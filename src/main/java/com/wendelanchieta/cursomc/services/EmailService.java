package com.wendelanchieta.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.wendelanchieta.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido pedido);
	
	void sendEmail(SimpleMailMessage msg);
}
