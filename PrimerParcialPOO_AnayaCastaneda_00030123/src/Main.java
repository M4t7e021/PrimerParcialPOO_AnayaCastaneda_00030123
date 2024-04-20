import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static ArrayList<AritculosElectronicos> aritculosElectronicos = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("-------------------------------");
        System.out.println("BIENVENIDO");
        System.out.println("\t1. Agregar producto a la lista ");
        System.out.println("\t2. Modificar producto de la lista");
        System.out.println("\t3. Consultar listado de productos disponibles");
        System.out.println("\t4. Salir");
        System.out.print("opcion: ");
        opcion = sc.nextInt();
        sc.nextLine();

            do{
                switch(opcion){
                    case 1:
                       AritculosElectronicos productos = new AritculosElectronicos();
                        System.out.println("Ingrese el producto que desea agregar a la lista");
                        sc.next();

                        aritculosElectronicos.add(productos);
                        break;

                    case 2:
                        buscarArticulo();
                        break;

                    case 3:
                        mostrarLista();
                        break;

                    case 4:
                        System.out.println("Salienoo.....");
                        break;

                    default:
                        System.out.println("Opcuion no valida");
                        break;
                }
            }while(opcion == 0);
        }

        public static String buscarArticulo(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el articulo que desee modificar");
            String name = scanner.next();

            for (int i = 0; 0 < aritculosElectronicos.size(); i++) {
                if (name != aritculosElectronicos.get(i).getNombreProducto()) {
                    System.out.println("Producto no encontrado");
                    System.out.println("Desea hacer una modificacion");
                    scanner.nextInt();
                }else{
                    return name;
                }
            }
            return name;
        }

        public static void mostrarLista(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el nombre del producto que desea consultar");
            String name = scanner.next();

            for (int i = 0; 0 < aritculosElectronicos.size(); i++) {
                if (name != aritculosElectronicos.get(i).getNombreProducto()) {
                    System.out.println("Producto no encontrado");
                }else{
                    System.out.println("Producto encontrado");
                }
            }
        }

    }