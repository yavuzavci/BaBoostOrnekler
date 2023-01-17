package com.bilgeadam.lesson044.singleton;

public class SingletonTest {
	
	public static void main(String[] args) {
		MyPostgreConnection myPostgreConnection = MyPostgreConnection.getInstance();
		MyPostgreConnection myPostgreConnection2 = MyPostgreConnection.getInstance();
		MyPostgreConnection myPostgreConnection3 = MyPostgreConnection.getInstance();
		MyPostgreConnection myPostgreConnection4 = MyPostgreConnection.getInstance();
		MyPostgreConnection myPostgreConnection5 = MyPostgreConnection.getInstance();
		MyPostgreConnection myPostgreConnection6 = MyPostgreConnection.getInstance();
		
		System.out.println(myPostgreConnection);
		System.out.println(myPostgreConnection2);
		System.out.println(myPostgreConnection3);
		System.out.println(myPostgreConnection4);
		System.out.println(myPostgreConnection5);
		System.out.println(myPostgreConnection6);
	}

}
