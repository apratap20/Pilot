import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;  
public class First extends HttpServlet{
private static final long serialVersionUID = -9155760945094023888L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		PrintWriter out=res.getWriter();
		out.println("The Result is "+k);
		
	}			
}
