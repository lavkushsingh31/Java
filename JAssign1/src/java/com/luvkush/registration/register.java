
package com.luvkush.registration;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Luvkush
 */
public class register extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String fname = request.getParameter("fname");
      String lname = request.getParameter("lname");
      String contact = request.getParameter("phone");
      String email = request.getParameter("email");
      String course = request.getParameter("courses");
      String title = "You are registered Successfully!";
         
      
      out.println(
         "<html>" +
            "<head><title>" + title + "</title></head>" +
            "<body>"
            + "<br/><br/><center><h1>You have been Registered Successfully! :) </h1><br/><br/><br/><br/>"
            + "<h2>Following are the credentails saved:  </h2><br/><br/>"
            + "<b>First Name</b>:"
                  + fname + "<br/><br/>" +
                  "<b>Last Name</b>: "
                  + lname + "<br/><br/>" +
                  "<b>Contact Number: </b>:"
                  + contact + "<br/><br/>" +
                  "<b>Registered Email ID: </b>:"
                  + email + "<br/><br/>" +
                  "<b>Registered Course: </b>:"
                  + course + "<br/><br/>" +
               
            "</center></body>" +
         "</html>"
      );
   }
}
