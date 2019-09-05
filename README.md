# learning-libgdx-scene2d-buttons

How to get Button1 to toggle()/setEnabled() state of Button2.


This project was generated using `gdx-setup.jar` (dated 2019-08-05), with 'Desktop' Sub Project, with 'Tools' extension.

```
public class Scene2DButtonsApplicationAdapter extends ApplicationAdapter {

	private Stage stage;
	private Skin skin;

	private Button button1;
	private Button button2;

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
```

How to get Button2 to have its state toggled on/off, same behavior as if it was clicked on
