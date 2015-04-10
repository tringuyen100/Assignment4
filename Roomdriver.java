/**
*Room driver to make the room
 * @author tri_nguyenhien
 */
import java.util.Scanner;


public class Roomdriver {
	public static void main(String[] args) {
	/**
	 * Making new room
	 *	
	 */
		Room room = new Room();
		System.out.println(room.toString());
		Room room2 = new Room("Yellow", "Hard wood floor", 1);
		System.out.println("\n" + room2);
		Room room1 = new Room("Purple", "Tiled", 0);
		System.out.println("\n" + room1);
		Room room3 = new Room("White", "Carpet", 3);
		System.out.println("\n" + room3);
	
		//Ask the user to create their own room 	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\nEnter room color");
		String wall = keyboard.next();
		room.setWall(wall);
		System.out.println("Enter floor type");
		String floor = keyboard.next();
		room.setFloor(floor);
		System.out.println("Enter amount of windows");
		int window = keyboard.nextInt();
		room.setWindow(window);
		System.out.println(room);
		
	}

}

