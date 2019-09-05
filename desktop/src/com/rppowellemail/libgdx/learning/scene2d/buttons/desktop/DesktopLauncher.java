package com.rppowellemail.libgdx.learning.scene2d.buttons.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.rppowellemail.libgdx.learning.scene2d.buttons.Scene2DButtonsApplicationAdapter;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Scene2DButtonsApplicationAdapter(), config);
	}
}
