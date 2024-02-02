package javaconcept;

public class ConditionIfElseIfLadderExample2 {

	public static void main(String[] args) {
		int num1=25;
		if (num1<24) {
			System.out.println("Number is lesser than 25");
		} else if(num1>50) {
			System.out.println("Number is greater than 50");
		}else {
			System.out.println("Number is greater than 24 and lesser than 50");
		}
	}

}
