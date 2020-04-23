package com.occamsrazor.web.lotto;

import com.occamsrazor.web.util.Messenger;

public interface LottoService {
	public void add(Lotto lotto);
	public int count();
	public Messenger record(String number);
}
