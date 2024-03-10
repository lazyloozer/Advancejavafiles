package com.kodnest.bot;

public class BotApp {

	public static void main(String[] args) {
		// WITHOUT INHERITANCE
		TrainerBot bot=new TrainerBot();
		bot.read();
		bot.write();
		bot.teaching();
		
		
		// with inheritance
		StudentBot s=new StudentBot();
		s.read();
		s.write();
		s.apply();


	}

}
