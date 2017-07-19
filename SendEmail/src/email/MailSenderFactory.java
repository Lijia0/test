package email;

public class MailSenderFactory {
	/**
     * 服务邮箱
     */
    private static SimpleMailSender serviceSms = null;
 
    /**
     * 获取邮箱
     * 
     * @param type 邮箱类型
     * @return 符合类型的邮箱
     */
    public static SimpleMailSender getSender(MailSenderType type) {
	    if (type == MailSenderType.SERVICE) {
	        if (serviceSms == null) {
	        serviceSms = new SimpleMailSender("469037951@qq.com",
	            "hidden");
	        }
	        return serviceSms;
	    }
	    return null;
    }
}
