package com.example.day11.실습문제;

import java.util.*;

public class BookManager {
    List<Book> list = new ArrayList<>();

    // 도서 추가
    public void addBook(Book b) {
        list.add(b);
    }

    // 도서 삭제
    public void removeBook(Book b) {
        list.remove(b);
    }

    // 검색
    public void findBook(String title) {
        for(Book b: list) {
            if(b.title.equals(title)) {
                System.out.println(b);
                break;
            }
        }
    }

    // 년도별 정렬
    public void sortBooksByYear() {
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.year - o2.year;
            }
        };
        Collections.sort(list, comparator); // List를 정렬
    }

    public void displayBooks() {
        for(Book b: list) {
            System.out.println(b);
        }
    }
}
