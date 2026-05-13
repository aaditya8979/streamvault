package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.ignite.m;
import com.fyber.inneractive.sdk.player.ui.o;
import com.fyber.inneractive.sdk.player.ui.s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.web.remoteui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f19056a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19063h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19057b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19058c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19059d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19060e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19061f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19062g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19064i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19065j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f19066k = m.NONE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f19067l = "";

    public f(o oVar) {
        this.f19056a = null;
        this.f19063h = false;
        this.f19056a = oVar;
        this.f19063h = oVar.H;
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z10, HashMap map) {
        s sVar = this.f19056a;
        if (sVar == null) {
            IAlog.a("%s: showFallback: fallback won't be displayed because it is null", "RemoteUiFallbackHandler");
            return;
        }
        sVar.g(this.f19057b);
        this.f19056a.d(this.f19064i);
        this.f19056a.f(this.f19061f);
        this.f19056a.a(this.f19060e, this.f19066k);
        this.f19056a.c(this.f19063h);
        this.f19056a.a(this.f19065j, this.f19067l);
        this.f19056a.b(this.f19062g);
        this.f19056a.e(this.f19058c);
        this.f19056a.a(this.f19059d);
    }
}
