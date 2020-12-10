public class Ejercicio3 {
    public static int differenceMaxMin(int[] arr) {
        //inicializo con valores del arreglo
        int max = arr[0];
        int min = arr[0];
        //Recorro el arreglo
        for (int i =0; i<arr.length;i++){
            if(min<arr[i]){ //verifico que sea mayor que el minimo
                if (max<arr[i]){ //compruebo que sea mayor que el que tengo guardado
                    max= arr[i];
                }
            }else {
                if (min>arr[i]){ //compruebo que sea menor del que tengo guardado
                    min =arr[i];
                }
            }
        }//retorno la diferencia
        return max-min;
    }
}
