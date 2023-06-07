import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

        String name = "John Doe";
        String accountType = "Corrente";
        double balance = 3000.0;
        int operationNumber = 0;

        System.out.println(
            """
            **********************************
            Dados iniciais do cliente:

            Nome do cliente: %s
            Tipo de conta: %s
            Saldo inicial: %f
            **********************************
            """.formatted(name, accountType, balance)
        );

        String menu = """
            \n** Digite sua opção **

            1- Consultar saldos
            2- Receber valor
            3- Transferir valor
            4- Sair

            """;

        Scanner reader = new Scanner(System.in);

        while (operationNumber != 4) {
            System.out.println(menu);
            operationNumber = reader.nextInt();
        }

        reader.close();
    }

}
