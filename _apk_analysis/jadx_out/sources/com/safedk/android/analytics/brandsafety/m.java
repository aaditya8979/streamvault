package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes8.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f52682a = Long.valueOf(System.currentTimeMillis());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f52683b = Long.valueOf(SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f52684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f52685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f52686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f52687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f52688g;

    public m(String str, String str2, String str3, String str4, m mVar) {
        this.f52684c = str;
        this.f52685d = str2;
        this.f52686e = str3;
        this.f52687f = str4;
        this.f52688g = mVar;
    }

    public String toString() {
        return "IntentDetails{ " + this.f52683b + ", " + this.f52684c + ", " + this.f52685d + ", " + this.f52686e + ", " + this.f52687f + " }";
    }
}
