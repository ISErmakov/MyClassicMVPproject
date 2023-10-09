import Controller.Controller;

public class App {
    /**
     * Создаем экземпляр контролера и запускаем его
     * @param args
     */
    public static void main(String[] args) {
        Controller control = new Controller();
        control.run();
    }
}
