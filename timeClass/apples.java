package timeClass;

public class apples {
	public static void main(String args[]) {
		tuna tunaObject = new tuna();
		//tunaObject.setTime(13, 27, 6); //LINK! Remember this!

		tunaObject.setTime(13, 27, 6);
		System.out.println(tunaObject.toMilitary());
		System.out.println(tunaObject.toNormal());
	}
}
