package ashwin.todo;

import java.io.IOException;
import ashwin.CRUDS.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/deletetodo.do")
public class DeleteTodoServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
    private TodoService todoService = new TodoService();
    private TodoOperations to = new TodoOperations();
    
    
    @Override                                      
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
    	
    	request.setAttribute("todos", to.getTodoItem());
    	request.getRequestDispatcher("/WEB-INF/views/deletetodo.jsp").forward(request, response);
		
    
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
    	
    		
			String todo=(String) request.getParameter("deletetodo");
			to.deleteTodoItem(todo);
	    	response.sendRedirect("/todo.do");
    	
    }

}
