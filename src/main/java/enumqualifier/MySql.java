package enumqualifier;

public class MySql implements IDataBase {
	
	@Override
	public String getDataBasetype(String data) {
		// TODO Auto-generated method stub
		return data + "mySql";
	}
}
