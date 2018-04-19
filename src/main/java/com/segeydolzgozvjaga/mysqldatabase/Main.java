package com.segeydolzgozvjaga.mysqldatabase;

import com.segeydolzgozvjaga.mysqldatabase.Dao.DaoImpl;

import java.util.logging.Logger;

/**
 * @author Sergey Dolgozvjaga
 *
 * Simple Java program to connect to MySQL database running on localhost and
 * running SELECT and INSERT query to retrieve and add data.
 */
public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String args[]) {

        logger.info("start application");
        DaoImpl impl = new DaoImpl();
        impl.displayAll();
        logger.info("exit application");
    }
}
