/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAO.UsuarioDAO;
import model.Usuario;
import service.EncryptPassword;

/**
 *
 * @author pablo
 */
public class LoginController extends HttpServlet {
    
    private static HttpServletResponse response;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        LoginController.response = response;
//        EncryptPassword encod = new EncryptPassword();
//        String login = request.getParameter("mail").trim();
//        String senha = request.getParameter("senha").trim();
//        senha = encod.encrypt(senha);
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet LoginController</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet LoginController at " + request.getContextPath() + "</h1>");
//            out.println("<p>Bem vindo, usuário de email: " + login + ""
//                    + " seja bem vindo, a sua senha é: " + senha + "</p>");
//            out.println("</body>");
//            out.println("</html>");
//            out.close();
//        }
//    }

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
        response.setContentType("text/html;charset=UTF-8");

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
        LoginController.response = response;
        String login = request.getParameter("mail");
        String senha = request.getParameter("pass");
        String remember = request.getParameter("remember");
        EncryptPassword encod = new EncryptPassword();
        try (PrintWriter out = response.getWriter()) {
            try {
                UsuarioDAO uDAO = new UsuarioDAO();
                Usuario u = new Usuario();
                String password = u.getSenha();
                u = uDAO.login(login);
                if(u.getId()>0 && encod.match(password, senha)) {
                    HttpSession sessao = request.getSession();
                    sessao.setAttribute("ulogado", u);
                    response.sendRedirect("../home/home.jsp");
                } else {
                    response.sendRedirect("register.jsp");
                    out.println("<script type='text/javascript'>");
                    out.println("alert('login ou senha inválidos');");
                    out.print("</script>");
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 

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
