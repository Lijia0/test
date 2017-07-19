package email;

import static org.junit.Assert.*;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.junit.Test;

public class SimpleMailSenderTest {

	@Test
	public void testSimpleMailSenderStringString() {
//		fail("Not yet implemented");
		
		SimpleMailSender serviceSms = new SimpleMailSender("smtp.exmail.qq.com","lijia@gtzc.cn",
	            "Lijia1!");
		try {
			serviceSms.send("469037951@qq.com", "标题", "内容");
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
