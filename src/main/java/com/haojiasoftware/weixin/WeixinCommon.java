package com.haojiasoftware.weixin;

import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * 微信开发共同信息
 * @author zhang
 *
 */
public class WeixinCommon {
	
	public static final ResourceBundle BUNDLE = PropertyResourceBundle.getBundle("smsconfig");
	
	/**
	 * 开发者凭据AppId
	 */
	public final static String APPID = BUNDLE.getString("WEIXIN_APPID");

	/**
	 * 开发者凭据Secret
	 */
	public final static String APPSECRET = BUNDLE.getString("WEIXIN_APPSECRET");
	
	/**
	 * Access Token
	 */
	public final static String TOKEN = BUNDLE.getString("WEIXIN_TOKEN");
	
	/**
	 * url
	 */
	public final static String MENU_BASE = BUNDLE.getString("WEIXIN_MENU_BASE");
	
}
