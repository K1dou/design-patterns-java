package com.kidou.factoryMethod.apple.after;

import com.kidou.factoryMethod.apple.after.factory.IPhone11ProFactory;
import com.kidou.factoryMethod.apple.after.factory.IPhoneFactory;
import com.kidou.factoryMethod.apple.after.factory.IPhoneXFactory;
import com.kidou.factoryMethod.apple.after.model.IPhone;

public class Client {

	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneXFactory.orderIPhone();
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iphone2);
	}
}
