package DD.stati;

public class Student {
	int chinese;
	int math;
	int english;
	static int pass = 60;

	public Student(int chinese, int math, int english) {
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}

	public void print() {
		System.out.println(getScore(chinese) + "\t" + getScore(math) + "\t" + getScore(english));
	}

	private String getScore(int score) {
		if (score < pass) {
			return String.valueOf(score) + "*";

		} else {
			return String.valueOf(score);
		}
	}

}
