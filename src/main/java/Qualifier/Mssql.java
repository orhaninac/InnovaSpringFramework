package Qualifier;

import javax.enterprise.inject.Default;

@Default
public class Mssql implements IDataBase {
	
	@Override
	public String DataBaseType(String data) {
		return "Varsayılan mssql";
	}
	
}
