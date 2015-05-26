package designPattern.singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonDoubleCheck {
	private static boolean initOK = false;
	private static SingletonDoubleCheck singleton;

	private SingletonDoubleCheck() {
		System.err.println("init。。。");
	}

	public static SingletonDoubleCheck getInstance() {
		if (!initOK) {
			// 每个线程第一次都会调用
			System.out.println("第一从关卡通过！");
			createInstance();
		}
		return singleton;
	}

	private static final void createInstance() {
		synchronized (SingletonDoubleCheck.class) {
			if (singleton == null) {
				singleton = new SingletonDoubleCheck();
			}
		}
		initOK=true;
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 100000; i++) {
			service.execute(new Runnable() {
				@Override
				public void run() {
					SingletonDoubleCheck s = SingletonDoubleCheck.getInstance();
//					System.out.println(s);
				}
			});
		}
	}
}