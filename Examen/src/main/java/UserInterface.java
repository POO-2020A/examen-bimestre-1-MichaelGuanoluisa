
import java.util.Scanner;
/**
 *
 * @author Michael Guanoluisa
 */
public class UserInterface {
    private Plane first;
    private Seat seat;
    private Passenger passenger;

    public UserInterface() {
       
    }
    
    
    
    public static void user(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas: ");
        int row = Integer.valueOf( scan.nextLine());
        System.out.println("Ingrese la cantidad de columnas: ");
        int col = Integer.valueOf( scan.nextLine());
        
        while(true){
            if(row <  9 && col <= 20){
            Plane first = new Plane(row, col);
            System.out.println(first);
            }
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Ingresar pasajero");
            System.out.println("2. Consultar asiento");
            System.out.println("3. Consultar pasajero");
            System.out.print("Ingrese la opcion: ");
            int op= Integer.valueOf(scan.nextLine());
            int i=0;
            if(op == 1){
                System.out.println("Ingresar un pasajero: ");
                    System.out.print("Ingrese el nombre del pasajero: ");
                    String name = scan.nextLine();
                    System.out.println("Ingrese el apellido del pasajero: ");
                    String lastname = scan.nextLine();
                    System.out.println("Ingrese la fila del asiento: ");
                    int row1 = Integer.valueOf(scan.nextLine());
                    System.out.println("Ingrese la columna del asiento: ");
                    String col1 = scan.nextLine();
                    Passenger pas = new Passenger(name, lastname);
                    Seat set = new Seat(row1, col1, pas);
                   
                    System.out.println("¡Pasajero ingresado!");
                    i++;
            }else if(op == 2){
                System.out.println("Consulta de asiento.");
                    System.out.println("Ingrese la fila del asiento: ");
                    int row2 = Integer.valueOf(scan.nextLine());
                    System.out.println("Ingrese la columna del asiento: ");
                    String col2 = scan.nextLine();
                    
            }else if(op == 3){
                System.out.println("Consulta de pasajero.");
                System.out.println("Ingrese el nombre y apellido: ");
                String name1 = scan.nextLine();
                
            }
            
        }
    }
}
