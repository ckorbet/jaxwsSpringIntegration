package es.steria.jaxwsSpringIntegration.beans.impl;

import es.steria.jaxwsSpringIntegration.beans.IMyCustomBean;

public class MyCustomBean implements IMyCustomBean {

	private static final long serialVersionUID = 1L;

	private String textMsg;

	/**
	 * <p>
	 * Crea una instancia por defecto de <code>MyCustomBean</code>
	 * </p>
	 */
	public MyCustomBean(){
		// Default constructor
	}

	/**
	 * <p>
	 * Crea una instancia de <code>MyCustomBean>/code> con el texto
	 * que se pasa como parametro
	 * </p>
	 * @param textMsg <code>String</code> texto que se tiene que asignar
	 */
	public MyCustomBean(final String textMsg){
		this.textMsg = textMsg;
	}

	@Override
	public final String printMsg() {
		return this.textMsg;
	}

	public final String getTextMsg() {
		return textMsg;
	}

	public final void setTextMsg(final String textMsg) {
		this.textMsg = textMsg;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("MyCustomBean [textMsg=")
								  .append(textMsg).append("]").toString();
	}



}
