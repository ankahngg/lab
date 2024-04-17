package com.badlogic.drop.Sprites;

import com.badlogic.drop.Drop;
import com.badlogic.drop.Screens.PlayScreen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap.Filter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.World;

public class Instruction extends SensorObject {
	private SpriteBatch batch;
	private Texture texture;
	public Instruction(World world, TiledMap map, Rectangle bounds, PlayScreen screen) {
		super(world,map,bounds);
		fixture.setUserData(this);
		Collision.setCategoryFilter(fixture, Collision.INSTRUCTION_BITS);
		texture = new Texture("Instruction.png");
		batch = screen.game.batch;
	}
	
	public void onHit() {
		batch.begin();
		batch.draw(texture, 
				this.body.getPosition().x-texture.getWidth()/Drop.PPM/2, 
				this.body.getPosition().y+3 ,
				texture.getWidth()/Drop.PPM,texture.getHeight()/Drop.PPM);
		batch.end();
	}
	public void onLeave() {
		
	}
}