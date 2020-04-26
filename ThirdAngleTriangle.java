package table;

import java.util.Scanner;

public class ThirdAngleTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float firstAngle, secondAngle, thirdAngle;
		
		System.out.print("Enter the first two angles in order: ");
		
		firstAngle = scan.nextInt();
		secondAngle = scan.nextInt();
		
		scan.close();
		
		thirdAngle = calculateThirdAngle(firstAngle, secondAngle);
		
		System.out.printf("Third angle calculated is: %f", thirdAngle);

	}
	
	static float calculateThirdAngle(float angle1, float angle2) {
		return 180 - angle1 - angle2;
	}

}
