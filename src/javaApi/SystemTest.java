package javaApi;

import java.io.File;

import org.junit.Test;

public class SystemTest {
	@Test
	public void getSecurityManagerTest() {
		SecurityManager security = System.getSecurityManager();
		security.checkWrite("/Users/hj/Documents/a.pages");
	}

}
