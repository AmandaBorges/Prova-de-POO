public class TesteJogos {

    public static  void main (String[] args){

        Time time1 = new Time();
            time1.setNomeTime("Vasco");
            time1.setCorTime("Amarelo");
            time1.setTecnicoTime("Antônio");

        Time time2 = new Time();
            time2.setNomeTime("Palmeiras");
            time2.setCorTime("Verde");
            time2.setTecnicoTime("João");

        Time time3 = new Time();
            time3.setNomeTime("Ceará");
            time3.setCorTime("Branco e Preto");
            time3.setTecnicoTime("Silva");

        Time time4 = new Time();
            time4.setNomeTime("Fortaleza");
            time4.setCorTime("Vermelho e azul");
            time4.setTecnicoTime("Joaquim");

        Jogo jogo1 = new Jogo("23/08/2022",time1,time2, 4d, 3d);
        Jogo jogo2 = new Jogo("27/07/22", time1, time3, 4d, 4d);
        Jogo jogo3 = new Jogo("29/07/22", time1, time4, 2d, 0d);
        Jogo jogo4 = new Jogo("01/08/22", time2, time3, 1d, 4d);
        Jogo jogo5 = new Jogo("05/08/22", time2, time4, 8d, 4d);
        Jogo jogo6 = new Jogo("09/08/22", time3, time4, 1d, 3d);

        Campeonato campeonato = new Campeonato(time1, time2, time3, time4, jogo1, jogo2, jogo3, jogo4, jogo5, jogo6);

        System.out.println("O time1 pontuou um total de: " + campeonato.calculaPontos(time1));
        System.out.println("O time2 pontuou um total de: " + campeonato.calculaPontos(time2));
        System.out.println("O time3 pontuou um total de: " + campeonato.calculaPontos(time3));
        System.out.println("O time4 pontuou um total de: " + campeonato.calculaPontos(time4));


    }



}