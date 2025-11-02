package org.example.loginwebapp;

import java.io.IOException;
import java.io.PrintWriter;

// Import the modern Jakarta EE packages
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet to handle user login.
 * The @WebServlet annotation maps this servlet to the "/login" URL pattern.
 * This is why the form's action="login" works.
 */
@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // 1. Retrieve parameters from the request
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        // 2. Validate the credentials (hardcoded for this example)
        // In a real app, you would check this against a database.
        if ("admin".equals(user) && "password123".equals(pass)) {
            // 3. If valid, display a personalized welcome message
            out.println("<html><head><title>Welcome</title><style>body{font-family: Arial, sans-serif; text-align: center; margin-top: 50px;} h1{color: #2a9d8f;}</style></head><body>");
            out.println("<h1>Welcome, " + user + "!</h1>");
            out.println("<p>You have successfully logged in.</p>");
            out.println("</body></html>");
        } else {
            // 4. If invalid, show an error message
            out.println("<html><head><title>Error</title><style>body{font-family: Arial, sans-serif; text-align: center; margin-top: 50px;} h1{color: #e76f51;}</style></head><body>");
            out.println("<h1>Login Failed</h1>");
            out.println("<p>Invalid username or password. Please try again.</p>");
            out.println("<a href='index.jsp'>Go Back to Login</a>"); // Link to go back
            out.println("</body></html>");
        }
    }

    // It's good practice to implement doGet as well,
    // even if just to redirect to the form or show an error.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirect GET requests back to the login page
        response.sendRedirect("index.jsp");
    }
}
