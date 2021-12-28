import java.util.ArrayList;
import java.util.Scanner;

public class Controller extends Nvien {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Nvien> nvienList = new ArrayList<>();

    static {
        nvienList.add(new Nvien("Son", 19));
        nvienList.add(new Nvien("Khuong", 18));
        nvienList.add(new Nvien("Tung", 24));
    }

    public void show(){
        for (Nvien nvien : nvienList) {
            System.out.println(nvien.toString());
        }
    }

    public void add(){
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi");
        int age = Integer.parseInt(scanner.nextLine());
        nvienList.add(new Nvien(name, age));
    }
    public void edit(){

    }
    public void delete(){
        System.out.println("Nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        nvienList.remove(id -1);
    }

}
