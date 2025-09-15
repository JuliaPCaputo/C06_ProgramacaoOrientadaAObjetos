import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Júlia", "123.456.789-00");
        ProcessarPedido pedido = new ProcessarPedido();

        MemoriaUSB musb1 = new MemoriaUSB("Pen-drive ", 16);
        MemoriaUSB musb2 = new MemoriaUSB("Pen-drive ", 32);
        MemoriaUSB musb3 = new MemoriaUSB("HD Externo ", 1);

        HardwareBasico[] hardwarePc1 = {
                new HardwareBasico(
                        "Pentium Core i3",
                        2200
                ),
                new HardwareBasico(
                        "Memória RAM",
                        8
                ),
                new HardwareBasico(
                        "HD",
                        500
                )
        };
        Computador pc1 = new Computador(
                "Apple",
                687,
                hardwarePc1,
                new SistemaOperacional(
                        "macOS Sequoia",
                        64
                )
        );
        pc1.addMemoriaUSB(musb1);

        HardwareBasico[] hardwarePc2 = {
                new HardwareBasico(
                        "Pentium Core i5",
                        3370
                ),
                new HardwareBasico(
                        "Memória RAM",
                        16
                ),
                new HardwareBasico(
                        "HD",
                        1
                )
        };
        Computador pc2 = new Computador(
                "Samsung",
                687 + 1234,
                hardwarePc2,
                new SistemaOperacional(
                        "Windows 8",
                        64
                )
        );
        pc2.addMemoriaUSB(musb2);

        HardwareBasico[] hardwarePc3 = {
                new HardwareBasico(
                        "Pentium Core i7",
                        4500
                ),
                new HardwareBasico(
                        "Memória RAM",
                        32
                ),
                new HardwareBasico(
                        "HD",
                        2
                )
        };
        Computador pc3 = new Computador(
                "Dell",
                687 + 5678,
                hardwarePc3,
                new SistemaOperacional(
                        "Windows 10",
                        64
                )
        );
        pc3.addMemoriaUSB(musb3);

        System.out.println("    COMPUTADORES DISPONÍVEIS");
        System.out.println(" ");
        System.out.println("OPÇÃO 1:");
        pc1.mostraPCConfigs();
        System.out.println(" ");
        System.out.println("OPÇÃO 2:");
        pc2.mostraPCConfigs();
        System.out.println(" ");
        System.out.println("OPÇÃO 3:");
        pc3.mostraPCConfigs();
        System.out.println(" ");

        while (true) {
            System.out.println("Informe uma opção para compra (1,2 ou 3) ou 0 para finalizar: ");

            Scanner entrada = new Scanner(System.in);
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    pedido.adicionarComputador(cliente, pc1);
                    System.out.println("Computador Apple adicionado ao pedido!");
                    break;
                case 2:
                    pedido.adicionarComputador(cliente, pc2);
                    System.out.println("Computador Samsung adicionado ao pedido!");
                    break;
                case 3:
                    pedido.adicionarComputador(cliente, pc3);
                    System.out.println("Computador Dell adicionado ao pedido!");
                    break;
                case 0:
                    pedido.mostrarResumo(cliente);
                    return;
                default:
                    System.out.println("Opção inválida.");

            }
        }
    }
}