package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * <code>Set welcome message.</code>
 */
public class RegistryAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        setMessage(getText(MESSAGE));
        setFormTitleMessage(getText(TITLE_FORM_MESSAGE));
        return SUCCESS;
    }

    /**
     * Provide default value for Message property.
     */
    public static final String MESSAGE = "hello.message";
    public static final String TITLE_FORM_MESSAGE = "form.title.message";

    /**
     * Field for Message property.
     */
    private String message;
    private String formTitleMessage;

    public String getFormTitleMessage() {
        return formTitleMessage;
    }

    public void setFormTitleMessage(String formTitleMessage) {
        this.formTitleMessage = formTitleMessage;
    }

    /**
     * Return Message property.
     *
     * @return Message property
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set Message property.
     *
     * @param message Text to display on HelloWorld page.
     */
    public void setMessage(String message) {
        this.message = message;
    }
}