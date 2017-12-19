package com.ifpb.shared;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ServiceLocator {
    
    
    public Calculadora lookup(String host, String port, String name){
        
        try {
            Properties properties = new Properties();
            properties.put(InitialContext.INITIAL_CONTEXT_FACTORY, 
                "com.sun.enterprise.naming.SerialInitContextFactory");
            properties.setProperty("org.omg.CORBA.ORBInitialHost", host);
            properties.setProperty("org.omg.CORBA.ORBInitialPort", port);
            Context cont = new InitialContext(properties);
            return (Calculadora) cont.lookup(name);
        } catch (NamingException ex) {
            Logger.getLogger(ServiceLocator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
}
