package com.legendofj.screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.legendofj.LegendOfJ;
import com.legendofj.sprites.Player;
import com.legendofj.tools.B2WorldCreator;
import com.legendofj.tools.WorldContactListener;

import java.util.concurrent.LinkedBlockingQueue;

public class PlayScreen implements Screen {
    private LegendOfJ game;
    private TextureAtlas atlas;
    public static boolean alreadyDead = false;

    private OrthographicCamera gamecam;
    private Viewport gamePort;

    private TmxMapLoader maploader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;

    private World world;
    private Box2DDebugRenderer b2dr;
    //private B2WorldCreator creator;
    private Player player;
    //private Array<Item> items;
    //private LinkedBlockingQueue<ItemDef> itemsToSpawn;

    public PlayScreen(LegendOfJ game){
        this.game = game;
        gamecam = new OrthographicCamera();
        gamePort = new FitViewport(LegendOfJ.V_WIDTH / LegendOfJ.PPM, LegendOfJ.V_HEIGHT/ LegendOfJ.PPM, gamecam);

        maploader = new TmxMapLoader();
        map = maploader.load("map.tmx");
        renderer = new OrthogonalTiledMapRenderer(map, 1  / LegendOfJ.PPM);

        gamecam.position.set(gamePort.getWorldWidth() / 2, gamePort.getWorldHeight() / 2, 0);
        world = new World(new Vector2(0, -10), true);

        b2dr = new Box2DDebugRenderer();

        //creator = new B2WorldCreator(this);

        player = new Player(this);

        world.setContactListener(new WorldContactListener());
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

    public TextureAtlas getAtlas(){
        return atlas;
    }
    public TiledMap getMap(){
        return map;
    }
    public World getWorld(){
        return world;
    }
}
