package PreviousChanges.BuilderPractice;

public class General {
    public static void main(String[] args) {
        EmployeeSheet es = EmployeeSheet.builder()
                .age(12)
                .name("Ivan")
                .salary(20000)
                .occupation("manager")
                .department("sales")
                .build();
    }
}
