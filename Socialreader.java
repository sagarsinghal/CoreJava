class message{
	int messageId;
	String MessageSource;
	String messageType;
	String Message;
	  
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessageSource() {
		return MessageSource;
	}
	public void setMessageSource(String messageSource) {
		MessageSource = messageSource;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	
}

interface socialFeedReader{
	public abstract message pollForNewMessage();
}

class facebookReader extends message implements socialFeedReader{
	
	@Override
	public message pollForNewMessage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class Socialreader{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

