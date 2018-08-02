package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculator
 */
@WebServlet("/calculator")
public class calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculator() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		int sal = Integer.parseInt(request.getParameter("num1"));
		String gr = request.getParameter("num1");	
		double bonus=0;
		if(sal>100000 && gr.equalsIgnoreCase("a")) {
			bonus=sal*0.05;
		}
		else if(sal>50000 || sal<=100000 && gr.equalsIgnoreCase("b")) {
			bonus=sal*0.07;
		}
		else if(sal<=50000 && gr.equalsIgnoreCase("c")) {
			bonus=sal*0.2;
		}
		
		double tax =sal*0.25;
		
		double netsal = sal+bonus+tax;
		String str="<table>	<th>Employee</th><tr><td>name</td><td>sal</td><td>bonus</td><td>tax</td><td>net</td></tr><tr><td>"+sal+"<td/></tr></table>";
//		<td>
//		pw.println(bonus+"<br>");</td><td>
//		pw.println(tax+"<br>");</td><td>
//		pw.println(netsal);</td></tr>
//		</table>"
		pw.println(str);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
