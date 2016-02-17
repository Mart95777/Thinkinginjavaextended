package containers;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utils.Countries;

public class Ex03 {
	
	public static void main(String[] args) {
		String s = "A[a-zA-Z]*";
		Pattern p = Pattern.compile(s);
		Matcher matcher;
		
		List<String> list = new ArrayList<String>();
		for (int i = 0; i<Countries.DATA.length;i++){
			matcher = p.matcher(Countries.DATA[i][0]);
			if (matcher.matches()) list.add(Countries.DATA[i][0]);
		}
		for (int i = 0; i<Countries.DATA.length;i++){
			matcher = p.matcher(Countries.DATA[i][0]);
			if (matcher.matches()) list.add(Countries.DATA[i][0]);
		}
		System.out.println(list);
		
		Set<String> set1 = new HashSet<String>();
		for (int i = 0; i<Countries.DATA.length;i++){
			matcher = p.matcher(Countries.DATA[i][0]);
			if (matcher.matches()) set1.add(Countries.DATA[i][0]);
		}
		for (int i = 0; i<Countries.DATA.length;i++){
			matcher = p.matcher(Countries.DATA[i][0]);
			if (matcher.matches()) set1.add(Countries.DATA[i][0]);
		}
		System.out.println(set1);
		
		Set<String> set2 = new LinkedHashSet<String>();
		for (int i = 0; i<Countries.DATA.length;i++){
			matcher = p.matcher(Countries.DATA[i][0]);
			if (matcher.matches()) set2.add(Countries.DATA[i][0]);
		}
		for (int i = 0; i<Countries.DATA.length;i++){
			matcher = p.matcher(Countries.DATA[i][0]);
			if (matcher.matches()) set2.add(Countries.DATA[i][0]);
		}
		System.out.println(set2);
		
		Set<String> set3 = new TreeSet<String>();
		for (int i = 0; i<Countries.DATA.length;i++){
			matcher = p.matcher(Countries.DATA[i][0]);
			if (matcher.matches()) set3.add(Countries.DATA[i][0]);
		}
		for (int i = 0; i<Countries.DATA.length;i++){
			matcher = p.matcher(Countries.DATA[i][0]);
			if (matcher.matches()) set3.add(Countries.DATA[i][0]);
		}
		System.out.println(set3);
		
	}

}
