
package Logica;


public class csArbol {
    
    private csNodo raiz;
    private int tamanio;
    private int altura;
    
    //Constructor
    
    public csArbol() {
        this.raiz = null;
        this.tamanio = 0;
        this.altura = 0;
    }
    
    //Getter and Setter

   // public csNodo getRaiz() {
   //     return raiz;
   // }
/*
    public void setRaiz(csNodo raiz) {
        this.raiz = raiz;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    */
    //public csNodo getRaiz() {
    //    return raiz;
    //}
    
    public int obtenerTamanio() {
       return tamanio; 
    }
    
    public void Insertar(int num) {
        if (tamanio == 0) {
            raiz = new csNodo(num,1);
        } else {
            raiz.Insertar(num);
        }
        tamanio++;
    }
    
    public void InOrder() {
        raiz.MostrarInOrder();
        System.out.println("fin");
    }

    public void PreOrder() {
        raiz.MostrarPreOrder();
        System.out.println("fin");
    }
    
    public void PostOrder() {
        raiz.MostrarPostOrder();
        System.out.println("fin");
    }
    
    public boolean Buscar(int num) {
        return raiz.Buscar(num);
    }

    public void Raiz() {
        raiz.MostrarRaiz();
        System.out.println("fin");
    }
    
    public int Sumar () {
        return raiz.Sumar();
    }

       
}

