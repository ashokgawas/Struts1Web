package com.struts1.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

public class LoginAction extends Action {

	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception 
	{
		LoginForm loginForm = (LoginForm) form;
		
		System.out.println("username - " + loginForm.getUserName() + "\npassword - " + loginForm.getPassword());
		
		if (loginForm.getUserName().equals(loginForm.getPassword())) {
			return mapping.findForward(SUCCESS);
		}
		else {
			return mapping.findForward(FAILURE);
		}
	}
}
