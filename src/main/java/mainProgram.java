import controller.Controller;
import model.Polynomial;
import view.Interface;

import java.util.Collections;

public class mainProgram {
    public static void main(String[] args) {
        Polynomial model = new Polynomial();
        Interface view = new Interface(model);
        Controller controller = new Controller(model, view);
        view.startMethod(view);

        view.setVisible(true);
    }
}
