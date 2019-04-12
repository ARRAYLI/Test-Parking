package pers.arrayli.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
/**
 * @author lzj13 用户登录类
 */
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. 从jsp页面获取提交上来的数据
		String username = request.getParameter("username");
		String password = request.getParameter("userpwd");
		String type = request.getParameter("type");

		System.out.println("username = " + username);
		System.out.println("password = " + password);
		System.out.println("type = " + type);

		// 2.根据提交上来的 type来判断是管理员登录还是普通用户登录
		if ("用户".equals(type)) {
			
			// 3. 在数据
			
			
		}
		if ("管理员".equals(type)) {

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
