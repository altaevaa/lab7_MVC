package lab7;
/*
* ��� � View, ��������� �������� � �����
* */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class Controller extends View {
	@FXML private Button beginTest;
	@FXML private TextField varX;    //varX ��������� � ����� � Model. ����� ������� �������� ���?
	@FXML private TextField varY;
    @FXML private void onActionbeginSum(ActionEvent event) {
     	// ������ ������ ������ ������
        model.setVarX(varX.getText()); 
        model.setVarY(varY.getText());         
    	// �������� ����������
        model.calculate();    	// �������� �� model �� view
    }
    @FXML private void onActionbeginMinus(ActionEvent event) {
     	// ������ ������ ������ ������
        model.setVarX(varX.getText()); 
        model.setVarY(varY.getText());         
    	// �������� ����������
        model.calculate2();    	// �������� �� model �� view
    }    
    

}
