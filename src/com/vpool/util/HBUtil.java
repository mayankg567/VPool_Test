package com.vpool.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBUtil {
	static SessionFactory sf;
	static {
		System.out.println("in static of HBUtil");
		Configuration cfg = new Configuration();
		cfg.configure();
		System.out.println("cfg: " + cfg);
		sf = cfg.buildSessionFactory();
	}

	public static Session openSession() {
		System.out.println("in HBUtil class");
		return sf.openSession();
	}

	public static void closeSF() {
		sf.close();
	}
}
