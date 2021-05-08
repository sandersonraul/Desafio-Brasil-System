
package desafioBrasilSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int comando = 0;

        do {
            System.out.print("\n\n +----------MENU----------+\n\n");
            System.out.println("|-------------------------------|");
            System.out.println("| Pressione[1] para - Tarefa 1. |");
            System.out.println("| Pressione[2] para - Tarefa 2. |");
            System.out.println("| Pressione[3] para - Tarefa 3. |");
            System.out.println("| Pressione[4] para - Tarefa 4. |");
            System.out.println("| Pressione[5] para - Tarefa 5. |");
            System.out.println("| Pressione[6] para - Tarefa 6. |");
            System.out.println("| Pressione[7] para - sair      |");
            System.out.println("|-------------------------------|");
            System.out.println("Selecione uma opção:");
            comando = input.nextInt();

            switch (comando) {
                case 1:
                    tarefa1();
                    break;

                case 2:
                    tarefa2();
                    break;

                case 3:
                    tarefa3();
                    break;

                case 4:
                    tarefa4();
                    break;

                case 5:
                    tarefa5();
                    break;

                case 6:
                    tarefa6();
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("\n\nOpção Inválida! Tente novamente.\n\n");
                    break;
            }
        } while (comando != 7); 
    }

    public static void tarefa1() {
        Scanner input = new Scanner(System.in);
        String nome;
        System.out.println("Digite um nome: ");
        nome = input.next();
        System.out.println(nome + " " + nome.length() + " caracteres");
    }

    public static void tarefa2() {
        Scanner input = new Scanner(System.in);
        String palavra;
        System.out.println("Informe uma palavra: ");
        palavra = input.nextLine();
        for (int i = palavra.length() - 1; i >= 0; i--) {
            System.out.print(palavra.charAt(i));
        }
    }

    public static void tarefa3() {
        Scanner input = new Scanner(System.in);
        String palavra;
        System.out.println("Informe uma palavra: ");
        palavra = input.next();
        for (int i = 0; i < (palavra.length() / 2) + 1; i++) {
            System.out.print(palavra.charAt(i));
        }
    }

    public static void tarefa4() {
        String dia;
        String mes;
        String ano;
        String teste = new String("17/01/1999");
        ArrayList<String> lista = new ArrayList<String>();
        String[] vetor = teste.split("/");
        for (int i = 0; i < vetor.length; i++) {
            lista.add(vetor[i]);
        }

        dia = lista.get(0);
        mes = lista.get(1);
        ano = lista.get(2);
       
        int d1 = Integer.parseInt(dia.substring(0, 1));
        int d2 = Integer.parseInt(dia.substring(1, 2));
        int m1 = Integer.parseInt(mes.substring(0, 1));
        int m2 = Integer.parseInt(mes.substring(1, 2));
        int a1 = Integer.parseInt(ano.substring(0, 1));
        int a2 = Integer.parseInt(ano.substring(1, 2));
        int a3 = Integer.parseInt(ano.substring(2, 3));
        int a4 = Integer.parseInt(ano.substring(3, 4));

        System.out.print(d1 + "+" + d2 + "+" + m1 + "+" + m2 + "+" + a1 + "+" + a2 + "+" + a3 + "+" + a4 + "=");
        System.out.println(d1 + d1 + m1 + m2 + a1 + a2 + a3 + a4);
    }

    public static void tarefa5() {
        Scanner input = new Scanner(System.in);
        int ddd = 0;
        HashMap<Integer, String> h = new HashMap<Integer, String>();
        h.put(61, "Brasília");
        h.put(71, "Salvador");
        h.put(11, "São Paulo");
        h.put(21, "Rio de Janeiro");
        h.put(32, "Juiz de fora");
        h.put(19, "Campinas");
        try {
            System.out.println("Digite um ddd:");
            ddd = input.nextInt();
        } catch (Exception e) {
            System.out.println("Apenas números permitidos");
        }

        if (h.containsKey(ddd)) {
            System.out.println(h.get(ddd));
        } else {
            System.out.println("DDD não cadastrado");
        }
    }

    public static void tarefa6() {
        Scanner input = new Scanner(System.in);
        int num;
        try {
            System.out.println("Digite um numero para contagem regressiva: ");
            num = input.nextInt();
            for (int i = num; i >= 0; i--) {
                System.out.println(num--);
            }
            System.out.println("KABUM!");

        } catch (Exception e) {
            System.out.println("Digite apenas números!");
        }
    }
}



