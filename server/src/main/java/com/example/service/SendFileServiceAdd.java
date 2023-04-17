package com.example.service;

import jakarta.inject.Singleton;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

@Singleton
public class SendFileServiceAdd {
    public int SendEmailAdd(String name,double price, String description) {
        final String from = "flowerbarshop@mail.ru";
        final String password = "A6fqJggGA2PHSvXhi5h5";//K1lnk2tJNhQDAa4TfsqX
        String host = "smtp.mail.ru";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "465");
        props.put("mail.smtps.ssl.checkserveridentity", true);
        props.put("mail.smtps.ssl.trust", "*");
        props.put("mail.smtp.ssl.enable", "true");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator(){
                    protected PasswordAuthentication getPassAuth(){
                        return new PasswordAuthentication(from, password);
                    }
                });

        try {
            // Создание объекта MimeMessage по умолчанию
            MimeMessage message = new MimeMessage(session);

            // Установить От: поле заголовка
            message.setFrom(new InternetAddress(from));

            // Установить Кому: поле заголовка
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(from));

            // Установить тему: поле заголовка
            message.setSubject("Заявка на добавление нового товара");

            // Создание части сообщения
            BodyPart messageBodyPart = new MimeBodyPart();

            // Заполнение сообщения
            messageBodyPart.setText("Название: "+name+". Описание: "+description+". Цена: "+price+"p.");

            // Создание составного сообщения
            Multipart multipart = new MimeMultipart();

            // Установить часть текстового сообщения
            multipart.addBodyPart(messageBodyPart);



            // Отправить полные части сообщения
            message.setContent(multipart );

            // Отправить сообщение
            try{
                Transport.send(message,from,password);}catch(javax.mail.SendFailedException sendFailedException){return 2;}
            System.out.println("Сообщение успешно отправлено");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
        return 1;
    }
}
