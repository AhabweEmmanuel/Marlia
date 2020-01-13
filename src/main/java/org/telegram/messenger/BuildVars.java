/*
 * This is the source code of Telegram for Android v. 5.x.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013-2018.
 */

package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;

public class BuildVars {

    public static boolean DEBUG_VERSION = false;
    public static boolean DEBUG_PRIVATE_VERSION = false;
    public static boolean LOGS_ENABLED = false;
    public static boolean USE_CLOUD_STRINGS = false;
    public static boolean CHECK_UPDATES = false;
    public static int BUILD_VERSION = 171; // build version
    public static String BUILD_VERSION_STRING = "2.0.7";
    public static int APP_ID = 328533; //obtain your own APP_ID at https://core.telegram.org/api/obtaining_api_id
    public static String APP_HASH = "f1f501c9bf184abaa3468373012c4b34"; //obtain your own APP_HASH at https://core.telegram.org/api/obtaining_api_id
    public static String HOCKEY_APP_HASH = "6ebaf425ef6745128e4852fe3a48470b";
    public static String HOCKEY_APP_HASH_DEBUG = "6ebaf425ef6745128e4852fe3a48470b";
    public static String SMS_HASH = "ZBdo0zk8qp3"; //https://developers.google.com/identity/sms-retriever/overview
    public static String PLAYSTORE_APP_URL = "https://play.google.com/store/apps/details?id=org.marlia.messenger";

    static {
        if (ApplicationLoader.applicationContext != null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", Context.MODE_PRIVATE);
            LOGS_ENABLED = sharedPreferences.getBoolean("logsEnabled", DEBUG_VERSION);
        }
    }
}
