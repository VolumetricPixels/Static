package com.volumetricpixels.staticrts.controller;

import org.spout.api.entity.controller.PlayerController;

public class StaticPlayerController extends PlayerController {
    public static final StaticControllerType TYPE = new StaticControllerType(StaticPlayerController.class, "Static Player");
    
    public StaticPlayerController() {
        super(TYPE);
    }

    @Override
    public void onAttached() {
        // TODO: Stuff
    }
}
