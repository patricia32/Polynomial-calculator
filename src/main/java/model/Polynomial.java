package model;

import java.util.ArrayList;

public class Polynomial {

    public int inputVerify(String string){
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i) != 'X' && string.charAt(i) != '^' && string.charAt(i) != '-' && string.charAt(i) != '+' && (string.charAt(i) > '9' || string.charAt(i) < '0'))
            return -1;
        }
       return 1;
    }
    public static ArrayList<Monomial> createPolynomial(ArrayList<String> polynomial){
        String[] pol1 = new String[100];
        for(String a: polynomial)
            pol1 = a.split("\\+");
        String left;
        String right;
        for(int z=0; z<pol1.length; z++){
            if(pol1[z].contains("-")){
                int here = pol1[z].indexOf("-");
                if(here == 0 && pol1[z].substring(1).contains("-")) {
                    String minusFirst = pol1[z].substring(1);
                    here = minusFirst.indexOf("-") + 1;
                }
                left = pol1[z].substring(0, here);
                right = pol1[z].substring(here);
                for(int i=z; i <= pol1.length-1; i++) {
                    if (pol1[i].equals(pol1[z])) {
                         pol1[z] = left;
                        String[] nou = new String[pol1.length + 1];
                        System.arraycopy(pol1, 0, nou, 0, i + 1);
                        nou[i + 1] = right;
                        if (nou.length - (i + 2) >= 0)
                            System.arraycopy(pol1, i + 2 - 1, nou, i + 2, nou.length - (i + 2));
                        pol1 = nou;
                    }
                }
                if(!pol1[z+1].substring(1).contains("-"))
                    z++;
            }
        }
        if(pol1[0]. equals("")){
            String[] copy = new String[pol1.length-1];
            System.arraycopy(pol1, 1, copy, 0, pol1.length - 1);
            pol1 = copy;
        }
        Monomial[] monoame1 = new Monomial[100];
        ArrayList<Monomial> monomials = new ArrayList<>();
        for(int i=0; i<100; i++)
            monoame1[i] = new Monomial(0,0);
        int i= 0, minus;
        for(String a: pol1){
            if(a.contains("-")) {
                minus = -1;
                a = a.substring(1);
            }
            else
                minus = 1;
            String coef ;
            if(a.contains("X")){
                int here = a.indexOf("X");
                coef = a.substring(0, here);
            }
            else
                coef = a;
            if(a.charAt(0) == 'X')
                coef = "1";
            String put;
            if(coef.equals("X"))
                monoame1[i].setCoeficient(minus);
            else
                monoame1[i].setCoeficient(Integer.parseInt(coef)*minus);

            if(a.contains("X")){
                if(a.contains("^")) {
                    int here = a.indexOf("^");
                    put = a.substring(here + 1);
                    monoame1[i].setPutere(Integer.parseInt(put));
                }
                else
                    monoame1[i].setPutere(1);
            }
            else
                monoame1[i].setPutere(0);
            monomials.add(monoame1[i]);
            i++;
        }
        return monomials;
    }
    ArrayList<Monomial> createMonomial(String polynomialString){
        ArrayList<String> p = new ArrayList<>();
        p.add(polynomialString);
        return createPolynomial(p);
    }
    public ArrayList<Monomial> monomialSort(ArrayList<Monomial> monomial){
        for(int i=0; i<monomial.size(); i++){
            for(int j=i+1; j< monomial.size(); j++){
                if(monomial.get(i).getPutere() < monomial.get(j).getPutere()){
                    Monomial aux = new Monomial(0,0);
                    aux.setPutere(monomial.get(i).getPutere());
                    aux.setCoeficient(monomial.get(i).getCoeficient());

                    monomial.get(i).setCoeficient(monomial.get(j).getCoeficient());
                    monomial.get(i).setPutere(monomial.get(j).getPutere());

                    monomial.get(j).setPutere(aux.getPutere());
                    monomial.get(j).setCoeficient(aux.getCoeficient());
                }
            }
        }
        return  monomial;
    }
    public ArrayList<Monomial> forSubtractionConv(ArrayList<Monomial> monomial){
        for(Monomial m1: monomial){
            m1.setCoeficient(m1.getCoeficient()*(-1));
        }
        return monomial;
    }
    public ArrayList<Monomial> resize(ArrayList<Monomial> result){
        for(int i=0; i< result.size(); i++) {
            for (int j = i+1; j < result.size(); j++) {
                if (  result.get(i).getPutere() == result.get(j).getPutere() ){
                    result.get(i).setCoeficient(result.get(i).getCoeficient() + result.get(j).getCoeficient());
                    result.remove(result.get(j));
                }
            }
        }
        return result;
    }

    String makeString(ArrayList<Monomial> monomial){
        String string = "";
        int zero = 0;
        for(Monomial m1: monomial)
            if (0 != m1.getCoeficient()) {
                zero = 1;
                break;
            }
            if(zero == 0)
                return "0";

        for(Monomial m: monomial){
            if(m.getCoeficient() != 0 && m.getPutere() == 0) {
                if (m.getCoeficient() > 0 )
                    string = string.concat("+");
                if(m.getCoeficient() != 1|| m.getCoeficient() != -1 )
                    string = string.concat(String.valueOf(m.getCoeficient()));

            }
            if(m.getCoeficient() != 0 && m.getPutere() != 0) {
                if (m.getCoeficient() > 0)
                    string = string.concat("+");
                if(m.getCoeficient() != 1 && m.getCoeficient() != -1)
                    string = string.concat(String.valueOf(m.getCoeficient()));
                else
                    if(m.getCoeficient() == -1 )
                        string = string.concat("-");

                if(m.getPutere() == 1)
                    string = string.concat("X");
                if(m.getPutere() > 1){
                    string = string.concat("X^");
                    string = string.concat(String.valueOf(m.getPutere()));
                }
            }
        }
        if(string.charAt(0) == '+'){
            return string.substring(1);
        }
        return string;
    }

    public String addition(String polynomialString1, String polynomialString2){
        if(inputVerify(polynomialString1) == -1 || inputVerify(polynomialString2)== -1)
            return null;
        ArrayList<Monomial> polynomial1 = createMonomial(polynomialString1);
        ArrayList<Monomial> polynomial2 = createMonomial(polynomialString2);
        polynomial1.addAll(polynomial2);

       polynomial1 = resize(polynomial1);
       polynomial1 = monomialSort(polynomial1);
        return makeString(polynomial1);
    }

    public String subtraction(String polynomialString1, String polynomialString2){
        if(inputVerify(polynomialString1) == -1 || inputVerify(polynomialString2) == -1)
            return null;
        ArrayList<Monomial> polynomial2 = createMonomial(polynomialString2);
        polynomial2 = forSubtractionConv(polynomial2);
        String stringSecondPolynomial=  makeString(polynomial2);
        return addition(polynomialString1, stringSecondPolynomial);
    }

    public String multiply(String polynomialString1, String polynomialString2){
        if(inputVerify(polynomialString1) == -1 || inputVerify(polynomialString2)== -1)
            return null;
        ArrayList<Monomial> polynomial1 = createMonomial(polynomialString1);
        ArrayList<Monomial> polynomial2 = createMonomial(polynomialString2);
        ArrayList<Monomial> result = new ArrayList<>();
        for (Monomial monomial : polynomial1) {
            for (Monomial value : polynomial2) {
                Monomial partial = new Monomial(0, 0);
                partial.setPutere(monomial.getPutere() + value.getPutere());
                partial.setCoeficient(monomial.getCoeficient() * value.getCoeficient());
                result.add(partial);
            }
        }
        while(result != resize(result)){
          result =  resize(result);
        }
        return makeString(result);
    }

    public String integrate(String polynomialString1){
        String result = "";
        if(inputVerify(polynomialString1) == -1)
            return null;
        ArrayList<Monomial> polynomial1 = createMonomial(polynomialString1);
        for(Monomial m1: polynomial1){
            m1.setPutere(m1.getPutere()+1);
            float floatCoef = ((float)m1.getCoeficient()/(m1.getPutere()));
            if(floatCoef != 0 && m1.getPutere() == 0) {
                if (floatCoef > 0)
                    result = result.concat("+");
                if (floatCoef != 1.0 || floatCoef != -1.0) {
                    if (floatCoef == (int) floatCoef)
                        result = result.concat(String.valueOf((int) floatCoef));
                    else
                        result = result.concat(String.valueOf(floatCoef));
                }
            }
            if(floatCoef != 0 && m1.getPutere() != 0) {
                if (floatCoef > 0)
                    result = result.concat("+");
                if(floatCoef != 1.0 && floatCoef != -1.0) {
                    if (floatCoef == (int) floatCoef)
                        result = result.concat(String.valueOf((int) floatCoef));
                    else
                        result = result.concat(String.valueOf(floatCoef));
                }
                else
                    if(floatCoef == -1 )
                        result = result.concat("-");

                if(m1.getPutere() == 1)
                    result = result.concat("X");
                if(m1.getPutere() > 1) {
                    result = result.concat("X^");
                    result = result.concat(String.valueOf(m1.getPutere()));
                }
            }
        }
        result = result.concat(" + C");
        if(result.charAt(0) == '+')
            return result.substring(1);
        return result;
    }

    public String derivative(String polynomialString1){
        if(inputVerify(polynomialString1) == -1 )
            return null;
        ArrayList<Monomial> polynomial1 = createMonomial(polynomialString1);

        for(Monomial m1: polynomial1){
            m1.setPutere(m1.getPutere()-1);
            m1.setCoeficient(m1.getCoeficient() * (m1.getPutere()+1));
        }
        return makeString(polynomial1);
    }
}
