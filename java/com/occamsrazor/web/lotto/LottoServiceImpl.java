package com.occamsrazor.web.lotto;

import java.util.Random;

import com.occamsrazor.web.util.Messenger;


public class LottoServiceImpl implements LottoService{
	private Lotto[] lottos;
	private int count;
	
	public LottoServiceImpl() {
		lottos = new Lotto[5];
		count =0;
	}
	
	@Override
	public void add(Lotto lotto) {
		lottos[count] = lotto;
		count++;
		
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public Messenger record(String number) {
		Random random = new Random();
		int randomNumber = random.nextInt(46)+1;
		
		String[] data = number.split(",");
		int expectNumber = Integer.parseInt(data[0]);
		return null;
	}

}
