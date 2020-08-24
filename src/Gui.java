/**
 * Created with IntelliJ IDEA,
 * User: corat
 * Date: 21.08.2020
 * Time: 14:05
 */
public class Gui {
    public static void main(String[] args) {

        //ButtonFrame demo = new ButtonFrame("Demo");
        //demo.setSize(300,75);
        //demo.setVisible(true);

        //EinButtonFuerAlles colorDemo = new einButtonFuerAlles("ColorDemo");
        //colorDemo.setSize(300,75);
        //colorDemo.setVisible(true);

        //DreiAusEinButton dreiAusEinButton = new DreiAusEinButton("Einer gewinnt");
        //dreiAusEinButton.setSize(300,75);
        //dreiAusEinButton.setVisible(true);

        //Zahlenschloss zahlenschloss = new Zahlenschloss("Drücke die drei richtigen Schalter zum schließen");
        //zahlenschloss.setSize(zahlenschloss.breite, zahlenschloss.hoehe);
        //zahlenschloss.setVisible(true);

        //TxtBsp textBsp = new TxtBsp("TextBeipiel");
        //textBsp.setSize(400, 100);
        //textBsp.setVisible(true);

        //TemperatureCalculator temperatureCalcultaor = new TemperatureCalculator("Temperaturrechner");
        //temperatureCalcultaor.setSize(200,150);
        //temperatureCalcultaor.setVisible(true);

        //KalorienRechner kalorienRechner = new KalorienRechner("Calories from Fat");
        //kalorienRechner.setSize(150,300);
        //kalorienRechner.setVisible(true);

        IdealWeight weightApp = new IdealWeight() ;
        weightApp.setSize( 250, 225 );
        weightApp.setResizable( false );
        weightApp.setVisible( true );
    }
}
