package no;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements r, q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public m f75915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public m f75916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f75917d;

    public final /* synthetic */ void A(m mVar) {
        this.f75915b = mVar;
    }

    public final /* synthetic */ void B(long j10) {
        this.f75917d = j10;
    }

    public final /* synthetic */ void C(m mVar) {
        this.f75916c = mVar;
    }

    @Override // no.r
    public void D(@NotNull i iVar, long j10) throws EOFException {
        tn.p.k(iVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
        }
        if (n() >= j10) {
            iVar.p(this, j10);
            return;
        }
        iVar.p(this, n());
        throw new EOFException("Buffer exhausted before writing " + j10 + " bytes. Only " + n() + " bytes were written.");
    }

    public final Void F(long j10) throws EOFException {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + n() + ", required: " + j10 + ')');
    }

    public final /* synthetic */ m G(int i10) {
        if (!(i10 >= 1 && i10 <= 8192)) {
            throw new IllegalArgumentException(("unexpected capacity (" + i10 + "), should be in range [1, 8192]").toString());
        }
        m mVar = this.f75916c;
        if (mVar == null) {
            m mVarF = p.f();
            this.f75915b = mVarF;
            this.f75916c = mVarF;
            return mVarF;
        }
        tn.p.h(mVar);
        if (mVar.d() + i10 <= 8192 && mVar.f75936e) {
            return mVar;
        }
        m mVarM = mVar.m(p.f());
        this.f75916c = mVarM;
        return mVarM;
    }

    @Override // no.j, java.lang.AutoCloseable
    public void close() {
    }

    public final void d() throws EOFException {
        skip(n());
    }

    @Override // no.r
    public boolean exhausted() {
        return n() == 0;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    @Override // no.r
    public int g0(@NotNull byte[] bArr, int i10, int i11) {
        tn.p.k(bArr, "sink");
        u.a(bArr.length, i10, i11);
        m mVar = this.f75915b;
        if (mVar == null) {
            return -1;
        }
        int iMin = Math.min(i11 - i10, mVar.j());
        mVar.o(bArr, i10, i10 + iMin);
        this.f75917d -= (long) iMin;
        if (o.b(mVar)) {
            w();
        }
        return iMin;
    }

    @Override // no.r, no.q
    @NotNull
    public a getBuffer() {
        return this;
    }

    public final long h() {
        long jN = n();
        if (jN == 0) {
            return 0L;
        }
        m mVar = this.f75916c;
        tn.p.h(mVar);
        return (mVar.d() >= 8192 || !mVar.f75936e) ? jN : jN - ((long) (mVar.d() - mVar.f()));
    }

    @Override // no.r
    public long i(@NotNull i iVar) {
        tn.p.k(iVar, "sink");
        long jN = n();
        if (jN > 0) {
            iVar.p(this, jN);
        }
        return jN;
    }

    @Override // no.q
    public long j(@NotNull j jVar) {
        tn.p.k(jVar, "source");
        long j10 = 0;
        while (true) {
            long jS = jVar.s(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (jS == -1) {
                return j10;
            }
            j10 += jS;
        }
    }

    public final void k(@NotNull a aVar, long j10, long j11) {
        tn.p.k(aVar, "out");
        u.a(n(), j10, j11);
        if (j10 == j11) {
            return;
        }
        long jD = j11 - j10;
        aVar.f75917d += jD;
        m mVarE = this.f75915b;
        while (true) {
            tn.p.h(mVarE);
            if (j10 < mVarE.d() - mVarE.f()) {
                break;
            }
            j10 -= (long) (mVarE.d() - mVarE.f());
            mVarE = mVarE.e();
        }
        while (jD > 0) {
            tn.p.h(mVarE);
            m mVarT = mVarE.t();
            mVarT.r(mVarT.f() + ((int) j10));
            mVarT.p(Math.min(mVarT.f() + ((int) jD), mVarT.d()));
            if (aVar.m() == null) {
                aVar.A(mVarT);
                aVar.C(mVarT);
            } else {
                m mVarT2 = aVar.t();
                tn.p.h(mVarT2);
                aVar.C(mVarT2.m(mVarT));
            }
            jD -= (long) (mVarT.d() - mVarT.f());
            mVarE = mVarE.e();
            j10 = 0;
        }
    }

    public final byte l(long j10) {
        long j11 = 0;
        if (j10 < 0 || j10 >= n()) {
            throw new IndexOutOfBoundsException("position (" + j10 + ") is not within the range [0..size(" + n() + "))");
        }
        if (j10 == 0) {
            m mVar = this.f75915b;
            tn.p.h(mVar);
            return mVar.k(0);
        }
        if (m() == null) {
            tn.p.h(null);
            throw null;
        }
        if (n() - j10 >= j10) {
            m mVarM = m();
            while (mVarM != null) {
                long jD = ((long) (mVarM.d() - mVarM.f())) + j11;
                if (jD > j10) {
                    break;
                }
                mVarM = mVarM.e();
                j11 = jD;
            }
            tn.p.h(mVarM);
            return mVarM.k((int) (j10 - j11));
        }
        m mVarT = t();
        long jN = n();
        while (mVarT != null && jN > j10) {
            jN -= (long) (mVarT.d() - mVarT.f());
            if (jN <= j10) {
                break;
            }
            mVarT = mVarT.g();
        }
        tn.p.h(mVarT);
        return mVarT.k((int) (j10 - jN));
    }

    public final /* synthetic */ m m() {
        return this.f75915b;
    }

    public final long n() {
        return this.f75917d;
    }

    public final /* synthetic */ long o() {
        return this.f75917d;
    }

    @Override // no.i
    public void p(@NotNull a aVar, long j10) {
        tn.p.k(aVar, "source");
        if (!(aVar != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        u.b(aVar.f75917d, 0L, j10);
        while (j10 > 0) {
            tn.p.h(aVar.f75915b);
            if (j10 < r1.j()) {
                m mVar = this.f75916c;
                if (mVar != null && mVar.f75936e) {
                    if ((((long) mVar.d()) + j10) - ((long) (mVar.i() ? 0 : mVar.f())) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        m mVar2 = aVar.f75915b;
                        tn.p.h(mVar2);
                        mVar2.y(mVar, (int) j10);
                        aVar.f75917d -= j10;
                        this.f75917d += j10;
                        return;
                    }
                }
                m mVar3 = aVar.f75915b;
                tn.p.h(mVar3);
                aVar.f75915b = mVar3.u((int) j10);
            }
            m mVar4 = aVar.f75915b;
            tn.p.h(mVar4);
            long j11 = mVar4.j();
            m mVarL = mVar4.l();
            aVar.f75915b = mVarL;
            if (mVarL == null) {
                aVar.f75916c = null;
            }
            if (m() == null) {
                A(mVar4);
                C(mVar4);
            } else {
                m mVarT = t();
                tn.p.h(mVarT);
                C(mVarT.m(mVar4).a());
                m mVarT2 = t();
                tn.p.h(mVarT2);
                if (mVarT2.g() == null) {
                    A(t());
                }
            }
            aVar.f75917d -= j11;
            this.f75917d += j11;
            j10 -= j11;
        }
    }

    @Override // no.r
    @NotNull
    public r peek() {
        return e.a(new h(this));
    }

    @Override // no.q
    public void q(byte b10) {
        G(1).x(b10);
        this.f75917d++;
    }

    @Override // no.r
    public byte readByte() throws EOFException {
        m mVar = this.f75915b;
        if (mVar == null) {
            F(1L);
            throw new KotlinNothingValueException();
        }
        int iJ = mVar.j();
        if (iJ == 0) {
            w();
            return readByte();
        }
        byte bN = mVar.n();
        this.f75917d--;
        if (iJ == 1) {
            w();
        }
        return bN;
    }

    @Override // no.r
    public boolean request(long j10) {
        if (j10 >= 0) {
            return n() >= j10;
        }
        throw new IllegalArgumentException(("byteCount: " + j10 + " < 0").toString());
    }

    @Override // no.r
    public void require(long j10) throws EOFException {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (n() >= j10) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + n() + ", required: " + j10 + ')');
    }

    @Override // no.j
    public long s(@NotNull a aVar, long j10) {
        tn.p.k(aVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
        }
        if (n() == 0) {
            return -1L;
        }
        if (j10 > n()) {
            j10 = n();
        }
        aVar.p(this, j10);
        return j10;
    }

    public void skip(long j10) throws EOFException {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
        }
        long j11 = j10;
        while (j11 > 0) {
            m mVar = this.f75915b;
            if (mVar == null) {
                throw new EOFException("Buffer exhausted before skipping " + j10 + " bytes.");
            }
            int iMin = (int) Math.min(j11, mVar.d() - mVar.f());
            long j12 = iMin;
            this.f75917d -= j12;
            j11 -= j12;
            mVar.r(mVar.f() + iMin);
            if (mVar.f() == mVar.d()) {
                w();
            }
        }
    }

    public final /* synthetic */ m t() {
        return this.f75916c;
    }

    @NotNull
    public String toString() {
        if (n() == 0) {
            return "Buffer(size=0)";
        }
        long j10 = 64;
        int iMin = (int) Math.min(j10, n());
        StringBuilder sb2 = new StringBuilder((iMin * 2) + (n() > j10 ? 1 : 0));
        ro.d dVar = ro.d.f78921a;
        int i10 = 0;
        for (m mVarM = m(); mVarM != null; mVarM = mVarM.e()) {
            ro.b bVar = ro.e.f78922a;
            int i11 = 0;
            while (i10 < iMin && i11 < mVarM.j()) {
                int i12 = i11 + 1;
                byte bA = bVar.a(mVarM, i11);
                i10++;
                sb2.append(u.c()[(bA >> 4) & 15]);
                sb2.append(u.c()[bA & 15]);
                i11 = i12;
            }
        }
        if (n() > j10) {
            sb2.append((char) 8230);
        }
        return "Buffer(size=" + n() + " hex=" + ((Object) sb2) + ')';
    }

    public final void w() {
        m mVar = this.f75915b;
        tn.p.h(mVar);
        m mVarE = mVar.e();
        this.f75915b = mVarE;
        if (mVarE == null) {
            this.f75916c = null;
        } else {
            mVarE.s(null);
        }
        mVar.q(null);
        p.d(mVar);
    }

    @Override // no.q
    public void write(@NotNull byte[] bArr, int i10, int i11) {
        tn.p.k(bArr, "source");
        u.a(bArr.length, i10, i11);
        int i12 = i10;
        while (i12 < i11) {
            m mVarG = G(1);
            int iMin = Math.min(i11 - i12, mVarG.h()) + i12;
            mVarG.v(bArr, i12, iMin);
            i12 = iMin;
        }
        this.f75917d += (long) (i11 - i10);
    }

    public final /* synthetic */ void x() {
        m mVar = this.f75916c;
        tn.p.h(mVar);
        m mVarG = mVar.g();
        this.f75916c = mVarG;
        if (mVarG == null) {
            this.f75915b = null;
        } else {
            mVarG.q(null);
        }
        mVar.s(null);
        p.d(mVar);
    }
}
