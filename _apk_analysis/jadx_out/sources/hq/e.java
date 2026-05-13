package hq;

import com.ironsource.C3978d4;
import hq.d;
import hq.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.util.StringMap;

/* JADX INFO: compiled from: BufferCache.java */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f63590a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringMap f63591b = new StringMap(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f63592c = new ArrayList();

    /* JADX INFO: compiled from: BufferCache.java */
    public static class a extends h.a {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f63593p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public HashMap f63594q;

        public a(String str, int i10) {
            super(str);
            this.f63594q = null;
            this.f63593p = i10;
        }

        public a d(Object obj) {
            HashMap map = this.f63594q;
            if (map == null) {
                return null;
            }
            return (a) map.get(obj);
        }

        public int e() {
            return this.f63593p;
        }

        public void f(Object obj, a aVar) {
            if (this.f63594q == null) {
                this.f63594q = new HashMap();
            }
            this.f63594q.put(obj, aVar);
        }
    }

    public a a(String str, int i10) {
        a aVar = new a(str, i10);
        this.f63590a.put(aVar, aVar);
        this.f63591b.put(str, (Object) aVar);
        while (i10 - this.f63592c.size() >= 0) {
            this.f63592c.add(null);
        }
        if (this.f63592c.get(i10) == null) {
            this.f63592c.add(i10, aVar);
        }
        return aVar;
    }

    public a b(d dVar) {
        return (a) this.f63590a.get(dVar);
    }

    public a c(String str) {
        return (a) this.f63591b.get(str);
    }

    public a d(byte[] bArr, int i10, int i11) {
        Map.Entry bestEntry = this.f63591b.getBestEntry(bArr, i10, i11);
        if (bestEntry != null) {
            return (a) bestEntry.getValue();
        }
        return null;
    }

    public int e(d dVar) {
        if (dVar instanceof a) {
            return ((a) dVar).e();
        }
        d dVarG = g(dVar);
        if (dVarG == null || !(dVarG instanceof a)) {
            return -1;
        }
        return ((a) dVarG).e();
    }

    public int f(String str) {
        a aVar = (a) this.f63591b.get(str);
        if (aVar == null) {
            return -1;
        }
        return aVar.e();
    }

    public d g(d dVar) {
        if (dVar instanceof a) {
            return dVar;
        }
        a aVarB = b(dVar);
        return aVarB == null ? dVar instanceof d.a ? dVar : new h.a(dVar.H(), 0, dVar.length(), 0) : aVarB;
    }

    public d h(String str) {
        a aVarC = c(str);
        return aVarC == null ? new a(str, -1) : aVarC;
    }

    public String toString() {
        return "CACHE[bufferMap=" + this.f63590a + ",stringMap=" + this.f63591b + ",index=" + this.f63592c + C3978d4.j.f31385e;
    }
}
