package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor   // Lombok tự tạo Constructor không tham số
@AllArgsConstructor // Lombok tự tạo Constructor đầy đủ tham số
@Getter             // Lombok tự tạo các hàm get...
@Setter             // Lombok tự tạo các hàm set...
public class Book {
    private int id;
    private String title;
    private String author;
}