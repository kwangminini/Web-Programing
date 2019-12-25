package index;

import java.io.IOException;
import java.io.PrintWriter;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date time = new Date();
		String todayTime = format.format(time);
		out.println("<html>");
		out.println("<body>");
		out.println("<style>"
				+ "body{display:flex; align-items:center; justify-content:center;}"
				+ "h1{position:absolute; left:10px; top:10px;}"
				+ "div{display:flex;"
				+ "flex-direction:column;"
				+ "width:100%; "
				+ "height:100%;"
				+ "align-items:center;"
				+ "justify-content:center;"
				+ "font-size:70px;}</style>");
		out.println("<h1><a href=\"index.html\">메인화면</a></h1>");
		out.println("<div>"+"현재시간:"+todayTime+"</div>");
		out.println("</body>");
		out.println("</html>");
	}

}
