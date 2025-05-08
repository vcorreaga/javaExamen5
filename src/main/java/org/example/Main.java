import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a La Cocina Fina");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Almuerzo");
        System.out.println("2. Cena");
        System.out.println("3. Reservar evento");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el día de la semana:");
                String dia = sc.nextLine();
                System.out.println("Ingrese el valor de la cuenta:");
                double valorCuenta = sc.nextDouble();

                if (dia.equalsIgnoreCase("Lunes") || dia.equalsIgnoreCase("Miércoles") || dia.equalsIgnoreCase("Viernes")) {
                    valorCuenta *= 0.9;
                }

                if (valorCuenta > 100000) {
                    valorCuenta *= 0.95;
                }

                System.out.println("Opción seleccionada: Almuerzo");
                System.out.println("Día: " + dia);
                System.out.println("Valor final a pagar: $" + valorCuenta);
                break;

            case 2:
                System.out.println("Ingrese el horario: ");
                int horario = sc.nextInt();
                System.out.println("Ingrese el valor de la cuenta:");
                double valorCena = sc.nextDouble();

                if (horario >= 20) {
                    valorCena *= 1.1;
                }

                if (valorCena > 150000) {
                    valorCena *= 0.92;
                }

                System.out.println("Opción seleccionada: Cena");
                System.out.println("Horario: " + horario + " horas");
                System.out.println("Valor final a pagar: $" + valorCena);
                break;

            case 3:
                System.out.println("Ingrese el número de invitados:");
                int invitados = sc.nextInt();
                double valorEvento = 50000 * invitados;

                if (invitados > 30) {
                    valorEvento *= 0.85;
                }

                System.out.println("Opción seleccionada: Reservar evento");
                System.out.println("Número de invitados: " + invitados);
                System.out.println("Valor final a pagar: $" + valorEvento);
                break;

            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }

        sc.close();
    }
}
