
      
$('#guardarCurso').on('click', function () {
    $.ajax({
        type: 'POST',
        url: "CursoS",
       
        data: {
            'nombreCurso': $('#nombreCurso').val(),
            'numeroEstudiantes':$('#nombreEstudiantes').val()
        },
        dataType: "text",
        success: function (data) {

        },
        async: false
    });
});
  
  
  


