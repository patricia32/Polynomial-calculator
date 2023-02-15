package model;

public class Monomial {
    private int putere;
    private int coeficient;

    public Monomial(int putere, int coeficient) {
        this.putere = putere;
        this.coeficient = coeficient;
    }

    public int getPutere() { return putere; }
    public void setPutere(int putere) {
        this.putere = putere;
    }

    public int getCoeficient() {
        return coeficient;
    }
    public void setCoeficient(int coeficient) {
        this.coeficient = coeficient;
    }

}
