package week0;

import java.util.Scanner;

public class Mello_Drone {

	static int x_pos;
	static int y_pos;
	static int z_pos;

	public Mello_Drone(int x_pos, int y_pos, int z_pos, String orientation) {
		x_pos = Mello_Drone.x_pos;
		y_pos = Mello_Drone.y_pos;
		z_pos = Mello_Drone.z_pos;
		orientation = Mello_Drone.orientation();
	}

	public static void main(String[] args) {
		Mello_Drone drone = new Mello_Drone(x_pos, y_pos, z_pos, orientation());
		Scanner scanner = new Scanner(System.in);
		int input;
		
		do {
			System.out.println(menu());
			input = scanner.nextInt();
			switch(input) {
				case 1:
					y_pos += 1;
					System.out.println("You have moved up");
					break;
				case 2:
					y_pos -= 1;
					System.out.println("You have moved down");
					break;
				case 3:
					z_pos += 1;
					System.out.println("You have moved forward");
					break;
				case 4:
					z_pos += 1;
					System.out.println("You have moved backward");
					break;
				case 5:
					x_pos -= 1;
					System.out.println("You have turned left");
					break;
				case 6:
					x_pos += 1;
					System.out.println("You have turned right");
					break;
				case 7:
					System.out.println(drone.toString());
					break;
				case 8:
					break;
				default:
					System.out.println("Please enter a number between 1-8");
			}
		}
		while (input != 8);
		System.out.println("See you later!");
	}
		
		public static String menu() {
			return "Which direction would you like to move the drone?" + "\n" + "1 - Move Up" + "\n" + "2 - Move Down" + "\n" + "3 - Move Forward" + "\n" + "4 - Move Backward" + "\n" + "5 - Turn Left" + "\n" + "6 - Turn Right" + "\n" + "7 - Display Position" + "\n" + "8 - Exit Navigation";
		}
		
		@Override
		public String toString() {
			return getClass().getSimpleName() + "[x_pos=" + x_pos + ", y_pos=" + y_pos + ", z_pos=" + z_pos + ", orientation=" + orientation() + "]";
		}
		
		public static String orientation() {
			if(x_pos == 0 && y_pos > 0) return "North";
			else if(x_pos > 0 && y_pos > 0) return "Northeast";
			else if(x_pos < 0 && y_pos > 0) return "Northwest";
			else if(x_pos == 0 && y_pos < 0) return "South";
			else if(x_pos > 0 && y_pos < 0) return "Southeast";
			else if(x_pos < 0 && y_pos < 0) return "Southwest";
			else if(x_pos > 0 && y_pos == 0) return "East";
			else if(x_pos < 0 && y_pos == 0) return "West";
			else return "You are at you started";
		}
	}
	
