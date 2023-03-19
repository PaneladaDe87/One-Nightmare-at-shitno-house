import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuController extends Activity {
    private Button newGameButton;
    private Button loadGameButton;
    private Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newGameButton = (Button) findViewById(R.id.new_game_button);
        newGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNewGame();
            }
        });

        loadGameButton = (Button) findViewById(R.id.load_game_button);
        loadGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadSavedGame();
            }
        });

        exitButton = (Button) findViewById(R.id.exit_button);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitGame();
            }
        });
    }

    private void startNewGame() {
        // Adicione o código para iniciar um novo jogo aqui
        Intent intent = new Intent(MenuController.this, NewGameActivity.class);
        startActivity(intent);
    }

    private void loadSavedGame() {
        // Adicione o código para carregar um jogo salvo aqui
        Intent intent = new Intent(MenuController.this, LoadGameActivity.class);
        startActivity(intent);
    }

    private void exitGame() {
        finish();
        System.exit(0);
    }
}
