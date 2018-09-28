package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class Filemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		Scanner input=new Scanner(System.in);
		String n =input.nextLine();
        list.add(n);

        writeToFile(list);
        deleteFromFile(list,"ali");

	}
	public static void writeToFile(ArrayList<String> list) {
		try {
			BufferedWriter writer=new BufferedWriter(new FileWriter("write.txt"));

			for(String x:list) {
				writer.write(x);
				writer.newLine();
			}
			
			writer.close();
			
		}catch (Exception e) {
			e.getStackTrace();
			
		}
		System.out.println(list);

		}
	public static void deleteFromFile(ArrayList<String> list, String search){
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals(search)){
				list.remove(i);
				writeToFile(list);
				System.out.println(list);
			}
		}
	}
}
