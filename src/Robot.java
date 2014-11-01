
public class Robot 
{
	enum directions{front, right, left, back,}
	
	int getCurrentRoomID(int current_x, int current_y)
	{
		int current_id;
		current_id = current_x + 4*current_y;
		return current_id;
	}
	
	
}
