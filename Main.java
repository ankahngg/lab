public class Main {
  public static void change (Student std) {
    std.setYear(2000);
  }
  public static void main(String[] args) {
    Student std = new Student("Nam", 10);
    System.out.println(std.getYear());
    change(std);
    System.out.println(std.getYear());

  }
}