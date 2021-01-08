
package lukuhaaste.main;

import lukuhaaste.ui.GUI;

public class Main {
    
    public static void main(String[] args) {
        
        /// Käynnistää graafisen käyttöliittymän
        
        new Thread() {
            @Override
            public void run() {
                javafx.application.Application.launch(GUI.class);
            }
        }.start();
    }
    
}
