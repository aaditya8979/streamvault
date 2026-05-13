package com.safedk.android.analytics.brandsafety.creatives;

import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bundle f52061a = new Bundle();

    public String a(AdNetworkConfiguration adNetworkConfiguration, String str) {
        return this.f52061a.getString(adNetworkConfiguration.name(), str);
    }

    public void a(AdNetworkConfiguration adNetworkConfiguration, float f10) {
        this.f52061a.putFloat(adNetworkConfiguration.name(), f10);
    }

    public void a(AdNetworkConfiguration adNetworkConfiguration, long j10) {
        this.f52061a.putLong(adNetworkConfiguration.name(), j10);
    }

    public boolean a(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f52061a.containsKey(adNetworkConfiguration.name());
    }

    public boolean a(AdNetworkConfiguration adNetworkConfiguration, boolean z10) {
        return this.f52061a.getBoolean(adNetworkConfiguration.name(), z10);
    }

    public void b(AdNetworkConfiguration adNetworkConfiguration, String str) {
        this.f52061a.putString(adNetworkConfiguration.name(), str);
    }

    public void b(AdNetworkConfiguration adNetworkConfiguration, boolean z10) {
        this.f52061a.putBoolean(adNetworkConfiguration.name(), z10);
    }

    public boolean b(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f52061a.getBoolean(adNetworkConfiguration.name());
    }

    public String c(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f52061a.getString(adNetworkConfiguration.name());
    }

    public float d(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f52061a.getFloat(adNetworkConfiguration.name());
    }

    public long e(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f52061a.getLong(adNetworkConfiguration.name());
    }

    public String toString() {
        return this.f52061a.toString();
    }
}
