import java.util.Scanner;
public class calculatingScore {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); {
		System.out.print("Please provide me with the total touchdowns of the player: ");
		int touchdowns = input.nextShort();
		int scoreTouchdowns =  touchdowns * 330;
		
		}
		Scanner input2 = new Scanner(System.in); {
		System.out.print("Please provide me with the total interceptions they made: ");
		int interceptions = input2.nextShort();
		int scoreInterceptions = interceptions * 200;
		}
		System.out.println(scoreTouchdowns + scoreInterceptions);
		}
	}

