package ashwin.todo;

import java.io.IOException;
import ashwin.CRUDS.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/addtodo.do")
public class AddTodoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	TodoService todoService = new TodoService();
	private TodoOperations to = new TodoOperations();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws
		IOException, ServletException{
		
		
		
		request.getRequestDispatcher("/WEB-INF/views/addtodo.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws
		IOException, ServletException{
		String newTodo = request.getParameter("todo");
		
		
		
		
			if(newTodo.equals("")){
				request.setAttribute("errorMsg", "Enter Some Value");
				request.getRequestDispatcher("/WEB-INF/views/addtodo.jsp").forward(request, response);
			}
			else{
				
				to.addTodoItem(newTodo);
				response.sendRedirect("/todo.do");
			}
		
		
	}

}
