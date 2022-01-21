package Interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@YolKesiciInterface
@Interceptor
public class YolKesiciMethod {
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {
		
		System.out.println("önceki durumum " + context.getMethod().getName() + " " + context.getClass());
		
		boolean isLogin = false;
		Object isContinue = null;
		if (isLogin) {
			System.out.println("Öncelikle üye olunuz !!!");
			return null;
		} else {
			try {
				isContinue = context.proceed();
				System.out.println(" LOgin Başarılı");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isContinue;
	}
	
}
