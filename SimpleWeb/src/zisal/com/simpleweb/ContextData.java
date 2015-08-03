package zisal.com.simpleweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionData
 */
@WebServlet(urlPatterns = "/ContextData")
public class ContextData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContextData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		HttpSession httpSession = request.getSession();
		ServletContext context = request.getServletContext();
		if(userName != "" && userName != null){			
			httpSession.setAttribute("userName", userName);
			context.setAttribute("userName", userName);
		}
		PrintWriter writer = response.getWriter();
		writer.println("Request Parameter User Name is " + userName);
		try{
			writer.println(" Session Parameter User Name is " + (String) httpSession.getAttribute("userName"));
			writer.println(" Context Parameter User Name is " + (String) context.getAttribute("userName"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
