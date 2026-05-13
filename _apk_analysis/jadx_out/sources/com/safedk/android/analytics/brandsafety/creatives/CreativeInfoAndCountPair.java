package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class CreativeInfoAndCountPair implements Serializable {
    private static final long serialVersionUID = -7509291458978814775L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CreativeInfo f51945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51946b;

    public CreativeInfoAndCountPair() {
    }

    public CreativeInfoAndCountPair(CreativeInfo creativeInfo) {
        this.f51945a = creativeInfo;
        this.f51946b = 1;
    }

    public CreativeInfo a() {
        return this.f51945a;
    }

    public int b() {
        return this.f51946b;
    }

    public void c() {
        this.f51946b++;
    }

    public void d() {
        this.f51946b--;
    }

    public String toString() {
        return super.toString();
    }
}
