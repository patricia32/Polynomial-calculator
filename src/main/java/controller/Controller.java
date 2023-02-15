package controller;

import model.Polynomial;
import view.Interface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Polynomial controllerModel;
    private Interface controllerView;
    public Controller(Polynomial model, Interface view) {
        controllerView = view;
        controllerModel = model;
        view.addExitListener(new ExitListener());
        view.addAdditionListener(new AdditionListener());
        view.addSubtractionListener(new SubtractionListener());
        view.addMultiplyListener(new MultiplyListener());
        view.addDivisionListener(new DivisionListener());
        view.addDerivativeListener(new DerivativeListener());
        view.addIntegrateListener(new IntegrateListener());
        view.addClearListener(new ClearListener());
    }

    public class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                controllerView.setVisible(false);
        }
    }

    public class AdditionListener implements  ActionListener{
        public void actionPerformed(ActionEvent e) {
            String result = controllerModel.addition(controllerView.getFirstPolynomial(), controllerView.getSecondPolynomial());
            if(result == null)
                controllerView.showError("Incorrect input! Please try using only digits and capital letters (X) and '^+-'.");
            else
                controllerView.setResult(result);

        }
    }

    public class SubtractionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String result = controllerModel.subtraction(controllerView.getFirstPolynomial(), controllerView.getSecondPolynomial());
            if(result == null)
                controllerView.showError("Incorrect input! Please try using only digits and capital letters (X) and '^+-'.");
            else
                controllerView.setResult(result);
        }
    }

    public class MultiplyListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String result = controllerModel.multiply(controllerView.getFirstPolynomial(), controllerView.getSecondPolynomial());
            if(result == null)
                controllerView.showError("Incorrect input! Please try using only digits and capital letters (X) and '^+-'.");
            else
                controllerView.setResult(result);
        }
    }

    public class DivisionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) { }
    }

    public class DerivativeListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String result = controllerModel.derivative(controllerView.getFirstPolynomial());
            if(result == null)
                controllerView.showError("Incorrect input! Please try using only digits and capital letters (X) and '^+-'.");
            else
                controllerView.setResult(result);
        }
    }

    public class IntegrateListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String result = controllerModel.integrate(controllerView.getFirstPolynomial());
            if(result == null)
                controllerView.showError("Incorrect input! Please try using only digits and capital letters (X) and '^+-'.");
            else
                controllerView.setResult(result);
        }
    }

    public class ClearListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            controllerView.clearAllFields();
        }
    }
}
