package kh.lclass.swing;

import javax.swing.JLabel;

class TimerRunnable implements Runnable {
	private JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n=0;
		while(true) { // 무한루프를 실행한다.
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000); // 1초 동안 잠을 잔 후 깨어난다.
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
	
	
}
