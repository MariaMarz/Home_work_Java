package Homework.Box;

public class BoxOne {
// V = a * b * c
  int width;
 int height;
 int depth;

public BoxOne(int width, int height, int depth) {
    this(width,height);
    this.width=width;
    this.height=height;
    this.depth=depth;

    print();

    System.out.println("VolumeBox is = " + width*height*depth);

}

    public BoxOne(int width, int height) {
    this(width);
        this.width = width;
        this.height = height;
        depth = 6;

     print();

        System.out.println("VolumeBox is = " + width*height*depth);
    }

    public BoxOne(int width) {
    this();
        this.width = width;
        height = 8;
        depth = 4;

       print();

        System.out.println("VolumeBox is = " + width*height*depth);
    }
    public BoxOne () {
    width =12;
    height = 10;
    depth = 2;

     print();

        System.out.println("VolumeBox is = " + width*height*depth);
    }

    public void print () {
        System.out.println("width=" + width + ", height=" + height + ",depth=" + depth);
    }
}


