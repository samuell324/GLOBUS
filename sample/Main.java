//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample;

import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main extends Application {
    public Main() {
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("sample.fxml"));
    }

    public static void main(String[] args) {
        double num = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = in.nextDouble();
        System.out.print("Введите второе число: ");
        double b = in.nextDouble();
        System.out.println("Введите номер мат. операции 1-add, 2-sub, 3-multi, 4-div");
        int operation = in.nextInt();
        switch(operation) {
            case 1:
                num = a + b;
                System.out.printf("Сложение: %s \n", num);
                break;
            case 2:
                num = a - b;
                System.out.printf("Вычитание: %s \n", num);
                break;
            case 3:
                num = a * b;
                System.out.printf("Умножение: %s \n", num);
                break;
            case 4:
                num = a / b;
                System.out.printf("Деление: %s \n", num);
                break;
            default:
                System.out.println("Ошибка, выберите мат. операцию");
        }

    }
}
