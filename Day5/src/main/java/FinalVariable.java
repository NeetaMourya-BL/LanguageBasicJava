public class FinalVariable {
    final int id;
    FinalVariable(int idNum) {
        id = idNum;
    }
    void getDetails() {
        System.out.println("Id of the Employee is: " + id);
    }
    public static void main(String args[]) {
        FinalVariable emp = new FinalVariable (154);
        emp.getDetails();
    }
}