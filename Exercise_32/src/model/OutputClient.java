package model;

public class OutputClient extends InputClient {
	
	public static void outputClient() {
		System.out.println(listClient.get(0).getName() + "\t" + listClient.get(0).getAddress());
	}

}
