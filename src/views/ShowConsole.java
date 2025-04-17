package views;

import java.util.Scanner;

public class ShowConsole {

    Scanner scanner = new Scanner(System.in);

    public int getCode() {
        System.out.print("Ingrese el código a buscar: ");
        return scanner.nextInt();
    }

    public String getName() {
        System.out.print("Ingrese el nombre: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
    
}
