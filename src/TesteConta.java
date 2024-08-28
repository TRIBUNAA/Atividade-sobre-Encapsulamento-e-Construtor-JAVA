public class TesteConta {
    public static void main(String[] args) {
        Conta contaCorrente = new Conta(0, "Corrente");
        Conta contaPoupanca = new Conta(0, "Poupança");

        System.out.println("Tentando depositar R$ 1.500,00 na conta corrente...");
        contaCorrente.depositar(1500.00); // Deve falhar

        System.out.println("Tentando depositar R$ 1.500,00 na conta poupança...");
        contaPoupanca.depositar(1500.00); // Deve passar

        System.out.println("Depositando R$ 98,52 na conta poupança...");
        contaPoupanca.depositar(98.52); // Deve passar

        System.out.println("Tentando sacar R$ 100,00 da conta poupança...");
        contaPoupanca.sacar(100.00); // Deve falhar

        System.out.println("Tentando transferir R$ 1.800,00 da conta corrente para poupança...");
        contaCorrente.transferir(1800.00, contaPoupanca); // Deve falhar

        System.out.println("Transferindo R$ 700,00 da poupança para a conta corrente...");
        contaPoupanca.transferir(700.00, contaCorrente); // Deve falhar

        System.out.println("Sacando R$ 1.000,00 da conta poupança...");
        contaPoupanca.sacar(1000.00); // Deve passar

        System.out.println("Sacando R$ 1.000,00 da conta corrente...");
        contaCorrente.sacar(1000.00); // Deve falhar
    }
}

