package boot;

public class runTest {

	public static void main(String[] args) {
		GameTest test=new GameTest();
		boolean pass=true;
		System.out.println("Zero game :");
		test.newGame();
		pass=pass&&test.testZero();
		System.out.println("Spare game :");
		test.newGame();
		pass=pass&&test.testSpare();
		System.out.println("Strike game :");
		test.newGame();
		pass=pass&&test.testStrike();
		System.out.println("Random game :");
		test.newGame();
		pass=pass&&test.testRandom();
		System.out.println("Perfect game :");
		test.newGame();
		pass=pass&&test.testPerfectGame();
		
		if(pass)
			System.out.println("Test was successfully passed");

	}

}
//Scores where checked in bowling calculator and verified
