

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String s = request.getParameter("t1");

        // Set the content type to HTML
        response.setContentType("text/html");
            pw.println("<html>");
            pw.println("<head>");
            pw.println("<style>");
            pw.println("body {");
            pw.println("    background-color: #1a1a1a;");  // Dark background
            pw.println("    color: #00ff00;");            // Neon green text
            pw.println("    font-family: 'Courier New', Courier, monospace;");
            pw.println("    font-size: 20px;");
            pw.println("    text-align: center;");
            pw.println("    margin: 0;");
            pw.println("    padding: 0;");
            pw.println("    height: 100vh;");
            pw.println("    display: flex;");
            pw.println("    justify-content: center;");
            pw.println("    align-items: center;");
            pw.println("}");
            pw.println("h1 {");
            pw.println("    text-shadow: 0 0 10px #00ff00;");
            pw.println("}");
            pw.println("a {");
            pw.println("    color: #00ff00;"); // Neon green color for links
            pw.println("    text-decoration: none;"); // Remove underline
            pw.println("    font-size: 18px;");
            pw.println("    margin-top: 20px;");
            pw.println("    display: inline-block;");
            pw.println("    padding: 10px;");
            pw.println("    transition: all 0.3s ease;");
            pw.println("}");
            pw.println("a:hover {");
            pw.println("    background-color: #00ff00;");
            pw.println("    color: black;");
            pw.println("    text-shadow: 0 0 10px #00ff00;");
            pw.println("}");
            pw.println("</style>");
            pw.println("</head>");
            pw.println("<body>");
            
            // Output the personalized message
            pw.println("<h1>Hello, " + s + "</h1>");

            // Add a link to another page
            pw.println("<a href='./hacker.html'>Go to another page</a>");

            pw.println("</body>");
            pw.println("</html>");
            pw.close();
        }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
