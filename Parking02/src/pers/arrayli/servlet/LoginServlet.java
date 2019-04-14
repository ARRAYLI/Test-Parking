package pers.arrayli.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.arrayli.domain.AdminUser;
import com.arrayli.domain.UserInfo;

import pers.arrayli.dao.AdminUserDao;
import pers.arrayli.service.AdminUserService;
import pers.arrayli.service.UserInfoService;
import pers.arrayli.service.impl.AdminUserServiceImpl;
import pers.arrayli.service.impl.UserInfoServiceImpl;

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
		
		// 打印登录信息
		System.out.println("username = " + username);
		System.out.println("password = " + password);
		System.out.println("type = " + type);
		
		// 打印系统信息
		System.out.println("操作系统："+ "WIN10");
		System.out.println("运行环境："+"Apache Tomcat");
		System.out.println("版本："+ "version-1.0");
		DateFormat sdf = DateFormat.getDateTimeInstance();  
		
		
		
		
		
		
		// 获取输出流对象
		PrintWriter out = response.getWriter();
	
		// 2.根据提交上来的 type来判断是管理员登录还是普通用户登录
		if ("用户".equals(type)) {
			// 3. 在数据库中查找查找用户,验证管理员用户是否存在
			try {
			
				// 3. 在数据库中查找查找用户
				UserInfoService service = new UserInfoServiceImpl();
				// 调用业务层方法来验证登录
				boolean LoginResult = service.login(username,password);
				
				// 如果登录成功的话，重定向到后台的首页
				if(LoginResult){
					
					response.sendRedirect("index.jsp");
				}else{
					// 如果登录失败的话
					out.println("<script>alert('用户名或密码有误！');window.location.href='login.jsp'</script>");
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if ("管理员".equals(type)) {
			// 3. 在数据库中查找查找用户,验证管理员用户是否存在
			try {
			
				// 3. 在数据库中查找查找用户
				AdminUserService service = new AdminUserServiceImpl();
				// 调用业务层方法来验证登录
				boolean LoginResult = service.login(username,password);
				
				// 如果登录成功的话，重定向到后台的首页
				if(LoginResult){
					response.sendRedirect("index.jsp");
				}else{
					// 如果登录失败的话
					out.println("<script>alert('用户名或密码有误！');window.location.href='login.jsp'</script>");
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			// 如果登录失败的话
			out.println("<script>alert('用户名或密码有误！');window.location.href='login.jsp'</script>");
		}
		
		out.flush();
		out.close();
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
