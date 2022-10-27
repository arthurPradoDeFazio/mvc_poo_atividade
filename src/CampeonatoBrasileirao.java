public class CampeonatoBrasileirao {
    public static void main(String[] args) {
        View view = new TableView();
        Model model = new Model();
        Controller controller = new Controller(view, model);
        controller.readInput();
    }
}
