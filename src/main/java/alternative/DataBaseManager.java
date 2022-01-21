package alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class DataBaseManager {
	
	@Inject
	private IDataBase iDataBase;
	
	public String getDatabaseName() {
		return iDataBase.DatabaseType("Mevcut Database: ");
	}
	
}
