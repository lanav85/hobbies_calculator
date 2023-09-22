
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class HobbiesCalculator
 */
public class HobbiesCalculator extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int totalScore = 0;

		String running = request.getParameter("running");
		if (running != null) {
			totalScore = totalScore + 10;
		}

		String swimming = request.getParameter("swimming");
		if (swimming != null) {
			totalScore = totalScore + 10;
		}

		String cycling = request.getParameter("cycling");
		if (cycling != null) {
			totalScore = totalScore + 10;
		}

		String football = request.getParameter("football");
		if (football != null) {
			totalScore = totalScore + 10;
		}

		String soccer = request.getParameter("soccer");
		if (soccer != null) {
			totalScore = totalScore + 10;
		}

		String rugby = request.getParameter("rugby");
		if (rugby != null) {
			totalScore = totalScore + 10;
		}
		
		
			
		String fitness = request.getParameter("fitness");
		
		if (fitness == null) {
			totalScore = totalScore + 0;
		}
		else if (fitness.equalsIgnoreCase ("low")) {
			totalScore = totalScore + 10;
		}
		else if (fitness.equalsIgnoreCase ("average")) {
			totalScore = totalScore + 20;
		}
		else  {
			totalScore = totalScore + 30;
		}

		String pop = request.getParameter("pop");
		if (pop != null) {
			totalScore = totalScore + 10;
		}

		String classical = request.getParameter("classical");
		if (classical != null) {
			totalScore = totalScore + 10;
		}

		String country = request.getParameter("country");
		if (country != null) {
			totalScore = totalScore + 10;
		}

		String reading = request.getParameter("reading");
		if (reading.equalsIgnoreCase("HistoricalFiction")) {
			totalScore = totalScore + 10;
		}else if (reading.equalsIgnoreCase("HistoricalNonFiction")) {
			totalScore = totalScore + 20;
		} else if (reading.equalsIgnoreCase("CrimeFiction")) {
			totalScore = totalScore + 30;
		} else if (reading.equalsIgnoreCase("Romance")) {
			totalScore = totalScore + 10;
		} else if (reading.equalsIgnoreCase("Comedy")) {
			totalScore = totalScore + 50;
		}
		
		
		String userName = request.getParameter("user");

		response.getWriter().append(userName + " your total score is " + totalScore);

	}

}
