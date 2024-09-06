
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Meses meses = new Meses();

        Mensagem msg = new Mensagem();
        char escolha;
        do {


            System.out.println("Digite o nome de um pai");
            msg.nomePai = scanner.next();

            System.out.println("Digite o nome do filho");
            msg.nomeFilho = scanner.next();

            System.out.println("(1 = Masculino) (2 = Feminino)");
            int sex = scanner.nextInt();

            System.out.println("Digite o primeiro mês até o ultimo que está em aberto");
            meses.rec1 = scanner.nextInt();
            meses.rec2 = scanner.nextInt();


            if (sex == 2 && meses.rec1 == meses.rec2) {
                msg.feminino();
                meses.mes(meses.rec1, meses.rec2);
                System.out.print("ainda está em aberto.\n");
            } else if (sex == 2 && meses.rec1 != meses.rec2) {
                msg.feminimoMais();
                meses.mes(meses.rec1, meses.rec2);
                System.out.print("ainda estão em aberto.\n");
            } else if (sex == 1 && meses.rec1 == meses.rec2) {
                msg.masculino();
                meses.mes(meses.rec1, meses.rec2);
                System.out.print("ainda está em aberto.\n");
            } else if (sex == 1 && meses.rec1 != meses.rec2) {
                msg.masculinoMais();
                meses.mes(meses.rec1, meses.rec2);
                System.out.print("ainda estão em aberto.\n");
            }

            System.out.println("Quer continuar a aplicação? (s = Continuar) n = Fechar)");
             escolha = scanner.next().charAt(0);
        }while (escolha != 2);
    }
}
