package com.yk.e.pl;

import android.content.Context;
import ys.c;

/* JADX INFO: loaded from: classes4.dex */
public class OktAndroidMediaPlayerFactory extends c<OktAndroidMediaPlayer> {
    public static OktAndroidMediaPlayerFactory create() {
        return new OktAndroidMediaPlayerFactory();
    }

    @Override // ys.c
    public OktAndroidMediaPlayer createPlayer(Context context) {
        return new OktAndroidMediaPlayer(context);
    }
}
