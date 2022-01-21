package alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class MySql implements IDataBase {
	
	@Override
	public String DatabaseType(String data) {
		
		return data + "Mssql";
	}
	
}
