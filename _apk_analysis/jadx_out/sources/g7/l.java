package g7;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.primitives.Ints;
import i6.b0;
import i6.x;
import i6.y;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import s7.a0;
import s7.m0;

/* JADX INFO: compiled from: SubtitleExtractor.java */
/* JADX INFO: loaded from: classes12.dex */
public class l implements i6.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f62186a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.m f62189d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i6.m f62192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b0 f62193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f62194i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f62187b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f62188c = new a0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Long> f62190e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a0> f62191f = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f62195j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f62196k = -9223372036854775807L;

    public l(j jVar, com.google.android.exoplayer2.m mVar) {
        this.f62186a = jVar;
        this.f62189d = mVar.b().e0("text/x-exoplayer-cues").I(mVar.f21751m).E();
    }

    @Override // i6.k
    public void a(i6.m mVar) {
        s7.a.g(this.f62195j == 0);
        this.f62192g = mVar;
        this.f62193h = mVar.track(0, 3);
        this.f62192g.endTracks();
        this.f62192g.h(new x(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f62193h.b(this.f62189d);
        this.f62195j = 1;
    }

    @Override // i6.k
    public int b(i6.l lVar, y yVar) throws IOException, DecoderException {
        int i10 = this.f62195j;
        s7.a.g((i10 == 0 || i10 == 5) ? false : true);
        if (this.f62195j == 1) {
            this.f62188c.L(lVar.getLength() != -1 ? Ints.d(lVar.getLength()) : 1024);
            this.f62194i = 0;
            this.f62195j = 2;
        }
        if (this.f62195j == 2 && e(lVar)) {
            d();
            g();
            this.f62195j = 4;
        }
        if (this.f62195j == 3 && f(lVar)) {
            g();
            this.f62195j = 4;
        }
        return this.f62195j == 4 ? -1 : 0;
    }

    @Override // i6.k
    public boolean c(i6.l lVar) throws IOException {
        return true;
    }

    public final void d() throws IOException, DecoderException {
        try {
            m mVarDequeueInputBuffer = this.f62186a.dequeueInputBuffer();
            while (mVarDequeueInputBuffer == null) {
                Thread.sleep(5L);
                mVarDequeueInputBuffer = this.f62186a.dequeueInputBuffer();
            }
            mVarDequeueInputBuffer.m(this.f62194i);
            mVarDequeueInputBuffer.f21430d.put(this.f62188c.d(), 0, this.f62194i);
            mVarDequeueInputBuffer.f21430d.limit(this.f62194i);
            this.f62186a.queueInputBuffer(mVarDequeueInputBuffer);
            n nVarDequeueOutputBuffer = this.f62186a.dequeueOutputBuffer();
            while (nVarDequeueOutputBuffer == null) {
                Thread.sleep(5L);
                nVarDequeueOutputBuffer = this.f62186a.dequeueOutputBuffer();
            }
            for (int i10 = 0; i10 < nVarDequeueOutputBuffer.getEventTimeCount(); i10++) {
                byte[] bArrA = this.f62187b.a(nVarDequeueOutputBuffer.getCues(nVarDequeueOutputBuffer.getEventTime(i10)));
                this.f62190e.add(Long.valueOf(nVarDequeueOutputBuffer.getEventTime(i10)));
                this.f62191f.add(new a0(bArrA));
            }
            nVarDequeueOutputBuffer.l();
        } catch (SubtitleDecoderException e10) {
            throw ParserException.createForMalformedContainer("SubtitleDecoder failed.", e10);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final boolean e(i6.l lVar) throws IOException {
        int iB = this.f62188c.b();
        int i10 = this.f62194i;
        if (iB == i10) {
            this.f62188c.c(i10 + 1024);
        }
        int i11 = lVar.read(this.f62188c.d(), this.f62194i, this.f62188c.b() - this.f62194i);
        if (i11 != -1) {
            this.f62194i += i11;
        }
        long length = lVar.getLength();
        return (length != -1 && ((long) this.f62194i) == length) || i11 == -1;
    }

    public final boolean f(i6.l lVar) throws IOException {
        return lVar.skip((lVar.getLength() > (-1L) ? 1 : (lVar.getLength() == (-1L) ? 0 : -1)) != 0 ? Ints.d(lVar.getLength()) : 1024) == -1;
    }

    public final void g() {
        s7.a.i(this.f62193h);
        s7.a.g(this.f62190e.size() == this.f62191f.size());
        long j10 = this.f62196k;
        for (int iF = j10 == -9223372036854775807L ? 0 : m0.f(this.f62190e, Long.valueOf(j10), true, true); iF < this.f62191f.size(); iF++) {
            a0 a0Var = this.f62191f.get(iF);
            a0Var.P(0);
            int length = a0Var.d().length;
            this.f62193h.e(a0Var, length);
            this.f62193h.c(this.f62190e.get(iF).longValue(), 1, length, 0, null);
        }
    }

    @Override // i6.k
    public void release() {
        if (this.f62195j == 5) {
            return;
        }
        this.f62186a.release();
        this.f62195j = 5;
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        int i10 = this.f62195j;
        s7.a.g((i10 == 0 || i10 == 5) ? false : true);
        this.f62196k = j11;
        if (this.f62195j == 2) {
            this.f62195j = 1;
        }
        if (this.f62195j == 4) {
            this.f62195j = 3;
        }
    }
}
