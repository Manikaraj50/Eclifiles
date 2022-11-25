

import java.util.LinkedHashSet;
import java.util.Set;

class UserDefine{
	private  String name;
   public String getname() {
	   return name;
   }
   public void setname(String name) {
	  this.name=name;
   }
}


public class SetFunction {
	public static void main(String[] args) {
		UserDefine u=new UserDefine();
		u.setname("jona");
		
		
		Set<UserDefine>s=new LinkedHashSet<>();
		s.add(u);
		
		for(UserDefine x : s) {
			System.out.println(x.getname());
		}
		
		
			
		}
	}


