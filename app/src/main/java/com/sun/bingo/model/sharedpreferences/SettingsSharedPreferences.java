package com.sun.bingo.model.sharedpreferences;

import de.devland.esperandro.SharedPreferenceActions;
import de.devland.esperandro.SharedPreferenceMode;
import de.devland.esperandro.annotations.SharedPreferences;

/**
 * Created by sunfusheng on 2015/6/25.
 */
@SharedPreferences(name = "settings", mode = SharedPreferenceMode.PRIVATE)
public interface SettingsSharedPreferences extends SharedPreferenceActions {

    boolean isReceivePush();
    void isReceivePush(boolean isReceivePush);

    int themeValue();
    void themeValue(int themeValue);

    String newBingoUrl();
    void newBingoUrl(String newBingoUrl);

    String newBingoDes();
    void newBingoDes(String newBingoDes);
}
