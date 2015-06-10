public class AngkaTerbilang{

	public static void main( String [] args ){
		int angka = Integer.parseInt( args[0] );
		System.out.println( angka +" terbilang : "+ terbilang( angka ) );
	}
	
	public static String terbilang(int value){
		String terbilang = "";			
		if ( value <12 ) {
			terbilang = " "+ bilang( value );
		}else if ( value<20 ){
			terbilang = terbilang( value - 10 )+" belas ";
		}else if ( value<100 ){
			terbilang = terbilang( value/10 )+" puluh "+terbilang( value % 10 );
		}else if ( value<200 ){
			terbilang = " seratus "+terbilang( value - 100 );
		}else if ( value<1000 ){
			terbilang = terbilang( value/100 )+" ratus "+terbilang(value % 100);
		}else if ( value<2000 ){
			terbilang = " seribu "+ terbilang(value-1000);
		}else if ( value<1000000 ){
			terbilang = terbilang( value/1000 )+" ribu "+terbilang(value % 1000);
		}else if ( value< 1000000000 ){
			terbilang = terbilang( value/1000000)+" juta "+ terbilang( value % 1000000);
		}else {
			terbilang = terbilang( value/1000000000)+ " milyar "+ terbilang( value%1000000000 );
		}
		return terbilang;
	}
	
	static String bilang(int value){
		String bilang = "";
			switch ( value ){
				case 0 : bilang = ""; break;
				case 1 : bilang = "satu"; break;
				case 2 : bilang = "dua"; break;
				case 3 : bilang = "tiga"; break;
				case 4 : bilang = "empat"; break;
				case 5 : bilang = "lima"; break;
				case 6 : bilang = "enam"; break;
				case 7 : bilang = "tujuh"; break;
				case 8 : bilang = "delapan"; break;
				case 9 : bilang = "sembilan"; break;
				case 10 : bilang = "sepuluh"; break;
				case 11 : bilang = "sebelas"; break;
				default : bilang = "tidak terdefinisi";
			}
		return bilang;
	}	
	
}