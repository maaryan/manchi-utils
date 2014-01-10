package com.manchikanti.manchiutils.commons;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TestNullOrEmptyCheck {
	@Test
	public void isNull() {
		assertTrue(NullOrEmptyCheck.isNull(null));
		assertFalse(NullOrEmptyCheck.isNull(""));
		assertFalse(NullOrEmptyCheck.isNull(this));
	}
	@Test
	public void isNullOrEmptyCollection() {
		Set<Object> set = null;
		assertTrue(NullOrEmptyCheck.isNullOrEmpty(set));
		set = new HashSet<Object>();
		List<Object> list = new ArrayList<Object>();
		assertTrue(NullOrEmptyCheck.isNullOrEmpty(set));
		assertTrue(NullOrEmptyCheck.isNullOrEmpty(list));
		set.add("manchikanti");
		list.add("manchikanti");
		assertFalse(NullOrEmptyCheck.isNullOrEmpty(set));
		assertFalse(NullOrEmptyCheck.isNullOrEmpty(list));
	}
	@Test
	public void isNullOrEmptyMap() {
		Map<Object,Object> map = null;
		assertTrue(NullOrEmptyCheck.isNullOrEmpty(map));
		map = new HashMap<Object,Object>();
		assertTrue(NullOrEmptyCheck.isNullOrEmpty(map));
		map.put("lastname", "manchikanti");
		assertFalse(NullOrEmptyCheck.isNullOrEmpty(map));
	}
	@Test
	public void isNullOrEmptyString() {
		String str = null;
		assertTrue(NullOrEmptyCheck.isNullOrEmpty(str));
		assertTrue(NullOrEmptyCheck.isNullOrEmpty(""));
		assertTrue(NullOrEmptyCheck.isNullOrEmpty("  \t"));
		assertFalse(NullOrEmptyCheck.isNullOrEmpty("manchikanti"));
	}
	@Test
	public void isNullOrEmptyObject() {
		Object obj = null;
		assertTrue(NullOrEmptyCheck.isNullOrEmpty(obj));
		obj = this;
		assertFalse(NullOrEmptyCheck.isNullOrEmpty(obj));
	}
}
