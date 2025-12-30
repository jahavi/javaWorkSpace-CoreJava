package com.day13.ConstructorMethodKeyWdStaticThis;

class DemoOrder {
    // 1) Static variable and static block (class load time)
    static int staticVar = print("static variable");
    static {
        print("static block");
    }

    // 2) Instance variable and IIB (each object creation)
    int instanceVar = print("instance variable");
    {
        print("instance IIB");
    }

    // 3) Constructor
    DemoOrder() {
        print("constructor body");
    }

    // Helper to print and return a dummy value
    static int print(String msg) {
        System.out.println(msg);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println("create first object");
        new DemoOrder();

        System.out.println("create second object");
        new DemoOrder();
    }
}

