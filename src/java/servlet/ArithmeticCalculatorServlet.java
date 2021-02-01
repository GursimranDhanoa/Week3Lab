
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
        request.setAttribute("result", "Result: ---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
                
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String first = request.getParameter("first");
        int firstNum = 0;
        request.setAttribute("first", first);
        
        String second = request.getParameter("second");
        int secondNum = 0;
        request.setAttribute("second", second);
      
        String result = new String();
        int answer = 0;
        
        String math = request.getParameter("calculate");
        if (first == null || first.equals("") || second == null || second.equals("")) {

            result = "Invalid";
           
        }
        else{
            
        
      try{
      
          firstNum = Integer.parseInt(first);
          secondNum = Integer.parseInt(second);
          
          if(math.equals("+")){
              answer = firstNum + secondNum;
          }
          else if (math.equals("-")){
              answer = firstNum - secondNum;
          }
           else if (math.equals("*")){
              answer = firstNum * secondNum;
          }
           else if (math.equals("%")){
              answer = firstNum % secondNum;
          }
          result = "Result: " + answer;
       
      
      }
      catch (NumberFormatException e)
      {
          result = "Invalid";
          }
       
   
      }
        request.setAttribute("result", result);        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
    
}
}