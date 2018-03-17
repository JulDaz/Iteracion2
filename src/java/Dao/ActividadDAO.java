/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Util.DbUtil;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
        PreparedStatement preparedStatement = connection.prepareStatement("insert into actividad values (?,?,1)");
        preparedStatement.setString(1, nombre);
        preparedStatement.setInt(2, idTema);
        preparedStatement.executeUpdate();
    }
}
