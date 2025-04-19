import models.Person;
import controllers.MetodoBusquedaBinario;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
//        Person[] people = new Person[10];
//        people[0] = new Person("Juan", 20);
//        people[1] = new Person("Pedro", 25);
//        people[2] = new Person("Maria", 30);
//        people[3] = new Person("Ana", 35);
//        people[4] = new Person("Luis", 40);
//        people[5] = new Person("Laura", 45);
//        people[6] = new Person("Carlos", 50);
//        people[7] = new Person("Sofia", 55);
//        people[8] = new Person("Javier", 60);
//        people[9] = new Person("Isabel", 65);


        ShowConsole view = new ShowConsole();
        int cantidad = view.numArray();
        Person[] people = new Person[cantidad];

        for (int i = 0; i < cantidad; i++) {
            people[i] = view.indexDatos(i);
        }

        MetodoBusquedaBinario mBB = new MetodoBusquedaBinario(people);
        mBB.ordenarArray(people);
        mBB.showPersonByAge();
    }
}
