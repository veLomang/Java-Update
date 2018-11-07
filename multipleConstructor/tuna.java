package multipleConstructor;
//Constructor: Method with same name as class.
public class tuna {
	private int hour;
	private int minute;
	private int second;
						//If user gives input with 1, 2, or 3 arguments the program calls the appropriate method with x arguments
	public tuna() {
		this(0,0,0);
		
	}
	public tuna(int h) {
		this(h,0,0);
	}
	public tuna(int h, int m) {
		this(h,m,0);
	}
	public tuna(int h, int m, int s) {
		setTime(h,m,s);
	}
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
}
//WATCH NEXT TUTORIAL TO FINISH

