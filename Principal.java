//public class Principal {

//}
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Calculos comparador = new Calculos();
        Scanner teclado = new Scanner(System.in);
        String menu = "1. Agregar usuario\n2. Comparación Salario\n3. Calcular canasta básica\n4. Ingresar sector laboral\n5. Gasto compratido \n7. Ingresar gasto mensual \n8. Indicar tipo de alojamiento \n9. Salir";
        int opcion = 1;
        
        System.out.println(menu);

        System.out.println("Ingrese la opción que desea: ");

        opcion = teclado.nextInt();
        teclado.nextLine();

        while (opcion<9 && opcion>=1){
            switch (opcion){
                case 1: {
                    String nombre, sexo, marca = "", modelo = "";
                    int edad, hab, linea = 0;
                    double salario = 0, dinAyuPersona = 0, comida, gastoDomicilio = 0, gastoGasolina = 0, colegiaturas = 0, consultaMedica = 0, medicina = 0, seguro = 0, ocio = 0, higiene = 0;
                    long dpi;
                    boolean alquiler = false, estadoLaboral;

                    System.out.println("Ingrese su nombre:");
                    nombre = teclado.nextLine();

                    System.out.println("Ingrese su edad:");
                    edad = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Ingrese su sexo:");
                    sexo = teclado.nextLine();

                    System.out.println("Ingrese su dpi:");
                    dpi = teclado.nextLong();
                    teclado.nextLine();

                    System.out.println("¿Cuántas personas viven con usted?");
                    hab = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Indique si usted comparte  gastos con otra persona:");
                    String ayuPersona = teclado.nextLine();
                    
                    if (ayuPersona.equalsIgnoreCase("si")){
                        System.out.println("¿Cuánto dinero aporta esa persona en su economía?");
                        dinAyuPersona = teclado.nextDouble();
                        teclado.nextLine();
                    }

                    System.out.println("¿Cuánto es su gasto promedio para los bienes de alimentación?");
                    comida = teclado.nextDouble();
                    teclado.nextLine();

                    boolean decision = true;

                    while (decision){
                        System.out.println("¿La vivienda en la que vive es de alquiler?");
                        String decVivienda = teclado.nextLine();
                        if (decVivienda.equalsIgnoreCase("si")){
                            decision = false;
                            alquiler = true;
                            System.out.println("Indique cuánto es su gasto en el alquiler:");
                            gastoDomicilio = teclado.nextDouble();
                            teclado.nextLine();
                        } else if (decVivienda.equalsIgnoreCase("no")){
                            decision = false;
                            alquiler = false;
                            System.out.println("Indique cuánto es su gasto para su domicilio:");
                            gastoDomicilio = teclado.nextDouble();
                            teclado.nextLine();
                        }
                    }

                    Vivienda casa = new Vivienda(hab, comida, alquiler, gastoDomicilio);

                    System.out.println("Actualmente, ¿tiene un trabajo?");
                    estadoLaboral = false;
                    String rpa = teclado.nextLine();

                    if (rpa.equalsIgnoreCase("si")) {
                        estadoLaboral = true;
                        System.out.println("Por favor, ingrese su salario:");
                        salario = teclado.nextFloat();
                        teclado.nextLine();
                    }

                    decision = true;

                    while (decision) {
                        System.out.println("¿Tiene un vehículo de su propiedad?");
                        rpa = teclado.nextLine();

                        if (rpa.equalsIgnoreCase("si")){
                            System.out.println("Indique la marca de su carro:");
                            marca = teclado.nextLine();
                            System.out.println("¿Cuál es el modelo de su carro?");
                            modelo = teclado.nextLine();
                            System.out.println("¿Cuál es la línea de su carro?");
                            linea = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("¿Cuánto es el gasto mensual en gasolina?");
                            gastoGasolina = teclado.nextFloat();
                            teclado.nextLine();
                            decision = false;
                        } else if (rpa.equalsIgnoreCase("no")) {
                            boolean tenerVehiculo = false;
                            gastoGasolina = 0;
                            decision = false;
                        }
                    }
                    Automovil carro = new Automovil(marca, linea, modelo, gastoGasolina);

                    System.out.println("¿Cuánto es el gasto en el sector educativo? (Indique 0 si no aplica)");
                    colegiaturas = teclado.nextDouble();
                    teclado.nextLine();

                    System.out.println("¿Cuánto es su gasto mensual por consulta médica? (Indique 0 si no aplica)");
                    consultaMedica = teclado.nextDouble();
                    teclado.nextLine();

                    System.out.println("¿Cuánto es su gasto mensual en la compra de medicinas? (Indique 0 si no aplica)");
                    medicina = teclado.nextDouble();
                    teclado.nextLine();

                    System.out.println("¿De cuánto es su seguro?");
                    seguro = teclado.nextDouble();
                    teclado.nextLine();

                    System.out.println("¿Cuánto es su gasto promedio en el ocio?");
                    ocio = teclado.nextDouble();
                    teclado.nextLine();

                    System.out.println("¿Cuánto es su gasto promedio en higiene personal?");
                    higiene = teclado.nextDouble();
                    teclado.nextLine();

                    serviciosGenerales servicios = new serviciosGenerales(colegiaturas, consultaMedica, medicina, seguro, ocio, higiene);

                    comparador.agregarUsuario(nombre, edad, sexo, dpi, estadoLaboral, salario, dinAyuPersona, carro, casa, servicios);

                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");

                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    break;
                }
                case 2:{
                    comparador.compararSalario();

                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    break;
                }
                case 3:{
                    comparador.compararCanastaBasica();

                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    break;
                }
                case 4:{
                    System.out.println("ingrese su sector laboral");
                    System.out.println("//listado de sectores laborales");
                    double salario = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("teniendo en cuenta su salario, con referencia a su sector, se infiere que");
                    System.out.println("//resultado de la comparativa");

                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    break;
                }
                case 5:{
                    comparador.gastosCompartidos();
                    
                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    break;
                }
                case 6:{
                    System.out.println("En el caso de contar con un automovil, ingresar el monto que se gasta en gasolina, de lo contrario ingresar como 0");
                    int gasolina = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    break;
                }
                case 7:{
                    comparador.serviciosTotales();
                    
                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
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
                    teclado.nextLine();
                    break;
                }
            }
        }
    }
}
