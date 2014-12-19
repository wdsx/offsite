package offsite;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import offsite.Device;

import org.junit.Test;

public class TestDevice {

	@Test
	public void aDeviceHasAModel_ABrand_AndAnId() throws Exception {
		Device device = new Device(1, "Mockia", "Lumia");
		
		assertThat(device.getId(), is(1));
		assertThat(device.getModel(), is("Lumia"));
		assertThat(device.getBrand(), is("Mockia"));
	}
	
	
}
