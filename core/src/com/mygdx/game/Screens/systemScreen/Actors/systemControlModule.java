package com.mygdx.game.Screens.systemScreen.Actors;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.Screens.galScreen.Stage.galScreenHUD;
import com.mygdx.game.Screens.galScreen.galaxyScreen;
import com.mygdx.game.Screens.systemScreen.systemScreen2;

public class systemControlModule extends Image {

    public boolean selected;
    Skin skin;
    public double X;
    public double Y;
    public String systName;
    public boolean currentPosition;
    public int row;

    public systemControlModule(systemScreen2 screen, float width, float height, float Xcoord, float Ycoord){
        super(screen.getThrustAt().findRegion("thrustNoHandle2"));
        currentPosition = false;
        X = Xcoord;
        Y = Ycoord;
        setWidth(width);
        setHeight(height);
        setX(Xcoord);
        setY(Ycoord);
        setBounds(getX(),getY(),getWidth(),getHeight());
        setTouchable(Touchable.enabled);
        selected = false;
        //skin = new Skin(screen.getStarsAt2());

        addListener(new ClickListener(){
            public void clicked(InputEvent event, float x, float y) {
                //
            }
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                //screen.galActors.updateMarkers(Xcoord,Ycoord,width,height,galHUD,systName);
                return true;
            }

            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                //
            }
        });
    }
    public void updateMarker(){

    }
}
