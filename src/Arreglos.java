import java.util.Scanner;

// Programa que declare un vector de diez elementos enteros y pida números para rellenarlo hasta que se llene el vector
// o se introduzca un número negativo. Entonces se debe imprimir el vector (sólo los elementos introducidos).


public class Arreglos {
    // definimos el arreglo notas
    int[] notas;
    Scanner scanner;


    //metodo constructor
    public Arreglos(){
        notas = new int[10];
        scanner = new Scanner(System.in);
    }

    //metodo ejecutar
    int cero = 0;
    public  void  ejecutar( ){
        for (int i = 0 ; i < notas.length; i++){

                System.out.println("notas(" + i + ")");
                int nota = scanner.nextInt();

                notas[i] = nota;
                if (notas[i] < 0){
                    break;
                }

        }


        for (int i = 0;i < notas.length; i++){
            System.out.println("notas(" + notas[i] + ")");

            }

        }



}
