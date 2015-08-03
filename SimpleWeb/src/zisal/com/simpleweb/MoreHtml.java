package zisal.com.simpleweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MoreHtml
 */
@WebServlet("/MoreHtml")
public class MoreHtml extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MoreHtml() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String religion = request.getParameter("religion");
		
		if( name != null && gender != null && religion != null ){
			PrintWriter writer = response.getWriter();
			writer.println("Your Name is ".
					concat(name).
					concat(" ").
					concat("You are a ").
					concat(gender).concat(" ").
					concat("and your faith is ").
					concat(religion));
		}
		
		
	}

}
