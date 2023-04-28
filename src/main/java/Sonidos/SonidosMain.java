
package Sonidos;


public class SonidosMain {

    
    public static void main(String[] args) {
       ListaEnlazadaDoble list = new ListaEnlazadaDoble();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.print(); // Output: 1 2 3 4 5
    list.remove(2);
    list.remove(3);
    list.remove(5);
    list.print(); // Output: 1 2 3 4
        
        
    }
    
}
