
public class Room
{
	int locationx;
	int locationy;
	int roomId;
	Room north;
	Room east;
	Room south;
	Room west;
	
	void setLocx(int locationx)
	{
		this.locationx = locationx;
	}
	void setLocy(int locationy)
	{
		this.locationy = locationy;
	}
	int[] getRoomLocation(int roomid)
	{
		int[] coordinate = new int[2];
		coordinate[0] = this.locationx;
		coordinate[1] = this.locationy;
		return coordinate;
	}
	int getRoombyLocation(int locationx, int locationy)
	{
		int returnedID;
		if(this.locationx == locationx && this.locationy == locationy)
		{
			returnedID = this.roomId;
		}
		else
		{
			returnedID = -1;
		}
		return returnedID;
	}
	
	
	int getLocx()
	{
		return locationx;
	}
	int getLocy()
	{
		return locationy;
	}
	int roomId()
	{
		return roomId;
	}
	Room getNorthRoom()
	{
		return north;
	}
	Room getEastRoom()
	{
		return east;
	}
	Room getSouthRoom()
	{
		return south;
	}
	Room getWestRoom()
	{
		return west;
	}
	
}
