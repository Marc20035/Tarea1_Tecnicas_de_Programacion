//¿Qué algoritmos usas en tu vida cotidiana? ¿Piensas que podrías escribir un programa para hacerlos más eficientes?

//genera un algoritmo que utilizamos en nuestra vida cotidiana en java
//y que podriamos escribir un programa para hacerlos mas eficientes
//el algoritmo que se generara sera el de la suma de los numeros del 1 al 100
//el programa se ejecutara en la consola de comandos
class Pregunta1{
    public static void main(String[] args){
        int suma = 0;
        for(int i = 1; i <= 100; i++){
            suma = suma + i;
        }
        System.out.println("La suma de los numeros del 1 al 100 es: " + suma);
    }
}


