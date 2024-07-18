class Employee implements Cloneable {

	private int employeeId;
	private String employeeName;
	private Department department;

	public Employee(int id, String name, Department dept) {
		this.employeeId = id;
		this.employeeName = name;
		this.department = dept;
	}
    
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}

class Department {

	private int id;
	private String name;

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class ShallowCloning{

	public static void main(String[] args) throws CloneNotSupportedException{

		Department dept = new Department(1, "Human Resource");
		Employee original = new Employee(2, "Admin",dept);
        
        //clone
		Employee cloned = (Employee) original.clone();

		//Let verify using employee id, if cloning actually workded
		System.out.println(cloned.getEmployeeId());

        //Let change the department name in cloned object and we will verify in original object
        cloned.getDepartment().setName("Finance");
        
        System.out.println(dept.getName());
        System.out.println(original.getDepartment().getName());
        System.out.println(cloned.getDepartment().getName());

		//Must be true and objects must have different memory addresses
		System.out.println(original != cloned);
	}
}