package coreJavaTraining;

public class Reversedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "saippuakivikauppias";
		String t = "";
		for (int i=s.length()-1; i>=0 ; i--)
		{
			//System.out.println(s.charAt(i));
			t =t + s.charAt(i);
		}
		
		System.out.println(s);
		System.out.println(t);
		
		if (s.equals(t))
				{
			System.out.println("Pelindrome");
				}
		else
		{
			System.out.println("Not Pelindrome");
		}
	}	
}
