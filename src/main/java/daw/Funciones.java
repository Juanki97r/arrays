package daw;

public class Funciones {
    

    public static int evaluaPalabra (String palabra){
        int control = 0;
        
        String palabraEv = "";

        char [] palabraChar = palabraEv.toCharArray();

        for( int i =0, j = palabraChar.length; i< palabraChar.length && j == 0; i++ , j-- ){

            if(palabraChar[i] == palabraChar[j]){
                control++; 
            } 
            

        }

        if (control == palabraChar.length){
            return 1;
        }

        return 2;
        

        





        

    }

}
