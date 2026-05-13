package qr;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: UDAVersion.java */
/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78490b;

    public q() {
        this.f78489a = 1;
        this.f78490b = 0;
    }

    public q(int i10, int i11) {
        this.f78489a = i10;
        this.f78490b = i11;
    }

    public int a() {
        return this.f78489a;
    }

    public int b() {
        return this.f78490b;
    }

    public List<ir.k> c() {
        ArrayList arrayList = new ArrayList();
        if (a() != 1) {
            arrayList.add(new ir.k(getClass(), "major", "UDA major spec version must be 1"));
        }
        if (a() < 0) {
            arrayList.add(new ir.k(getClass(), "minor", "UDA minor spec version must be equal or greater 0"));
        }
        return arrayList;
    }
}
