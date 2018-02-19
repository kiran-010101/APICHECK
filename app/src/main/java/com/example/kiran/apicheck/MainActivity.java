package com.example.kiran.apicheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubeThumbnailView;

public class MainActivity extends YouTubeBaseActivity {

    private static final String TAG = "MainActivity";

    YouTubePlayerView myoutubeplayer;
    Button mplaybtn;
    YouTubePlayer.OnInitializedListener moninitializedlistener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"onCreate:Starting.");

        mplaybtn = (Button)findViewById(R.id.btnplay);

        myoutubeplayer = (YouTubePlayerView)findViewById(R.id.youtubeplayer);

        moninitializedlistener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                Log.d(TAG,"onClick:Done initializing.");
          //youTubePlayer is used from upper argument
                youTubePlayer.loadPlaylist("PLGCjwl1RrtcSi2oV5caEVScjkM6r3HO9t");


            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                Log.d(TAG,"onClick:Failed initializing.");
            }
        };

        mplaybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d(TAG,"onClick:Initializing youtube player.");

                myoutubeplayer.initialize(YOUTUBECONFIG.getApiKey(), moninitializedlistener);

                Log.d(TAG,"onClick:Done initializing.");
            }
        });
    }
}
