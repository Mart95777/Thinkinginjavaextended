package containers;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utils.Countries;

public class Ex02 {

	public static void main(String[] args) {
		Map<String,String> m = new HashMap<String,String>();
		String s = "A[a-zA-Z]*";
		Pattern p = Pattern.compile(s);
		Matcher matcher;
				
		for (int i = 0; i<Countries.DATA.length;i++){
			matcher = p.matcher(Countries.DATA[i][0]);
			if (matcher.matches()) m.put(Countries.DATA[i][0], Countries.DATA[i][1]);
		}
		System.out.println(m);
		Set set = m.keySet();
		System.out.println(set);
	}

}
