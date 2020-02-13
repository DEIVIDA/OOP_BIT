package OOP6_generic;

public class TwoItems<A, B> {
	
	A firstItem;
	B secondItem;	

	public TwoItems(A firstItem, B secondItem) {
		
		this.firstItem = firstItem;
		this.secondItem = secondItem;
	}
	
	public TwoItems() {
		
	}

	public void setFirstItem(A firstItem) {
		this.firstItem = firstItem;
	}
	
	public A getFirstItem() {
		return this.firstItem;
	}
	
	public void setSecondItem(B secondItem) {
		this.secondItem = secondItem;
	}
	
	public B getSecondItem() {
		return this.secondItem;
	}

	@Override
	public String toString() {
		return "TwoItems [firstItem=" + firstItem + ", secondItem=" + secondItem + "]";
	}

}
