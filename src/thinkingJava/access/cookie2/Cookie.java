//: access/cookie2//Cookie.java
/* 
                        类内部     package内       子类         其他
-----------------------------------------------
public      允许         允许                 允许         允许 
protected   允许         允许                 允许         不允许 
default     允许         允许                 不允许     不允许 
private     允许         不允许             不允许     不允许 
----------------------------------------------- */

package thinkingJava.access.cookie2;

public class Cookie {
	public Cookie() {
		System.out.println("Cookie constructor");
	}

	protected void bite() {
		System.out.println("bite");
	}
}
