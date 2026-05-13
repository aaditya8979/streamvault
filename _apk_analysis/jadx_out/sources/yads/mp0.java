package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class mp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h73 f92494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f92495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f92496c;

    public mp0(int i10, h73 h73Var, int[] iArr) {
        if (iArr.length == 0) {
            ih1.a("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f92494a = h73Var;
        this.f92495b = iArr;
        this.f92496c = i10;
    }
}
