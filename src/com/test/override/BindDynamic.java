/* • Create a Simple Method Overriding(Dynamic Binding) in Java */

package com.test.override;

public class BindDynamic {
	protected String val;

	void display(String str) {
		val = "Base Class Fuction ".concat(str);
		System.out.println(val);
	}
}
