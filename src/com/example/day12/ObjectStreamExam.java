package com.example.day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamExam {
    public static void main(String[] args) throws Exception {
        // 객체를 파일에 저장
        Person p = new Person("kim", 20);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.txt"));
        out.writeObject(p);

        // 파일에 저장된 객체 읽기
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
        Person read = (Person) ois.readObject();
        System.out.println(read);
        System.out.println(read.getName());
        System.out.println(read.getAge());
        out.close();
    }
}
