package DesignPattern.StructuralDesignPattern.ProxyDesignPattern;

/*
    * a mediator layer
    * when to use:
    * if any kind of access related implementation is required
    * for caching purpose
    * for preprocessing or postprocessing
    * here in below eg: before hitting the real dao it calls proxy dao which confirms access related issues
 */
public class Client {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeProxy();

        try {
            System.out.println("***Trying insert, delete and get for ADMIN***");
            employeeDAO.insert("ADMIN", new EmployeeDO());
            employeeDAO.delete("ADMIN", "123");
            employeeDAO.get("ADMIN", "123");

            System.out.println("***Trying insert, delete and get for USER***");
            employeeDAO.insert("USER", new EmployeeDO());
            employeeDAO.delete("USER", "123");
            employeeDAO.get("USER", "123");

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

    }
}
