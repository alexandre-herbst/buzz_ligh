package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        BuzzLightyear a = new BuzzLightyear();

        System.out.println("Este é o Buzz Poject");

        System.out.println("----------Entre com a ação para o Buzz!------------ ");

        Scanner teclado = new Scanner(System.in);

        System.out.println("1- Pressionar Botão Azul  ");
        System.out.println("2- Pressionar Botão Vermelho ");
        System.out.println("3- Pressionar Botão Verde  ");

        int escolha  = teclado.nextInt();

        if (escolha  == 1){

            System.out.println(a.BotaoAzul());
        }

        if (escolha  == 2){

            System.out.println(a.BotaoVermelho());
        }
        if (escolha  == 3){

            System.out.println(a.BotaoVerde());
        }


    }
}
