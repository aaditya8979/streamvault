package kr;

import java.util.LinkedHashMap;
import java.util.Map;
import qr.l;
import tr.d;

/* JADX INFO: compiled from: GENASubscription.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a<S extends l> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S f73557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f73558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f73559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f73560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public org.fourthline.cling.model.types.b f73561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<String, d<S>> f73562g;

    public a(S s10) {
        this.f73559d = 1800;
        this.f73562g = new LinkedHashMap();
        this.f73557b = s10;
    }

    public a(S s10, int i10) {
        this(s10);
        this.f73559d = i10;
    }

    public synchronized Map<String, d<S>> F() {
        return this.f73562g;
    }

    public synchronized int G() {
        return this.f73559d;
    }

    public synchronized S H() {
        return this.f73557b;
    }

    public synchronized String I() {
        return this.f73558c;
    }

    public synchronized void J(int i10) {
        this.f73560e = i10;
    }

    public synchronized void K(String str) {
        this.f73558c = str;
    }

    public abstract void e();

    public abstract void g();

    public synchronized int o() {
        return this.f73560e;
    }

    public synchronized org.fourthline.cling.model.types.b t() {
        return this.f73561f;
    }

    public String toString() {
        return "(GENASubscription, SID: " + I() + ", SEQUENCE: " + t() + ")";
    }
}
