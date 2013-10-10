/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.u201214941.dao;

import edu.upc.u201214941.entity.Deuda;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Alfonso
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/WEB-INF/context/U201214941-servlet.xml")

public class DeudaDaoTest {

    
    private static Logger log = LoggerFactory.getLogger(DeudaDaoTest.class);
    
    @Autowired
    private DeudaDao deudaDao;
    
    @Test
    public void testGetListRuc(){
      Deuda objDeuda = new Deuda();
        String ruc = "20516755416";
        objDeuda = deudaDao.getListRuc(ruc);
        Assert.assertNull(objDeuda);   
    }
//    
//    public DeudaDaoTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getListDeudas method, of class DeudaDao.
//     */
//    @org.junit.Test
//    public void testGetListDeudas() {
//        System.out.println("getListDeudas");
//        DeudaDao instance = new DeudaDaoImpl();
//        List expResult = null;
//        List result = instance.getListDeudas();
//        assertEquals(expResult, result);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getListRuc method, of class DeudaDao.
//     */
//    @org.junit.Test
//    public void testGetListRuc() {
//        System.out.println("getListRuc");
//        String Ruc = "";
//        DeudaDao instance = new DeudaDaoImpl();
//        Deuda expResult = null;
//        Deuda result = instance.getListRuc(Ruc);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    public class DeudaDaoImpl implements DeudaDao {
//
//        public List<Deuda> getListDeudas() {
//            return null;
//        }
//
//        public Deuda getListRuc(String Ruc) {
//            return null;
//        }
//    }
}