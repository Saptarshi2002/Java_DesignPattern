import java.util.ArrayList;
import java.util.List;

public class MainConverter implements Subject {
	
	private List<Observer> observers = new ArrayList<>();
	private int n;
	private boolean showBin,showHex,showOct;
	

	@Override
	public void add(Observer observer) {
		observers.add(observer);	
	}

	@Override
	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
		
	}
	
	public void setValues(int n,boolean showBin,boolean showOct,boolean showHex) {
		this.n = n;
		this.showBin = showBin;
		this.showHex = showHex;
		this.showOct = showOct;
		
		notifyObserver();
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(n, showBin, showOct, showHex);
		}
		
	}
	


}
