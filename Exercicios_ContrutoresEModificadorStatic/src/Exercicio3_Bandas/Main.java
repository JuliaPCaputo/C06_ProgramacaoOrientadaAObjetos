package Exercicio3_Bandas;

public class Main {
    public static void main(String[] args) {
        Empresario emp = new Empresario("Carla Andrade", 123456);
        Banda banda = new Banda("Legião Urbana", "Rock alternativo");

        banda.setEmpresario(emp);

        banda.addMembroNovo(new Membro("Renato Russo", "Vocal"));
        banda.addMembroNovo(new Membro("Marcelo Bonfá", "Bateria"));
        banda.addMembroNovo(new Membro("Dado Villa-Lobos", "Guitarra"));
        banda.addMembroNovo(new Membro("Renato Rocha", "Baixo"));

        banda.addMusicaNova(new Musica("Que país é este?", 2.58));
        banda.addMusicaNova(new Musica("Eduardo e Mônica", 4.31));

        banda.mostraInfo();
    }
}
