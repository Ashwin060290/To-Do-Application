package ashwin.login;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ashwin.todo.TodoService;

@WebServlet(urlPatterns = "/login.check")
public class LoginCheckServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private UserValidationService service = new UserValidationService();
	private TodoService todoService = new TodoService();
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name =  request.getParameter("name");
		String pass =  request.getParameter("pass");
		boolean check = service.isUserValid(name, pass);
		
		if(check)
		{
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			response.sendRedirect("/todo.do");
			
		}
		else{
			request.setAttribute("errorMsg", "Invalid Name or Password");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}

}
