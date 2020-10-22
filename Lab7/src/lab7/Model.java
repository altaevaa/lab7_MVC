package lab7;
/*
здесь вычисления и внутреннее хранение данных
а также регистрация и уведомление слушателей
* */
import java.util.LinkedList;
import java.util.List;

public class Model implements Observable {
	private List<Observer> observers; // список слушателей
	private int sum;
	private String varX;
	private String varY;	
	// конструктор: создаем новый список для <a>	
    Model() {
        observers = new LinkedList<>();
    }
	// регистрация слушателя
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	// уведомление слушателей
	@Override
	public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.notification(message);
        }

	}
    void setVarX (String s) {
        varX = s;
	}     
    String getVarX() {
        return varX;
    }

	
    void calculate() {
    summa();
    notifyObservers("summa");
    } 

void summa(){
	int x = Integer.parseInt(varX);
	int y = Integer.parseInt(varY);
	//какие-то вычисления
	  sum = y+x;

}
void calculate2() {
	difference();
notifyObservers("difference");
} 

void difference(){
int x = Integer.parseInt(varX);
int y = Integer.parseInt(varY);
//какие-то вычисления
  sum = y-x;

}

public int getSum() {
	return sum;
}
public String getVarY() {
	return varY;
}
public void setVarY(String varY) {
	this.varY = varY;
}
}
