
        package com.example.tetrisgame;

        import android.content.Context;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Paint;
        import android.view.View;

        public class TetrisView extends View {
            private Paint paint;
            private int[][] grid = new int[20][10];
            private int score = 0;

            public TetrisView(Context context) {
                super(context);
                paint = new Paint();
                initializeGrid();
            }

            private void initializeGrid() {
                // Initialize the grid with zeros
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 10; j++) {
                        grid[i][j] = 0;
                    }
                }
            }

            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                canvas.drawColor(Color.BLACK);
                paint.setColor(Color.WHITE);

                // Draw the grid
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (grid[i][j] == 1) {
                            canvas.drawRect(j * 50, i * 50, j * 50 + 50, i * 50 + 50, paint);
                        }
                    }
                }

                // Display score
                paint.setColor(Color.GREEN);
                paint.setTextSize(50);
                canvas.drawText("Score: " + score, 20, 50, paint);
            }
        }
    