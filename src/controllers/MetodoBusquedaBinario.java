package controllers;
import models.Person;
import views.ShowConsole;

public class MetodoBusquedaBinario {
    private Person[] people;
    private ShowConsole showConsole;

    public MetodoBusquedaBinario(Person[] people) {
        this.people = people;
        this.showConsole = new ShowConsole();
    }

    public void ordenarArray(Person[] people) {
        int n = people.length;
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (people[j].getAge() > people[j + 1].getAge()) {
                    Person aux = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (people[j].getName().compareToIgnoreCase(people[j + 1].getName()) > 0) {
                    Person aux = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = aux;
                }
            }
        }
    }

    public int findPersonByAge(int age) {
        int bajo = 0;
        int alto = people.length - 1;
        showConsole.showMessage("Array de edades: " + getEdadesAsString());

        while (bajo <= alto) {
            int medio = bajo + (alto - bajo) / 2;
            int valorCentro = people[medio].getAge();

            // Mostrar estado actual
            showConsole.showMessage(getSubarrayString(bajo, alto) +
                    "  bajo=" + bajo +
                    "  alto=" + alto +
                    "  centro=" + medio +
                    "  valorCentro=" + valorCentro);

            if (valorCentro == age) {
                showConsole.showMessage("--> ENCONTRADO");
                return medio;
            } else if (valorCentro < age) {
                showConsole.showMessage("--> DERECHA");
                bajo = medio + 1;
            } else {
                showConsole.showMessage("--> IZQUIERDA");
                alto = medio - 1;
            }
        }

        showConsole.showMessage("--> NO ENCONTRADO");
        return -1;
    }


    public String getSubarrayString(int inicio, int fin) {
        StringBuilder sb = new StringBuilder();
        for (int i = inicio; i <= fin; i++) {
            if (i > inicio) sb.append(" | ");
            sb.append(people[i].getAge());
        }
        return sb.toString();
    }

    public String getEdadesAsString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < people.length; i++) {
            if (i > 0) sb.append(" | ");
            sb.append(people[i].getAge());
        }
        return sb.toString();
    }

    public void showPersonByAge() {
        showConsole.showBanner();
        int index = showConsole.inputCode();
        int age = findPersonByAge(index);

        if (age == -1) {
            showConsole.showMessage("La persona con edad " + index + " no fue encontrada");
        }
        else {
            showConsole.showMessage("Persona de edad " + index + " encontrada");
            showConsole.showMessage("La persona con edad " + index + " es " + people[age].getName());
        }
    }
}