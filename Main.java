import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int numero = rnd.nextInt(10);
        int sla = 0;
        while (sla != numero) {
            System.out.println("Adivinhe o número de 1 a 10: ");
            sla = sc.nextInt();
            if (sla == numero) {
                System.out.println("Parabéns! Você acertou!");
            } else if (sla > numero) {
                System.out.println("Tenten um número menor!");

            } else if (sla < numero) {
                System.out.println("Tente um número maior");
            } else if (sla > 10){
                System.out.println("Coloque só números de 1 a 10!");
            }
        } 
    }
}