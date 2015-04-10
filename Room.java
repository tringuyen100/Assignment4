/**
 * Room class to use for creating a new room
 * Room = room = new Room("yellow", "Hard wood floor", 1);
 * room.getWall
 * @author tri_nguyenhien
 *
 */
public class Room {
	private String wall;
	private String floor;
	private int window;
	/**
	 * Initialize the room to default
	 */
	public Room() {
		this.wall = "white";
		this.floor = "carpet";
		this.window = 0;
	} 
	/**
	 * initialize the room value
	 * @param wall
	 * @param floor
	 * @param window
	 */
	public Room(String wall, String floor, int window) {
		this.wall = wall;
		this.floor = floor;
		this.window = window;
		
	}
	/**
	 * Ask for the wall color
	 * @return the wall color
	 */
	public String getWall() {
		return "wall";
	}
	/**
	 * the wall color
	 * @param wall the color of the wall in double type
	 */
	public void setWall(String wall) {
		this.wall = wall;
	}
	/**
	 * Ask for the type of floor
	 * @return the type of floor
	 */
	public String getFloor() {
		return "floor";
	}
	/**
	 * the floor type
	 * @param floor the type of floor in double type
	 */
	public void setFloor(String floor) {
		this.floor = floor;
	}
	/**
	 * ask for the number of windows
	 * @return the number of windows
	 */
	public String getWindow(){
		return "window";
	}
	/**
	 * the number of windows
	 * @param window the number of window in double type
	 */
	public void setWindow(int window) {
		this.window = window;
	} 
	/**
	 * 
	 * @return the room information
	 */
	public String toString() {
		return "Wall color is: " + this.wall
			+ "\nFloor style is: " + this.floor
			+ "\nNumber of windows are: " + this.window;
	}

}
