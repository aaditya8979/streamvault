package fr;

import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.model.ValidationException;
import qr.l;
import qr.m;
import ur.r;
import ur.s;

/* JADX INFO: compiled from: MutableService.java */
/* JADX INFO: loaded from: classes11.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f61866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f61867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public URI f61868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public URI f61869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public URI f61870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<a> f61871f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<g> f61872g = new ArrayList();

    public l a(qr.a aVar) throws ValidationException {
        return aVar.C(this.f61866a, this.f61867b, this.f61868c, this.f61869d, this.f61870e, b(), c());
    }

    public org.fourthline.cling.model.meta.a[] b() {
        org.fourthline.cling.model.meta.a[] aVarArr = new org.fourthline.cling.model.meta.a[this.f61871f.size()];
        Iterator<a> it = this.f61871f.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            aVarArr[i10] = it.next().a();
            i10++;
        }
        return aVarArr;
    }

    public m[] c() {
        m[] mVarArr = new m[this.f61872g.size()];
        Iterator<g> it = this.f61872g.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            mVarArr[i10] = it.next().a();
            i10++;
        }
        return mVarArr;
    }
}
