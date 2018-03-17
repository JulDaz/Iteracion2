/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Materia;
import Util.DbUtil;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author FiJus
 */
public class MateriaDAO {

    private Connection connection;

    public MateriaDAO() throws SQLException, URISyntaxException, ClassNotFoundException, IOException {
        connection = DbUtil.getConnection();
    }



    public Materia getMateriaById(int idMateria) throws SQLException {
        Materia m = new Materia();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from materia where id=" + idMateria);
        while (rs.next()) {
            m.setIdMateria(idMateria);
            m.setNombre(rs.getString("nombre"));
        }
        return m;
    }

}
