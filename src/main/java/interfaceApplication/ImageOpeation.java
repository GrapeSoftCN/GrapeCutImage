package interfaceApplication;

import common.java.browser.PhantomJS;
import common.java.nlogger.nlogger;
import common.java.security.codec;

/**
 * 获取网页截图
 * 
 *
 */
public class ImageOpeation {
	public String getNetImage(String url,int width,int height) {
		String image = null;
		try {
			PhantomJS pjs = new PhantomJS();
			if (url!=null && !url.equals("")) {
				url = codec.DecodeHtmlTag(url);
				url = codec.decodebase64(url);
				System.out.println("url: "+url);
				System.out.println("width: "+width);
				System.out.println("height: "+height);
				image = pjs.sreenshot(width, height, url);
				image = "data:image/jpeg;base64,"+image;
			}
		} catch (Exception e) {
			nlogger.logout(e);
			image = null;
		}
		return image;
	}
	
}
