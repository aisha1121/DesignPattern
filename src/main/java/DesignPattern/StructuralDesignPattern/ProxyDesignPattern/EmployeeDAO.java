package DesignPattern.StructuralDesignPattern.ProxyDesignPattern;

public interface EmployeeDAO {
    void insert(String client, EmployeeDO emp) throws Exception;
    void delete(String client, String employeeId) throws Exception;
    EmployeeDO get(String client, String employeeId) throws Exception;
}
