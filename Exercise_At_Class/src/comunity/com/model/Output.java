package comunity.com.model;

public class Output extends Input{
	public static void outputList() {
		for(int i=0; i<ListWorker.size(); i++) {
			System.out.println(ListWorker.get(i).getmHo() + "  " + 
								ListWorker.get(i).getMten() + "   " +
								ListWorker.get(i).getmSoSP());
		}
	}

}
