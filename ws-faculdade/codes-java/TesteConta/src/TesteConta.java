public class TesteConta{
    public static void main(String[] args) {
        Conta c1 = new Conta(1, "Pablo", 123, 200.0);

        System.out.println(c1.saldo);
        System.out.println(verificaSaldo(123));
        System.out.println(creditaValor(300));
    }
}
