import java.util.*;

public class MilitaryTimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();
		int[] tArr= new int[]{13,14,15,16,17,18,19,20,21,22,23,12};
		String[] t=time.split(":");
		StringBuilder sec=new StringBuilder().append(t[2].charAt(0)).append(t[2].charAt(1));
		StringBuilder ampm=new StringBuilder().append(t[2].charAt(2)).append(t[2].charAt(3));
		String str=ampm.toString();
		int ti= Integer.parseInt(t[0]);
		
		if(str.equalsIgnoreCase("pm"))
			ti=tArr[ti-1];
		else if(str.equalsIgnoreCase("am") && ti==12)
			ti=00;
		
		if(str.equalsIgnoreCase("pm"))
			System.out.println(ti+":"+t[1]+":"+sec);
		else
			System.out.println("0"+ti+":"+t[1]+":"+sec);
	}
	
}

