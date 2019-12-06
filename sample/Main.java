package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    }


    public static void main(String[] args) {
        int num = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.println("Введите номер мат. операции 1-add, 2-sub, 3-multi, 4-div");
        int operation = in.nextInt();

        switch (operation) {
            case 1 :
                num = a+b;
                System.out.printf("Сложение: %s \n", num);
                break;
            case 2 :
                num = a-b;
                System.out.printf("Вычитание: %s \n", num);
                break;
            case 3 :
                num = a * b;
                System.out.printf("Умножение: %s \n", num);
                break;
            case 4 :
                num = a / b;
                System.out.printf("Деление: %s \n", num);
                break;
                default :
                    System.out.println("Ошибка, выберите мат. операцию");

        }
    }
}
