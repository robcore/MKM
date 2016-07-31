package com.grarak.kerneladiutor.utils.kernel;

import android.content.Context;

import com.grarak.kerneladiutor.utils.Constants;
import com.grarak.kerneladiutor.utils.Utils;
import com.grarak.kerneladiutor.utils.root.Control;

/**
 * Created by matt on 31.7.2016.
 */
public class Power implements Constants {

    public static void activateC0State (boolean active, Context context) {
        String path = C0STATE;
        Control.runCommand(active ? "1" : "0", path, Control.CommandType.GENERIC, context);
        Control.runCommand(active ? "1" : "0", path.replace("0", "1"), Control.CommandType.GENERIC, context);
        Control.runCommand(active ? "1" : "0", path.replace("0", "2"), Control.CommandType.GENERIC, context);
        Control.runCommand(active ? "1" : "0", path.replace("0", "3"), Control.CommandType.GENERIC, context);
    }

    public static boolean isC0StateActive() {
        return Utils.readFile(C0STATE).equals("1");
    }

    public static boolean hasC0State () {
        return Utils.existFile(C0STATE);
    }

    public static void activateC1State (boolean active, Context context) {
        String path = C1STATE;
        Control.runCommand(active ? "1" : "0", path, Control.CommandType.GENERIC, context);
        Control.runCommand(active ? "1" : "0", path.replace("0", "1"), Control.CommandType.GENERIC, context);
        Control.runCommand(active ? "1" : "0", path.replace("0", "2"), Control.CommandType.GENERIC, context);
        Control.runCommand(active ? "1" : "0", path.replace("0", "3"), Control.CommandType.GENERIC, context);
    }

    public static boolean isC1StateActive() {
        return Utils.readFile(C1STATE).equals("1");
    }

    public static boolean hasC1State () {
        return Utils.existFile(C1STATE);
    }

    public static void activateC2State (boolean active, Context context) {
        String path = C2STATE;
        Control.runCommand(active ? "1" : "0", path, Control.CommandType.GENERIC, context);
        Control.runCommand(active ? "1" : "0", path.replace("0", "1"), Control.CommandType.GENERIC, context);
        Control.runCommand(active ? "1" : "0", path.replace("0", "2"), Control.CommandType.GENERIC, context);
        Control.runCommand(active ? "1" : "0", path.replace("0", "3"), Control.CommandType.GENERIC, context);
    }

    public static boolean isC2StateActive() {
        return Utils.readFile(C2STATE).equals("1");
    }

    public static boolean hasC2State () {
        return Utils.existFile(C2STATE);
    }

    public static void activateC3State (boolean active, Context context) {
        String path = C3STATE;
        Control.runCommand(active ? "1" : "0", path, Control.CommandType.GENERIC, context);
        Control.runCommand(active ? "1" : "0", path.replace("0", "1"), Control.CommandType.GENERIC, context);
        Control.runCommand(active ? "1" : "0", path.replace("0", "2"), Control.CommandType.GENERIC, context);
        Control.runCommand(active ? "1" : "0", path.replace("0", "3"), Control.CommandType.GENERIC, context);
    }

    public static boolean isC3StateActive() {
        return Utils.readFile(C3STATE).equals("1");
    }

    public static boolean hasC3State () {
        return Utils.existFile(C3STATE);
    }
}
