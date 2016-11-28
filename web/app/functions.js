
function separador_miles(x) {
	signo = "";
	
	if (x.value.substr(0, 1) == "-") {
		x.value = x.value.substr(1);
		signo = "-";
	}
	
	y = x.value;
	inicio = x.value.length - 3;
	z = "";
	
	while (inicio > 0) {
		z = ","+y.substr(inicio, 3)+z;
		
		inicio -= 3;
	}
	
	if (x.value.length % 3) 
		restante = x.value.length % 3;
	else
		restante = 3;
	
	z = y.substr(0, restante)+z;
	
	x.value = signo+""+z;
}