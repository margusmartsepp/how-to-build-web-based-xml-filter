package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlAdapter;

// TODO: Auto-generated Javadoc
/**
 * The Class StringToDoubleMapAdapter.
 * 
 * @author Margus Martsepp
 * @version $Revision: 1.0 $
 */
@SuppressWarnings("rawtypes") public class StringToDoubleMapAdapter extends
		XmlAdapter<StringToDoubleMapAdapter, Map> {

	/** The entry. */
	protected List<MapTypeEntry> entry = new ArrayList<MapTypeEntry>();

	/**
	 * The Class MapTypeEntry.
	 * 
	 * @author Margus Martsepp
	 * @version $Revision: 1.0 $
	 */
	public static class MapTypeEntry {

		/** The key. */
		@XmlAttribute protected String key;

		/** The value. */
		@XmlValue protected Double value;

		/**
		 * Of.
		 * 
		 * @param k
		 *        the k
		 * @param v
		 *        the v
		 * 
		
		 * @return the map type entry */
		public static MapTypeEntry of(final String k, final Double v) {
			return new MapTypeEntry() {
				{
					this.key = k;
					this.value = v;
				}
			};
		}
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	/**
	 * Method unmarshal.
	 * 
	 * @param v
	 *        StringToDoubleMapAdapter
	 * 
	 * 
	
	 * @return Map * @throws Exception * @throws Exception
	 */
	@SuppressWarnings("unchecked") @Override public Map unmarshal(
			StringToDoubleMapAdapter v) throws Exception {
		HashMap hashMap = new HashMap();
		for (MapTypeEntry myEntryType : v.entry)
			hashMap.put(myEntryType.key, myEntryType.value);
		return hashMap;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	/**
	 * Method marshal.
	 * 
	 * @param v
	 *        Map
	 * 
	 * 
	
	 * @return StringToDoubleMapAdapter * @throws Exception * @throws Exception
	 */
	@Override public StringToDoubleMapAdapter marshal(Map v) throws Exception {
		StringToDoubleMapAdapter myMapType = new StringToDoubleMapAdapter();
		for (Object key : v.keySet())
			myMapType.entry.add(MapTypeEntry.of((String) key, (Double) v.get(key)));
		return myMapType;
	}
}
