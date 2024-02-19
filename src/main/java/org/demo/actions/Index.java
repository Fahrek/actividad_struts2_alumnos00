package org.demo.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
		@Result(location = "${redirectName}", type = "redirectAction")
})
public class Index extends ActionSupport {

	private String redirectName;

	@Override
	public String execute() {
		redirectName = "intro";
		return Action.SUCCESS;
	}

	public String getRedirectName() {
		return redirectName;
	}
}
