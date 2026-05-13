package d6;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PlaylistTimeline.java */
/* JADX INFO: loaded from: classes9.dex */
public final class s1 extends com.google.android.exoplayer2.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f59692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f59693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f59694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f59695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.c0[] f59696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object[] f59697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap<Object, Integer> f59698m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(Collection<? extends k1> collection, e7.c0 c0Var) {
        super(false, c0Var);
        int iT = 0;
        int size = collection.size();
        this.f59694i = new int[size];
        this.f59695j = new int[size];
        this.f59696k = new com.google.android.exoplayer2.c0[size];
        this.f59697l = new Object[size];
        this.f59698m = new HashMap<>();
        int iM = 0;
        int i10 = 0;
        for (k1 k1Var : collection) {
            this.f59696k[i10] = k1Var.getTimeline();
            this.f59695j[i10] = iT;
            this.f59694i[i10] = iM;
            iT += this.f59696k[i10].t();
            iM += this.f59696k[i10].m();
            this.f59697l[i10] = k1Var.getUid();
            this.f59698m.put(this.f59697l[i10], Integer.valueOf(i10));
            i10++;
        }
        this.f59692g = iT;
        this.f59693h = iM;
    }

    @Override // com.google.android.exoplayer2.a
    public int A(int i10) {
        return s7.m0.h(this.f59695j, i10 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.a
    public Object D(int i10) {
        return this.f59697l[i10];
    }

    @Override // com.google.android.exoplayer2.a
    public int F(int i10) {
        return this.f59694i[i10];
    }

    @Override // com.google.android.exoplayer2.a
    public int G(int i10) {
        return this.f59695j[i10];
    }

    @Override // com.google.android.exoplayer2.a
    public com.google.android.exoplayer2.c0 J(int i10) {
        return this.f59696k[i10];
    }

    public List<com.google.android.exoplayer2.c0> K() {
        return Arrays.asList(this.f59696k);
    }

    @Override // com.google.android.exoplayer2.c0
    public int m() {
        return this.f59693h;
    }

    @Override // com.google.android.exoplayer2.c0
    public int t() {
        return this.f59692g;
    }

    @Override // com.google.android.exoplayer2.a
    public int y(Object obj) {
        Integer num = this.f59698m.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.a
    public int z(int i10) {
        return s7.m0.h(this.f59694i, i10 + 1, false, false);
    }
}
