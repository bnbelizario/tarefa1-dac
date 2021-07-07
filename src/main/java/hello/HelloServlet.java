/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author viter
 */
@WebServlet("/alomundo")
public class HelloServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
	
	Calendar calendario = new GregorianCalendar();
	
	int hora = calendario.get(Calendar.HOUR_OF_DAY); 
	
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        
        String msg = "";
        
        String lang = request.getParameter("lang");
        if(lang==null)
            lang = "pt";
        switch(lang){
            case "pt":
            	if(hora <= 12) {
            		msg = "Bom dia, ";
            	} else if (hora > 12 && hora <= 18) {
            		msg = "Boa tarde, ";
            	} else if (hora > 18) {
            		msg = "Boa noite, ";
            	}
                break;
            case "en":
            	if(hora <= 12) {
            		msg = "Good Morning, ";
            	} else if (hora > 12 && hora <= 18) {
            		msg = "Good afternoon, ";
            	} else if (hora > 18) {
            		msg = "Good night, ";
            	}
                break;
            case "de":
            	if(hora <= 12) {
            		msg = "Guten Morgen, ";
            	} else if (hora > 12 && hora <= 18) {
            		msg = "Guten Nachmittag, ";
            	} else if (hora > 18) {
            		msg = "Boa Nacht, ";
            	}
                break;
            case "fr":
            	if(hora <= 12) {
            		msg = "Bonjour, ";
            	} else if (hora > 12 && hora <= 18) {
            		msg = "Bon après-midi, ";
            	} else if (hora > 18) {
            		msg = "Bonne nuit, ";
            	}
            	break;
            case "it":
            	if(hora <= 12) {
            		msg = "Buongiorno, ";
            	} else if (hora > 12 && hora <= 18) {
            		msg = "Buon pomeriggio, ";
            	} else if (hora > 18) {
            		msg = "Buona Notte, ";
            	}
            	break;
            case "es":
            	if(hora <= 12) {
            		msg = "Buenos dias, ";
            	} else if (hora > 12 && hora <= 18) {
            		msg = "Buenas tardes, ";
            	} else if (hora > 18) {
            		msg = "Buenas noches, ";
            	}
            	break;
        }
        
        String nome = request.getParameter("nome");

        if(nome==null)
            nome = "Fulano";
        
        msg = msg+nome+"!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet</h1>");
            out.println("<p>" + msg + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
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
        String msg = "";
        
        String lang = request.getParameter("lang");
        if(lang==null)
            lang = "pt";
        switch(lang){
        case "pt":
        	if(hora <= 12) {
        		msg = "Bom dia, ";
        	} else if (hora > 12 && hora <= 18) {
        		msg = "Boa tarde, ";
        	} else if (hora > 18) {
        		msg = "Boa noite, ";
        	}
            break;
        case "en":
        	if(hora <= 12) {
        		msg = "Good Morning, ";
        	} else if (hora > 12 && hora <= 18) {
        		msg = "Good afternoon, ";
        	} else if (hora > 18) {
        		msg = "Good night, ";
        	}
            break;
        case "de":
        	if(hora <= 12) {
        		msg = "Guten Morgen, ";
        	} else if (hora > 12 && hora <= 18) {
        		msg = "Guten Nachmittag, ";
        	} else if (hora > 18) {
        		msg = "Boa Nacht, ";
        	}
            break;
        case "fr":
        	if(hora <= 12) {
        		msg = "Bonjour, ";
        	} else if (hora > 12 && hora <= 18) {
        		msg = "Bon après-midi, ";
        	} else if (hora > 18) {
        		msg = "Bonne nuit, ";
        	}
        	break;
        case "it":
        	if(hora <= 12) {
        		msg = "Buongiorno, ";
        	} else if (hora > 12 && hora <= 18) {
        		msg = "Buon pomeriggio, ";
        	} else if (hora > 18) {
        		msg = "Buona Notte, ";
        	}
        	break;
        case "es":
        	if(hora <= 12) {
        		msg = "Buenos dias, ";
        	} else if (hora > 12 && hora <= 18) {
        		msg = "Buenas tardes, ";
        	} else if (hora > 18) {
        		msg = "Buenas noches, ";
        	}
        	break;

        }
        
        String nome = request.getParameter("nome");

        if(nome==null)
            nome = "Fulano";
        
        msg = msg+nome+"!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet</h1>");
            out.println("<p>" + msg + "</p>");
            out.println("</body>");
            out.println("</html>");
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
