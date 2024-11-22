//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.cliente = " Pablo Oliveira ";
        conta.saldo = 400;

        Conta destino = new Conta();
        destino.cliente = " Lucas ";

        conta.transferirPara(destino, 100);

        destino.exeibirSaldo();
    }
}
