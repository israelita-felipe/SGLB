package br.com.glb.util;

import javax.faces.context.FacesContext;
import org.hibernate.Session;

/**
 *
 * @author Israel Araújo
 */
public class FacesContextUtil {

    // ATRIBUTOS
    private static final String HIBERNATE_SESSION = "hibernate_session";
    
    
    // METODOS
    public static void setRequestSession(Session session){
        FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put(HIBERNATE_SESSION, session);
    }

    public static Session getRequestSession() {
        return (Session)FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get(HIBERNATE_SESSION);
    }
    
}

