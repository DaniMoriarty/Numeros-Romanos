import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {

		int num= 2055;
		String numero="";
		char numro='I';
		
		ArrayList<Character> romano= new ArrayList<Character>();
		ArrayList<String> romanoX= new ArrayList<String>();
		String romanoXX="";
		String[] unidades= {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String[] decenas= {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] centenas= {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] millares= {"M", "MM", "MMM"};
		
		int cifra= num%10;
		numero= numero + Integer.toString(cifra);
		
		while(num>0) {
			num=num/10;
			numero= numero + Integer.toString(num%10);
		}
		
		for( int i=numero.length()-2; i>=0;i--) {
			romano.add(numero.charAt(i));
		}
		
		System.out.println(romano);
		
		for(int i=0; i<romano.size(); i++) {
			
			if(Character.getNumericValue(romano.get(i))==0) {
				romanoX.add(" ");
				romanoXX= romanoXX + " ";
			}
			else {
				if(romano.size()-i==4) {
					romanoX.add(millares[Character.getNumericValue(romano.get(i))-1]);
					romanoXX= romanoXX + millares[Character.getNumericValue(romano.get(i))-1];
				}
				else if(romano.size()-i==3) {
					romanoX.add(centenas[Character.getNumericValue(romano.get(i))-1]);
					romanoXX= romanoXX + centenas[Character.getNumericValue(romano.get(i))-1];
				}
				else if(romano.size()-i==2) {
					romanoX.add(decenas[Character.getNumericValue(romano.get(i))-1]);
					romanoXX= romanoXX + decenas[Character.getNumericValue(romano.get(i))-1];
				}
				else if(romano.size()-i==1) {
					romanoX.add(unidades[Character.getNumericValue(romano.get(i))-1]);
					romanoXX= romanoXX + unidades[Character.getNumericValue(romano.get(i))-1];
				}
			}

		}
		
		System.out.println(romanoX);
		System.out.println(romanoXX);
		
		

	}

}
