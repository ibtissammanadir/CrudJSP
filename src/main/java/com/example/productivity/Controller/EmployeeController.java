package com.example.productivity.Controller;

import java.io.*;
import java.sql.Connection;
import java.util.List;

import com.example.productivity.Dao.DaoImpl;
import com.example.productivity.Model.Employee;
import com.example.productivity.Service.Service;
import com.example.productivity.util.DatabaseConnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
public class EmployeeController extends HttpServlet {
    private Connection conn;
    private DaoImpl employeeDao;

    public void init() {
        DatabaseConnection connectNow = new DatabaseConnection();
        conn = connectNow.getConnection();
        employeeDao = new DaoImpl(conn);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null) {
            switch (action) {
                case "edit":
                    showEditForm(request, response);
                    break;
                case "delete":
                    deleteEmployee(request, response);
                    break;
                default:
                    listEmployees(request, response);
                    break;
            }
        } else {
            listEmployees(request, response);
        }
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Service service = new Service(employeeDao);
        service.removeEmployeeById(id);
        response.sendRedirect("EmployeeController");
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Service service = new Service(employeeDao);
        Employee existingEmployee = service.getEmployeeById(id);
        request.setAttribute("employee", existingEmployee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("form.jsp");
        dispatcher.forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String lastName = request.getParameter("LastName");
        String firstName = request.getParameter("FirstName");
        String email = request.getParameter("Email");
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("Adresse");
        String department = request.getParameter("Department");
        String salary = request.getParameter("Salary");
        Employee employee = new Employee( id,lastName, firstName, email, phoneNumber, address, department, salary);
        Service service = new Service(employeeDao);
        service.updateEmployee(employee);
        response.sendRedirect("EmployeeController");
    }

    private void listEmployees(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lastName = request.getParameter("LastName");
        String firstName = request.getParameter("FirstName");
        String email = request.getParameter("Email");
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("Adresse");
        String department = request.getParameter("Department");
        String salary = request.getParameter("Salary");
        Employee employee = new Employee( lastName, firstName, email, phoneNumber, address, department, salary);
        Service service = new Service(employeeDao);
        service.addEmployee(employee);
        Service servicee = new Service(employeeDao);
        List<Employee> employees = servicee.getAllEmployees();
        request.setAttribute("employees", employees);
        System.out.println(employees);
        RequestDispatcher dispatcher = request.getRequestDispatcher("liste.jsp");
        dispatcher.forward(request, response);
    }

}
   /** @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lastName = request.getParameter("LastName");
        String firstName = request.getParameter("FirstName");
        String email = request.getParameter("Email");
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("Adresse");
        String department = request.getParameter("Department");
        String salary = request.getParameter("Salary");
        Employee employee = new Employee( lastName, firstName, email, phoneNumber, address, department, salary);
        Service service = new Service(employeeDao);
        service.addEmployee(employee);
        Service servicee = new Service(employeeDao);
        List<Employee> employees = servicee.getAllEmployees();
        request.setAttribute("employees", employees);
        System.out.println(employees);
        RequestDispatcher dispatcher = request.getRequestDispatcher("liste.jsp");
        dispatcher.forward(request, response);
    }**/

