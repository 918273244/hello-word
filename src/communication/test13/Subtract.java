package communication.test13;

public class Subtract {

	private String lock;

	public Subtract(String lock) {
		this.lock = lock;
	}

	public void subtract() {
		try {
			synchronized (lock) {
				if (Add.list.size() == 0) {
					System.out.println("wait begin Thread name = "
							+ Thread.currentThread().getName());
					lock.wait();
					System.out.println("wait end Thread name = "
							+ Thread.currentThread().getName());

				}
				Add.list.clear();
				System.out.println("list size = "+Add.list.size());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
