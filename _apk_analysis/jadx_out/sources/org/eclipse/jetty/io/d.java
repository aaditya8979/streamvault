package org.eclipse.jetty.io;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.eclipse.jetty.io.Buffers;

/* JADX INFO: compiled from: ThreadLocalBuffers.java */
/* JADX INFO: loaded from: classes11.dex */
public class d extends org.eclipse.jetty.io.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ThreadLocal<b> f76669f;

    /* JADX INFO: compiled from: ThreadLocalBuffers.java */
    public class a extends ThreadLocal<b> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b initialValue() {
            return new b();
        }
    }

    /* JADX INFO: compiled from: ThreadLocalBuffers.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public hq.d f76671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public hq.d f76672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public hq.d f76673c;
    }

    public d(Buffers.Type type, int i10, Buffers.Type type2, int i11, Buffers.Type type3) {
        super(type, i10, type2, i11, type3);
        this.f76669f = new a();
    }

    @Override // org.eclipse.jetty.io.Buffers
    public hq.d b() {
        b bVar = this.f76669f.get();
        hq.d dVar = bVar.f76672b;
        if (dVar != null) {
            bVar.f76672b = null;
            return dVar;
        }
        hq.d dVar2 = bVar.f76673c;
        if (dVar2 == null || !g(dVar2)) {
            return j();
        }
        hq.d dVar3 = bVar.f76673c;
        bVar.f76673c = null;
        return dVar3;
    }

    @Override // org.eclipse.jetty.io.Buffers
    public void c(hq.d dVar) {
        dVar.clear();
        if (dVar.j0() || dVar.Z()) {
            return;
        }
        b bVar = this.f76669f.get();
        if (bVar.f76672b == null && g(dVar)) {
            bVar.f76672b = dVar;
        } else if (bVar.f76671a == null && f(dVar)) {
            bVar.f76671a = dVar;
        } else {
            bVar.f76673c = dVar;
        }
    }

    @Override // org.eclipse.jetty.io.Buffers
    public hq.d d(int i10) {
        b bVar = this.f76669f.get();
        hq.d dVar = bVar.f76673c;
        if (dVar == null || dVar.e0() != i10) {
            return i(i10);
        }
        hq.d dVar2 = bVar.f76673c;
        bVar.f76673c = null;
        return dVar2;
    }

    @Override // org.eclipse.jetty.io.Buffers
    public hq.d getBuffer() {
        b bVar = this.f76669f.get();
        hq.d dVar = bVar.f76671a;
        if (dVar != null) {
            bVar.f76671a = null;
            return dVar;
        }
        hq.d dVar2 = bVar.f76673c;
        if (dVar2 == null || !f(dVar2)) {
            return h();
        }
        hq.d dVar3 = bVar.f76673c;
        bVar.f76673c = null;
        return dVar3;
    }

    public String toString() {
        return "{{" + e() + StringUtils.COMMA + a() + "}}";
    }
}
