package _2_Structural_Design_Patterns._6_Composite_Pattern._1_Daily_Code_Buffer;


public class CompositeApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CompositeApplication.class, args);
		Department salesDepartment = new SalesDepartment(
				1, "Sales department");
		Department financialDepartment = new FinancialDepartment(
				2, "Financial department");

		HeadDepartment headDepartment = new HeadDepartment(
				3, "Head department");

		headDepartment.addDepartment(salesDepartment);
		headDepartment.addDepartment(financialDepartment);

		headDepartment.printDepartmentName();
	}

}
