package email;

import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class SendEmail {
	
	public void send(){
		
		 // 发送邮件
	    SimpleMailSender sms = MailSenderFactory
	        .getSender(MailSenderType.SERVICE);
	    List<String> recipients = new ArrayList<String>();
	    recipients.add("469037951@qq.com");
//	    recipients.add("invisible@gmail.com");
	    try {
	        for (String recipient : recipients) {
	        	sms.send(recipient, "价格变动", "您关注的物品降价了!");
	        }
	    } catch (AddressException e) {
	        e.printStackTrace();
	    } catch (MessagingException e) {
	        e.printStackTrace();
	    }
	}
}
