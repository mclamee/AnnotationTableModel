package com.swing.table.i18n;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * This tool is used to load proper i18n strings from the resource bundle files.
 * 
 * @author Williamz
 * 
 */
public class I18NUtil {
    private static I18NUtil instance;
    public static I18NUtil getInstance(Locale locale){
        if(locale == null){
            locale = Locale.getDefault();
        }
        if(instance == null){
            instance = new I18NUtil();
        }
        return instance.getBundle(locale);
    }
    
    private String BUNDLE_NAME = "com.swing.table.i18n.messages";
    private ResourceBundle RESOURCE_BUNDLE;
    
    private I18NUtil getBundle(Locale locale){
        RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, locale);
        return this;
    }
    
    private I18NUtil() {}

    public String getString(String key) {
        try {
            return RESOURCE_BUNDLE.getString(key);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }
}

