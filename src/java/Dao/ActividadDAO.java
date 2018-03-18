/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Actividades;
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
 * @author FiJus
 */
public class ActividadDAO {

    private Connection connection;

    public ActividadDAO() throws SQLException, URISyntaxException, ClassNotFoundException, IOException {
        connection = DbUtil.getConnection();
    }

    public void addActividad(String nombre, int idTema) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into actividad(nombre,idtema,delete) values (?,?,1)");
        preparedStatement.setString(1, nombre);
        preparedStatement.setInt(2, idTema);
        preparedStatement.executeUpdate();
    }

    public ArrayList<Actividades> getAllActividades(int idT) throws SQLException {
        ArrayList<Actividades> actividad = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from actividad where delete=1 and idtema="+idT);
        while (rs.next()) {
            Actividades c = new Actividades();
            c.setIdTema(rs.getInt("idtema"));
            c.setNombre(rs.getString("nombre"));
            c.setId(rs.getInt("id"));
            actividad.add(c);
        }
        return actividad;
    }
}
