/*Document JavaScript*/
function input(){
	var data=new Array();
	var a,b,bar,kol;
	bar=prompt("masukkan baris = ");
	kol=prompt("masukkan kolom = ");
	document.write("bar  ="+bar+"<br />");
	document.write("kol  ="+kol+"<br />");
		for(a=0;a<bar;a++){
			for(b=0;b<kol;b++){				
				document.write("loop a= "+a+" b= "+b+"<br />");
				data[a][b]=window.prompt("Masukkan nilai pada elemen ");
			}
		}
}
input();