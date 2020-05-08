package lession6;

public class Main {

	public static void main(String[] args) {
		WorkerAtHour n1 = new WorkerAtHour("Іванов Іван Іванович", "роботяга", 180, 50.5f, 20f);
		System.out.println(n1 + " зарплата =" + n1.calculation()+" грн");
		WorkerAtHour n2 = new WorkerAtHour("Кузьмін Кузьма Кузьміч", "роботяга", 200, 55.5f, 20f);
		System.out.println(n2 + " зарплата =" + n2.calculation()+" грн");
		
		WorketAtRate n3 = new WorketAtRate("Петров Петро Петрович", "начальник", 20, 20, 15000, 10f);
		System.out.println(n3 + " зарплата =" + n3.calculation()+" грн");
		WorketAtRate n4 = new WorketAtRate("Леонов Леонід Леонідович", "замнач", 20, 20, 10000, 10f);
		System.out.println(n4 + " зарплата =" + n4.calculation()+" грн");
		
		
	}

}
