/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Estudiante;
import Modelo.Observador;
import Util.DbUtil;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author LabingXEON
 */
public class ObservadorDAO {

    private Connection connection;

    public ObservadorDAO() throws SQLException, URISyntaxException, ClassNotFoundException, IOException {
        connection = DbUtil.getConnection();
    }

    public void addObservador(String detalles, int calificacion, int idEst, int idProfesor) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into observador(idprofesor,detalles,calificacion,idestudiante,delete) values (?,?,?,?,?)");
        preparedStatement.setInt(1, idProfesor);
        preparedStatement.setString(2, detalles);
        preparedStatement.setInt(3, calificacion);
        preparedStatement.setInt(4, idEst);
        preparedStatement.setInt(5, 1);
        System.out.println(calificacion+"--"+detalles+"---"+idEst+"--"+idProfesor);
        preparedStatement.executeUpdate();
    }

    public ArrayList<Estudiante> getEstudiantesByIDCurso(int id_curso) throws SQLException, URISyntaxException {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from estudiante where idcurso=" + id_curso);
        while (rs.next()) {
            Estudiante c = new Estudiante();
            c.setIdEstudiante(rs.getInt("documento"));
            c.setNombre(rs.getString("nombre"));
            estudiantes.add(c);
        }
        return estudiantes;
    }

    public ArrayList<Observador> getObservadorByID(int id_estudiante) throws SQLException, URISyntaxException {
        ArrayList<Observador> notasObs = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from observador where idestudiante=" + id_estudiante+" and delete=1");
        while (rs.next()) {
            Observador c = new Observador();
            c.setIdEstudiante(rs.getInt("idestudiante"));
            c.setCalificacion(rs.getInt("calificacion"));
            c.setDetalles(rs.getString("detalles"));
            notasObs.add(c);
        }
        return notasObs;
    }

    public ArrayList<Observador> getAllObservadores() throws SQLException, URISyntaxException {
        ArrayList<Observador> notasObs = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from observador where delete=1");
        while (rs.next()) {
            Observador c = new Observador();
            notasObs.add(c);
        }
        return notasObs;
    }

}
