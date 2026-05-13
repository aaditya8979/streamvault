package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.player.ui.n;
import com.fyber.inneractive.sdk.util.g1;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f19053a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19055c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f19054b = new ConcurrentHashMap();

    public e(d dVar) {
        this.f19053a = dVar;
    }

    public final void a(int i10, g1 g1Var) {
        n nVar;
        d dVar = this.f19053a;
        if (dVar == null || (nVar = dVar.f19043e) == null) {
            return;
        }
        ((z) nVar).a(i10, g1Var);
    }

    public final void a(String str, String str2, boolean z10) {
        if (!z10) {
            this.f19054b.put(str, str2);
            return;
        }
        d dVar = this.f19053a;
        if (dVar != null) {
            dVar.f19040b.a(str2);
        }
    }
}
