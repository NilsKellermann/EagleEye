package dataAccess.user;

public interface EmployeeVisitor {
	public void visitElement(Manager manager);

	public void visitElement(Developer developer);
}
