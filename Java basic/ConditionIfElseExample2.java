package javaconcept;

public class ConditionIfElseExample2 {

	public static void main(String[] args) {
		int num1=12;
		if (num1>25) {
			System.out.println("Number is greater than 25");
		} else {
			System.out.println("Number is lesser than 25");
		}
		int num2=15;
		if (num2!=20) {
			System.out.println("Number is not equal to 20");
		} else {
			System.out.println("Number is equal to 20");
		}
		int num3=50;
		if (num3==20) {
			System.out.println("Number is equal to 20");
		} else {
			System.out.println("Number is not equal to 20");
		}
		int age=20;
		if (age>34) {
			System.out.println("Age is greater than 34");
		} else {
			System.out.println("Age is lesser than 34");
		}
		int num4=3;
		if ((num4<5)&& (num4>10)){
			System.out.println("Number is lesser than 5 and Number is greater than 10");
		}else {
			System.out.println("Number is lesser than 5 and Number is lesser than 10");
		}
		int num5=100;
		if ((num5<=100)||(num5>120)) {
			System.out.println("Number is lesser than or equal to 100 OR Number is greater than 120");
		} else {
			System.out.println("Number is lesser than or equal to 100 OR Number is lesser than 120");
		}
	}

}
