import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota do primeiro semestre:");
        Float primeiraNota = Float.valueOf(scanner.nextLine());
        System.out.println("Digite a nota do segundo semestre");
        Float segundaNota = Float.valueOf(scanner.nextLine());
        CalcMedia(primeiraNota,segundaNota);
    }

    private static void CalcMedia(Float primeiraNota,Float segundaNota ) {
            Float mediaFinal = (primeiraNota + segundaNota) / 2;
            if(mediaFinal < 60.00){
                System.out.println("NOTA FINAL: "+ mediaFinal + " REPROVADO");
            }else{
                System.out.println("NOTA FINAL:"+ mediaFinal + " APROVADO");
            }
    }

}

/**
 * Problema "notas"
 * Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de
 * uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve (com uma casa decimal) no
 * ano juntamente com um texto explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a
 * mensagem "REPROVADO", conforme exemplos.
 * Exemplo 1:
 * Digite a primeira nota: 45.5
 * Digite a segunda nota: 31.3
 * NOTA FINAL = 76.8
 * Exemplo 2:
 * Digite a primeira nota: 34.0
 * Digite a segunda nota: 23.5
 * NOTA FINAL = 57.5
 * REPROVADO
 */