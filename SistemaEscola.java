import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8];

        System.out.println("=== Sistema Escolar ===");

        // Recebendo as 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = sc.nextDouble();
        }

        // Calculando médias bimestrais
        double mediaBim1 = notas[0];
        double mediaBim2 = notas[1];
        double mediaBim3 = notas[2];
        double mediaBim4 = notas[3];
        double mediaBim5 = notas[4];
        double mediaBim6 = notas[5];
        double mediaBim7 = notas[6];
        double mediaBim8 = notas[7];

        // Calculando médias bimestrais agrupadas
        double mediaBimestre1 = (notas[0] + notas[1]) / 2;
        double mediaBimestre2 = (notas[2] + notas[3]) / 2;
        double mediaBimestre3 = (notas[4] + notas[5]) / 2;
        double mediaBimestre4 = (notas[6] + notas[7]) / 2;

        // Calculando médias semestrais
        double mediaSemestre1 = (mediaBimestre1 + mediaBimestre2) / 2;
        double mediaSemestre2 = (mediaBimestre3 + mediaBimestre4) / 2;

        // Calculando média final anual
        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2;

        // Exibindo resultados de forma clara
        System.out.println("\n--- Relatório de Notas ---");
        System.out.printf("1º Bimestre: %.1f\n", mediaBimestre1);
        System.out.printf("2º Bimestre: %.1f\n", mediaBimestre2);
        System.out.printf("1º Semestre: %.1f\n", mediaSemestre1);
        System.out.printf("3º Bimestre: %.1f\n", mediaBimestre3);
        System.out.printf("4º Bimestre: %.1f\n", mediaBimestre4);
        System.out.printf("2º Semestre: %.1f\n", mediaSemestre2);
        System.out.printf("Média Final Anual: %.1f\n", mediaFinal);

        sc.close();
    }
}
