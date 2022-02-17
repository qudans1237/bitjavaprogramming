package test;

import java.util.Scanner;

class Rectangle {
	int width;
	int length;
	String color;

	int getWidth() {
		return width;
	}

	void setWidth(int width) {
		this.width = width;
	}

	int getLength() {
		return length;
	}

	void setLength(int length) {
		this.length = length;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	int area() {
		return width * length;
	}

	int perimiter() {
		return (width * 2) + (length * 2);
	}
}

public class TestRectangle {
	public static void main(String s[]) {
		Scanner keyboard = new Scanner(System.in);

		Rectangle rec1 = new Rectangle();
		System.out.println("ù��° ���簢���� ����");
		rec1.setColor(keyboard.next());

		System.out.println("ù��° ���簢���� ����");
		rec1.setWidth(keyboard.nextInt());

		System.out.println("ù��° ���簢���� ����");
		rec1.setLength(keyboard.nextInt());

		Rectangle rec2 = new Rectangle();
		System.out.println("�ι�° ���簢���� ����");
		rec2.setColor(keyboard.next());

		System.out.println("�ι�° ���簢���� ����");
		rec2.setWidth(keyboard.nextInt());

		System.out.println("�ι�° ���簢���� ����");
		rec2.setLength(keyboard.nextInt());

		System.out.println(rec1.getColor() + " ���簢���� ���̴� " + rec1.area() + "�̰� �ѷ��� " + rec1.perimiter() + "�Դϴ�.");

		System.out.println(rec2.getColor() + " ���簢���� ���̴� " + rec2.area() + "�̰� �ѷ��� " + rec2.perimiter() + "�Դϴ�.");

		if (rec1.area() > rec2.area()) {
			System.out.println("���̴� " + rec1.getColor() + " ���簢���� �� Ů�ϴ�.");
		} else if (rec1.area() < rec2.area()) {
			System.out.println("���̴� " + rec2.getColor() + " ���簢���� �� Ů�ϴ�.");
		} else {
			System.out.println("���̴� �����ϴ�.");
		}

		if (rec1.perimiter() > rec2.perimiter()) {
			System.out.println("�ѷ��� " + rec1.getColor() + " ���簢���� �� Ů�ϴ�.");
		} else if (rec1.perimiter() < rec2.perimiter()) {
			System.out.println("�ѷ��� " + rec2.getColor() + " ���簢���� �� Ů�ϴ�.");
		} else {
			System.out.println("�ѷ��� �����ϴ�.");
		}
	}
}
