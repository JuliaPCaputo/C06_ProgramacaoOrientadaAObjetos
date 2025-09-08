package Exercicio0_Cantina;

public class Cantina {
    String nome;
    Salgado salgados[] = new Salgado[3];
    int i;

    void addSalgado(Salgado novoSalgado){
        for(i = 0; i < salgados.length; i++){
            if(salgados[i] == null){
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("A " + nome + " possui os seguintes salgados: ");
        for(Salgado salgado : salgados){
            if(salgado != null){ // Verifica se existe salgado antes de imprimir
                System.out.println(salgado.nome);
            }
        }
    }
}
