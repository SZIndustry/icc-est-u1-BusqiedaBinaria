import models.Person;
import controllers.MetodoBusquedaBinario;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
ShowConsole view = new ShowConsole();
        int cantidad = view.numArray();
        Person[] people = new Person[cantidad];

        for (int i = 0; i < cantidad; i++) {
            people[i] = view.indexDatos(i + 1);
        }

        MetodoBusquedaBinario mBB = new MetodoBusquedaBinario(people);
        mBB.ordenarArray(people);
        mBB.showPersonByAge();
    }
}
