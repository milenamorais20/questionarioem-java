package projetosjava.questionario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Questionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.println("Responda com 'v' ou 'f'");
        System.out.println("A 1D possui 5 álbuns músicas. ");
        String resp = scanner.next();
        respostas.add("A 1D possui 5 álbuns músicas. . Resposta: " + resp);

        System.out.println("O último videoclipe lançado foi 'History'");
        resp = scanner.next();
        respostas.add("\nO último videoclipe lançado foi 'History'. Resposta: " + resp);

        System.out.println("Eles fizeram 3 shows no Brasil");
        resp = scanner.next();
        respostas.add("\nEles fizeram 3 shows no Brasil. Resposta: " + resp);

        System.out.println("A banda terminou com apenas 4 integrantes ao invés de 5");
        resp = scanner.next();
        respostas.add("\nA banda terminou com apenas 4 integrantes ao invés de 5. Resposta: " + resp);

        System.out.println("O ex-integrante, Harry Styles, é o queridinho do momento");
        resp = scanner.next();
        respostas.add("\nO ex-integrante, Harry Styles, é o queridinho do momento. Resposta: " + resp);

        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while (count < respostas.size()){
            String respNext = contador.next();
            if (respNext.contains("v")) {
                count++;
            }
        }

        switch (count){
            case 1:
                System.out.println("\n\nFã nutella. Pelo visto você tem muito a aprender ainda");
                break;
            case 2:
            case 3:
                System.out.println("\n\nSeja um fã melhor viu");
                break;
            case 4:
                System.out.println("\n\nEstá quase lá! Continue assim");
                break;
            case 5:
                System.out.println("\n\nVocê sim é digno de ser chamadx de directioner! Parabéns");
                break;
            default:
                System.out.println("\n\nHouve algum erro");
                break;
        }
    }
}
