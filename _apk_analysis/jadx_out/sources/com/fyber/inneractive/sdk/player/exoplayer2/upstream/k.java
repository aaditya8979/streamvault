package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.ironsource.C3978d4;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f18696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18701f;

    public k(Uri uri, long j10, long j11, long j12, String str, int i10) {
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        if (j11 < 0) {
            throw new IllegalArgumentException();
        }
        if (j12 <= 0 && j12 != -1) {
            throw new IllegalArgumentException();
        }
        this.f18696a = uri;
        this.f18697b = j10;
        this.f18698c = j11;
        this.f18699d = j12;
        this.f18700e = str;
        this.f18701f = i10;
    }

    public final String toString() {
        return "DataSpec[" + this.f18696a + ", " + Arrays.toString((byte[]) null) + ", " + this.f18697b + ", " + this.f18698c + ", " + this.f18699d + ", " + this.f18700e + ", " + this.f18701f + C3978d4.j.f31385e;
    }
}
