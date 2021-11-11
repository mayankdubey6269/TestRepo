package exerciseIO13;

import java.io.File;
import java.util.Date;

public class TextPackage {

	public static void main(String[] args) {
		File f = new File("d:/hello.txt");
		File newf = new File("d:/hellojava.txt");
//		System.out.println(f);
//		System.out.println("Name" +f.getName());
//		System.out.println("Is writable" +f.canWrite ());
//		System.out.println("Absolute path:" +f.getAbsolutePath());
//		System.out.println("Is readbale" +f.canRead());
//		System.out.println("Is file" +f.isFile());
//		System.out.println("Is Directory" +f.isDirectory());
//		System.out.println("LastModifued at" +new Date(f.lastModified()));
//		System.out.println("Lenght" +f.length()  );
//		System.out.println(f.exists());	
//		System.out.println(f.delete());
//		System.out.println(f.mkdir());
//		System.out.println(f.listFiles());
//		System.out.println(f.getName());
		System.out.println(f.renameTo(newf));
	}
}
