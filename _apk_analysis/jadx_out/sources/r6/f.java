package r6;

import com.google.android.exoplayer2.ParserException;
import i6.l;
import i6.n;
import java.io.IOException;
import s7.a0;

/* JADX INFO: compiled from: OggPageHeader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f78694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f78695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f78696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f78697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f78698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f78699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f78700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f78701j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a0 f78702k = new a0(255);

    public boolean a(l lVar, boolean z10) throws IOException {
        b();
        this.f78702k.L(27);
        if (!n.b(lVar, this.f78702k.d(), 0, 27, z10) || this.f78702k.F() != 1332176723) {
            return false;
        }
        int iD = this.f78702k.D();
        this.f78692a = iD;
        if (iD != 0) {
            if (z10) {
                return false;
            }
            throw ParserException.createForUnsupportedContainerFeature("unsupported bit stream revision");
        }
        this.f78693b = this.f78702k.D();
        this.f78694c = this.f78702k.r();
        this.f78695d = this.f78702k.t();
        this.f78696e = this.f78702k.t();
        this.f78697f = this.f78702k.t();
        int iD2 = this.f78702k.D();
        this.f78698g = iD2;
        this.f78699h = iD2 + 27;
        this.f78702k.L(iD2);
        if (!n.b(lVar, this.f78702k.d(), 0, this.f78698g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f78698g; i10++) {
            this.f78701j[i10] = this.f78702k.D();
            this.f78700i += this.f78701j[i10];
        }
        return true;
    }

    public void b() {
        this.f78692a = 0;
        this.f78693b = 0;
        this.f78694c = 0L;
        this.f78695d = 0L;
        this.f78696e = 0L;
        this.f78697f = 0L;
        this.f78698g = 0;
        this.f78699h = 0;
        this.f78700i = 0;
    }

    public boolean c(l lVar) throws IOException {
        return d(lVar, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.getPosition() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.skip(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(i6.l r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.getPeekPosition()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            s7.a.a(r0)
            s7.a0 r0 = r8.f78702k
            r3 = 4
            r0.L(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r4 = r9.getPosition()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L51
        L2b:
            s7.a0 r4 = r8.f78702k
            byte[] r4 = r4.d()
            boolean r4 = i6.n.b(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L51
            s7.a0 r0 = r8.f78702k
            r0.P(r1)
            s7.a0 r0 = r8.f78702k
            long r4 = r0.F()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r9.resetPeekPosition()
            return r2
        L4d:
            r9.skipFully(r2)
            goto L1a
        L51:
            if (r0 == 0) goto L5b
            long r3 = r9.getPosition()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L63
        L5b:
            int r3 = r9.skip(r2)
            r4 = -1
            if (r3 == r4) goto L63
            goto L51
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.f.d(i6.l, long):boolean");
    }
}
