package ashwin.filter;

import java.io.IOException;


import java.io.PrintWriter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebFilter(urlPatterns = "*.do")
public class LoginRequiredFilter implements Filter {
	
	@Override
	public void destroy(){
		
	}
	
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException{
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		System.out.print(request.getSession().getAttribute("name"));
		
				if(request.getSession().getAttribute("name") != null){
					
					chain.doFilter(servletRequest , servletResponse );
				}
				else{
					
					//request.setAttribute("errorMsg", "Please Enter Login Details");
					request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
				
				}
		}
	
	
	@Override
	public void init(FilterConfig arg0)throws ServletException{
		
	}
	

}
