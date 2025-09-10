package com.steamjin.level02.normal.book.run;

import com.steamjin.level02.normal.book.model.dto.BookDTO;

import java.awt.print.Book;

public class Application {
    public static void main(String[] args) {
        //기본 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        //필드 3가지를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        //모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생

        BookDTO bookDTO1 = new BookDTO();
        System.out.println(bookDTO1.getInformation());

        BookDTO bookDTO2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        System.out.println(bookDTO2.getInformation());

        BookDTO bookDTO3 = new BookDTO("홍길동전", "활빈당", "허균", 500000, 0.5);
        System.out.println(bookDTO3.getInformation());
    }
}