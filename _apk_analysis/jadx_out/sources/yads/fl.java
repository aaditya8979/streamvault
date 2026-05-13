package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class fl extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f89608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0 f89609d;

    public fl(int i10, int i11, int i12, int i13, mx0 mx0Var, boolean z10, RuntimeException runtimeException) {
        StringBuilder sb2 = new StringBuilder("AudioTrack init failed ");
        sb2.append(i10);
        sb2.append(" Config(");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(i13);
        sb2.append(")");
        sb2.append(z10 ? " (recoverable)" : "");
        super(sb2.toString(), runtimeException);
        this.f89607b = i10;
        this.f89608c = z10;
        this.f89609d = mx0Var;
    }
}
