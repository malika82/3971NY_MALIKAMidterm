package design;

public abstract class AbstractClasss implements Employee {


    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }
    public abstract String getAddress();
}
