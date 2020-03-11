package menu;

public class Waitress {
	private PancakeHouseMenu _phMenu;
	private DinnerMenu _dMenu;
	private CafeMenu _cMenu;
	private String _time;
	private static final int TIME_0630 = 390;
	private static final int TIME_1030 = 630;
	private static final int TIME_1500 = 900;
	private static final int TIME_2200 = 1320;
	public Waitress(PancakeHouseMenu phMenu, DinnerMenu dMenu, CafeMenu cMenu) {
			_phMenu = phMenu;
			_dMenu = dMenu;
			_cMenu = cMenu;
	}

	public void printMenu(int hour, int min) {
		Iterator it;
		int time = hour*60 + min;
		if(time>=TIME_0630 && time<=TIME_1030) {
			//Print Cafe Menu since it is breakfast time
			it = _cMenu.createIterator();
			_time = _cMenu.getTime();
			System.out.println("\n\n" + _time + " now. Here is Cafe Menu:\n\n");
			printMenu(it);
			
		}else if(time>=TIME_1030 && time<=TIME_1500) {
			//Print Pancake House Menu since it is lunch time
			it = _phMenu.createIterator();
			_time = _phMenu.getTime();
			System.out.println("\n\n" + _time + " now. Here is Pancake House Menu:\n\n");
			printMenu(it);
		}else if(time>=TIME_1500 && time<=TIME_2200) {
			//Print Diner Menu since it is dinner time
			it = _dMenu.createIterator();
			_time = _dMenu.getTime();
			System.out.println("\n\n" + _time + " now. Here is Diner Menu:\n\n");
			printMenu(it);
		}else {
			System.out.println("\n\nSorry we are closed now!\n\n");
		}
	}
	public void printMenu(Iterator it) {
		while (it.hasNext()) {
			MenuItem item = it.next();
			System.out.printf("%s\t%s\t%.2f\n", item.getName(),item.getDescription(),item.getPrice());
		}
	}
	public String getEatingTime() {
		return _time;
	}
}
