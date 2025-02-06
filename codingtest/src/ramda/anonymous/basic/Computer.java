package ramda.anonymous.basic;

public class Computer  {

	private int sound;
	private RemoteControl remote;
	
	public Computer() {
		
		remote = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				
				sound++;
				System.out.println("컴퓨터 볼륨: " +sound);
			}
			
			@Override
			public void volumeDown() {
				
				sound--;
				System.out.println("컴퓨터 볼륨: " +sound);
			}
			
			@Override
			public void turnOff() {

				System.out.println("컴퓨터를 끕니다.");
			}
			
			@Override
			public void trunOn() {

				System.out.println("컴퓨터를 켭니다.");
			}
		};
	}
}
