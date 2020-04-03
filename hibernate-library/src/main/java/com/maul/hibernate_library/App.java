package com.maul.hibernate_library;

import org.hibernate.Session;

import com.maul.hibernate_library.config.HibernateConfig;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session= HibernateConfig.getSessionFactory().openSession();

    }
}
