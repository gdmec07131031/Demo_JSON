package cn.edu.gdmec.s07131031.demo_json;

import java.util.List;

public class Person {

		private String name;
		private int age;
		private List<String> phose;
		
		public Person() {
			super();
		}

		public Person(String name, int age, List<String> phose) {
			super();
			this.name = name;
			this.age = age;
			this.phose = phose;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public List<String> getPhose() {
			return phose;
		}

		public void setPhose(List<String> phose) {
			this.phose = phose;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", phose=" + phose
					+ "]";
		}
		
		
		
		

}
