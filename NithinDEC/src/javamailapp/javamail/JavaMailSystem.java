/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javamailapp.javamail;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author DineshReddy
 */
public class JavaMailSystem {
    
    public static void sendMail(String recepient, String emailSubject, String emailContent) throws Exception{ //
        System.out.println("Preparing to send an email");
        
        Properties properties = new Properties(); // to configure the mail system
        /*
        properties.put("mail.smtp.auth ", "true");
        properties.put("mail.smtp.starttls.enable ", "true");
        properties.put("mail.smtp.host ", "smtp.gmail.com");
        properties.put("mail.smtp.port ", "587"); //587 //465
        */
        
        //
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        //
        //mail.smtp.auth // this is for authentication of the mail server
        //mail.smtp.starttls.enable // this is for encryption
        //mail.smtp.host // for every mail server you have a host and a port // smtp.gmail.com
        //mail.smtp.port //587
        
        
        //Email Credentials of the account, from which you have to send the email
        
        final String myAccountEmail = "oxygenmanagementsystem@gmail.com";
        final String password = "oxygen123";
        
        // login using this email address
        Session session = Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAccountEmail,password);
            
            }
        });
        
        // prepare the message
        
        Message message = prepareMessage(session, myAccountEmail, recepient, emailSubject, emailContent);
        
        Transport.send(message);
        System.out.println("Message Sent Successfully");
    }

    private static Message prepareMessage(Session session, String myAccountEmail, String recepient , String emailSubject, String emailContent) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail)); // from address
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient) );
            
            message.setSubject(emailSubject);
            message.setText(emailContent);
            
            return message;
        } catch (Exception ex) {
            Logger.getLogger(JavaMailSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;// if some exception happens
    }
}
