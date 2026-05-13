package yads;

import yads.ln3;
import yads.mq0;

/* JADX INFO: loaded from: classes4.dex */
public final class ln3 implements mq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pq0 f92040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m73 f92041b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jn3 f92044e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92042c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f92043d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f92045f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f92046g = -1;

    static {
        new rq0() { // from class: bt.f6
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return ln3.a();
            }
        };
    }

    public static /* synthetic */ mq0[] a() {
        return new mq0[]{new ln3()};
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01aa  */
    @Override // yads.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(yads.nq0 r25, yads.gg2 r26) throws yads.ob2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ln3.a(yads.nq0, yads.gg2):int");
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f92040a = pq0Var;
        this.f92041b = pq0Var.a(0, 1);
        pq0Var.a();
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) {
        return on3.a((ld0) nq0Var);
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.f92042c = j10 == 0 ? 0 : 4;
        jn3 jn3Var = this.f92044e;
        if (jn3Var != null) {
            jn3Var.a(j11);
        }
    }
}
