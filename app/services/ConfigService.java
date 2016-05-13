/**
 * 
 */
package services;

import javax.inject.Inject;

/**
 * @author adhiraima
 *
 */
public class ConfigService {
	
	@Inject AtomicCounter counter;
	
	public static int getConfigPort() {
		return AtomicCounter.getInstance().nextCount();
	}

}
