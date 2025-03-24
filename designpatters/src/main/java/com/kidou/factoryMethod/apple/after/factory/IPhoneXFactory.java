package com.kidou.factoryMethod.apple.after.factory;

import com.kidou.factoryMethod.apple.after.model.IPhone;
import com.kidou.factoryMethod.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
