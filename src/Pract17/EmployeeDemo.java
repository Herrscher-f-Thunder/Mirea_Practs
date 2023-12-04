package Pract17;

public class EmployeeDemo {
    public static Employee retriveEmployyFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Arseniy");
        employee.setDepartment("ikbo");
        employee.setSalary(4000);
        return employee;
    }
    public static void main(String[] args) {
        Employee model = retriveEmployyFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();

        controller.setEmployyDepartment("inbo");
        System.out.println("\n\nПосле изменений:");
        controller.updateView();
    }
}
