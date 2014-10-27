class besarkecil{
	String data=null;
	public besarkecil(){		
	}
	public void setData(String data){
		this.data=data;
	}	
	public String setUpper(){
		return data.toUpperCase();
	}
	public String setLower(){
		return data.toLowerCase();
	}
	public static void main(String [] args){
		besarkecil x=new besarkecil();
		x.setData("fauzi");
		System.out.println(x.setUpper());
		//System.out.println(x.setLower());
	}
}