
public class Robot 
{
	enum directions{front, right, left, back,}
	//enum wall{oepned, closed,}
	
	int getCurrentRoomID(int current_x, int current_y)
	{
		int current_id;
		current_id = current_x + 4*current_y;
		return current_id;
	}
	boolean[] getSencerValue()
	{
		boolean sencerResult[] = new boolean[3];
		//if door is opened, hold value is ture; otherwise, false.
		return sencerResult;
	}
	
	
}
