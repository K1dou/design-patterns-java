package com.kidou.factoryMethod.apple.halfSimple.factory;

import com.kidou.factoryMethod.apple.halfSimple.model.IPhone;
import com.kidou.factoryMethod.apple.halfSimple.model.IPhone11;
import com.kidou.factoryMethod.apple.halfSimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if (level.equals("standard")) {
			return new IPhone11();
		} else if (level.equals("highEnd")) {
			return new IPhone11Pro();
		} else
			return null;
	}

}
