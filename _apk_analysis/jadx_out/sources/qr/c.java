package qr;

import java.util.ArrayList;
import java.util.List;
import ur.z;

/* JADX INFO: compiled from: DeviceIdentity.java */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f78438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f78439b;

    public c(z zVar) {
        this.f78438a = zVar;
        this.f78439b = 1800;
    }

    public c(z zVar, Integer num) {
        this.f78438a = zVar;
        this.f78439b = num;
    }

    public Integer a() {
        return this.f78439b;
    }

    public z b() {
        return this.f78438a;
    }

    public List<ir.k> c() {
        ArrayList arrayList = new ArrayList();
        if (b() == null) {
            arrayList.add(new ir.k(getClass(), "major", "Device has no UDN"));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f78438a.equals(((c) obj).f78438a);
    }

    public int hashCode() {
        return this.f78438a.hashCode();
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") UDN: " + b();
    }
}
