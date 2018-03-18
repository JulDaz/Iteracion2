$(document).ready(function () {
    $.ajax({
        type: 'GET',
        url: "MateriaS",
        //force to handle it as text
        
        data: {
           
        },
        dataType: "text",
        success: function (data) {
            var selectForm = $('#tabla');
            selectForm.empty();
            selectForm.append('<tr><td style="color:white" >Materias</td> </tr>');
            var json = $.parseJSON(data);
            for (var i = 0; i < json.length; ++i)
            {
                var opcion = "<tr><td style=\"color:white\" >" + json[i].nombre + "</td></tr>";
                selectForm.append(opcion);
            }
        },
        async: false
    });



});









