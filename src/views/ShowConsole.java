    package views;
    import java.util.Scanner;
    import models.Person;

    public class ShowConsole {
        private Scanner scanner = new Scanner(System.in);

        public ShowConsole() {
            this.scanner = new Scanner(System.in);
        }

        public void showMessage(String message) {
            System.out.println(message);
        }

        public int numArray() {
            System.out.print("Ingrese la cantidad de personas: ");
            int cantidad = scanner.nextInt();
            return cantidad;
        }

        public Person indexDatos(int numero) {
            System.out.println("\nIngrese Persona #" + numero + ":");
            scanner.nextLine();

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();

            return new Person(nombre, edad);
        }

        public void mostrarPersonas(models.Person[] personas) {
            System.out.println("\n--- Listado de Personas ---");
            for (Person p : personas) {
                System.out.println(p.toString());
            }
        }

        public void showBanner() {
            System.out.println("\nx|Método de busqueda binario");
        }
        
        public int inputCode() {
            System.out.println("Ingrese la edad de la persona: ");
            int code = scanner.nextInt();
            return code;
        }

    }
