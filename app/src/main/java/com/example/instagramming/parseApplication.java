package com.example.instagramming;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class parseApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        //Register you parse Models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ociTuUty8PsgO4j0OlpTPC1PDW0U9lue51AfhF88")
                .clientKey("RicJGteO3cEVKVI9glUs2493jpmWbC0pUHDmsOxm")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
