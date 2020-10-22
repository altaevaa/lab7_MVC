package lab7;
/*
* это представление: то, что выводится на форму
* */
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
public class View implements Observer {
	@FXML private TabPane tabPane;	
	@FXML private Tab UserData;
	@FXML private Tab Other;
	@FXML private Tab Summa;
	// поля вывода
	@FXML private Label LabelSumma; 
	// создаем модель здесь, поскольку это суперкласс для контроллера
	Model model = new Model();   
    // конструктор: регистрация на сообщения модели
    View() {
        model.registerObserver(this);
    }
	// уведомления от модели
	@Override
	public void notification(String message) {
	// разные уведомления под разный вывод
		if (message.equals("summa")) {
            tabPane.getSelectionModel().select(1); 
            UserData.setDisable(true);
            Other.setDisable(true);
            Summa.setDisable(false);
            LabelSumma.setText("Сумма равна "+model.getSum());     		
        }  
		if (message.equals("difference")) {
            tabPane.getSelectionModel().select(1); 
            UserData.setDisable(true);
            Other.setDisable(true);
            Summa.setDisable(false);
            LabelSumma.setText("Разность равна "+model.getSum());     		
        }  	
		
	}
}
