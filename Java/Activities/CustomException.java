package session3;

public class CustomException extends Exception{
	private String message;// that is going to be the exception message.
	CustomException(String message ){
		this.message=message;	
	}
	@Override
	public String getMessage() {
	    return message;
	}

}
