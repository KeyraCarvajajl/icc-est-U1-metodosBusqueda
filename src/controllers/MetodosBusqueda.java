package controllers;

import views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private Person[] people;

    public MetodosBusqueda(Person[], persons){
        showConsole = new showConsole();
        this.people = persons;
        showPersonByCode();
    }

    public int busquedaLineal(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado)
                return i; 
        }
        return -1;
    }

    public int findPersonByCode(int code){
        for (int i = 0; i < people.length; i++){
            if(people{i}.getCode() == code){
                return i;
            }
        }
        return -1;
    }

    public void showPersonByCode(int code){
        int codeToFind = showConsole.getCode();
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson >= 0){
            showConsole.showMessage("Persona encontrada");
            showConsole.showMessage(people[indexPerson].toString){
            } else {
                showConsole.showMessage("Persona con codigo" + codeToFind + "no encontrado")
            }
        }
    }
}