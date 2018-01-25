package com.vpool.action;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmailOTP {
	public static void sendEmailOtp(String recipient, int eotp) {
		// Recipient's email ID needs to be mentioned.
		// String to = "dhananjayradhanpura@gmail.com";
		String to = recipient;
		// Sender's email ID needs to be mentioned
		String from = "dpsoni95@gmail.com";
		final String username = "dpsoni95@gmail.com";// change accordingly
		final String password = "916652232asdcqwe24";// change accordingly

		// Assuming you are sending email through relay.jangosmtp.net
		String host = "smtp.gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		// props.put("mail.smtp.starttls.enable", "false");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.user", username);

		// Get the Session object.
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// Create a default MimeMessage object.
			Message message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

			// Set Subject: header field
			message.setSubject("Vehicle Pooling OTP for email verification");

			// Now set the actual message
			message.setText("Dear user,\nYour OTP for Email verification is " + eotp
					+ ".It is valid for 15 min.\nPlease do not reply to this mail. It is system generated mail.\nIncoming mails are not monitored.");

			// Send message
			Transport.send(message);

			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}