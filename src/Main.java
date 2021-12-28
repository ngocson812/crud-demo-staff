import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("MENU");
            System.out.println("1, Hien thi nhan vien");
            System.out.println("2, Them nhan vien");
            System.out.println("3, Sua nhan vien");
            System.out.println("4, Xoa nhan vien");
            System.out.println("5, Quit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    controller.show();
                    break;
                case 2:
                    controller.add();
                    break;
                case 3:
                case 4:
                    controller.delete();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}