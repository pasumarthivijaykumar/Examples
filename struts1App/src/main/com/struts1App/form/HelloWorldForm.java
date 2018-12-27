/**
 * 
 */
package struts1App.form;

import org.apache.struts.action.ActionForm;

/**
 * @author Vijay-Win
 *
 */
public class HelloWorldForm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6593169172590700057L;
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
