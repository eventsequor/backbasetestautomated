package com.sophos.backbasetestautomated.register.utils;

public class AccessAttempts {
	private static Boolean entry;
	static {
		entry = false;
	}

	/**
	 * This method return if the user try sign in of the portal BBlog
	 * 
	 * @return false if the BBlog web portal has never been entered after opening
	 *         the browser
	 */
	public static Boolean getEntry() {
		return entry;
	}

	/**
	 * Stable true indicating that a login attempt has already been made in the
	 * BBlog web portal
	 */
	public static void setEntry() {
		AccessAttempts.entry = true;
	}

}
