package com.gomaa.Factory;

import com.gomaa.Buttons.Button;

public abstract class Dialog {
		
	public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
