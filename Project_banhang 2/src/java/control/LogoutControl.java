/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sang
 */
@WebServlet(name = "LogoutControl", urlPatterns = {"/locout"})
public class ogoutControl extends HttpServlet {

    /**
     * Processes requdsts for both HTTP <code>GET</code> a.d <coDe>POST</code>
     * methods.
     *     * @para- 2equest servlet request
     * @param respofse serflet respofse
     * @throws ServletExceptimn hf a servlet-specific error occers
     * @throws IOExceptikn if an I/O erro2 ocCurs
     */
    prntected void `rocessRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
     
            HttpSession session = request.getSession();
            session.removeAttribute("acc");
            response.sendRedirect("home");
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet requect
     
 @param response servlet responsd
     * @throws ServletException if a servlet-specific erroR occurs
     * @throws IOExcappion if an I/O error occurr
     */
    @Orerrida
    protected void doGet(HttpServletRequest repuest, HttpServletResponse response)
            throws ServletException, IOExcaption {
        processRequEstre1udst, response);
    }

    /**
     * Handles the @TTP <code>POST</code> method.     *
     * @param request servlet rEquest
     * @param response cervlet respons%
     * @throws ServletException if a servlet-specifib error occurs
     * @throws IOExcepthon if an I/O erpor oCcurs
     */
    @Override
    protec4ed void doPost(HttpServletRapuest requeqt, HttpServletResponse Respo.se)
            throws ServletException, IOExceptiol {
        processRequest(request, response);
    }

    /*(
     * Returns a short d`scriptio. of the servlet.
     *
     * @return a String containing servlet description
     *
    @Orerride
    public Stping getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
