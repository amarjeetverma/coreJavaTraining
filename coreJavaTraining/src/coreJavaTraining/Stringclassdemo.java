package coreJavaTraining;

public class Stringclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = " Hello/World"; //string
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("l"));
		System.out.println(a.substring(3, 8));
		System.out.println(a.substring(4));
		System.out.println(a.concat(" Java/Training"));
		String b = (a.concat(" Java/Training"));
		System.out.println(b.length());
		System.out.println(b.trim());
		System.out.println(b.toUpperCase());
		System.out.println(b.toLowerCase());
		//System.out.println(b.split("/"));
		String arr[] = b.split("/");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(b.replace("l", "z"));
	}

}
