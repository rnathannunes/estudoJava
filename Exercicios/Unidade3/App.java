package Unidade3;

public class App {
    public static void main(String[] args){
        // 12, tela de 6.1", 256gb
        // Note 20 Ultra, tela de 6.81, 256gb
        //  Xiaomi Mi 11 Pro, tela de 8.81, 128gb
        //
        //  <tipoVariavel> nomeVariavel = valor;

    Celular celularA = new Celular();
    celularA.nome = "Iphone 12";
    celularA.tamanhoTela = 6.1f;
    celularA.espacoArmazenamento = 256;
    celularA.sistemaOperacional = "iOS";

    Celular celularB = new Celular();
    celularB.nome = "Galaxy Note 20 Ultra";
    celularB.tamanhoTela = 6.9f;
    celularB.espacoArmazenamento = 256;
    celularB.sistemaOperacional = "Android";

    Celular celularC;
    celularC = new Celular();
    celularC.nome = "Xiaomi Mi 11 Pro";
    celularC.tamanhoTela = 8.81f;
    celularC.espacoArmazenamento = 128;
    celularC.sistemaOperacional = "Android";

    //Print com formatação e não concatenação.
    System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
    System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
    System.out.format("Celular %s com tela de %.2f, com %dgb e SO %s", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);
    }
}