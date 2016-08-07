package com.lodz360;

import com.lodz360.User;
import com.lodz360.MyApp;

/**
 * Created by michalina on 05/08/16.
 */
public class BMIException extends Throwable {
    public static void main(String[] args) {
        try {
            (user.checkbmi);
        } catch (BMIToLowException toLow) {
            System.out.println("Wpisałeś głupoty, albo jesteś tak chudy, że już nic Ci nie pomoże");
        } catch (BMIToHighException toHigh) {
            System.out.println("Za duże BMI");
        }
    }
}
