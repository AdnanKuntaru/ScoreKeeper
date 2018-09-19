package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /** This is an integer that hold the score keeper result
     *
     */
    int realGoal;
    int realFouls;
    int realYellow;
    int realRedCard;
    int barcaGoal;
    int barcaFouls;
    int barcaYellow;
    int barcaRedCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /** this the button that add one goal to the "Real Madrid" when user press the goals button
     *
     * @param view
     */
    public void addOneGoalToReal(View view) {
        realGoal = realGoal + 1;
        displayRealGoals(realGoal);
    }

    /** this the method that display the score of Real Madrid
     *
     * @param realGoal
     */
    public void displayRealGoals(int realGoal) {
        TextView scoreView = (TextView) findViewById(R.id.real_goals);
        scoreView.setText(String.valueOf(realGoal));

    }

    /** this is the button that add a foul to "Real Madrid" after pressing the foul button by user
     * @param view
     */

    public void addOneFoulToReal(View view) {
        realFouls = realFouls + 1;
        displayRealFouls(realFouls);
    }

    /** this the method that display the foul  of Real Madrid
     *
     * @param realFouls
     */
    public void displayRealFouls(int realFouls) {
        TextView foulsView = (TextView) findViewById(R.id.real_fouls);
        foulsView.setText(String.valueOf(realFouls));
    }

    /** this the button that add one yellow card for each press of the button
     *
     * @param view
     */

    public void addOneYellowToReal(View view) {
        realYellow = realYellow + 1;
        displayRealYellowCard(realYellow);
    }

    /** this the method that display the yelllow cards of Real Madrid
     *
     * @param realYellow
     */
    public void displayRealYellowCard(int realYellow) {
        TextView yellowView = (TextView) findViewById(R.id.real_yellow_cards);
        yellowView.setText(String.valueOf(realYellow));
    }

    /** this the button that increase the red card for each pressing by user to the Real Madrid
     *
     * @param view
     */
    public void addOneRedCardToReal(View view) {
        realRedCard = realRedCard + 1;
        displayRealRedCards(realRedCard);
    }
//** this the method that display the the red card of Real Madrid
    public void displayRealRedCards(int realRedCard) {
        TextView redCardView = (TextView) findViewById(R.id.real_red_card);
        redCardView.setText(String.valueOf(realRedCard));
    }
/* this the button that add one goal to the Barcelona by each user`s pressing

 */
    public void addOneGoalToBarca(View view) {
        barcaGoal = barcaGoal + 1;
        displayBarcaGoals(barcaGoal);
    }

    /** This is the method that display Barcelona the score
     *
     * @param barcaGoal
     */

    public void displayBarcaGoals(int barcaGoal) {
        TextView scoreView = (TextView) findViewById(R.id.barca_goals);
        scoreView.setText(String.valueOf(barcaGoal));

    }

    /** this is  the button that add one fouls to Barcelona when the user press it.
     *
     * @param view
     */

    public void addOneFoulToBarca(View view) {
        barcaFouls = barcaFouls + 1;
        displayBarcaFouls(barcaFouls);
    }

    /** this the method that display Barcelona fouls
     *
     * @param barcaFouls
     */
    public void displayBarcaFouls(int barcaFouls) {
        TextView foulsView = (TextView) findViewById(R.id.barca_fouls);
        foulsView.setText(String.valueOf(barcaFouls));
    }

    /** this the button that add one yellow card to Barcelona each click.
     *
     * @param view
     */
    public void addOneYellowToBarca(View view) {
        barcaYellow = barcaYellow + 1;
        displayBarcaYellowCard(barcaYellow);
    }

    /** this is the method that display Barcelona fouls
     *
     * @param barcaYellow
     */

    public void displayBarcaYellowCard(int barcaYellow) {
        TextView yellowView = (TextView) findViewById(R.id.barca_yellow_cards);
        yellowView.setText(String.valueOf(barcaYellow));
    }

    /** this is the button that add one red after user press it, to Barcelona.
     *
      * @param view
     */

    public void addOneRedCardToBarca(View view) {
        barcaRedCard = barcaRedCard + 1;
        displayBarcaRedCards(barcaRedCard);
    }

    /** this is the  method that display the Barcelona red card
     *
     * @param barcaRedCard
     */
    public void displayBarcaRedCards(int barcaRedCard) {
        TextView redCardView = (TextView) findViewById(R.id.barca_red_card);
        redCardView.setText(String.valueOf(barcaRedCard));
    }
//** this is reset button. That reset the result of both team to initial value.
    public void resetScore(View view) {
        realGoal = 0;
        realFouls = 0;
        realYellow = 0;
        realRedCard = 0;
        barcaGoal = 0;
        barcaFouls = 0;
        barcaYellow = 0;
        barcaRedCard = 0;

        displayRealGoals(realGoal);
        displayRealFouls(realFouls);
        displayRealYellowCard(realYellow);
        displayRealRedCards(realRedCard);

        displayBarcaGoals(barcaGoal);
        displayBarcaFouls(barcaFouls);
        displayBarcaYellowCard(barcaYellow);
        displayBarcaRedCards(barcaRedCard);

    }
}
