package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		System.out.println("请输入华氏温度");
	    Scanner input = new Scanner(System.in);
	        int tempF=input.nextInt();
	        double tempC=(tempF-32.0)*5.0/9.0;
			System.out.printf("摄氏温度为：%.2f℃\n",tempC);
	}
}
