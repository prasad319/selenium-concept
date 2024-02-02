package javaconcept;

public class SwitchcaseStatementExample {

	public static void main(String[] args) {
		int month=3;
		switch(month) {
		case 1:{
			System.out.println("january");
			break;
		}
		case 2:{
			System.out.println("february");
			break;
		}
		case 3:{
			System.out.println("march");
			break;
		}
		case 4:{
			System.out.println("april");
			break;
		}
		default:{
			System.out.println("wrong input");
		}
		}
	}
}