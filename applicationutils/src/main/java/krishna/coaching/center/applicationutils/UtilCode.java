package krishna.coaching.center.applicationutils;

import org.apache.commons.lang3.StringUtils;

public class UtilCode {

	public boolean stringChecks(){
		
		String name = "";
		if(StringUtils.isEmpty(name))
		return true;
		
		return false;
	}
	
	public static void main(String a[]){
		System.out.println("testing!!");
	}
}
