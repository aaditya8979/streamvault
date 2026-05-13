package qr;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.fourthline.cling.model.ValidationException;
import ur.r;
import ur.s;
import ur.z;

/* JADX INFO: compiled from: LocalDevice.java */
/* JADX INFO: loaded from: classes3.dex */
public class e extends a<c, e, f> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rr.b f78448j;

    public e(c cVar, q qVar, ur.j jVar, b bVar, d[] dVarArr, f[] fVarArr, e[] eVarArr) throws ValidationException {
        super(cVar, qVar, jVar, bVar, dVarArr, fVarArr, eVarArr);
        this.f78448j = null;
    }

    public e(c cVar, ur.j jVar, b bVar, d[] dVarArr, f[] fVarArr) throws ValidationException {
        super(cVar, jVar, bVar, dVarArr, fVarArr);
        this.f78448j = null;
    }

    @Override // qr.a
    public List<ir.k> G() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.G());
        if (x()) {
            for (d dVar : q()) {
                if (dVar.g().isAbsolute()) {
                    arrayList.add(new ir.k(getClass(), "icons", "Local icon URI can not be absolute: " + dVar.g()));
                }
                if (dVar.g().toString().contains("../")) {
                    arrayList.add(new ir.k(getClass(), "icons", "Local icon URI must not contain '../': " + dVar.g()));
                }
                if (dVar.g().toString().startsWith("/")) {
                    arrayList.add(new ir.k(getClass(), "icons", "Local icon URI must not start with '/': " + dVar.g()));
                }
            }
        }
        return arrayList;
    }

    @Override // qr.a
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public e e(z zVar) {
        return d(zVar, this);
    }

    public rr.b I() {
        return this.f78448j;
    }

    @Override // qr.a
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public e[] p() {
        D[] dArr = this.f78425g;
        return dArr != 0 ? (e[]) dArr : new e[0];
    }

    @Override // qr.a
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public e t() {
        if (A()) {
            return this;
        }
        e eVarS = this;
        while (eVarS.s() != null) {
            eVarS = eVarS.s();
        }
        return eVarS;
    }

    @Override // qr.a
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public f[] u() {
        S[] sArr = this.f78424f;
        return sArr != 0 ? (f[]) sArr : new f[0];
    }

    @Override // qr.a
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public e B(z zVar, q qVar, ur.j jVar, b bVar, d[] dVarArr, f[] fVarArr, List<e> list) throws ValidationException {
        return new e(new c(zVar, r().a()), qVar, jVar, bVar, dVarArr, fVarArr, list.size() > 0 ? (e[]) list.toArray(new e[list.size()]) : null);
    }

    @Override // qr.a
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public f C(s sVar, r rVar, URI uri, URI uri2, URI uri3, org.fourthline.cling.model.meta.a<f>[] aVarArr, m<f>[] mVarArr) throws ValidationException {
        return new f(sVar, rVar, aVarArr, mVarArr);
    }

    @Override // qr.a
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public f[] D(int i10) {
        return new f[i10];
    }

    @Override // qr.a
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public e[] F(Collection<e> collection) {
        return (e[]) collection.toArray(new e[collection.size()]);
    }

    @Override // qr.a
    public sr.c[] a(ir.g gVar) {
        ArrayList arrayList = new ArrayList();
        if (A()) {
            arrayList.add(new sr.a(gVar.d(this), this));
        }
        for (f fVar : u()) {
            arrayList.add(new sr.e(gVar.e(fVar), fVar));
            arrayList.add(new sr.d(gVar.c(fVar), fVar));
            arrayList.add(new sr.g(gVar.j(fVar), fVar));
        }
        for (d dVar : q()) {
            arrayList.add(new sr.b(gVar.p(this, dVar.g()), dVar));
        }
        if (w()) {
            for (e eVar : p()) {
                arrayList.addAll(Arrays.asList(eVar.a(gVar)));
            }
        }
        return (sr.c[]) arrayList.toArray(new sr.c[arrayList.size()]);
    }

    @Override // qr.a
    public b n(rr.c cVar) {
        return I() != null ? I().a(cVar) : m();
    }
}
