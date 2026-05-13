package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: loaded from: classes8.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CreativeInfo f52705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f52706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f52707c;

    public o(CreativeInfo creativeInfo, String str, String str2) {
        this.f52705a = creativeInfo;
        this.f52706b = str;
        this.f52707c = System.currentTimeMillis() + ";" + str2;
    }

    public String toString() {
        return "what?: " + this.f52705a.toString() + " how? " + this.f52706b + " when?: " + this.f52707c;
    }
}
