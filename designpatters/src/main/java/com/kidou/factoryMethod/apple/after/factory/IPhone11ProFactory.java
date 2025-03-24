package com.kidou.factoryMethod.apple.after.factory;

import com.kidou.factoryMethod.apple.after.model.IPhone;
import com.kidou.factoryMethod.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
