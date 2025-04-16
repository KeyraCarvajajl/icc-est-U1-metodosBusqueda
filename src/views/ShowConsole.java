package views;

public class ShowConsole {
    private Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        System.err.println("Metodo Busqueda");
    }

    public int getCode() {
        System.err.println("Ingrese codigo");
        int codigo = scanner.nextInt();
        System.err.println("Codigo ingresado: " + codigo);
        return codigo;
    }

    public void showMessage(String message){
        System.err.println(message);
    }
}
