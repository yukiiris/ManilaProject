package Components;

import Scenes.LoseScene;
import Scenes.Scene1;
import Systems.ComponentSystem;

public class VictoryCheckComponent extends ComponentSystem {
    public static int level = 1;

    public VictoryCheckComponent() {
    }

    @Override
    public void start() {

    }

    @Override
    protected void function() {

    }

    /**
     * 游戏胜利！
     */
    public static void Win() {

    }

    /**
     * 游戏失败！
     */
    public void Lose() {
        LoadScene(new LoseScene());
    }
}