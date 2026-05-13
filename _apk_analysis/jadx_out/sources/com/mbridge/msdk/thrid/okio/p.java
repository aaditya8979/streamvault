package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: SegmentPool.java */
/* JADX INFO: loaded from: classes2.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static o f40877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f40878b;

    private p() {
    }

    public static o a() {
        synchronized (p.class) {
            o oVar = f40877a;
            if (oVar == null) {
                return new o();
            }
            f40877a = oVar.f40875f;
            oVar.f40875f = null;
            f40878b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return oVar;
        }
    }

    public static void a(o oVar) {
        if (oVar.f40875f != null || oVar.f40876g != null) {
            throw new IllegalArgumentException();
        }
        if (oVar.f40873d) {
            return;
        }
        synchronized (p.class) {
            long j10 = f40878b + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            if (j10 > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                return;
            }
            f40878b = j10;
            oVar.f40875f = f40877a;
            oVar.f40872c = 0;
            oVar.f40871b = 0;
            f40877a = oVar;
        }
    }
}
