package offsite;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.List;

import offsite.Device;
import offsite.DeviceProvider;

import org.junit.Test;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class DeviceProviderTest {

	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		DeviceProvider deviceProvider = new DeviceProvider();
		List<Device> load = deviceProvider.load("devices.json");
		for (Device device : load) {
			System.out.println(device.getModel());
			System.out.println(device.getBrand());
			System.out.println();
		}
	}
	
	@Test
	public void canLoadDevicesFromJson() throws Exception {
		
		DeviceProvider unit = new DeviceProvider();
		
		List<Device> devices = unit.load("devices.json");
		
		assertThat(devices, is(notNullValue()));
		assertThat(devices.size(), is(3));
		
	}
}
