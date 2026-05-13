package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.e;
import com.mbridge.msdk.video.signal.impl.h;
import com.mbridge.msdk.video.signal.j;

/* JADX INFO: compiled from: DefaultJSFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements IJSFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.video.signal.b f42203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f42204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f42205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f42206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f42207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f42208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f42209g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.f42203a == null) {
            this.f42203a = new com.mbridge.msdk.video.signal.impl.b();
        }
        return this.f42203a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f42208f == null) {
            this.f42208f = new com.mbridge.msdk.video.signal.impl.g();
        }
        return this.f42208f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f42209g == null) {
            this.f42209g = new com.mbridge.msdk.video.signal.impl.c();
        }
        return this.f42209g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        if (this.f42204b == null) {
            this.f42204b = new com.mbridge.msdk.video.signal.impl.d();
        }
        return this.f42204b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        if (this.f42207e == null) {
            this.f42207e = new e();
        }
        return this.f42207e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f42206d == null) {
            this.f42206d = new com.mbridge.msdk.video.signal.impl.f();
        }
        return this.f42206d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f42205c == null) {
            this.f42205c = new h();
        }
        return this.f42205c;
    }
}
