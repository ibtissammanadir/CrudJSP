package com.example.productivity.Service;

import com.example.productivity.Dao.DaoImpl;
import com.example.productivity.Model.Employee;
import com.example.productivity.util.DatabaseConnection;

import java.sql.Connection;
import java.util.List;

public class Service {
    private DaoImpl employeeDao;


    public Service(DaoImpl employeeDao) {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection conn = connectNow.getConnection();
        this.employeeDao = new DaoImpl(conn);
    }




    public void addEmployee(Employee employee) {
        employeeDao.create(employee);
    }

    public Employee getEmployeeById(int id) {
        return employeeDao.findById(id);
    }

    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

    public void updateEmployee(Employee employee) {

          employeeDao.updateEmployee(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeDao.delete(employee);
    }

    public void removeEmployeeById(int id) {
        employeeDao.deleteById(id);
    }

}
