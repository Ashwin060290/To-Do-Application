package ashwin.todo;
import ashwin.CRUDS.*;

import java.io.IOException;

import javax.ejb.SessionBean;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/todo.do")
public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TodoService todoService = new TodoService();
	private TodoOperations to = new TodoOperations();
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
		
		request.setAttribute("todos", to.getTodoItem());
        request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
		
	}
	
	

}
