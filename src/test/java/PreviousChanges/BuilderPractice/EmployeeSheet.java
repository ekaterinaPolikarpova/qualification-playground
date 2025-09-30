package PreviousChanges.BuilderPractice;

public class EmployeeSheet {
    private String name;
    private int age;
    private String occupation;
    private String department;
    private int salary;

    private EmployeeSheet() {
    }

    public static EmployeeSheetBuilder builder() {
        return new EmployeeSheetBuilder();
    }

    //inner (static) class
    public static class EmployeeSheetBuilder {
        private String name;
        private int age;
        private String occupation;
        private String department;
        private int salary;

        public EmployeeSheetBuilder name(String name) {
            this.name = name;
            return this;
        }

        public EmployeeSheetBuilder age(int age) {
            this.age = age;
            return this;
        }

        public EmployeeSheetBuilder occupation(String occupation) {
            this.occupation = occupation;
            return this;
        }

        public EmployeeSheetBuilder department(String department) {
            this.department = department;
            return this;
        }

        public EmployeeSheetBuilder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeSheet build() {
            EmployeeSheet es = new EmployeeSheet();
            es.age = this.age;
            es.salary = this.salary;
            es.department = this.department;
            es.occupation = this.occupation;
            es.name = this.name;
            return es;
        }
    }
}
