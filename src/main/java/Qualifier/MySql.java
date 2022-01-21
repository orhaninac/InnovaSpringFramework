package Qualifier;

@QualifierCokluSecim
public class MySql implements IDataBase {
	
	@Override
	public String DataBaseType(String data) {
		return "Opsiyonel mssql";
	}
	
}
