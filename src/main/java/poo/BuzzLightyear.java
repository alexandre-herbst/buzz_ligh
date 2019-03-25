package poo;

import java.util.Random;

public class BuzzLightyear {


    private String frase1 =   "Eu sou Buzz Lightyear";
    private String frase2 =   "Ao infinito, e além! ";
    private String frase3 =   "Buzz Lightyear ao resgate!";
    private String frase4 =   "Buzz Lightyear se apresentando para o serviço";
    private String frase5 =   "Eu sou Buzz Lightear, patrulheiro espacial";
    private String frase6 =   "Buzz Lightyear, desligando!!";

    private String frases[] = {frase1,frase2,frase3,frase4,frase5,frase6};

    private Random rand = new Random();

    public String BotaoAzul() {
        String a =  frases[rand.nextInt(6)];
        return a;
    }
    public String BotaoVermelho() {
        String a =  frases[rand.nextInt(6)];
        return a;
    }
    public String BotaoVerde() {
        String a =  frases[rand.nextInt(6)];
        return a;
    }
//    public String BotaoRedondo() {
//    }
//    public String BotaoLazer() {
//    }
//    public String BotaoKarate() {
//    }


}
