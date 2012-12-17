package fr.xebia.xndfandroid;

import android.content.Context;

/**
 * This class provides static application context.
 * User: Stéphane Moreau <smoreau@xebia.fr>
 */
public class Application extends android.app.Application {
    private static Context context;

    /**
     * Statically saves the application context
     * and maybe do more later on.
     */
    public void onCreate() {
        super.onCreate();
        Application.context = super.getApplicationContext();
    }

    /**
     * Gets the application context statically saved.
     * @return the application context
     */
    public static Context getContext() {
        return Application.context;
    }
}
