package Abstract;

public abstract class Hello {
	private String msg;

	public Hello(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public abstract void sayHello();

	
}
