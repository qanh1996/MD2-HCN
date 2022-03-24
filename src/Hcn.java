import java.util.Scanner;

public class Hcn {
    double width, height;

    public Hcn() {

    }

    public Hcn(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArena() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "{" + "width=" + width + ",height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = sc.nextDouble();
        System.out.println("Enter the height");
        double height = sc.nextDouble();
        Hcn Hcn = new Hcn(width, height);
        System.out.println(Hcn.display());
        System.out.println(Hcn.getArena());
        System.out.println(Hcn.getPerimeter());
    }
}



