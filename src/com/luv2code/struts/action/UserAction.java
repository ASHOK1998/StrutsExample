package com.luv2code.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.luv2code.struts.form.UserForm;

public class UserAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		UserForm userForm = (UserForm)form;
		
		System.out.println(userForm);
		if(userForm!=null && !userForm.getFirstName().isEmpty() && !userForm.getLastName().isEmpty()){
			request.setAttribute("userForm", userForm);
			HttpSession session = request.getSession();
			session.setAttribute("userForm", userForm);
			return mapping.findForward("success");
		}
		return mapping.findForward("failure");
	}

}
