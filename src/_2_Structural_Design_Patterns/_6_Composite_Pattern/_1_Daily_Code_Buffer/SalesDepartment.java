package _2_Structural_Design_Patterns._6_Composite_Pattern._1_Daily_Code_Buffer;

public class SalesDepartment implements Department{

    private Integer id;
    private String name;

    public SalesDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}