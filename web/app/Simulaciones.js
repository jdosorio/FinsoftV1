function getCalculos(num){
                    
   $.ajax({
    url: "SSimulaciones",
    type: "POST",
    timeout: 30000,
    data: {cedula: num},
    cache: false,
    success: function (data) {
        $('#tabla').html(data);
    },
    error: function (data) { 
        console.log(data); }
  });
}


