package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlAdapter;

@SuppressWarnings("rawtypes") public class StringToDoubleMapAdapter extends
		XmlAdapter<StringToDoubleMapAdapter, Map> {

	@XmlElement protected List<MapTypeEntry> entry = new ArrayList<MapTypeEntry>();

	public static class MapTypeEntry {
		@XmlAttribute protected String key;
		@XmlValue protected Double value;
		public static MapTypeEntry of(final String k, final Double v) {
			return new MapTypeEntry() {
				{
					this.key = k;
					this.value = v;
				}
			};
		}
	}

	@SuppressWarnings("unchecked") @Override public Map unmarshal(
			StringToDoubleMapAdapter v) throws Exception {
		HashMap hashMap = new HashMap();
		for (MapTypeEntry myEntryType : v.entry)
			hashMap.put(myEntryType.key, myEntryType.value);
		return hashMap;
	}

	@Override public StringToDoubleMapAdapter marshal(Map v) throws Exception {
		StringToDoubleMapAdapter myMapType = new StringToDoubleMapAdapter();
		for (Object key : v.keySet())
			myMapType.entry.add(MapTypeEntry.of((String) key, (Double) v.get(key)));
		return myMapType;
	}
}
