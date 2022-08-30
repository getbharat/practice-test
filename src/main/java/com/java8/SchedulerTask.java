package com.java8;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class SchedulerTask {

	public static void main(String[] args) {

		final Timer timer = new Timer();
		final Calendar calendar = Calendar.getInstance();
		long miliSeconds = (24 - calendar.get(Calendar.HOUR_OF_DAY) - 1) * 60 * 60 * 1000
				+ (60 - calendar.get(Calendar.MINUTE)) * 60 * 1000 + (60 - calendar.get(Calendar.SECOND) * 1000);
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("Give Me Some Task, Time: " + (new Date()).toString());
			}
		}, miliSeconds, 86400000);

	}

}
