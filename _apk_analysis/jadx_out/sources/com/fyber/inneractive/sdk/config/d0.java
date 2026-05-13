package com.fyber.inneractive.sdk.config;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f16001a;

    public d0(IAConfigManager iAConfigManager) {
        this.f16001a = iAConfigManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAConfigManager iAConfigManager = this.f16001a;
        if (iAConfigManager.f15970p == null) {
            iAConfigManager.f15970p = j.a(iAConfigManager.f15960f);
        }
        com.fyber.inneractive.sdk.util.r.f19556b.post(new c0(this));
    }
}
