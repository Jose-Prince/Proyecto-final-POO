//public class Principal {

//}
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String menu = "1. Comparación Salario\n2. Calcular canasta básica\n3. Comprobar hijos\n4. Ingresar sector laboral\n5. Ingresar gastos compartidos\n6. Comprobar automovil \n7. Ingresar gasto mensual \n8. Indicar tipo de alojamiento \n9. Salir";
        int opcion = 1;
        float salario = 0;
        
        System.out.println(menu);

        System.out.println("Ingrese la opción que desea: ");

        opcion = teclado.nextInt();
        teclado.nextLine();

        while (opcion<9 && opcion>=1){
            switch (opcion){
                case 1: {
                    System.out.println("Ingrese su nombre:");
                    String nombre = teclado.nextLine();

                    System.out.println("Ingrese su edad:");
                    int edad = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Ingrese su sexo:");
                    String sexo = teclado.nextLine();

                    System.out.println("Ingrese su dpi:");
                    long dpi = teclado.nextLong();
                    teclado.nextLine();

                    System.out.println("¿Cuántas personas viven con usted?");
                    int hab = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Indique si usted comparte  gastos con otra persona:");
                    String ayuPersona = teclado.nextLine();
                    
                    if (ayuPersona.equalsIgnoreCase("si")){
                        System.out.println("¿Cuánto dinero aporta esa persona en su economía?");
                        float dinAyuPersona = teclado.nextFloat();
                        teclado.nextLine();
                    }

                    System.out.println("¿Cuánto es su gasto promedio para los bienes de alimentación?");
                    float comida = teclado.nextFloat();

                    boolean decision = true;
                    while (decision){
                        System.out.println("¿La vivienda en la que vive es de alquiler?");
                    String decVivienda = teclado.nextLine();
                    if (decVivienda.equalsIgnoreCase("si")){
                        decision = false;
                        boolean alquiler = true;
                        float gastoDomicilio = teclado.nextFloat();
                        teclado.nextLine();
                    } else if (decVivienda.equalsIgnoreCase("no")){
                        decision = false;
                        boolean alquiler = false;
                        float gastoDomicilio = teclado.nextFloat();
                        teclado.nextLine();
                    }
                }
                    System.out.println("Actualmente, ¿tiene un trabajo?");
                    boolean estadoLaboral = false;
                    String rpa = teclado.nextLine();
                    if (rpa.equalsIgnoreCase("si")) {
                        estadoLaboral = true;
                        System.out.println("por favor ingrese su salario");
                        salario = teclado.nextFloat();
                    }
                    decision = true;
                    while (decision) {
                        System.out.println("¿Tiene un vehículo de su propiedad?");
                        rpa = teclado.nextLine();
                        if (rpa.equalsIgnoreCase("si")){
                            boolean tenerVehiculo = true;
                            System.out.println("¿Cuánto es el gasto en gasolina?");
                            float gastoGasolina = teclado.nextFloat();
                            teclado.nextLine();
                        } else if (rpa.equalsIgnoreCase("no")) {
                            boolean tenerVehiculo = false;
                            float gastoGasolina = 0;
                        }
                    }

                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");

                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    break;
                }
                case 2:{
                    System.out.println("segun el salario ingresado, se concluye que:");
                    System.out.println("//aquí iría el resultado");

                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    break;
                }
                case 3:{
                    System.out.println("Teniendo en cuenta la situación familar:");
                    System.out.println("//aquí iría el resultado que varia si tiene o no hijos y cuantos");

                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    break;
                }
                case 4:{
                    System.out.println("ingrese su sector laboral");
                    System.out.println("//listado de sectores laborales");
                    salario = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("teniendo en cuenta su salario, con referencia a su sector, se infiere que");
                    System.out.println("//resultado de la comparativa");

                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    break;
                }
                case 5:{
                    System.out.println("En el caso de tener gastos compartidos, ingresar el monto con el que se le apoya, de lo contrario ingresar como 0");
                    int compartidos = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    break;
                }
                case 6:{
                    System.out.println("En el caso de contar con un automovil, ingresar el monto que se gasta en gasolina, de lo contrario ingresar como 0");
                    int gasolina = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    break;
                }
                case 7:{
                    System.out.println("ingrese sus gastos mensuales");
                    int gastos = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    break;
                }
                case 8:{
                    System.out.println("ingrese el tipo de alojamiento que tiene (1) alquiler (2)propiedad propia");
                    int Vivienda = teclado.nextInt();
                    //ciclo para segun la decició ingresar el monto de la propiedad y su cantidad de meses por pagar y monto, asi mismo para la renta
                    teclado.nextLine();
                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    break;
                }
            }
        }
    }
}
