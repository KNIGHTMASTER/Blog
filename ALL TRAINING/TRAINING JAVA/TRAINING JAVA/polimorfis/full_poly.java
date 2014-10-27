abstract class try_poly{	

	abstract void count_large(){
	}
}

class a extends try_poly{
	public a(String a){
		System.out.println(a);
	}
	public void count_large(int p, int l){		
	int L=p*l;
		System.out.println("Large = "+L);		
	}
}

class b extends try_poly{
	public b(String b){
		System.out.println(b);
	}
	public void count_large(int p, int l){
	int L=p*l;;
		System.out.println("Large = "+L);		
	}
}

class full_poly{
	public static void main(String [] args){
		a satu=new a("awal");
		satu.count_large(2,3);
		
		b dua=new b("kedua");
		dua.count_large(2,3);
	}
}
