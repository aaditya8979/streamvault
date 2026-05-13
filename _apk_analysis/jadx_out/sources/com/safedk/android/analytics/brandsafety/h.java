package com.safedk.android.analytics.brandsafety;

import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f52579d = "ClickUrlCandidate";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f52580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f52581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f52582c;

    public h(long j10, String str) {
        this.f52580a = 0L;
        Logger.d(f52579d, "click url candidate, currentTime=" + j10 + ", clickUrl=" + str);
        this.f52580a = j10;
        this.f52581b = str;
    }

    public h(long j10, String str, String str2) {
        this.f52580a = 0L;
        Logger.d(f52579d, "click URL candidate, current time: " + j10 + ", click URL: " + str + ", view address: " + str2);
        this.f52580a = j10;
        this.f52581b = str;
        this.f52582c = str2;
    }
}
