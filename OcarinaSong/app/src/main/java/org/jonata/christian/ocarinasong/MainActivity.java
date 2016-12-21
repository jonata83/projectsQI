package org.jonata.christian.ocarinasong;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //WIDGETS
    private Button fire;
    private Button water;
    private Button shadow;
    private Button desert;
    private Button light;
    private Button forest;
    private Button epona;
    private Button lullaby;
    private Button zelda;

//MediaPlayer
   private MediaPlayer mp;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Referencia
fire = (Button) findViewById(R.id.fire);
water = (Button) findViewById(R.id.water);
shadow = (Button) findViewById(R.id.shadow);
desert = (Button) findViewById(R.id.desert);
light = (Button) findViewById(R.id.light);
forest = (Button) findViewById(R.id.forest);
epona = (Button) findViewById(R.id.epona);
lullaby = (Button) findViewById(R.id.lullaby);
zelda = (Button) findViewById(R.id.zelda);

 //
fire.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(getBaseContext(),"bolero of fire",Toast.LENGTH_LONG).show();
        Play(view,R.raw.bolerooffire);
    }
});
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"serenade of water",Toast.LENGTH_LONG).show();
                stop(view);
                Play(view,R.raw.serenadeofwater);
            }
        });
        shadow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"nocturne of shadow",Toast.LENGTH_LONG).show();
                stop(view);
                Play(view,R.raw.nocturneofshadow);
            }
        });
        desert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"requiem of spirit",Toast.LENGTH_LONG).show();
                stop(view);
                Play(view,R.raw.requiemofspirit);
            }
        });
        light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"prelude of light",Toast.LENGTH_LONG).show();
                stop(view);
                Play(view,R.raw.preludeoflight);
            }
        });
        forest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"minuet of forest",Toast.LENGTH_LONG).show();
                stop(view);
                Play(view,R.raw.minuetofforest);
            }
        });
        epona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"epona song",Toast.LENGTH_LONG).show();
                stop(view);
                Play(view,R.raw.eponasong);
            }
        });
        lullaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"lullaby song",Toast.LENGTH_LONG).show();
                stop(view);
                Play(view,R.raw.lullaby);
            }
        });
        zelda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"theme temple",Toast.LENGTH_LONG).show();
                stop(view);
                Play(view,R.raw.zeldatheme);
            }
        });

    }// onCreate
    public void Play (View v,int som){
        try{mp = MediaPlayer.create(getBaseContext(), som);
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mp.stop();
                    mp.release();
                    mp=null;
                }
            });
            mp.start();
        }catch (Exception e){
        }
    }

    public void stop(View v){
        try {
            mp.stop();
        }catch (Exception e){
        }
    }
}//fecha class

