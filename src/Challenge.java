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

            switch (operationNumber) {
                case 1:
                    System.out.println("R$ " + balance);

                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    double receiveValue = reader.nextDouble();
                    balance += receiveValue;
                    System.out.println("Saldo atualizado R$ " + balance);

                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    double sendValue = reader.nextDouble();

                    if (balance < sendValue) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        balance -= sendValue;
                        System.out.println("Saldo atualizado R$ " + balance);
                    }

                    break;
                default:
                    System.out.println("Desculpe, a opção que você digitopu não esta listada nas operações disponives, favor selecionar uma das operações abaixo: ");
                    break;
            }
        }

        reader.close();
    }
}
