package step4_01.string;

import java.util.Scanner;

public class Qestion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		char[] save = new char[text.length()];
		
		for (int i = 0; i < text.length(); i++) {
			save[i] = text.charAt(i);
		}
		
		int size = word.length();
		
		boolean isChecked = false;
		int index = 0;
		
		for (int i = 0; i < save.length-size+1; i++) {
			int count = 0;
			for (int j = 0; j < size; j++) {
				if(save[i+j] == word.charAt(j)) {
					count++;
			}
			if(count == size) {
				isChecked = true;
				index = i;
			}
			
			}
		}
			
			
		if(isChecked) {
			int index1 = index;
			int index2 = index+word.length();
			
			System.out.print("바꿀 단어를 입력하세요: ");
			String me = scan.next();
			
			char[] arr = save;
			String front = "";
			
			for (int j = 0; j < index1; j++) {
				front += arr[j];
			}
			
			String back = "";
			for (int j = index2; j < arr.length; j++) {
				back += arr[j];
			}
			
			System.out.println(front + me + back);
			
			
		}
		
		else {
			System.out.println("해당 단어는 존재하지 않습니다.");
		}
		
	}

}
