/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Temperaturas;

/**
 * @author kathp
 */
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/TemperaturaServlet")
public class TemperaturaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        double temperatura = Double.parseDouble(request.getParameter("temperatura"));
        String tipoConversion = request.getParameter("tipoConversion");

        ConversorTemperatura conversor = new ConversorTemperatura();

        double resultado = conversor.convertir(temperatura, tipoConversion);

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("<h1>Resultado de la conversión</h1>");

            out.println("<p>Temperatura ingresada: " + temperatura + "</p>");
            out.println("<p>Conversión realizada: " + tipoConversion + "</p>");
            out.println("<p>Resultado: " + resultado + "</p>");

            out.println("<br>");
            out.println("<a href='temperaturas.html'>Volver</a>");

            out.println("</body>");
            out.println("</html>");
        }
    }
}
