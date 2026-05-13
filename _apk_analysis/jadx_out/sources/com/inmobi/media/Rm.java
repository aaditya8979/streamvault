package com.inmobi.media;

import android.app.KeyguardManager;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.PowerManager;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Rm {
    public static final MediaPlayer a(Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return Build.VERSION.SDK_INT >= 34 ? new MediaPlayer(context) : new MediaPlayer();
    }

    public static final void a(MediaPlayer mediaPlayer, Q1 q12) {
        tn.p.k(mediaPlayer, "<this>");
        tn.p.k(q12, "audioFocusManager");
        if (Build.VERSION.SDK_INT >= 26) {
            mediaPlayer.setAudioAttributes(q12.f26158d);
        } else {
            mediaPlayer.setAudioStreamType(3);
        }
    }

    public static final boolean a(Context context, boolean z10) {
        tn.p.k(context, "<this>");
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return false;
        }
        Object systemService2 = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        if (keyguardManager == null) {
            return false;
        }
        return powerManager.isInteractive() && (z10 || !keyguardManager.isKeyguardLocked());
    }
}
