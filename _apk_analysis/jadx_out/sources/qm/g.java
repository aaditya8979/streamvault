package qm;

import java.util.ArrayList;

/* JADX INFO: compiled from: LinkedArrayList.java */
/* JADX INFO: loaded from: classes9.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f78359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f78360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile int f78361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f78362f;

    public g(int i10) {
        this.f78358b = i10;
    }

    public void a(Object obj) {
        if (this.f78361e == 0) {
            Object[] objArr = new Object[this.f78358b + 1];
            this.f78359c = objArr;
            this.f78360d = objArr;
            objArr[0] = obj;
            this.f78362f = 1;
            this.f78361e = 1;
            return;
        }
        int i10 = this.f78362f;
        int i11 = this.f78358b;
        if (i10 != i11) {
            this.f78360d[i10] = obj;
            this.f78362f = i10 + 1;
            this.f78361e++;
        } else {
            Object[] objArr2 = new Object[i11 + 1];
            objArr2[0] = obj;
            this.f78360d[i11] = objArr2;
            this.f78360d = objArr2;
            this.f78362f = 1;
            this.f78361e++;
        }
    }

    public Object[] b() {
        return this.f78359c;
    }

    public int c() {
        return this.f78361e;
    }

    public String toString() {
        int i10 = this.f78358b;
        int i11 = this.f78361e;
        ArrayList arrayList = new ArrayList(i11 + 1);
        Object[] objArrB = b();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            arrayList.add(objArrB[i13]);
            i12++;
            i13++;
            if (i13 == i10) {
                objArrB = (Object[]) objArrB[i10];
                i13 = 0;
            }
        }
        return arrayList.toString();
    }
}
