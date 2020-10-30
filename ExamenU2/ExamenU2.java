package examenu2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExamenU2 {

    public static void main(String[] args) {
        ExamenU2 metodo = new ExamenU2();
        Scanner V = new Scanner(System.in);
        List<Integer> P = new LinkedList<>();
        List<Integer> IP = new LinkedList<>();
        int par = 0, impar = 0, Dato, i = 0;
        do {
            System.out.println("Ingresa un numero");
            Dato = V.nextInt();
            if (metodo.esPar(Dato)) {
                if (par < 5) {
                    P.add(Dato);
                    par++;
                    i++;
                } else {
                    System.out.println("Lista Par llena");
                }
            } else {
                if (impar < 5) {
                    IP.add(Dato);
                    impar++;
                    i++;
                } else {
                    System.out.println("Lista impar Llena");
                }
            }
        } while (i < 10);
        metodo.Imprimir(P, IP, 0);
    }

    public boolean esPar(int n) {
        return n % 2 == 0;
    }

    public void Imprimir(List<Integer> I, List<Integer> IP, int i) {
        if (i < I.size()) {

            System.out.print("[" + I.get(i) + "]");
            System.out.print("[" + IP.get(i) + "]");
            Imprimir(I, IP, (i + 1));
        }
    }
}
