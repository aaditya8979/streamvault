package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class jk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f91264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f91265d;

    public jk2(int i10, float[] fArr, float[] fArr2, int i11) {
        this.f91262a = i10;
        ni.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f91264c = fArr;
        this.f91265d = fArr2;
        this.f91263b = i11;
    }

    public final int a() {
        return this.f91264c.length / 3;
    }
}
