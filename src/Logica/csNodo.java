/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


public class csNodo {
    
    private int numero;
    private int altura;
    private csNodo derecha;
    private csNodo izquierda;
    
    //Constructor
    public csNodo(int numero, int altura) {
        
        this.numero = numero;
        this.altura = altura;
        this.derecha = null;
        this.izquierda = null;
        
    }

    //Getter and Setter

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public csNodo getDerecha() {
        return derecha;
    }

    public void setDerecha(csNodo derecha) {
        this.derecha = derecha;
    }

    public csNodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(csNodo izquierda) {
        this.izquierda = izquierda;
    }
    
    // Metodos
    
    
    
    public void Insertar(int num) {
        
        if(num < this.numero) {
            if(this.izquierda == null) {
                this.izquierda = new csNodo(num, this.altura + 1);
            } else {
                this.izquierda.Insertar(num);
            }
        } else {
            if(this.derecha == null) {
                this.derecha = new csNodo(num, this.altura + 1);
            } else {
                this.derecha.Insertar(num);
            }
        }
        
    }
    
    public void MostrarInOrder() {   //IZ - Centro - DE
        if(this.izquierda != null) {
            this.izquierda.MostrarInOrder();
        }
        System.out.print(numero + " -> ");
        if(this.derecha != null) {
            this.derecha.MostrarInOrder();
        }
        
    }
    
    public void MostrarPreOrder() {   //Centro - IZ - DE
        
        System.out.print(numero + " -> ");
        
        if(this.izquierda != null) {
            this.izquierda.MostrarPreOrder();
        }
        
        if(this.derecha != null) {
            this.derecha.MostrarPreOrder();
        }
        
    }
    
    public void MostrarPostOrder() {   //IZ - DE - Centro
        
       
        if(this.izquierda != null) {
            this.izquierda.MostrarPostOrder();
        }
        
        if(this.derecha != null) {
            this.derecha.MostrarPostOrder();
        }
        
        System.out.print(numero + " -> ");
        
    }
    
    public boolean Buscar(int num) {
        
        boolean find = false;
        
        if(num == this.numero) {
            find = true;
        } else {
            if (this.izquierda != null) {
                find = this.izquierda.Buscar(num);
            }
            if(find == false) {
                if(this.derecha != null) {
                    find = this.derecha.Buscar(num);
                }
            }
        }
    return find;  
    }    
    
    public int Sumar () {
        int suma = this.numero;
        if (this.izquierda != null) {
            suma+= this.izquierda.Sumar();
        }
        if (this.derecha != null) {
            suma+= this.derecha.Sumar();
        }
        
        return suma;
    }
    
   public void MostrarRaiz() {   
        
       
        if(this.izquierda != null) {
            this.izquierda.MostrarRaiz();
        }
        
        if(this.derecha != null) {
            this.derecha.MostrarRaiz();
        }
        
        System.out.print(numero + " -> ");
        
    }
}
