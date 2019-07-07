package comunity.com.model;

import java.util.Collections;
import java.util.Comparator;

public class SortIncrese extends Input{
	
	public static void sortBySalary() {
		Collections.sort(ListWorker, new Comparator<Worker>() {
			@Override
			public int compare(Worker worker1 , Worker worker2) {
				if(worker1.getmSoSP() == worker2.getmSoSP())
					return 0;
				else if(worker1.getmSoSP() > worker2.getmSoSP())
					return 1;
				else
					return -1;
			}
		});
		
	}
}
