package view;

import controller.Controller;
import model.Polynomial;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Interface extends javax.swing.JFrame {
    Controller controller;
    public Interface(Polynomial model) {
        initComponents();
    }
    private void initComponents() {

        fundal = new javax.swing.JPanel();
        secPol = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstPol = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        div = new javax.swing.JButton();
        deriv = new javax.swing.JButton();
        integ = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        compute = new javax.swing.JToggleButton();
        clear = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rez = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fundal.setBackground(new java.awt.Color(255, 204, 204));


        jLabel1.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18)); // NOI18N
        jLabel1.setText("Second polynomial");

        jLabel2.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 24)); // NOI18N
        jLabel2.setText("Polynomial Calculator");

        jLabel3.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18)); // NOI18N
        jLabel3.setText("First polynomial");


        add.setText("Add");
        sub.setText("Subtract");
        div.setText("Divide");
        deriv.setText("Derivate");
        integ.setText("Integrate");
        mul.setText("Multiplicate");
        compute.setText("Compute");
        clear.setText("Clear");
        exitButton.setText("X");

        jLabel4.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18)); // NOI18N
        jLabel4.setText("Result");

        javax.swing.GroupLayout fundalLayout = new javax.swing.GroupLayout(fundal);
        fundal.setLayout(fundalLayout);
        fundalLayout.setHorizontalGroup(
                fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundalLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundalLayout.createSequentialGroup()
                                .addGroup(fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fundalLayout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(fundalLayout.createSequentialGroup()
                                                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                                                .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(fundalLayout.createSequentialGroup()
                                                                .addGroup(fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(41, 41, 41)
                                                                .addGroup(fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(secPol)
                                                                        .addComponent(firstPol)))))
                                        .addGroup(fundalLayout.createSequentialGroup()
                                                .addGroup(fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundalLayout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(58, 58, 58))
                                                        .addGroup(fundalLayout.createSequentialGroup()
                                                                .addGap(49, 49, 49)
                                                                .addGroup(fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(compute, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(deriv, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(57, 57, 57)))
                                                .addGroup(fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(integ, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                                        .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(47, 47, 47))
                        .addGroup(fundalLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rez, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        fundalLayout.setVerticalGroup(
                fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fundalLayout.createSequentialGroup()
                                .addGroup(fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fundalLayout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel2))
                                        .addComponent(exitButton))
                                .addGap(18, 18, 18)
                                .addGroup(fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(firstPol, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(secPol, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(deriv, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(integ, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(compute, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(fundalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rez, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fundal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fundal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    public void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }

    public void addExitListener(ActionListener exitListener){exitButton.addActionListener(exitListener);}
    public void addAdditionListener(ActionListener additionListener){ add.addActionListener(additionListener);}
    public void addSubtractionListener(ActionListener subtractionListener) { sub.addActionListener(subtractionListener);}
    public void addMultiplyListener(ActionListener multiplyListener) { mul.addActionListener(multiplyListener);}
    public void addDivisionListener(ActionListener divisionListener) { div.addActionListener(divisionListener);}
    public void addDerivativeListener(ActionListener derivativeListener){ deriv.addActionListener(derivativeListener);}
    public void addIntegrateListener(ActionListener integrateListener){ integ.addActionListener(integrateListener);}
    public void addClearListener(ActionListener clearListener){clear.addActionListener(clearListener);}

    public String getFirstPolynomial(){ return firstPol.getText(); }
    public String getSecondPolynomial(){ return secPol.getText();}
    public void clearAllFields(){
        firstPol.setText("");
        secPol.setText("");
        rez.setText("");
    }
    public void setResult(String result){ rez.setText(result); }

    public void startMethod (Interface interfaceH){
        java.awt.EventQueue.invokeLater(() -> interfaceH.setVisible(true));
    }
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JToggleButton compute;
    private javax.swing.JButton deriv;
    private javax.swing.JButton div;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField firstPol;
    private javax.swing.JPanel fundal;
    private javax.swing.JButton integ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton mul;
    private javax.swing.JTextField rez;
    private javax.swing.JTextField secPol;
    private javax.swing.JButton sub;
}
