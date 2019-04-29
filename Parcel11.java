package HelloWorld;

public class Parcel11 {
	public static class ParcelContents implements Contents {
		private int i = 11;
		public int value() { return i; }
	}
	
	protected static class ParcelDestination implements Destination{
		private String label;
		private ParcelDestination(String whereTo){
			label = whereTo;
		}
		public String readLabel() { return label; }
		public static void f(){}
		static int x = 10;
		static class AnotherLevel {
			public static void f() {}
			static int x = 10;
		}
	}
	public static Destination destination(String s){
		return new ParcelDestination(s);
	}
	
	public static Contents contents(){
		return new ParcelContents();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contents c = contents();
		Destination d = destination("Tasmania");
	}

}
