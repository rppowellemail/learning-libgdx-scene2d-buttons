package com.rppowellemail.libgdx.learning.scene2d.buttons;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class Scene2DButtonsApplicationAdapter extends ApplicationAdapter {

	private Stage stage;
	private Skin skin;

	private Button button1;
	private Button button2;
	private CheckBox checkBox1;

	@Override
	public void create () {
		stage = new Stage();
		skin = new Skin(Gdx.files.internal("uiskin.json"));

		button1 = new Button(skin);
		button1.setSize(32, 32);
		button1.setPosition(32, 32);
		stage.addActor(button1);

		button1.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
			    Gdx.app.log("Scene2DButtonsApplicationAdapter", "button2.toggle()");
				button2.toggle();
				checkBox1.toggle();
			}
		});

		button2 = new Button(skin);
		button2.setSize(32, 32);
		button2.setPosition(96, 32);
		button2.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				Gdx.app.log("Scene2DButtonsApplicationAdapter", "button2 was clicked");
				button2.toggle();
			}
		});

		stage.addActor(button2);

		checkBox1 = new CheckBox("1", skin);
		checkBox1.setSize(32, 32);
		checkBox1.setPosition(160, 32);

		stage.addActor(checkBox1);

		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void render () {
	    stage.act();

		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.draw();
	}

	@Override
	public void dispose () {
		stage.dispose();
	}
}
