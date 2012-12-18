package com.its.tabs.trm.web.servlets;

/**
 * Created by IntelliJ IDEA.
 * User: t00750090
 * Date: Dec 16, 2012
 * Time: 8:47:35 PM
 * To change this template use File | Settings | File Templates.
 */


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class StartupManager extends HttpServlet {



    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("StartupManager init" );



    }


}
