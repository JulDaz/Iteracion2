$(document).ready(function () {

    $('#EliminarE').on('submit', function () {
        $.ajax({
            type: 'GET',
            url: "EstudianteS",
            data: {

                'opcion': "3",
                // 'documento': $('#documento').val(),
                'documento': $('#documento').val()
            },
            dataType: "text",
            success: function (data) {


            },
            async: false
        });
    });

    $('#botonVerE').click(function () {
        $.ajax({
            type: 'GET',
            url: "EstudianteS",
            //force to handle it as text
            data: {
                'opcion': "4",
                'documento': $('#documentos').val()
                        // 'documento':"144144"
            },
            dataType: "text",
            success: function (data) {
                var json = $.parseJSON(data);
                $('#documento2').attr('value', json.idEstudiante);
                $('#nombre').attr('value', json.nombre);
                $('#idcurso').attr('value', json.idCurso);
                $('#fechanacimiento').attr('value', json.fechaNacimiento);
                $('#direccion').attr('value', json.direccion);
                $('#celularcontacto').attr('value', json.celularContacto);
                $('#tiposangre').attr('value', json.tipoSangre);
                $('#rh').attr('value', json.rh);


            },
            async: false
        });

    });
    $('#EditarE').on('submit', function () {
        $.ajax({
            type: 'GET',
            url: "EstudianteS",
            data: {
                'opcion': "5",
                'documento': $('#documento2').val(),
                'nombre': $('#nombre').val(),
                'idcurso': $('#idcurso').val(),
                'fechanacimiento': $('#fechanacimiento').val(),
                'direccion': $('#direccion').val(),
                'celularcontacto': $('#celularcontacto').val(),
                'tiposangre': $('#tiposangre').val(),
                'rh': $('#rh').val()
            },
            dataType: "text",
            success: function (data) {


            },
            async: false
        });
    });
});