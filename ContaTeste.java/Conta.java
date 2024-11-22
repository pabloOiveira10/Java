import java.nio.file.FileSystemNotFoundException;

public class Conta {
    public String cliente;
    public double saldo;

    void exeibirSaldo() {
        System.out.println(cliente + "seu saldo é: " + saldo);

    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Operação não realizada! Saldo insuficiente");
        } else {
            saldo -= valor;
        }



    }

    void transferirPara(Conta destino, double valor ){
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("");
        System.out.println("=============================================");
        System.out.println(this.cliente + "Tranferencia de R$" + valor + "\nPara" +  destino.cliente);
        System.out.println("==============================================");

    }

}
