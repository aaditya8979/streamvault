package com.bytedance.sdk.component.vt.ouw.vt;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes3.dex */
final class le {
    public static fkw ouw;
    public static long vt;

    private le() {
    }

    public static fkw ouw() {
        synchronized (le.class) {
            fkw fkwVar = ouw;
            if (fkwVar == null) {
                return new fkw();
            }
            ouw = fkwVar.f12829le;
            fkwVar.f12829le = null;
            vt -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return fkwVar;
        }
    }

    public static void ouw(fkw fkwVar) {
        if (fkwVar.f12829le != null || fkwVar.f12831ra != null) {
            throw new IllegalArgumentException();
        }
        if (fkwVar.yu) {
            return;
        }
        synchronized (le.class) {
            long j10 = vt;
            if (j10 + PlaybackStateCompat.ACTION_PLAY_FROM_URI > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                return;
            }
            vt = j10 + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            fkwVar.f12829le = ouw;
            fkwVar.f12830lh = 0;
            fkwVar.vt = 0;
            ouw = fkwVar;
        }
    }
}
