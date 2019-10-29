package com.liyuhang.ThinkingInJava.Generic;

public class ArrayGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;
    @SuppressWarnings("uncheck")
    public static void main(String[] args) {
        //gia = (Generic<Integer>[]) new Object[SIZE];
        gia = (Generic<Integer>[])new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<Integer>();
        // 虽然gia已经被转型为(Generic<Integer>[])，但这个信息只存在于编译期
        // 运行时它仍为Object数组
        //! gia[1] = new Object();
        //! gia[2] = new Generic<>(Double);
    }
}

class Generic<T> {}
