package org;

public class UserDefineException {
         public static void main(String[] args) throws Throwable{
			String empid="112345";
			if(empid.equals("123464")) {
				System.out.println("welcome");
			}else {
				throw new EmployeeIdNotFoundException();
			}
		}
}
