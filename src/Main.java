import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Pegar o Input
        Scanner leitura = new Scanner(System.in);

        //Informações Iniciais
        String nome = "Alex Mobilly";
        String tipoConta = "Corrente";
        double saldo = 1412.0;

        //Interface de Informação
        System.out.println("****************");
        System.out.println("Banco Quadros");

        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);

        System.out.println("\n****************");

        //Opções para Operação
        String menu = """
                1 - Consultar saldo
                2 - Tranferir valor
                3 - Receber valor
                4 - Sair
                
                """;

        //Operações
        for (int i = 0; i <= 4; i++) {
            System.out.println(menu);
            System.out.println("\nDigite a opção desejada: ");
            int opcao = leitura.nextInt();

            if (opcao == 1){
                //Confirir o Saldo da Conta
                System.out.println("R$ " + saldo + " Disponível em sua Conta");
            } else if (opcao == 2) {
                System.out.println("Informe o valor que deseja transferir: ");
                double saque = leitura.nextDouble();
                if (saque <= saldo) {
                    saldo = (saldo - saque);
                    System.out.println("Saldo atualizado R$ " + saldo);
                } else {
                    System.out.println("Não há saldo suficiente para fazer essa Tranfêrencia");
                }
            } else if (opcao == 3) {
                //Receber o Dinheiro
                System.out.println("Informe o valor a receber: ");
                double deposito = leitura.nextDouble();
                saldo = (saldo + deposito);
                System.out.println("Saldo atualizado R$ " + saldo);
            } else if (opcao != 4){
                System.out.println("Operação Inválida");
            } else {
                System.exit(0);
            }
        }
    }
}
