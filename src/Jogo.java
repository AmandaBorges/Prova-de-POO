public class Jogo {

    public String dataJogo;
    public Time time1;
    public Time time2;
    public Double placarTime1;

    public Double placarTime2;

    public int vencedor;

    public Jogo(String dataJogo, Time time1, Time time2, Double placarTime1, Double placarTime2, int vencedor) {
        this.dataJogo = dataJogo;
        this.time1 = time1;
        this.time2 = time2;
        this.placarTime1 = placarTime1;
        this.placarTime2 = placarTime2;
        this.vencedor = vencedor;
    }

    public Jogo(String dataJogo, Time time1, Time time2, double placarTime1, double placarTime2) {
        this.dataJogo = dataJogo;
        this.time1 = time1;
        this.time2 = time2;
        this.placarTime1 = placarTime1;
        this.placarTime2 = placarTime2;
    }

    public int getVencedor() {
        if (placarTime1 > placarTime2) {
            return 1;
        } else if (placarTime2 > placarTime1) {
            return 2;

        } else {
            return 0;
        }
    }

    public String placarAtual (){
        return  this.time1.getNomeTime() + " " + placarTime1 + " x " + this.placarTime2 + " " + this.time2.getNomeTime();

    }

}
