package com.allen.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) {

		writeTest();
	}

	private static void writeTest() {
		try {
			FileOutputStream out = new FileOutputStream("data.txt");
			out.write(65);
			out.flush();
			out.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
