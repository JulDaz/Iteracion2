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

});