package enumqualifier;

public class Mssql implements IDataBase {
	
	@Override
	public String getDataBasetype(String data) {
		return data + "Mssql";
	}
	
}
