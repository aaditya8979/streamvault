package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* JADX INFO: loaded from: classes.dex */
class p6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s7 f9544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f9545h;

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, p8 p8Var) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Unable to resolve VAST wrapper. Server returned " + i10);
            }
            p6.this.a(i10);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, p8 p8Var, int i10) {
            this.f8505a.q0().a(h6.a(p8Var, p6.this.f9544g, p6.this.f9545h, p6.this.f8505a));
        }
    }

    public p6(s7 s7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.f9545h = appLovinAdLoadListener;
        this.f9544g = s7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.b(this.f8506b, "Failed to resolve VAST wrapper due to error code " + i10);
        }
        if (i10 != -1009) {
            a8.a(this.f9544g, this.f9545h, i10 == -1001 ? t7.TIMED_OUT : t7.GENERAL_WRAPPER_ERROR, i10, this.f8505a);
            return;
        }
        AppLovinAdLoadListener appLovinAdLoadListener = this.f9545h;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i10);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String strA = a8.a(this.f9544g);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.b(this.f8506b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "Resolving VAST ad with depth " + this.f9544g.d() + " at " + strA);
        }
        try {
            this.f8505a.q0().a(new a(com.applovin.impl.sdk.network.a.a(this.f8505a).b(strA).c("GET").a(p8.f9551f).a(((Integer) this.f8505a.a(x4.U4)).intValue()).c(((Integer) this.f8505a.a(x4.V4)).intValue()).a(false).a(), this.f8505a));
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.a(this.f8506b, "Unable to resolve VAST wrapper", th2);
            }
            a(-1);
        }
    }
}
