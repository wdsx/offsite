import java.io.File;
import java.util.ArrayList;
import java.util.List;

import play.Play;


public class DeviceLoader {

	public boolean doesFileExist(String file) {
		File f = new File(Play.applicationPath+file);
		return f.exists();		
	}

	public List<Object> devices(String string) {
		List<Object> list = new ArrayList();
		list.add(null);
		list.add(null);
		list.add(null);
		return list;
	}

}
