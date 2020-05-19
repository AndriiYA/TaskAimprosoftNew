package controllers;

import Dao.EmployceDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EmploeceController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/listEmployee.jsp";
    private static String LIST_EMPLOYEE = "/listEmployee.jsp";
    private EmployceDao dao;

    public EmploeceController() {
        super();
        dao = new EmployceDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            int id = Integer.parseInt(request.getParameter("id"));
            dao.deleteEployee(id);
            forward = LIST_EMPLOYEE;
            request.setAttribute("EmployceDB", dao.getAllEmployce());
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            int id = Integer.parseInt(request.getParameter("id"));
            Employce employce = dao.getEmployceById(id);
            request.setAttribute("EmployceDB", employce);
        } else if (action.equalsIgnoreCase("listEmployce")){
            forward = LIST_EMPLOYEE;
            request.setAttribute("EmployceDB", dao.getAllEmployce());
        } else {
            forward = INSERT_OR_EDIT;
        }
*/
String action = request.getParameter("action");
        if (action == null) {
            request.setAttribute("employce", dao.getAllEmployce());
        }

        RequestDispatcher view = request.getRequestDispatcher(LIST_EMPLOYEE);
        view.forward(request, response);

    }

}