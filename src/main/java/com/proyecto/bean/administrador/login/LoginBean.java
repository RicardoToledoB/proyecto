package com.proyecto.bean.administrador.login;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
@RequestScoped
public class LoginBean {
    private static Logger log = Logger.getLogger(LoginBean.class.getName());  
        
      private String username;  
      private String password;  
        
      public String login() {  
           FacesContext context = FacesContext.getCurrentInstance();  
           HttpServletRequest request = (HttpServletRequest) context  
                                              .getExternalContext().getRequest();  
          
           try {  
              
                request.login(username, password);  
           } catch (ServletException e) {  
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Login failed!", null));  
                return "index";  
           }  
      
           return "/sistema/index.xhtml?faces-redirect=true"; 
      }  
        
      public String logout() {  
           String result="/index.xhtml?faces-redirect=true";  
             
           FacesContext context = FacesContext.getCurrentInstance();  
           HttpServletRequest request = (HttpServletRequest)context.getExternalContext().getRequest();  
             
           try {  
                request.logout();  
           } catch (ServletException e) {  
                log.log(Level.SEVERE, "Failed to logout user!", e);  
                result = "/error.xhtml?faces-redirect=true";  
           }  
             
           return result;  
      }  
   
      public String getUsername() {  
           return username;  
      }  
   
      public void setUsername(String username) {  
           this.username = username;  
      }  
   
      public String getPassword() {  
           return password;  
      }  
   
      public void setPassword(String password) {  
           this.password = password;  
      }  
   
    
}
