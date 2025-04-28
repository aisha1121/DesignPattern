package DesignPattern.StructuralDesignPattern.ProxyDesignPattern;

public class EmployeeProxy implements EmployeeDAO {

    EmployeeDAO employeeDAO;

    public EmployeeProxy() {
        this.employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void insert(String client, EmployeeDO emp) throws Exception{
        if (client.equals("ADMIN")) {
            employeeDAO.insert(client, emp);
            return;
        }
        throw new Exception("Access denied");
    }

    @Override
    public void delete(String client, String employeeId) throws Exception{
        if (client.equals("ADMIN")) {
            employeeDAO.delete(client, employeeId);
            return;
        }
        throw new Exception("Access denied");
    }

    @Override
    public EmployeeDO get(String client, String employeeId) throws Exception{
        return employeeDAO.get(client, employeeId);
    }
}
