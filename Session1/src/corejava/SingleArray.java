package corejava;

public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Rainbow []=new String [7];
		
		Rainbow[0]="Red";
		Rainbow[1]="Orange";
		Rainbow[2]="Yellow";
		Rainbow[3]="Green";
		Rainbow[4]="violet";
		Rainbow[5]="indigo";
		Rainbow[6]="blue";
		System.out.println(Rainbow[0]);
		
		for (int i=0; i<Rainbow.length; i+=1)
		{
			System.out.println(Rainbow[i]);
			
		}
		System.out.println(Rainbow.length);
	}

}
