package enumqualifier;

import javax.inject.Inject;

public class QualifierManager {
	
	@Inject
	@EQalifier(EDataBase.MSSQL)
	IDataBase iDatabase;
	
	public String getDataBaseType() {
		return iDatabase.getDataBasetype("Database: ");
	}
}
