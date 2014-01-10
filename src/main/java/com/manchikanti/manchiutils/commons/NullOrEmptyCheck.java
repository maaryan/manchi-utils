package com.manchikanti.manchiutils.commons;

import java.util.Collection;
import java.util.Map;

public class NullOrEmptyCheck {
	public static boolean isNull(Object obj) {
		return obj == null;
	}

	@SuppressWarnings("rawtypes")
	public static boolean isNullOrEmpty(Object obj) {
		if (isNull(obj))
			return true;
		if (obj instanceof Collection) {
			return isNullOrEmpty((Collection) obj);
		}
		if (obj instanceof Map) {
			return isNullOrEmpty((Map) obj);
		}
		String str = obj.toString();
		return str.trim().length() == 0;
	}

	@SuppressWarnings("rawtypes")
	public static boolean isNullOrEmpty(Collection coll) {
		if (isNull(coll))
			return true;
		return coll.size() == 0;
	}

	@SuppressWarnings("rawtypes")
	public static boolean isNullOrEmpty(Map map) {
		if (isNull(map))
			return true;
		return map.size() == 0;
	}

	public static boolean isNullOrEmpty(String str) {
		if (isNull(str))
			return true;
		return str.trim().length() == 0;
	}

}
