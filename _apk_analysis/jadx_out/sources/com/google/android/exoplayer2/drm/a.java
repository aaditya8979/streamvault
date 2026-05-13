package com.google.android.exoplayer2.drm;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.p;
import com.google.common.collect.r2;
import com.google.common.primitives.Ints;
import h6.q;
import java.util.Map;
import r7.h;
import r7.p;
import s7.m0;

/* JADX INFO: compiled from: DefaultDrmSessionManagerProvider.java */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21518a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("lock")
    public p.f f21519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("lock")
    public c f21520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public h.a f21521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f21522e;

    @Override // h6.q
    public c a(p pVar) {
        c cVar;
        s7.a.e(pVar.f22033c);
        p.f fVar = pVar.f22033c.f22098c;
        if (fVar == null || m0.f79487a < 18) {
            return c.f21528a;
        }
        synchronized (this.f21518a) {
            if (!m0.c(fVar, this.f21519b)) {
                this.f21519b = fVar;
                this.f21520c = b(fVar);
            }
            cVar = (c) s7.a.e(this.f21520c);
        }
        return cVar;
    }

    @RequiresApi(18)
    public final c b(p.f fVar) {
        h.a aVarB = this.f21521d;
        if (aVarB == null) {
            aVarB = new p.b().b(this.f21522e);
        }
        Uri uri = fVar.f22067c;
        i iVar = new i(uri == null ? null : uri.toString(), fVar.f22072h, aVarB);
        r2<Map.Entry<String, String>> it = fVar.f22069e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            iVar.e(next.getKey(), next.getValue());
        }
        DefaultDrmSessionManager defaultDrmSessionManagerA = new DefaultDrmSessionManager.b().e(fVar.f22065a, h.f21537d).b(fVar.f22070f).c(fVar.f22071g).d(Ints.n(fVar.f22074j)).a(iVar);
        defaultDrmSessionManagerA.E(0, fVar.c());
        return defaultDrmSessionManagerA;
    }
}
