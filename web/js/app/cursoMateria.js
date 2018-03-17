$('#verCursosMateria').click(function () {
    $.ajax({
        type: 'GET',
        url: "CursoMateriaS",
        //force to handle it as text
        data: {
            'opcion': "0"
        },
        dataType: "text",
        success: function (data) {
            $('#tablaCM').removeAttr('style');
            $('#SelectCM').attr('style', 'display: none;');
            var selectForm = $('#tablaCM');
            selectForm.append('<tr><td style="color:white" >Curso</td><td style="color:white" >Materia</td><td style="color:white" >Profesor</td> </tr>');
            var json = $.parseJSON(data);
            console.log(json);
            for (var i = 0; i < json.length; ++i)
            {
                var opcion = "<tr><td style=\"color:white\" >" + json[i].curso + "</td><td style=\"color:white\" >" + json[i].materia + "</td><td style=\"color:white\" >" + json[i].profesor + "</td> </tr>";
                selectForm.append(opcion);
            }

        },
        async: false
    });
});
