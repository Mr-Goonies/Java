public class Magic {
	public static void main(String[] args) {
    int myNumber = 10; //original number
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne;
    int stepThree = stepTwo;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

    System.out.println(stepSix);

    myNumber = 20;
    
    System.out.println(stepSix);







		

	}
}
