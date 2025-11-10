package daw;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        

        String palabra = JOptionPane.showInputDialog("Introduce la palabra");

        if(Funciones.evaluaPalabra(palabra) == 1){
            JOptionPane.showMessageDialog(null, "La palabra es un palíndromo");
        } 
        else {
            JOptionPane.showMessageDialog(null, "La palabra no es un palíndromo");

        }
}
}