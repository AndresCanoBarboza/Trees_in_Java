
package Ventana;

import Logica.csArbol;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class VerArbol {

   
    public static void main(String[] args) {
        
        csArbol arbol = new csArbol();
       
        JComboBox comb = new JComboBox (new Object[] {"Insertar Datos", "InOrder", "PreOrden", "PostOrden", "Sumar Elementos del árbol", "Buscar valor deseado", "Obtener Raíz", "Obetener Tanaño del árbol", "Salir"});
        
    do {    
        JOptionPane.showMessageDialog(null, comb, "Seleccione una opción.",1);
        
        switch (comb.getSelectedIndex()) {
                  
            case 0:
                int numNodos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de Nodos que desea."));
                
            try {    
                for (int i = 0; i < numNodos; i++) {
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número."));  
                    try{
                    if(arbol.Buscar(numero)) {
                        JOptionPane.showMessageDialog(null, "El número ya existe.");
                    }
                                 
                    }catch(Exception b){}
                    
                    arbol.Insertar(numero);
                    
                }    
            }catch (NumberFormatException e){ JOptionPane.showMessageDialog(null, "Debe digitar solo números.");
            }

            break;    
            case 1:
                //Llamado InOrder
                arbol.InOrder();
            break;    
            
            case 2:
                //Lamado PreOrden
                arbol.PreOrder();
            break;   
            
            case 3:
                // Llamado PostOrden
                arbol.PostOrder();
            break;
            
            case 4:
                // Verificar si hay elementos para proceder
                
                if (arbol.obtenerTamanio() == 0) {
                    JOptionPane.showMessageDialog(null, "Primero debe ingresar datos.");
                } else {
                // Sumado de elmentos
                System.out.println(arbol.Sumar());
                }
            break;
           
            case 5:
                           
            if (arbol.obtenerTamanio() == 0) { // Verificar si hay elementos para proceder
                JOptionPane.showMessageDialog(null, "Primero debe ingresar datos.");
            } else {
            try{    
                // Buscar elemento solicitado
                
                int num = Integer.parseInt(JOptionPane.showInputDialog("Digite el número que desea buscar."));
                if (arbol.Buscar(num)) {
                    System.out.println("El número " + "'" + num +"'" + " sí existe en el árbol.");
                } else {
                    System.out.println("El número " + "'" + num +"'" + " no existe en el árbol.");
                }  
            }catch (NumberFormatException n) { JOptionPane.showMessageDialog(null, "Debe digitar un número.");
                }  
            }
           
            case 6:
               // System.out.println(arbol.Raiz());
                
            break;   
            
            case 7:
                System.out.println(arbol.obtenerTamanio());
            break;    
        }
    } while (comb.getSelectedIndex() != 8);    
       /* // Ordenaminetos
        arbol.InOrder();
        arbol.PreOrder();
        arbol.PostOrder();
        
        // Buscar nodo
        if (arbol.Buscar(4)) {
            System.out.println("existe");
        } else {
            System.out.println("no existe");
        }  
        
        // Sumado de elmentos
        System.out.println(arbol.Sumar());*/
    
       
       
    }
    
    
    
}    

