
package lab12;
import javax.swing.JOptionPane;


public class Lab12 {

    public static void main(String[] args) {
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Redes de Computadoras",
                JOptionPane.
                DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[] {"Agregar", "Listar", "Salir"}, null);
        while(opcion!=2){
            String ip = JOptionPane.showInputDialog("Ingrese un dato”);
            System.out.println(ip);
                opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Redes de Computadoras",
                JOptionPane.
                DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[] {"Agregar", "Buscar", "Listar", "Salir"}, null);
        
        }
        
    }
    }
    
}
