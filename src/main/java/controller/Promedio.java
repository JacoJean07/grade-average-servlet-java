/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Estudiante;

/**
 *
 * @author Jaco
 */
public class Promedio extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            // recibimos los valores de la request 
            String fullName = request.getParameter("fullname");
            double note1 = Double.parseDouble(request.getParameter("note1"));
            double note2 = Double.parseDouble(request.getParameter("note2"));
            double note3 = Double.parseDouble(request.getParameter("note3"));

            //validacion de datos
            if (note1 > 10 || note2 > 10 || note3 > 10) {
                request.setAttribute("error", "<div class=\"alert alert-danger\" role=\"alert\">\n"
                        + "                    Las notas no pueden ser mayores a 10.\n"
                        + "                </div>");
                request.setAttribute("fullname", fullName);
                request.setAttribute("note1", note1);
                request.setAttribute("note2", note2);
                request.setAttribute("note3", note3);
                request.getRequestDispatcher("index.jsp").forward(request, response);
                return;
            }

            // crear el objeto
            Estudiante estudiante = new Estudiante(fullName, note1, note2, note3);

            //llamar al metodo del promedio
            double PromedioEstudiante = estudiante.calcularPromedio();
            String Categoria = estudiante.clasificar();
            String color = "";

            switch (Categoria) {
                case "INSUFICIENTE":
                    color = "btn-outline-danger";
                    break;
                case "MALO":
                    color = "btn-outline-warning";
                    break;
                case "BUENO":
                    color = "btn-outline-primary";
                    break;
                case "EXCELENTE":
                    color = "btn-outline-success";
                    break;
                default:
                    color = "";
                    break;
            }

            // Guarda el resultado en el objeto request
            request.setAttribute("fullName", fullName);
            request.setAttribute("PromedioEstudiante", PromedioEstudiante);
            request.setAttribute("Categoria", Categoria);
            request.setAttribute("color", color);

            // Redirige a la página con la response
            request.getRequestDispatcher("view.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Promedios de tres notas de un estudiante";
    }// </editor-fold>

}
