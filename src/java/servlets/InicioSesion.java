/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DAO.InicioSesionDAO;
import controller.Consultas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Members;

/**
 *
 * @author Emmanuel
 */
public class InicioSesion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String uname = request.getParameter("usuario");
        String pass = request.getParameter("pass");
        // String rango = request.getParameter("rango"); 
        Members members = new Members();
        members.setUname(uname);
        members.setPass(pass);
        InicioSesionDAO inicioSesionDAO = new InicioSesionDAO();

        try {
            String autenticar = inicioSesionDAO.autenticar(members);

            if (autenticar.equals("Admin_Role")) {
                System.out.println("Administrador");
                HttpSession session = request.getSession();
                session.setAttribute("admin", uname);
                request.setAttribute("uname", uname);
                // request.getRequestDispatcher("welcomepage.jsp").forward(request, response);
                response.sendRedirect("adminPage.jsp");

            } else if (autenticar.equals("marca_Role")) {
                System.out.println("marca's Home");
                HttpSession session = request.getSession();
                session.setAttribute("marca", uname);
                request.setAttribute("uname", uname);
                //request.getRequestDispatcher("/mainpage.html").forward(request, response);
                response.sendRedirect("marcaPage.jsp");
            } else if (autenticar.equals("influencer_Role")) {
                System.out.println("Influencer's Home");
                HttpSession session = request.getSession();
                session.setAttribute("influencer", uname);
                request.setAttribute("uname", uname);
                //request.getRequestDispatcher("/mainpage.html").forward(request, response);
                response.sendRedirect("influencerPage.jsp");
            } else {
                response.sendRedirect("error.jsp");
            }

//                Consultas co = new Consultas(); 
//        if(co.autenticacion(uname, pass )){
//            response.sendRedirect("welcomepage.jsp");
//        }else {
//            response.sendRedirect("error.jsp");
//        }
//        
        } catch (Exception ex) {

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
