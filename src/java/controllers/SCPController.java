/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hambo
 */
public class SCPController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/SCPMainMenu.jsp";

        String action = request.getParameter("action");
        if (action == null) {
            action = "first";
        }

        HttpSession session = request.getSession();

        String message = null;

        switch (action) {
            case "exit":
                url = "/private?action=profile";
                break;
            case "start":
                int dayCount  = 1;
                session.setAttribute("dayCount", dayCount);
                url = "/SCPGame.jsp";
                break;
            case "settings":
                url = "/SCPSettings.jsp";
                break;
            case "deleteGame":
                //delete save game from db
                break;
            case "finishDay":
                //delete save game from db
                break;

        }

        getServletContext().getRequestDispatcher(url).forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
