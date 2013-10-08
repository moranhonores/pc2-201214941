/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.u201214941.controller;

import edu.upc.u201214941.dao.DeudaDao;
import edu.upc.u201214941.entity.Deuda;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Alfonso
 */

@Controller("deudaController")
public class DeudaController {
     
    @Autowired
    private DeudaDao objDeudaDao;
    private static Logger log = LoggerFactory.getLogger(DeudaController.class);
    
   @RequestMapping("/ListarDeuda")
    public ModelAndView ListarDeuda() {
        ModelAndView mav = new ModelAndView("/ListarDeuda");
        List<Deuda> deuda = objDeudaDao.getListDeudas();
        mav.addObject("deuda", objDeudaDao);
        return mav;
    }
    
}
