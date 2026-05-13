package fr;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.model.ValidationException;
import qr.l;
import qr.q;
import ur.j;
import ur.z;

/* JADX INFO: compiled from: MutableDevice.java */
/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f61841a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public URL f61843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f61844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f61845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f61846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public URI f61847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f61848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f61849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f61850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public URI f61851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f61852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f61853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public URI f61854n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ur.g f61856p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f61860t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f61842b = new h();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<ur.h> f61855o = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<e> f61857q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<f> f61858r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List<d> f61859s = new ArrayList();

    public qr.a a(qr.a aVar) throws ValidationException {
        return b(aVar, e(), this.f61843c);
    }

    public qr.a b(qr.a aVar, q qVar, URL url) throws ValidationException {
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = this.f61859s.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b(aVar, qVar, url));
        }
        return aVar.B(this.f61841a, qVar, d(), c(url), f(), g(aVar), arrayList);
    }

    public qr.b c(URL url) {
        String str = this.f61845e;
        qr.g gVar = new qr.g(this.f61846f, this.f61847g);
        qr.h hVar = new qr.h(this.f61848h, this.f61849i, this.f61850j, this.f61851k);
        String str2 = this.f61852l;
        String str3 = this.f61853m;
        URI uri = this.f61854n;
        List<ur.h> list = this.f61855o;
        return new qr.b(url, str, gVar, hVar, str2, str3, uri, (ur.h[]) list.toArray(new ur.h[list.size()]), this.f61856p);
    }

    public j d() {
        return j.d(this.f61844d);
    }

    public q e() {
        h hVar = this.f61842b;
        return new q(hVar.f61879a, hVar.f61880b);
    }

    public qr.d[] f() {
        qr.d[] dVarArr = new qr.d[this.f61857q.size()];
        Iterator<e> it = this.f61857q.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dVarArr[i10] = it.next().a();
            i10++;
        }
        return dVarArr;
    }

    public l[] g(qr.a aVar) throws ValidationException {
        l[] lVarArrD = aVar.D(this.f61858r.size());
        Iterator<f> it = this.f61858r.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            lVarArrD[i10] = it.next().a(aVar);
            i10++;
        }
        return lVarArrD;
    }
}
