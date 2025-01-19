
        package com.example.tetrisgame;

        import android.os.Bundle;
        import android.widget.FrameLayout;
        import androidx.appcompat.app.AppCompatActivity;

        public class MainActivity extends AppCompatActivity {
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                FrameLayout gameView = new FrameLayout(this);
                gameView.addView(new TetrisView(this));
                setContentView(gameView);
            }
        }
    