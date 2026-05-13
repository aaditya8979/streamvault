package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16649a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16650b;

    public boolean getAllowFullscreen() {
        return this.f16649a;
    }

    public String getMediationName() {
        return IAConfigManager.O.f15966l;
    }

    public String getMediationVersion() {
        return IAConfigManager.O.f15968n;
    }
}
