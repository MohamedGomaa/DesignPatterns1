package com.gomaa.Factory;

import com.gomaa.Buttons.Button;
import com.gomaa.Buttons.HtmlButton;

public class HtmlDialog extends Dialog {
	
	 @Override
	    public Button createButton() {
	        return new HtmlButton();
	    }
}
