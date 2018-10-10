package practice01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		
		gugudan();
		
		diamond();
		
		sungjeok();

		try {
			sungjeok_file();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}
	
	public static void gugudan() {
		int iter1, iter2;
		
		for (iter1 = 2; iter1 < 10; iter1++) {
			for (iter2 = 1; iter2 < 10; iter2++) {
				System.out.printf("%2d X %2d = %2d\t", iter1, iter2, iter1*iter2);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		
		for (iter1 = 1; iter1 < 10; iter1++) {
			for (iter2 = 2; iter2 < 10; iter2++) {
				System.out.printf("%2d X %2d = %2d\t", iter2, iter1, iter2*iter1);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		
		iter1 = 2;
		while(iter1 < 10) {			
			iter2 = 1;
			
			while (iter2 < 10) {				
				System.out.printf("%2d X %2d = %2d\t", iter1, iter2, iter1*iter2);
				
				iter2++;
			}
			iter1++;
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		
		iter1 = 2;
		do {			
			iter2 = 1;
			
			do {				
				System.out.printf("%2d X %2d = %2d\t", iter1, iter2, iter1*iter2);
				
				iter2++;
			} while (iter2 < 10);
			
			iter1++;
			System.out.println("");
		}while(iter1 < 10);
		System.out.println("");
		System.out.println("");
		
	}
	
	public static void diamond() {
		int iter3, iter4, iter5, iter6;
		
		for (iter3 = 0; iter3 < 5; iter3++) {
			for (iter4 = 4 - iter3; iter4 > 0; iter4--) {
				System.out.printf(" ");
			}
			for (iter5 = iter3; iter5 >= 0; iter5--) {
				System.out.printf("*");
			}
			for (iter6 = 0; iter6 < iter3; iter6++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
		
		for(iter3 = 1; iter3 < 5; iter3++) {
			for (iter4 = 0; iter4 < iter3; iter4++) {
				System.out.printf(" ");
			}
			for (iter5 = 5; iter5 > iter3; iter5--) {
				System.out.printf("*");
			}
			for (iter6 = 4; iter6 > iter3; iter6--) {
				System.out.printf("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		
		iter3 = 0;
		while (iter3 < 5) {
			iter4 = 4 - iter3;
			
			while (iter4 > 0) {
				System.out.printf(" ");
				iter4--;
			}
			
			iter5 = iter3; 
			
			while (iter5 >= 0) {
				System.out.printf("*");
				iter5--;
			}
			
			iter6 = 0;
			
			while(iter6 < iter3) {
				System.out.printf("*");
				iter6++;
			}
			System.out.println();
			iter3++;
		}
		
		iter3 = 1;
		while (iter3 < 5) {
			iter4 = 0;
			
			while (iter4 < iter3) {
				System.out.printf(" ");
				iter4++;
			}
			
			iter5 = 5; 
			
			while (iter5 > iter3) {
				System.out.printf("*");
				iter5--;
			}
			
			iter6 = 4;
			
			while(iter6 > iter3) {
				System.out.printf("*");
				iter6--;
			}
			System.out.println();
			iter3++;
		}
		System.out.println("");
		System.out.println("");
		
		iter3 = 0;
		do {
			iter4 = 4 - iter3;
			
			do {
				if (iter3 < 4)
					System.out.printf(" ");
				iter4--;
			}while (iter4 > 0);
			
			iter5 = iter3; 
			
			do {
				System.out.printf("*");
				iter5--;
			} while (iter5 >= 0);
			
			iter6 = 0;
			
			do {
				if (iter3 != 0) {
					System.out.printf("*");
				}
				iter6++;
			} while(iter6 < iter3);
			System.out.println();
			iter3++;
		}while (iter3 < 5);
		
		iter3 = 1;
		do {
			iter4 = 0;
			
			do {
				System.out.printf(" ");
				iter4++;
			} while (iter4 < iter3);
			
			iter5 = 5; 
			
			do {
				System.out.printf("*");
				iter5--;
			} while (iter5 > iter3);
			
			iter6 = 4;
			
			do {
				if( iter3 != 4) {
					System.out.printf("*");
				}
				iter6--;
			} while(iter6 > iter3);
			System.out.println();
			iter3++;
		} while (iter3 < 5);
		System.out.println("");
		System.out.println("");
		
	}

	public static void sungjeok() {
		System.out.printf("성적입력 : ");
		
		Scanner input = new Scanner(System.in);
		
		int iTo = input.nextInt();
		
		if ( iTo > 90) {
			System.out.println("성적은 A입니다.");
		}
		else if (iTo > 80) {
			System.out.println("성적은 B입니다");
		}
		else if (iTo > 70) {
			System.out.println("성적은 C입니다");
		}
		else if (iTo > 60) {
			System.out.println("성적은 D입니다.");
		}
		else {
			System.out.println("성적은 F입니다.");
		}
		System.out.println("");
		System.out.println("");

		System.out.printf("성적입력 : ");
		iTo = input.nextInt();
		
		switch(iTo) {
		case 100 : case 99 : case 98 : case 97 : case 96 : case 95 : case 94 : case 93 : case 92 : case 91 : 
			System.out.println("성적은 A입니다.");
			break;
		case 90 : case 89 : case 88 : case 87 : case 86 : case 85 : case 84 : case 83 : case 82 : case 81 : 
			System.out.println("성적은 B입니다.");
			break;
		case 80 : case 79 : case 78 : case 77 : case 76 : case 75 : case 74 : case 73 : case 72 : case 71 : 
			System.out.println("성적은 C입니다.");
			break;
		case 70 : case 69 : case 68 : case 67 : case 66 : case 65 : case 64 : case 63 : case 62 : case 61 : 
			System.out.println("성적은 D입니다.");
			break;
		default :
			System.out.println("성적은 F입니다.");
			break;	
		}
	}

	public static void sungjeok_file() throws IOException {
		System.out.println("점수 5개 입력");
		
		Scanner input = new Scanner(System.in);
		
		int iter = 1;
		int iScore; 
		String sIn;
		String sOut;
		
		File file = new File("test1.txt");
        FileWriter writer = null;		

        writer = new FileWriter(file, false);
        
		while (iter < 6) {
			System.out.printf("성적입력 %d : ", iter);
			sIn = input.nextLine();
			writer.write(sIn +"\r\n");
	        writer.flush();
	        
	        iter++;
		}
		System.out.println("파일닫기");
		writer.close();
		
		BufferedReader bReader = null;
		
		System.out.println("\n 성적 파일 열기 ");
        bReader = new BufferedReader(new FileReader(file));
        
        while((sOut = bReader.readLine()) != null) {
            System.out.printf("%s : ", sOut);
            
            iScore = Integer.parseInt(sOut);
            
            if ( iScore > 90) {
    			System.out.println("성적은 A입니다.");
    		}
    		else if (iScore > 80) {
    			System.out.println("성적은 B입니다");
    		}
    		else if (iScore > 70) {
    			System.out.println("성적은 C입니다");
    		}
    		else if (iScore > 60) {
    			System.out.println("성적은 D입니다.");
    		}
    		else {
    			System.out.println("성적은 F입니다.");
    		}
        }
        
        bReader.close();   
	}

}
