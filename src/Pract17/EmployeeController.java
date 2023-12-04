package Pract17;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }
    public void setEmployyName(String name){
        model.setName(name);
    }
    public String getEmployyName(){
        return model.getName();
    }
    public void setEmployyDepartment(String department){
        model.setDepartment(department);
    }
    public String getEmployyDepartment(){
        return model.getDepartment();
    }
    public void setEmployySalary(int salary){
        model.setSalary(salary);
    }
    public int getEmployySalary(){
        return model.getSalary();
    }
    public void updateView(){
        view.printEmployeeDetails(model.getName(), model.getDepartment(), model.getSalary());
    }
}
