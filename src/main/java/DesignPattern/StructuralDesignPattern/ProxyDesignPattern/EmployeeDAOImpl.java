package DesignPattern.StructuralDesignPattern.ProxyDesignPattern;

public class EmployeeDAOImpl implements EmployeeDAO{
    @Override
    public void insert(String client, EmployeeDO emp) throws Exception{
        System.out.println("Employee DO inserted");
    }

    @Override
    public void delete(String client, String employeeId) throws Exception{
        System.out.println("Employee data deleted");
    }

    @Override
    public EmployeeDO get(String client, String employeeId) throws Exception{
        System.out.println("Successfully returned employee data");
        return new EmployeeDO();
    }
}
