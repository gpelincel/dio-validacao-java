import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o 1° parametro:");
        int param_1 = scan.nextInt();
        System.out.println("Insira o 2° parametro:");
        int param_2 = scan.nextInt();

        try{
            contar(param_1, param_2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Parametro 1 maior que o Parametro 2!");
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if (parametro1 > parametro2){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametro2 - parametro1;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Printiando o numero "+i);
        }
    }
}