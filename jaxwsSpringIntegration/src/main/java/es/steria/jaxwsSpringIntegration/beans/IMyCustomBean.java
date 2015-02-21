package es.steria.jaxwsSpringIntegration.beans;

import java.io.Serializable;

/**
 * <p>
 * Clase de ejmplo
 * </p>
 */
public interface IMyCustomBean extends Serializable {
	/**
	 * <p>
	 * Retorna un <code>String</code> con un mensaje de texto
	 * </p>
	 * @return <code>String</code> con el mensaje de texto
	 */
	String printMsg();
}
