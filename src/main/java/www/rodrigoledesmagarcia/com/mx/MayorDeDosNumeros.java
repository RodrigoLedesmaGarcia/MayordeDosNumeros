package www.rodrigoledesmagarcia.com.mx;

import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {

        float numero1, numero2;
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Ingrese el primer numero a comparar: ");
        numero1 = input.nextFloat();
        System.out.print("Ingrese el segundo numero a comparar: ");
        numero2 = input.nextFloat();


        String resultado = (numero1 > numero2)? "Verdadero" : "Falso";
        System.out.println("¿Es el numero ".concat(String.valueOf(numero1)).concat(" es mayor que el numero ").
                                              concat(String.valueOf(numero2)).concat(" ?: ").concat(resultado));


    }
}
