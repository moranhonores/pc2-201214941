/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.u201214941.dao.impl;

import edu.upc.u201214941.dao.DeudaDao;
import edu.upc.u201214941.entity.Deuda;
import java.util.List;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alfonso
 */

@Repository
public class DeudaDaoImpl extends SimpleJdbcDaoSupport implements DeudaDao {
    
    private static Logger log = LoggerFactory.getLogger (DeudaDaoImpl.class);

    @Autowired
    public DeudaDaoImpl (DataSource dataSource){
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }
    
    @Override
    public List<Deuda> getListDeudas() {
        return getSimpleJdbcTemplate().query(
               "Select idDeuda,ruc,concepto,periodoTributario,resolucion,codTributo,importePago from deudas",
               new BeanPropertyRowMapper<Deuda>(Deuda.class));
    }

    @Override
    public Deuda getListRuc(String Ruc) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select idDeuda,ruc,concepto,periodoTributario,resolucion,codTributo,importePago from deudas where ruc=?",
                    new BeanPropertyRowMapper<Deuda>(Deuda.class), Ruc);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
