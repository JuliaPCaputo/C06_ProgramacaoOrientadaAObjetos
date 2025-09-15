public class ProcessarPedido {
    public void adicionarComputador(Cliente cliente, Computador computador) {
        cliente.insertComputador(computador);
    }

    public void mostrarResumo(Cliente cliente) {
        System.out.println("    RESUMO DO PEDIDO");
        System.out.println("Cliente: " + cliente.getNome() + " - CPF: " + cliente.getCpf());
        for (int i = 0; i < cliente.getQuantidadeDeComputadores(); i++) {
            cliente.getComputadores()[i].mostraPCConfigs();
            System.out.println(" ");
        }
        System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra());
    }
}