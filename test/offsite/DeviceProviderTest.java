package offsite;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class DeviceProviderTest {

	@Test
	public void canLoadDevicesFromJson() throws Exception {
		
		DeviceProvider unit = new DeviceProvider();
		
		List<Device> devices = unit.load("devices.json");
		
		assertThat(devices, is(notNullValue()));
		assertThat(devices.size(), is(3));
		
	}
}
