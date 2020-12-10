

public class Ejercicio2 {
    public static int countTrue(boolean[] arr) {
        int contador=0;
        //recorro el array
        for (int i=0; i<arr.length;i++){
            //si es verdadero en la posicion dada
            if(arr[i]){
                contador++;//incrementa si cumple
            }
        }
        return contador;//regresa el numero de true
    }
}


