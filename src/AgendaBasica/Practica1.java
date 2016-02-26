
package AgendaBasica;
import java.util.Scanner;


public class Practica1 {
    
    public static void menu(){
           System.out.println("Ingres Datos");
           System.out.println("Actualizar Datos");
           System.out.println("Borrar");
           System.out.println("Buscar");
           System.out.println("Salir");
          
   
    
    }

   
    public static void main(String[] args) {
        
       PersonalData Datos[]= new PersonalData[100];//almacena 100 personas
       
       Scanner lector=new Scanner(System.in);
       int opc, contUs=0; 
       do{
           menu();
           opc=lector.nextInt();
           
           switch(opc){
               case 1:
                   if(contUs<99){
                       Datos[contUs]= new PersonalData();
                   System.out.println("Ingres nombre");
                   Datos[contUs].setNombre(lector.next());
                   System.out.println("Ingres Apellido");
                   Datos[contUs].setApellido(lector.next());
                   System.out.println("Ingres fecha");
                   Datos[contUs].setFecha(lector.next());
                   System.out.println("Ingres cedula");
                   Datos[contUs].setCedula(lector.next());
                   System.out.println("Ingres direccion");
                   Datos[contUs].setDireccion(lector.next());
                   System.out.println("Ingres telefono");
                   Datos[contUs].setTelefono(lector.next());
                   System.out.println("Ingres areas favoritas");
                   Datos[contUs].setAreas(lector.next());
                   contUs++;
                   }else System.out.println("NO hay memoria");
                      
                   
                   break;
                           case 2:
                               break;
                               
                           case 3:
                               break;
                               
                           case 4:
                               break;
                               
                           case 5:
                               System.out.println("Gracias");
                               break;
                               
                           default:
                               System.out.println("Opcion incorrecta");
                               break;
           }
       
       
       
       
       }while(opc!=5);
       
    }
    
}
