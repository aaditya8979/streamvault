package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final np f95311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sp f95312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pp f95313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f95314d;

    public tp(qp qpVar, sp spVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f95312b = spVar;
        this.f95314d = i10;
        this.f95311a = new np(qpVar, j10, j11, j12, j13, j14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        if (r8 != r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        r20.f89980a = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d2, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(yads.ld0 r19, yads.gg2 r20) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tp.a(yads.ld0, yads.gg2):int");
    }

    public final void a(long j10) {
        pp ppVar = this.f95313c;
        if (ppVar == null || ppVar.f93697a != j10) {
            long jA = this.f95311a.f92903a.a(j10);
            np npVar = this.f95311a;
            this.f95313c = new pp(j10, jA, npVar.f92905c, npVar.f92906d, npVar.f92907e, npVar.f92908f, npVar.f92909g);
        }
    }
}
