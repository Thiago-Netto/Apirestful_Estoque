package com.sistemaestoque.api.configs;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class EmailConfig {
//A classe EmailConfig é a classe de configuração responsável por configurar e fornecer um bean do tipo JavaMailSender, que será utilizado para enviar e-mails na aplicação... 
//utilizando o servidor SMTP do Gmail.
//Foi utilizado um email real para teste real da aplicação. Caso queira testar a funcionalidade deste código basta mudar os dados de e-mail para os de outro e-mail que tenha acesso.
    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);
        mailSender.setUsername("fernando.tonehunter@gmail.com"); 
        mailSender.setPassword("zaeh ubwf bquv gtik");
        
        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        return mailSender;
    }
}