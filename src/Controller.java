import java.util.Scanner;

public class Controller {
    Model model;
    View view;
    Scanner scan = new Scanner(System.in);
    private String firstPlayer, secondPlayer;
    private int firstPlayerGoals, secondPlayerGoals;

    public Controller(View v, Model m) {
        view = v;
        model = m;
    }

    private void readMatchData() {
        System.out.print("1o time: ");
        firstPlayer = scan.next();

        System.out.print("Gols do " + firstPlayer + ": ");
        firstPlayerGoals = scan.nextInt();

        System.out.print("1o time: ");
        secondPlayer = scan.next();

        System.out.print("Gols do " + secondPlayer + ": ");
        secondPlayerGoals = scan.nextInt();
    }

    public void readInput() {
        do {
            readMatchData();
            model.update(firstPlayer, firstPlayerGoals, secondPlayer, secondPlayerGoals);
            view.show(model.table);

            System.out.print("Continuar leitura? (S/N) ");
        } while (scan.next().equalsIgnoreCase("S"));
    }


}
