package Scenarios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Sales Scenario")
public class SalesScenarios__2 extends OpenPage{

    @DisplayName("Scenario 2")
    @Test
    void ScenarioTwo() {

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


        Elements.homeMode().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.management().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.mixAndMatch().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.create().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.MixandMacthcurrentRecordName().sendKeys("AVOCADO 2 for £10.00");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.MixandMatchquantity().sendKeys("2");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.MixandMacthcurrentRewardAmount().sendKeys("£10.00");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.MixandMacthSubmenuProduct().sendKeys("AVOCADO");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        ElementsJS.pointFruitMenuAVOCADO();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.SAVEmm().click();

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.MixandMacthfirst().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.DELETEmm().click();
        assertEquals("block", Elements.deleteAreYouSure().getCssValue("display"));

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.deleteAreYouSureYES().click();
        assertEquals("none", Elements.deleteAreYouSure().getCssValue("display"));

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.create().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.MixandMacthcurrentRecordName().sendKeys("AVOCADO 2 for £16.00");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.MixandMatchquantity().sendKeys("2");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.MixandMacthcurrentRewardAmount().sendKeys("£16.00");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.MixandMacthSubmenuProduct().sendKeys("AVOCADO");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        ElementsJS.pointFruitMenuAVOCADO();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.SAVEmm().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.backMicandMacth().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.create().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.MixandMacthcurrentRecordName().sendKeys("AVOCADO 3 for £16.00");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.MixandMatchquantity().sendKeys("3");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.MixandMacthcurrentRewardAmount().sendKeys("£16.00");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.MixandMacthSubmenuProduct().sendKeys("AVOCADO");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        ElementsJS.pointFruitMenuAVOCADO();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.SAVEmm().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.homeModeBack().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.onePopUp().click();
        Elements.sixPopUp().click();
        assertEquals("16", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        assertEquals("1", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£7.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


        Elements.fourScreen().click();
        Elements.xScreen().click();


                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.onePopUp().click();
        Elements.sixPopUp().click();
        assertEquals("16", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        assertEquals("5", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£5.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£30.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");

        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.onePopUp().click();
        Elements.sixPopUp().click();
        assertEquals("16", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        assertEquals("6", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£10.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£32.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.cardScreen().click();
        assertEquals("block", Elements.StartcardtransactionYesNo().getCssValue("display"),"The yes/no screen to start card transaction did not pop up.\n");
        Elements.StartcardtransactionYes().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        assertEquals("none", Elements.StartcardtransactionYesNo().getCssValue("display"),"The yes/no screen to start card transaction did not close.");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.Cscreen().click();



    }

}
