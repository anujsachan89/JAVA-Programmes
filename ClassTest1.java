package com.bridgelabz.programs;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ClassTest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements to be sorted: ");

        int num_of_elements = input.nextInt();
        List elementList = new LinkedList();
        for (int i = 0; i < num_of_elements; i++) {
            System.out.print("Element" + (i + 1) + ": ");
            elementList.add(input.next());
        }
        input.close();
        System.out.println(elementList);
        Collections.sort(elementList);
        System.out.println(elementList);
    }
}