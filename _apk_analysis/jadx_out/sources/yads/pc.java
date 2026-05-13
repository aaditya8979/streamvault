package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import yads.mq0;

/* JADX INFO: loaded from: classes12.dex */
public final class pc implements mq0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb2 f93532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ib2 f93533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pq0 f93534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f93535g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f93538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f93539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f93540l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93529a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qc f93530b = new qc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f93531c = new jb2(2048);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f93537i = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f93536h = -1;

    static {
        new rq0() { // from class: bt.c8
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return yads.pc.a();
            }
        };
    }

    public pc() {
        jb2 jb2Var = new jb2(10);
        this.f93532d = jb2Var;
        this.f93533e = new ib2(jb2Var.a());
    }

    public static mq0[] a() {
        return new mq0[]{new pc()};
    }

    public final int a(ld0 ld0Var) throws EOFException, InterruptedIOException {
        int i10 = 0;
        while (true) {
            ld0Var.b(this.f93532d.f91147a, 0, 10, false);
            this.f93532d.e(0);
            if (this.f93532d.o() != 4801587) {
                break;
            }
            jb2 jb2Var = this.f93532d;
            jb2Var.e(jb2Var.f91148b + 3);
            int iL = this.f93532d.l();
            i10 += iL + 10;
            ld0Var.a(false, iL);
        }
        ld0Var.f91940f = 0;
        ld0Var.a(false, i10);
        if (this.f93536h == -1) {
            this.f93536h = i10;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012a  */
    @Override // yads.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(yads.nq0 r21, yads.gg2 r22) throws yads.ob2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.pc.a(yads.nq0, yads.gg2):int");
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f93534f = pq0Var;
        this.f93530b.a(pq0Var, new l93(Integer.MIN_VALUE, 0, 1));
        pq0Var.a();
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        ld0 ld0Var = (ld0) nq0Var;
        int iA = a(ld0Var);
        int i10 = iA;
        int i11 = 0;
        int i12 = 0;
        do {
            ld0Var.b(this.f93532d.f91147a, 0, 2, false);
            this.f93532d.e(0);
            if ((this.f93532d.r() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                ld0Var.b(this.f93532d.f91147a, 0, 4, false);
                this.f93533e.b(14);
                int iA2 = this.f93533e.a(13);
                if (iA2 <= 6) {
                    i10++;
                    ld0Var.f91940f = 0;
                    ld0Var.a(false, i10);
                } else {
                    ld0Var.a(false, iA2 - 6);
                    i12 += iA2;
                }
            } else {
                i10++;
                ld0Var.f91940f = 0;
                ld0Var.a(false, i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iA < 8192);
        return false;
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.f93539k = false;
        this.f93530b.a();
        this.f93535g = j11;
    }
}
