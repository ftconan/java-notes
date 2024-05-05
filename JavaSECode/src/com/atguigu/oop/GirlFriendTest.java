package com.atguigu.oop;

/**
 * @Author magician
 * @Date 2024/5/5
 * @Version 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend g1 = GirlFriend.getInstance();
        GirlFriend g2 = GirlFriend.getInstance();
        System.out.println(g1 == g2);
    }
}

class GirlFriend {
    private GirlFriend() {
    }

    private static GirlFriend gf = null;

    public static GirlFriend getInstance() {
        if (gf == null) {
            gf = new GirlFriend();
        }
        return gf;
    }
}
