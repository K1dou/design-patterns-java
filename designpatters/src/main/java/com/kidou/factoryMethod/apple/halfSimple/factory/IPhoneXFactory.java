package com.kidou.factoryMethod.apple.halfSimple.factory;

import com.kidou.factoryMethod.apple.halfSimple.model.IPhone;
import com.kidou.factoryMethod.apple.halfSimple.model.IPhoneX;
import com.kidou.factoryMethod.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if (level.equals("standard")) {
			return new IPhoneX();
		} else if (level.equals("highEnd")) {
			return new IPhoneXSMax();
		} else
			return null;
	}

}
