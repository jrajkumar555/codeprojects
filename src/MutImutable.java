
public class MutImutable {

	public static void main(String[] args) {
		String s1 = "vengat";
		String s2 = "prabu"; // immutable string
		System.out.println("Immutable string");
		//System.out.println(System.identityHashCode(s1));
		//System.out.println(System.identityHashCode(s2));
		String r = s1.concat(s2);
		System.out.println(s1);
		//System.out.println(System.identityHashCode(r));
		StringBuffer x1=new StringBuffer("vengat");
		StringBuffer x2=new StringBuffer("prabu");// mutable string
		System.out.println("mutable string");
		//System.out.println(System.identityHashCode(x1));
		//System.out.println(System.identityHashCode(x2));
		x1.append(x2);
		System.out.println(x1);
		//System.out.println(System.identityHashCode(x1));
		}

	}


