package apopeira2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Index
 */
@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getParameter("name");
		request.getParameter("distance");
		request.getParameter("familyIncome");
		request.getParameter("studentSiblings");
		request.getParameter("differentCity");
		request.getParameter("yearsRoom");
		request.getParameter("telephoneNumber");
		request.getParameter("emailAddress");
		HttpSession session = request.getSession();
		String studentname = request.getParameter("name");
		int dist = Integer.parseInt(request.getParameter("distance"));
		int income = Integer.parseInt(request.getParameter("familyIncome"));
		int siblings = Integer.parseInt(request.getParameter("studentSiblings"));
		String difCity = request.getParameter("differentCity");
		int yeaRoom = Integer.parseInt(request.getParameter("yearsRoom"));
		int phoneNumber = Integer.parseInt(request.getParameter("telephoneNumber"));
		String mail = request.getParameter("emailAffress");
		session.setAttribute("stdname", studentname );
		session.setAttribute("stddist", dist);
		session.setAttribute("stdincome",income);
		session.setAttribute("stddist", dist);
		session.setAttribute("siblings", siblings);
		session.setAttribute("stdCity", difCity);
		session.setAttribute("stdyeaRoom", yeaRoom);
		session.setAttribute("stdNumber", phoneNumber);
		session.setAttribute("stdmail", mail);

	
		request.getRequestDispatcher("StudentData.jsp").forward(request, response);
		
	}
/*
 * 	private int points =0;
	int temp1 = 10 * yearsRoom;

 */
}
