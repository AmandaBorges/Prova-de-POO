public class Campeonato {

    Time time1, time2, time3, time4;
    Jogo jogo1, jogo2, jogo3, jogo4, jogo5, jogo6;

    int pontosr1;

    int pontos2;

    public Campeonato(Time time1, Time time2, Time time3, Time time4, Jogo jogo1, Jogo jogo2, Jogo jogo3, Jogo jogo4, Jogo jogo5, Jogo jogo6) {
        this.time1 = time1;
        this.time2 = time2;
        this.time3 = time3;
        this.time4 = time4;
        this.jogo1 = jogo1;
        this.jogo2 = jogo2;
        this.jogo3 = jogo3;
        this.jogo4 = jogo4;
        this.jogo5 = jogo5;
        this.jogo6 = jogo6;
    }

    int pontos3;
    int pontos4;

    public int calculaPontos(Time time) {

        int pontosTime = 0;


//      JOGO 1

        if (this.jogo1.time1.getNomeTime() == time.getNomeTime()) {
            if (this.jogo1.getVencedor() == 1) {
                pontosTime = pontosTime + 3;
            }
            if (this.jogo1.getVencedor() == 0) {
                pontosTime = pontosTime + 1;
            }
        }

        if (this.jogo1.time2.getNomeTime() == time.getNomeTime()) {
            if (this.jogo1.getVencedor() == 2) {
                pontosTime = pontosTime + 3;
            }
            if (this.jogo1.getVencedor() == 0) {
                pontosTime = pontosTime + 1;
            }
        }
//        JOGO 2

        if(this.jogo2.time1.getNomeTime() == time.getNomeTime()){
            if(this.jogo2.getVencedor()==1)
            {
                pontosTime = pontosTime+3;
            }
            if(this.jogo2.getVencedor()==0)
            {
                pontosTime = pontosTime + 1;
            }
        }
        if(this.jogo2.time2.getNomeTime() == time.getNomeTime()){
            if(this.jogo2.getVencedor()==2)
            {
                pontosTime = pontosTime+3;
            }
            if(this.jogo2.getVencedor()==0){
                pontosTime = pontosTime + 1;
            }
        }

//        JOGO 3

        if(this.jogo3.time1.getNomeTime() == time.getNomeTime()){
            if(this.jogo3.getVencedor()==1)
            {
                pontosTime = pontosTime+3;
            }
            if(this.jogo3.getVencedor()==0)
            {
                pontosTime = pontosTime + 1;
            }
        }
        if(this.jogo3.time2.getNomeTime() == time.getNomeTime()){
            if(this.jogo3.getVencedor()==2)
            {
                pontosTime = pontosTime+3;
            }
            if(this.jogo3.getVencedor()==0){
                pontosTime = pontosTime + 1;
            }
        }
//     JOGO 4

        if(this.jogo4.time1.getNomeTime() == time.getNomeTime()){
            if(this.jogo4.getVencedor()==1)
            {
                pontosTime = pontosTime+3;
            }
            if(this.jogo4.getVencedor()==0)
            {
                pontosTime = pontosTime + 1;
            }
        }
        if(this.jogo4.time2.getNomeTime() == time.getNomeTime()){
            if(this.jogo4.getVencedor()==2)
            {
                pontosTime = pontosTime+3;
            }
            if(this.jogo4.getVencedor()==0){
                pontosTime = pontosTime + 1;
            }
        }

//        JOGO 5

        if(this.jogo5.time1.getNomeTime() == time.getNomeTime()){
            if(this.jogo5.getVencedor()==1)
            {
                pontosTime = pontosTime+3;
            }
            if(this.jogo5.getVencedor()==0)
            {
                pontosTime = pontosTime + 1;
            }
        }
        if(this.jogo5.time2.getNomeTime() == time.getNomeTime()){
            if(this.jogo5.getVencedor()==2)
            {
                pontosTime = pontosTime+3;
            }
            if(this.jogo5.getVencedor()==0){
                pontosTime = pontosTime + 1;
            }
        }

//        JOGO6

        if(this.jogo6.time1.getNomeTime() == time.getNomeTime()){
            if(this.jogo6.getVencedor()==1)
            {
                pontosTime = pontosTime+3;
            }
            if(this.jogo6.getVencedor()==0)
            {
                pontosTime = pontosTime + 1;
            }
        }
        if(this.jogo6.time2.getNomeTime() == time.getNomeTime()){
            if(this.jogo6.getVencedor()==2)
            {
                pontosTime = pontosTime+3;
            }
            if(this.jogo6.getVencedor()==0){
                pontosTime = pontosTime + 1;
            }
        }
        return pontosTime;
    }

    public String classificação(){
        String primeiroLugar = "";
        String segundoLugar = "";
        String terceiroLugar = "";
        String quartoLugar = "";

        return primeiroLugar;
    }

//    public void mostraResultados() {

//        System.out.println("Nome: " + this.get());
//        System.out.println("Tipo de conta : " + this.tipo);
//        System.out.println("Saldo da conta: " + getSaldo());
//        System.out.println("Status da conta: " + isStatus());
//
//
//        System.out.println(" - X - ");
//        System.out.println("   ");
//    }



}
