package com.kidou.factoryMethod.apple.after.factory;

import com.kidou.factoryMethod.apple.after.model.IPhone;
import com.kidou.factoryMethod.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
