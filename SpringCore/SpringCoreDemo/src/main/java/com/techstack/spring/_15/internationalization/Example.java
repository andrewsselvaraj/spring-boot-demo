/**
 * 
 */
package com.techstack.spring._15.internationalization;

import org.springframework.context.MessageSource;

/**
 * @author KARTHIKEYAN N
 *
 */
public class Example {

	private MessageSource messages;

	public void setMessages(MessageSource messages) {
		this.messages = messages;
	}

	public void execute() {
		String message = this.messages.getMessage("argument.required", new Object[] { "userDao" }, "Required", null);
		System.out.println(message);
	}
}
