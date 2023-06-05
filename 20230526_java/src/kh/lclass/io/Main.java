package kh.lclass.io;

import java.io.IOException;

import kh.lclass.exception.UserException;

public class Main {

	public static void main(String[] args) /*throws IOException*/{
		// TODO Auto-generated method stub
//		new TestFileIO().testFile();
//		new TestFileIO().testFileRead();
//		new TestFileIO().testFileRead2();
//		new TestFileIO().testFileRead3();
//		try {
//			new TestFileIO().testRamda();
//		} catch (UserException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		new TestFileIO().testFileReadData();
		new TestFileIO().testFileOutputStreamObject();
		new TestFileIO().testFileInputStreamObject();
		
		System.out.println("=== main끝 ===");

	}

}
