package quiz10;

public class MainClass {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		
		new Computer(new KeyBoard(), new Mouse(), new Monitor());
		
		computer.computerInfo();
		
		Monitor monitor = computer.getMonitor();
		
		monitor.info();
		
		computer.getMonitor().info();
		
	}
}
