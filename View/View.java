package View;

import java.util.Scanner;

/**
 * Класс View  реализует методы интерфеса iGetView
 */
public class View implements iGetView{
    /**
     * Методы вывода полученных от контролера(бизнесс-логики модел) данных
     * @param s данные передаваемые в модоль отображения
     */
    @Override
    public void printAll(String s) {
        System.out.println(s);
    }

    /**
     * Метод реализует общение с пользователем. Выводится приглашение и считывается ответ на приглашение.
     * @param message
     * @return
     */
    @Override
    public String promt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
