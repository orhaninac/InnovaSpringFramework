package Qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("qualiferCDI")
@ApplicationScoped
public class QualifierManager implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	@QualifierCokluSecim
	private IDataBase iDataBase;
	
	public String getiJavaVersion() {
		return iDataBase.DataBaseType(" Type:  ");
	}
	
}
