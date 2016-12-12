package java8;

import java.util.Optional;

public class ApiInstruct {
	private static String comment = "test-007";
	
	public static Optional<String> getComments(String require){
		//Objects.requireNonNull(require);
		return Optional.ofNullable(require);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getComments(null));
	}

}
