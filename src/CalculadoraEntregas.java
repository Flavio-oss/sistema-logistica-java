import java.util.Scanner;

/**
 * Sistema de Gestão de Lucro para Entregadores
 * Desenvolvido para o portfólio de estudos em Java.
 */
public class CalculadoraEntregas{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada de dados
        System.out.println("--- GESTÃO DE LOGÍSTICA (iFood) ---");
        System.out.print("Digite o valor total bruto das entregas de hoje: R$ ");
        double valorBruto = teclado.nextDouble();

        System.out.print("Digite a quilometragem total percorrida: ");
        double kmPercorrido = teclado.nextDouble();

        // Variáveis de custo
        double custoManutencaoPorKm = 0.15; // Estimativa para bike (pneus, freios, óleo)
        double custoAlimentacao = 15.00;    // Valor gasto para se manter na rua

        // Cálculos
        double custoTotalManutencao = kmPercorrido * custoManutencaoPorKm;
        double lucroLiquido = valorBruto - custoTotalManutencao - custoAlimentacao;

        // Cálculo da Reserva de Emergência
        double reservaEmergencia = lucroLiquido * 0.10;
        double saldoFinalLivre = lucroLiquido - reservaEmergencia;

        // Saída de resultados
        System.out.println("\n--- RESUMO DO DIA ---");
        System.out.printf("Faturamento Bruto: R$ %.2f\n", valorBruto);
        System.out.printf("Custo de Manutenção: R$ %.2f\n", custoTotalManutencao);
        System.out.printf("Custo de Alimentação: R$ %.2f\n", custoAlimentacao);
        System.out.println("----------------------");
        System.out.printf("LUCRO LÍQUIDO REAL: R$ %.2f\n", lucroLiquido);
        System.out.println("----------------------");
        System.out.printf("Reserva de Emergência (10%%): R$ %.2f\n", reservaEmergencia);
        System.out.printf("SALDO LIVRE PARA USO: R$ %.2f\n", saldoFinalLivre);

        // Lógica de Desempenho
        if (lucroLiquido >= 60.0) {
            System.out.println("Status: DIA DE MESTRE! Meta batida.");
        } else {
            System.out.println("Status: Meta não atingida. Foco no próximo turno!");
        }

        teclado.close();
    }
}