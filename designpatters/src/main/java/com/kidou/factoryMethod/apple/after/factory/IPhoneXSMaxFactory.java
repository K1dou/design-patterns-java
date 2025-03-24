package com.kidou.factoryMethod.apple.after.factory;

import com.kidou.factoryMethod.apple.after.model.IPhone;
import com.kidou.factoryMethod.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
