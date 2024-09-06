public class Meses {

    String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    int rec1;
    int rec2;

    void MesesBuilder() {
        this.meses = meses;
        this.rec1 = rec1;
        this.rec2 = rec2;
    }

    public void mes(int rec1, int rec2) {

        for (int i = this.rec1; i <= this.rec2; i++ ) {
            if (this.rec1 == this.rec2) {
                System.out.print(meses[this.rec1]+" ");
                this.rec1++;
            } else if (this.rec2 - this.rec1 == 1){
                System.out.print(meses[this.rec1] + " e ");
                this.rec1++;
            } else {
                System.out.print(meses[this.rec1] + ", ");
                this.rec1++;
            }
        }
    }

}
