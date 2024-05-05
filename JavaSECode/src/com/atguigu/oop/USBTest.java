package com.atguigu.oop;

/**
 * @Author magician
 * @Date 2024/5/5
 * @Version 1.0
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.useDevice(new Mouse());
        computer.useDevice(new Keyboard());
        computer.useDevice(new Printer());
        computer.useDevice(new USB() {
            @Override
            public void open() {
                System.out.println("USB设备开启");
            }

            @Override
            public void close() {
                System.out.println("USB设备关闭");
            }
        });
    }
}

class Computer {
    public void powerOn() {
        System.out.println("笔记本开机");
    }

    public void powerOff() {
        System.out.println("笔记本关机");
    }

    public void useDevice(USB usb) {
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        } else if (usb instanceof Printer) {
        }
    }
}

class Mouse implements USB {
    public void click() {
        System.out.println("鼠标点击");
    }

    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }
}

class Keyboard implements USB {
    public void type() {
        System.out.println("键盘输入");
    }

    @Override
    public void open() {
        System.out.println("键盘开启");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }
}

class Printer implements USB {
    public void print() {
        System.out.println("打印机打印");
    }

    @Override
    public void open() {
        System.out.println("打印机开启");
    }

    @Override
    public void close() {
        System.out.println("打印机关闭");
    }
}

interface USB {
    void open();

    void close();
}
