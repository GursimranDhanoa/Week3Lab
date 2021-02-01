
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 821214
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        request.setAttribute("result", "Result: ---");
                
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String first = request.getParameter("first");
        request.setAttribute("first", first);
        
        String second = request.getParameter("second");
        request.setAttribute("second", second);
      
        if (first == null || first.equals("") || second == null || second.equals("") ){
          
          request.setAttribute("result", "Invalid");
          
          getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);              
                return;
            }
      /*try{
      
          request.setAttribute("message", "Your age next birthday will be " + (Integer.parseInt(age) + 1));
          
          getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
          
      }
      catch (NumberFormatException e)
      {
          request.setAttribute("Message", "Enter a valid number");
           getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
          
         
      }
       
      */      
          
      }
    
}
