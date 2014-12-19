import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

import play.test.UnitTest;

public class DeviceLoaderTest extends UnitTest {

    @Test
    public void iCanPassAStringToTheDeviceLoader_ItShouldReturnFalse_If_FileDoesNotExists() {
    	DeviceLoader unit = new DeviceLoader();    	
    	assertFalse(unit.doesFileExist("/file.json"));
    }
    
    @Test
    public void iCanPassAStringToTheDeviceLoader_ItShouldReturnTrue_If_FileDoesExists() {
    	DeviceLoader unit = new DeviceLoader();    	
    	assertTrue(unit.doesFileExist("/devices.json"));
    }
    
    @Test
    public void whenIPassAFileThatExistsToTheDeviceLoader_ItShouldReturnDevices() {
    	DeviceLoader unit = new DeviceLoader();    	
    	assertThat(unit.devices("/devices.json").size(), is(3));
    }
}
