package Controller;

import View.View;
import Model.Model;
import View.iGetView;

public class Controller {
    private String helloparam;
    //Экземпляры интерфейсов View, Model;
    private iGetView view;
    private iGetModel model;

    private String data; //Это наша импортированная структура данных

    /**
     * Экземпляр контролера создает экземпляры View и Model
     * Важное замечание! Модел должен знать о структуре данных поскольку их формирует(скачивает/закачивает)
     * Контролер должен знать о структуре данных поскольку их верефицирует
     * Вью должен знать о структуре поскольку их выводит(отображает) пользователю
     * ИТОГ структуру данных лучше в отдельную папку
     */
    public Controller(){
        this.view = new View();
        this.model = new Model();
    }

    public boolean testData(String data){
        return !data.isEmpty();
    }

    public void run(){
        //Если мы уверены во View то выводим приглашение в него
        view.promt("---------------New Hello-------------------");
        //Если мы уверены в model то получаем данные из него
        data = model.getALL();
        //Полученные данные проверяем и передаем на отображение View;
        if (testData(data)){
            view.printAll(data);
        }
        else view.promt("Ошибка чтения данных 0");

    }
}