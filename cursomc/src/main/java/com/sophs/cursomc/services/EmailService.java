package com.sophs.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.sophs.cursomc.domain.Cliente;
import com.sophs.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);

	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
