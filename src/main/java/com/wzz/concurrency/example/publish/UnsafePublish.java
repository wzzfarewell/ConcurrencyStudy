package com.wzz.concurrency.example.publish;

import com.wzz.concurrency.annotations.NotThreadSafe;

import java.util.Arrays;

/**
 * UnsafePublish
 * 发布对象
 * @author wzzfarewell
 * @date 2019/10/1
 **/
@NotThreadSafe
public class UnsafePublish {

    private String[] states = {"a", "b", "c"};

    public String[] getStates() {
        return states;
    }

    public static void main(String[] args) {
        UnsafePublish unsafePublish = new UnsafePublish();
        System.out.println(Arrays.toString(unsafePublish.getStates()));
        unsafePublish.getStates()[0] = "d";
        System.out.println(Arrays.toString(unsafePublish.getStates()));
    }
}
