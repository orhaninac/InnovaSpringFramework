package alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class PostgreSql implements IDataBase {
	@Override
	public String DatabaseType(String data) {
		
		return data + "Mssql";
	}
	
}
