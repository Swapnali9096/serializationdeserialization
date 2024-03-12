package com.jspiders.serializationdeserialization.deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.jspiders.serializationdeserialization.object.User;

public class Deserialization {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	File file=new File("D:\\Demo.txt");
	FileInputStream fileInputStream=new FileInputStream(file);
	ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
	Object user=objectInputStream.readObject();
	System.out.println(user);
	System.out.println("object is deserialized");
	objectInputStream.close();
	fileInputStream.close();
	}
}
