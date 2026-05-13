package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: loaded from: classes5.dex */
public class O5 extends BaseRequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f65684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f65685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4817gm f65686c;

    @NonNull
    public final String a() {
        return this.f65684a;
    }

    public final String b() {
        return this.f65685b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f65684a + "', mAppSystem='" + this.f65685b + "', startupState=" + this.f65686c + '}';
    }
}
