package encapsulations;

public class Student {
		private int age;
		private String name;
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			if(age>20) {
				System.out.println("You are to old to be a student in our school.");
			}else {
			this.age = age;
			}
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
}
