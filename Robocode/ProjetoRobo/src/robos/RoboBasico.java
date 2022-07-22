/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robos;
import robocode.*;
import java.awt.Color;
/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class RoboBasico extends AdvancedRobot {

    public void configurarCor(String time) {
//colorir o tanque
        if (time == "São Paulo") {
            setBodyColor(Color.red);
            setGunColor(Color.black);
            setRadarColor(Color.black);
            setScanColor(Color.white);
            setBulletColor(Color.white);
        } else if (time == "Palmeiras") {
            setBodyColor(Color.green);
            setGunColor(Color.white);
            setRadarColor(Color.green);
            setScanColor(Color.white);
            setBulletColor(Color.green);
        } else if (time == "Corinthians") {
            setBodyColor(Color.white);
            setGunColor(Color.black);
            setRadarColor(Color.black);
            setScanColor(Color.white);
            setBulletColor(Color.white);
        } else if (time == "Santos") {
            setBodyColor(Color.black);
            setGunColor(Color.white);
            setRadarColor(Color.white);
            setScanColor(Color.black);
            setBulletColor(Color.black);
        }
    }

    public void mover() {
        ahead(100);
        turnGunRight(180);
        back(100);
        turnGunRight(180);
    }

    public void configurarRobo() {
        configurarCor("São Paulo");
    }

    public void run() {
        configurarRobo();
// Robot main loop
        while (true) {
            mover();
        }
    }

}
