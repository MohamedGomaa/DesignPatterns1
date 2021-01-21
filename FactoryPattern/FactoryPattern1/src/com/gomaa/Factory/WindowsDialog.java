package com.gomaa.Factory;

import com.gomaa.Buttons.Button;
import com.gomaa.Buttons.WindowsButton;

public class WindowsDialog extends Dialog {
	
	
	@Override
    public Button createButton() {
        return new WindowsButton();
    }
}