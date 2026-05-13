package yads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class xf2 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f96757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f96758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f96759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f96760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s63[] f96761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object[] f96762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f96763l;

    public xf2(List list, sy2 sy2Var) {
        super(sy2Var);
        int size = list.size();
        this.f96759h = new int[size];
        this.f96760i = new int[size];
        this.f96761j = new s63[size];
        this.f96762k = new Object[size];
        this.f96763l = new HashMap();
        Iterator it = list.iterator();
        int iB = 0;
        int iA = 0;
        int i10 = 0;
        while (it.hasNext()) {
            dn1 dn1Var = (dn1) it.next();
            this.f96761j[i10] = dn1Var.a();
            this.f96760i[i10] = iB;
            this.f96759h[i10] = iA;
            iB += this.f96761j[i10].b();
            iA += this.f96761j[i10].a();
            this.f96762k[i10] = dn1Var.getUid();
            this.f96763l.put(this.f96762k[i10], Integer.valueOf(i10));
            i10++;
        }
        this.f96757f = iB;
        this.f96758g = iA;
    }

    @Override // yads.s63
    public final int a() {
        return this.f96758g;
    }

    @Override // yads.s63
    public final int b() {
        return this.f96757f;
    }
}
