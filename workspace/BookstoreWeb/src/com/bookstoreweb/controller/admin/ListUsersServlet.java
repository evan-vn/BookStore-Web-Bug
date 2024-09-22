package com.bookstoreweb.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstoreweb.entity.Users;
import com.bookstoreweb.service.UserServices;


@WebServlet("/admin/list_users")
public class ListUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ListUsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserServices userService = new UserServices();
		List<Users> list_users = userService.listUser();
		request.setAttribute("listUsers",list_users );
		
		String listPage = "user_list.jsp";
		
		RequestDispatcher requestDispatcher= request.getRequestDispatcher(listPage);
		requestDispatcher.forward(request, response);
		
		
	}


}
