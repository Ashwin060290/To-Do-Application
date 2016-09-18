package ashwin.Test;


import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/test.check")
public class AppTestMain extends HttpServlet{
	
		private static final long serialVersionUID = 1L;
			
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			myApplicationTest test = new myApplicationTest();
			
			test.startWebDriver();
			
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
			
		}
		

}
