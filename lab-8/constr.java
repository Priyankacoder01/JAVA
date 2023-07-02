//3. Illustrate the execution of constructors in multi-level inheritance with three Java classes – plate(int length, int width), box(length, width, height), wood box (length, width, height, thick).
class Plate {
    int length, width;
    Plate(int a, int b) {
        length = a;
        width = b;
        System.out.println("Plate constructor with length " + length + " and width " + width);
    }
}

class Box extends Plate {
    int height;
    Box(int a, int b, int c) {
        super(a, b);
        height = c;
        System.out.println("Box constructor with length " + length + ", width " + width + ", and height " + height);
    }
}

class WoodBox extends Box {
    int thickness;
    WoodBox(int a, int b, int c, int d) {
        super(a, b, c);
        thickness = d;
        System.out.println("WoodBox constructor with length " + length + ", width " + width + ", height " + height + ", and thickness " + thickness);
    }
}

public class constr {
    public static void main(String[] args){
        WoodBox woodBox = new WoodBox(10, 20, 30, 5);
   }
}