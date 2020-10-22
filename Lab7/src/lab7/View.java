package lab7;
/*
* ��� �������������: ��, ��� ��������� �� �����
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
	// ���� ������
	@FXML private Label LabelSumma; 
	// ������� ������ �����, ��������� ��� ���������� ��� �����������
	Model model = new Model();   
    // �����������: ����������� �� ��������� ������
    View() {
        model.registerObserver(this);
    }
	// ����������� �� ������
	@Override
	public void notification(String message) {
	// ������ ����������� ��� ������ �����
		if (message.equals("summa")) {
            tabPane.getSelectionModel().select(1); 
            UserData.setDisable(true);
            Other.setDisable(true);
            Summa.setDisable(false);
            LabelSumma.setText("����� ����� "+model.getSum());     		
        }  
		if (message.equals("difference")) {
            tabPane.getSelectionModel().select(1); 
            UserData.setDisable(true);
            Other.setDisable(true);
            Summa.setDisable(false);
            LabelSumma.setText("�������� ����� "+model.getSum());     		
        }  	
		
	}
}
