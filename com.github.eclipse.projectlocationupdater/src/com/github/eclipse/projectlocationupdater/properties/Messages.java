package com.github.eclipse.projectlocationupdater.properties;

import org.eclipse.osgi.util.NLS;

/**
 * @author Max Gensthaler
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.github.eclipse.projectlocationupdater.properties.messages"; //$NON-NLS-1$
	public static String error_dialog_messagePrefix;
	public static String error_dialog_title;
	public static String proppage_browse;
	public static String proppage_currentLocation;
	public static String proppage_newLocation;
	public static String proppage_projectOpenWarning;
	public static String proppage_usage;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		//
	}
}
