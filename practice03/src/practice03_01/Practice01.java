package practice03_01;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PropPractice prop = new PropPractice();
		
		String propStr;
		
		propStr = prop.read("Diamond");
		int line = 0;
		try {
			Double.parseDouble(propStr);
			line = Integer.parseInt(propStr);
			
			Diamond dia = new Diamond();			
			dia.print2console(line);
		} catch (NumberFormatException e) {
			System.out.println("--- error!! properties file data error!!");
		}
		
		Gugudan gugu = new Gugudan();
		
		gugu.print2console();;
		
		Sungjuk sungjuk = new Sungjuk();
		
		sungjuk.print2console();
	}

}
