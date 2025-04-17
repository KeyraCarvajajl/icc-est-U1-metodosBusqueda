package controllers;

import views.ShowConsole;
import models.Person;

public class MetodosBusquedaBinaria {

    private Person[] people;
    private ShowConsole pantalla;

    public MetodosBusquedaBinaria(Person[] personas) {
        this.pantalla = new ShowConsole();
        this.people = personas;
        ordenarPorNombreBurbuja(); 
        pantalla.showMessage("Método de búsqueda binaria");
    }

    private void ordenarPorNombreBurbuja() {
        int n = people.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (people[j].getName().compareTo(people[j + 1].getName()) > 0) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

    public int findPersonByCode(int code){
        int bajo = 0;
        int alto = people.length - 1;

        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;

            if (people[central].getCode() == code) {
                return central;
            }

            if (people[central].getCode() < code) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }

        return -1;
    }

    private int findPersonByName(String name){
        int bajo = 0;
        int alto = people.length - 1;

        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;

            int comparacion = people[central].getName().compareTo(name);

            if (comparacion == 0) {
                return central;
            } else if (comparacion < 0) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }

        return -1;
    }

    public void showPersonByCode(){
        int codeToFind = pantalla.getCode();
        int indexPerson = findPersonByCode(codeToFind);

        if (indexPerson == -1){
            pantalla.showMessage("No hay la persona con ese código");
        } else {
            pantalla.showMessage("Persona con código " + codeToFind + " encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

    public void showPersonByName(){
        String nameToFind = pantalla.getName();
        int indexPerson = findPersonByName(nameToFind);

        if (indexPerson == -1){
            pantalla.showMessage("No hay la persona con ese nombre");
        } else {
            pantalla.showMessage("Persona con nombre " + nameToFind + " encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }
}
