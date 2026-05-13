package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.Trace;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w {
    public static void a() {
        if (z.f18822a >= 18) {
            Trace.endSection();
        }
    }

    public static void a(String str) {
        if (z.f18822a >= 18) {
            Trace.beginSection(str);
        }
    }
}
