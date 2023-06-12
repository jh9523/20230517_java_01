package kh.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class mkFile {

	public void mkdirFile() {
		String path = "D:/dd/test/";
		String filename = "a.txt";
		
		new File(path).mkdirs();		// 디렉토리 생성
		File f = new File(path+filename);
		FileWriter fw = null;
		try {
			f.createNewFile();	// 파일생성
			
			fw = new FileWriter(f);
			
			fw.write("Hello, World");
			fw.flush();
		} catch (IOException e) {
			System.out.println("파일 생성 못함");
			e.printStackTrace();
		} finally {
			try {
				if( fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileRead() {
		String filePath = "D:/dd/test/b.txt";
		try(
				FileInputStream fis = new FileInputStream(filePath);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);
			)
		{
			String str = null;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
