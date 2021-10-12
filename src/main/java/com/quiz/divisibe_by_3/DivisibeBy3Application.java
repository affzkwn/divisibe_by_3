package com.quiz.divisibe_by_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class DivisibeBy3Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();

		for (int i = x; i <= y; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}
}
