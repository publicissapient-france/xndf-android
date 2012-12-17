package fr.xebia.xndfandroid.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import fr.xebia.xndfandroid.Application;

/**
 * Connectivity utility.
 * User: Stéphane Moreau <smoreau@xebia.fr>
 */
public class Connectivity {

    /**
     * This is a utility class, we don't need to instantiate it.
     */
    private Connectivity() {
        // Empty constructor
    }

    private static NetworkInfo getNetworkInfo() {
        ConnectivityManager connectivityManager = (ConnectivityManager) Application.getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo();
    }

    /**
     * Checks if the device is connected to the network.
     * @return <code>true</code> if the device is connected; <code>false</code> otherwise
     */
    public static boolean isConnected() {
        NetworkInfo networkInfo = getNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    /**
     * Checks if the WIFI data connection is activated.
     * @return <code>true</code> if the WIFI data connection is activated; <code>false</code> otherwise
     */
    public static boolean isWifiActivated() {
        NetworkInfo networkInfo = getNetworkInfo();
        return networkInfo != null && networkInfo.getType() == ConnectivityManager.TYPE_WIFI;
    }

    /**
     * Checks if the Mobile data connection is activated.
     * @return <code>true</code> if the Mobile data connection is activated; <code>false</code> otherwise
     */
    public static boolean isMobileActivated() {
        NetworkInfo networkInfo = getNetworkInfo();
        return networkInfo != null && networkInfo.getType() == ConnectivityManager.TYPE_MOBILE;
    }
}