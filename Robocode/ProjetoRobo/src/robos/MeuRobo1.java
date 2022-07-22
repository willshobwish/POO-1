/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robos;

import robocode.*;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class MeuRobo1 extends RoboBasico {

    int forca_tiro = 1;

    public void atirar(int forca) {
        fire(forca);
    }

    public void mover() {
        ahead(100);
        turnGunRight(45);
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        atirar(forca_tiro);
        if (forca_tiro <= 3) {
            forca_tiro++;
        } else {
            forca_tiro = 1;
        }
    }

    public void onHitWall(HitWallEvent e) {
// quando bater na parede, recuar 20 e virar 90 graus
        back(20);
        turnRight(90);
    }

}
