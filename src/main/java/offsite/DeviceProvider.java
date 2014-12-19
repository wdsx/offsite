package offsite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class DeviceProvider {

	public List<Device> load(String string) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<Device>>() {}.getType();
		List<Device> devices = gson.fromJson(new FileReader(new File("devices.json")), listType );
		
		return devices;
	}

}
