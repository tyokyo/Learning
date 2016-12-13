package model.command;


//----------  Class FanOnCommand  ---------------------
public class FanOnCommand implements Command {
	private Fan myFan;
	public FanOnCommand (Fan F) {
		myFan = F;
	}
	public void execute() {
		myFan.startRotate();
	}
}