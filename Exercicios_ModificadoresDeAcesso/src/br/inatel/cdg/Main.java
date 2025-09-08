package br.inatel.cdg;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Júlia");
        c1.setCpf(123456);

        Cliente c2 = new Cliente();
        c2.setNome("Luciana");
        c2.setCpf(109876);

        Cliente clientes[] = new Cliente[2];
        clientes[0] = c1;
        clientes[1] = c2;

        Conta conta = new Conta();
        conta.setClientes(clientes);
        conta.setLimite(1000);
        conta.setNumero(1234);

        System.out.println(conta.getSaldo());

        conta.deposita(500);
        System.out.println(conta.getSaldo());

        conta.sacar(300);
        System.out.println(conta.getSaldo());

        conta.sacar(600);
        System.out.println(conta.getSaldo());
    }
}