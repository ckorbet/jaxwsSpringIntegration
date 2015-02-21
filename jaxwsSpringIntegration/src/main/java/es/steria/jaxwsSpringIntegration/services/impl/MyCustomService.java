package es.steria.jaxwsSpringIntegration.services.impl;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import es.steria.jaxwsSpringIntegration.beans.impl.MyCustomBean;
import es.steria.jaxwsSpringIntegration.services.IMyCustomWebService;

@WebService(serviceName="myWSService")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public class MyCustomService implements IMyCustomWebService {

	private static final long serialVersionUID = 1L;

	private MyCustomBean myCustomBean;

	/**
	 * <p>
	 * Crea aun instancia por defecto de <code>MyCustomService</code>
	 * </p>
	 */
	public MyCustomService(){
		// Default constructor
	}

	/**
	 * <p>
	 * Crea una instancia de <code>MyCustomService</code> con el
	 * <code>MyCustomBean</code> que se pasa como parametro
	 * </p>
	 * @param myCustomBean
	 */
	public MyCustomService(final MyCustomBean myCustomBean){
		this.myCustomBean = myCustomBean;
	}

	@WebMethod(operationName="printMsg")
	public final String printMsg() {
		return this.myCustomBean.printMsg();
	}

	@WebMethod(operationName="printMsg", exclude=true)
	public void setMyCustomBean(final MyCustomBean myCustomBean){
		this.myCustomBean = myCustomBean;
	}

}
