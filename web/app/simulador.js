/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var glbLey = 2*689454;

var asesoria = 0.02;
var iva = 0.16;
var papeleria = 0.009;
var gmf = 0.04;

function recalcularSimulacion(){
    
    if(txtSimuBasi.value < 0){
        alert("Debe digitar primero el salario basico para realizar los respectivos calculos");
        return false;
    }
   
    txtSimuApor.value = Math.round(parseInt(txtSimuBasi.value) * 0.08);
    txtSimuTing.value = Math.round(parseInt(txtSimuBasi.value) + parseInt(txtSimuAdic.value));
    txtSimuInapo.value = Math.round(parseInt(txtSimuTing.value) - parseInt(txtSimuApor.value));
    
    if(parseInt(txtSimuBasi.value)< glbLey){
        var base = parseInt(txtSimuInapo.value) - 689454;
    }else{
        var base = parseInt(txtSimuInapo.value)/2;
    }
    
    txtSimuSlib.value = Math.round(base - parseInt(txtSimuTegr.value));
    
    if(txtSimuCuot.value != 0 && txtSimuTegr.value == 0){
    
    txtSimuCuot.value = txtSimuCuot.value;
    
    }else{
        txtSimuCuot.value = txtSimuSlib.value;
    }
    
    txtSimuCred.value = Math.round(parseInt(txtSimuCuot.value) * ((Math.pow(1 + (parseFloat(txtSimuTasa.value) / 100.00), parseInt(txtSimuPlaz.value)) - 1) / ((parseFloat(txtSimuTasa.value) / 100.00) * Math.pow(1 + (parseFloat(txtSimuTasa.value) / 100.00), parseInt(txtSimuPlaz.value)))));
    
    txtSimuAfin.value = Math.round(parseInt(txtSimuCred.value) * asesoria);
    
    txtSimuIva.value = Math.round(parseInt(txtSimuAfin.value) * iva);
    
    txtSimuGmf.value = Math.round(parseInt(txtSimuAfin.value) * gmf);
    
    txtSimuPape.value = Math.round(parseInt(txtSimuCred.value) * papeleria);
    
    txtSimuDese.value = Math.round((parseInt(txtSimuCred.value)) - parseInt(txtSimuAfin.value) - parseInt(txtSimuIva.value) - parseInt(txtSimuPape.value) - parseInt(txtSimuGmf.value));
}


