package enumqualifier;

public class PostgreSql implements IDataBase {
	@Override
	public String getDataBasetype(String data) {
		return data + "PostgreSql";
	}
	
}
