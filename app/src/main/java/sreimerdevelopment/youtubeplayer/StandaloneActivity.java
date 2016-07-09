package sreimerdevelopment.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity
    implements View.OnClickListener
{
    private String GOOGLE_API_KEY = "INSERT YOUR API KEY HERE";
    private String YOUTUBE_VIDEO_ID = "Fa1NpndOQZE";
    private String YOUTUBE_PLAYLIST = "PLOU2XLYxmsII5c3Mgw6fNYCzaWrsM3sMN";
    private Button btnPlayVideo;
    private Button btnPlayPlaylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnPlayVideo = (Button) findViewById(R.id.btnPlayVideo);
        btnPlayPlaylist= (Button) findViewById(R.id.btnPlayList);

        btnPlayVideo.setOnClickListener(this);
        btnPlayPlaylist.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btnPlayVideo:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, GOOGLE_API_KEY, YOUTUBE_VIDEO_ID);
                break;
            case R.id.btnPlayList:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this,GOOGLE_API_KEY, YOUTUBE_PLAYLIST);
                break;
            default:

        }
        if (intent != null ) {
            startActivity(intent);
        }
    }
}
