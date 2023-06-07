
public class Challenge {
    public static void main(String[] args) {

        String name = "John Doe";
        String accountType = "Corrente";
        double balance = 3000.0;

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
    }
}
