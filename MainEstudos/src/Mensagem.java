public class Mensagem{

    String nomePai;
    String nomeFilho;



    public void feminino(){
        System.out.println("Olá "+nomePai+", boa tarde! Tudo bem? estou entrando em contato pois foi " +
                "verificado que a mensalidade da "+nomeFilho+" do mês de ");
    }

    public void masculino() {
        System.out.println("Olá "+nomePai+", boa tarde! Tudo bem? estou entrando em contato pois foi " +
                "verificado que a mensalidade do "+nomeFilho+" do mês de ");
    }

    public void feminimoMais() {
        System.out.println("Olá " + nomePai+ ", boa tarde! Tudo bem? estou entrando em contato pois foi " +
                "verificado que as mensalidades da " + nomeFilho+ " dos meses de ");
    }

    public void masculinoMais() {
        System.out.println("Olá " + nomePai + ", boa tarde! Tudo bem? estou entrando em contato pois foi " +
                "verificado que as mensalidades do " + nomeFilho + " dos meses de ");
    }

}
