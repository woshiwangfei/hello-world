package innerclasses;

class WithInner {
	class Inner{}
}

public class InheritInner extends WithInner.Inner {
	InheritInner(WithInner wi) {
		wi.super();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
	}

}
