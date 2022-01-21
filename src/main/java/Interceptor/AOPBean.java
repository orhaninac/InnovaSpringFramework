package Interceptor;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("interceptorAOP")
@ApplicationScoped
public class AOPBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Login login;
	
	public String getLogin() {
		return login.isLogin("Admin sayfası admin.xhtml");
	}
}
