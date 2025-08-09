/*
Drone Controller: Drone → Control → FlightControl / CameraControl
Concept: Demonstrate hierarchical inheritance in hardware systems with overriding.
Classes:
• Drone → system check
• Control → base controller
• FlightControl, CameraControl → specific override
Sample Output:
• Flight Control:
• Drone Ready. Battery: 85%
• Executing base control sequence...
• Flight Mode Activated: Altitude Hold ON.
•
• Camera Control:
• Drone Ready. Battery: 85%
• Executing base control sequence...
• Camera Mode Activated: Recording at 4K.
 */

package day5;
class Drone {

}
class Control extends Drone {
	void displayFlightControl() {
		System.out.println("Flight Control:");
	}
	void displayCameraControl() {
		System.out.println("Camera Control:");
	}
}
class FlightControl extends Control {
	@Override
	void displayFlightControl() {
		super.displayFlightControl();
		System.out.println("Drone Ready. Battery: 85%\nExecuting base control sequence...\nFlight Mode Activated: Altitude Hold ON.\n");
	}
}
class CameraControl extends Control {
	@Override
	void displayCameraControl() {
		super.displayCameraControl();
		System.out.println("Drone Ready. Battery: 85%\nExecuting base control sequence...\nCamera Mode Activated: Recording at 4K.\n");
	}
}
public class Inheri5 {
	public static void main(String[] args) {
		FlightControl fc=new FlightControl();
		CameraControl cc=new CameraControl();
		fc.displayFlightControl();
		cc.displayCameraControl();
	}
}
