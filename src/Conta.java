public class Conta {
    private double saldo;
    private String tipo;

    public Conta(double saldoInicial, String tipo) {
        this.saldo = saldoInicial;
        this.tipo = tipo;
    }

    public boolean depositar(double valor) {
        if ("Corrente".equals(tipo) && valor > 1000.00) {
            System.out.println("Depósito falhou: valor acima do permitido para contas correntes.");
            return false;
        }
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
        return true;
    }

    public boolean sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saque falhou: saldo insuficiente.");
            return false;
        }
        this.saldo -= valor;
        System.out.println("Saque realizado com sucesso.");
        return true;
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if ("Corrente".equals(this.tipo) && "Poupança".equals(contaDestino.tipo)) {
            if (valor > saldo) {
                System.out.println("Transferência falhou: saldo insuficiente.");
                return false;
            }
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência realizada com sucesso.");
            return true;
        } else {
            System.out.println("Transferência falhou: transferência permitida apenas de Corrente para Poupança.");
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }
}
