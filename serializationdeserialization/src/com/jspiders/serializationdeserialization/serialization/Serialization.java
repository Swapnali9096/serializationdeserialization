package com.jspiders.serializationdeserialization.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.jspiders.serializationdeserialization.object.User;

public class Serialization {
public static void main(String[] args) throws IOException {
	File file=new File("D:\\Demo.txt");
	FileOutputStream fileOutputStream=new FileOutputStream(file);
	ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
	objectOutputStream.writeObject(new User(1,"ram","ram@gmail.com",9678645345l));
	System.out.println("object has been serializable");
	objectOutputStream.close();
	fileOutputStream.close();
}
}
