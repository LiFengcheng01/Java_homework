package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		System.out.println("请输入要生成的数值项数");
	   Scanner input = new Scanner(System.in);
	        int num=input.nextInt();
			System.out.printf("%d\n",fibonacci(num));
	}
	public  static int fibonacci(int i)
    {
        if(i==0||i==1)
        {
            return i;
        }
        else if(i==2)
            return 1;
        else
        {
            int last=0;
            int post=1;
            int fin=0;
            for(int x=2;x<=i+1;x++)
            {
                fin=last+post;
                post=last;
                last=fin;
            }
            return  fin;
        }

    }
}
