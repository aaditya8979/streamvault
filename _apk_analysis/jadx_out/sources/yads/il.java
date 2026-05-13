package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class il extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f90872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0 f90873d;

    public il(int i10, mx0 mx0Var, boolean z10) {
        super(mg2.a("AudioTrack write failed: ", i10));
        this.f90872c = z10;
        this.f90871b = i10;
        this.f90873d = mx0Var;
    }
}
