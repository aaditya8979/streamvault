package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes11.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f16695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f16696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f16697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.s0 f16698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16699e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16700f = false;

    public x(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f16698d = s0Var;
        this.f16697c = rVar;
    }

    public com.fyber.inneractive.sdk.web.v0 a() {
        return null;
    }

    public void a(String str) {
    }

    public boolean a(boolean z10, com.fyber.inneractive.sdk.util.g gVar) {
        return false;
    }

    public com.fyber.inneractive.sdk.response.e b() {
        return this.f16696b;
    }

    public boolean c() {
        com.fyber.inneractive.sdk.config.s0 s0Var = this.f16698d;
        if (s0Var == null) {
            IAlog.f("%s : isFullscreenAd() called with unit config null", IAlog.a(this));
            return false;
        }
        return false;
    }

    public boolean d() {
        return false;
    }

    public abstract void destroy();

    public abstract boolean e();

    public void f() {
    }

    public abstract boolean isVideoAd();
}
