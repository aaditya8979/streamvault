package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import yads.mq0;
import yads.tv0;

/* JADX INFO: loaded from: classes2.dex */
public final class tv0 implements mq0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pq0 f95373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m73 f95374f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ts1 f95376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public bw0 f95377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f95378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f95379k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public sv0 f95380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f95381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f95382n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f95369a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f95370b = new jb2(0, new byte[32768]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f95371c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uv0 f95372d = new uv0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f95375g = 0;

    static {
        new rq0() { // from class: bt.sa
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return tv0.a();
            }
        };
    }

    public static mq0[] a() {
        return new mq0[]{new tv0()};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ba  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean, int] */
    @Override // yads.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(yads.nq0 r27, yads.gg2 r28) throws yads.ob2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tv0.a(yads.nq0, yads.gg2):int");
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f95373e = pq0Var;
        this.f95374f = pq0Var.a(0, 1);
        pq0Var.a();
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        ld0 ld0Var = (ld0) nq0Var;
        ts1 ts1VarA = new w21().a(ld0Var, u21.f95511b);
        if (ts1VarA != null) {
            int length = ts1VarA.f95344b.length;
        }
        byte[] bArr = new byte[4];
        ld0Var.b(bArr, 0, 4, false);
        return ((((long) bArr[3]) & 255) | ((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8))) == 1716281667;
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f95375g = 0;
        } else {
            sv0 sv0Var = this.f95380l;
            if (sv0Var != null) {
                sv0Var.a(j11);
            }
        }
        this.f95382n = j11 != 0 ? -1L : 0L;
        this.f95381m = 0;
        this.f95370b.c(0);
    }
}
