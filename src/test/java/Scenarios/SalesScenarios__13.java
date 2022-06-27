package Scenarios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Sales Scenario")
public class SalesScenarios__13 extends OpenPage {


    @DisplayName("Scenario 13")
    @Test
    void ScenarioThirteen() {

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

    Elements.functions().click();

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

    Elements.changeClerk().click();                 //2

            assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open.");
            Elements.twoPopUp().click();


                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

            assertEquals("2", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

            Elements.enterPopUp().click();
            assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen is not closed.");


                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }



    Elements.functions().click();


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



    ElementsJS.abcd_MainMonitor();
                assertEquals("1", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
                assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
                assertEquals("£0.11", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


    Elements.cash1Screen().click();


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


    Elements.Cscreen().click();



                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }











        Elements.functions().click();

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.changeClerk().click();             //1

                    assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open.");
                    Elements.onePopUp().click();


                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                    assertEquals("1", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                    Elements.enterPopUp().click();
                    assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen is not closed.");


                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }



        Elements.functions().click();


                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }













    }
}