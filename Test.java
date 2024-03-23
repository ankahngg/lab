
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so SV");
        int N = scanner.nextInt();
        int sum=0;
        Student[] stds = new Student[N];
        for(int i=0;i<N;i++) {
            System.out.println("Nhap thong tin sinh vien thu "+(i+1)+": ");
            System.out.println("Ten: ");
            String name = scanner.next();
            System.out.println("Nam sinh:");
            int year = scanner.nextInt();
            
            //stds[i].setName(name);
            //stds[i].setYear(year);
            stds[i] = new Student(name, year);

            sum += 2024-year;
        }
        System.out.println("Danh sach lop: ");
        for(int i=0;i<N;i++) {
            System.out.println(stds[i].getName());
        }
        System.out.println("Tong so tuoi la: "+sum);
    }
}
