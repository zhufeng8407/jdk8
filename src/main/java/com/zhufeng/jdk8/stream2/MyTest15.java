package com.zhufeng.jdk8.stream2;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyTest15 extends ClassLoader {

	private String classLoaderName;
	
	private final String fileExtension = ".class";
	
	public MyTest15(String classLoaderName) {
		super();
		this.classLoaderName = classLoaderName;
	}
	
	public MyTest15(ClassLoader classLoader, String classLoaderName) {
		super(classLoader);
		this.classLoaderName = classLoaderName;
	}
	
	
	
	@Override
	public Class<?> findClass(String name) throws ClassNotFoundException {
		System.out.println("findClass: " + name);
		
		byte[] bytes = this.loadClassData(name);
		
		return this.defineClass(name, bytes, 0, bytes.length);
	}
	
	private byte[] loadClassData(String name) {
		InputStream is = null;
		byte[] data = null;
		ByteArrayOutputStream baos = null;
		
		try {
//			this.classLoaderName = this.classLoaderName.replace(".", "/");
//			String fileName = name.replace(".", "/") + this.fileExtension;
//			fileName = this.getResource(fileName).getFile();
//			System.out.println("-----------------------------------: " + fileName);
			is = new FileInputStream(new File(name + this.fileExtension));
			baos = new ByteArrayOutputStream();
			int ch = 0;
			while (-1 != (ch = is.read())) {
				baos.write(ch);
			}
			
			data = baos.toByteArray();
					
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				baos.close();
				is.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
		return data;
	}
	
	public static void test(ClassLoader classLoader) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> clazz = classLoader.loadClass("com.zhufeng.jdk8.stream2.MySetCollector");
		
		System.out.println(clazz.newInstance());
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		test(new MyTest15("loader1"));
	}

}
