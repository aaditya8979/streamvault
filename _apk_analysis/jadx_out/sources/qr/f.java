package qr;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.fourthline.cling.model.ValidationException;
import ur.r;
import ur.s;

/* JADX INFO: compiled from: LocalService.java */
/* JADX INFO: loaded from: classes3.dex */
public class f<T> extends l<e, f> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<org.fourthline.cling.model.meta.a, jr.c> f78449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<m, tr.c> f78450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set<Class> f78451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f78452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ir.j f78453k;

    public f(s sVar, r rVar, Map<org.fourthline.cling.model.meta.a, jr.c> map, Map<m, tr.c> map2, Set<Class> set, boolean z10) throws ValidationException {
        super(sVar, rVar, (org.fourthline.cling.model.meta.a[]) map.keySet().toArray(new org.fourthline.cling.model.meta.a[map.size()]), (m[]) map2.keySet().toArray(new m[map2.size()]));
        this.f78452j = z10;
        this.f78451i = set;
        this.f78450h = map2;
        this.f78449g = map;
    }

    public f(s sVar, r rVar, org.fourthline.cling.model.meta.a[] aVarArr, m[] mVarArr) throws ValidationException {
        super(sVar, rVar, aVarArr, mVarArr);
        this.f78453k = null;
        this.f78449g = new HashMap();
        this.f78450h = new HashMap();
        this.f78451i = new HashSet();
        this.f78452j = true;
    }

    public tr.c n(String str) {
        m<f> mVarH = h(str);
        if (mVarH != null) {
            return o(mVarH);
        }
        return null;
    }

    public tr.c o(m mVar) {
        return this.f78450h.get(mVar);
    }

    public jr.c p(org.fourthline.cling.model.meta.a aVar) {
        return this.f78449g.get(aVar);
    }

    public synchronized ir.j<T> q() {
        ir.j<T> jVar;
        jVar = this.f78453k;
        if (jVar == null) {
            throw new IllegalStateException("Unmanaged service, no implementation instance available");
        }
        return jVar;
    }

    public Set<Class> r() {
        return this.f78451i;
    }

    public boolean s(Class cls) {
        return ir.f.e(r(), cls);
    }

    public boolean t(Object obj) {
        return obj != null && s(obj.getClass());
    }

    @Override // qr.l
    public String toString() {
        return super.toString() + ", Manager: " + this.f78453k;
    }

    public boolean u() {
        return this.f78452j;
    }

    public synchronized void v(ir.j<T> jVar) {
        if (this.f78453k != null) {
            throw new IllegalStateException("Manager is final");
        }
        this.f78453k = jVar;
    }
}
