package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import entity.MapAdapter.MapType;
import entity.MapAdapter.MapType.MapTypeEntry;

@SuppressWarnings("rawtypes") public class MapAdapter extends
		XmlAdapter<MapType, Map> {

	public static class MapType {
		public List<MapTypeEntry> entry = new ArrayList<MapTypeEntry>();

		public static class MapTypeEntry {
			@XmlAttribute public String key;
			@XmlValue public Double value;
		}
	}

	@SuppressWarnings("unchecked") @Override public Map unmarshal(MapType v) throws Exception {
		HashMap hashMap = new HashMap();
		for (MapTypeEntry myEntryType : v.entry) {
			hashMap.put(myEntryType.key, myEntryType.value);
		}
		return hashMap;
	}

	@Override public MapType marshal(Map v) throws Exception {
		MapType myMapType = new MapType();
		for (Object key : v.keySet()) {
			MapTypeEntry myMapEntryType = new MapTypeEntry();
			myMapEntryType.key = (String) key;
			myMapEntryType.value = (Double) v.get(key);
			myMapType.entry.add(myMapEntryType);
		}
		return myMapType;
	}

}
