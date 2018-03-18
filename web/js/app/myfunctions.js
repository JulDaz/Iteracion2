$(document).ready(function () {
    $('#EliminarProfesor2').on('submit', function () {
        $.ajax({
            type: 'GET',
            url: "ProfesorGestion",
            data: {
                'cedula': $('#cedula').val(),
                'opcion': "0"
            },
            dataType: "text",
            success: function (data) {


            },
            async: false
        });
    });

    $('#botonVerP').click(function () {
        $.ajax({
            type: 'GET',
            url: "ProfesorGestion",
            //force to handle it as text
            data: {
                'opcion': "1",
                'cedula': $('#cedula').val()
                        // 'documento':"144144"
            },
            dataType: "text",
            success: function (data) {
                var json = $.parseJSON(data);
                $('#cedula2').attr('value', json.idProfesor);
                $('#nombre').attr('value', json.nombre);
                $('#tipousuario').attr('value', json.tipoU);
                $('#password').attr('value', json.password);
                $('#usuario').attr('value', json.usuario);
                $('#fechanacimiento').attr('value', json.fechaNacimiento);
                $('#tiposangre').attr('value', json.tipoSangre);
                $('#rh').attr('value', json.rh);
                $('#correo').attr('value', json.correo);
                $('#celular').attr('value', json.celular);
                $('#direccion').attr('value', json.direccion);
                $('#estudios').attr('value', json.estudios);
                $('#experiencia').attr('value', json.experiencia);


            },
            async: false
        });

    });
    $('#EditarP').on('submit', function () {
        $.ajax({
            type: 'GET',
            url: "ProfesorGestion",
            data: {
                'opcion': "2",
                'cedula': $('#cedula').val(),
                'nombre': $('#nombre').val(),
                'tipoU': $('#tipousuario').val(),
                'correo': $('#correo').val(),
                'celular': $('#celular').val(),
                'direccion': $('#direccion').val(),
                'estudios': $('#estudios').val(),
                'experiencia': $('#experiencia').val(),
                'fechanacimiento': $('#fechanacimiento').val(),
                'tiposangre': $('#tiposangre').val(),
                'rh': $('#rh').val(),
                'usuario': $('#usuario').val(),
                'contra': $('#password').val()
            },
            dataType: "text",
            success: function (data) {


            },
            async: false
        });
    });

});