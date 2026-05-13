package g7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;
import d6.u1;
import d6.z0;
import s7.m0;
import s7.q;
import s7.u;

/* JADX INFO: compiled from: TextRenderer.java */
/* JADX INFO: loaded from: classes12.dex */
public final class p extends com.google.android.exoplayer2.e implements Handler.Callback {

    @Nullable
    public n A;
    public int B;
    public long C;
    public long D;
    public long E;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final Handler f62200o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f62201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f62202q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z0 f62203r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f62204s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f62205t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f62206u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f62207v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.m f62208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public j f62209x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public m f62210y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public n f62211z;

    public p(o oVar, @Nullable Looper looper) {
        this(oVar, looper, k.f62185a);
    }

    public p(o oVar, @Nullable Looper looper, k kVar) {
        super(3);
        this.f62201p = (o) s7.a.e(oVar);
        this.f62200o = looper == null ? null : m0.t(looper, this);
        this.f62202q = kVar;
        this.f62203r = new z0();
        this.C = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.E = -9223372036854775807L;
    }

    public final long A(long j10) {
        s7.a.g(j10 != -9223372036854775807L);
        s7.a.g(this.D != -9223372036854775807L);
        return j10 - this.D;
    }

    public final void B(SubtitleDecoderException subtitleDecoderException) {
        q.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f62208w, subtitleDecoderException);
        x();
        G();
    }

    public final void C() {
        this.f62206u = true;
        this.f62209x = this.f62202q.b((com.google.android.exoplayer2.m) s7.a.e(this.f62208w));
    }

    public final void D(f fVar) {
        this.f62201p.onCues(fVar.f62173b);
        this.f62201p.g(fVar);
    }

    public final void E() {
        this.f62210y = null;
        this.B = -1;
        n nVar = this.f62211z;
        if (nVar != null) {
            nVar.l();
            this.f62211z = null;
        }
        n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.l();
            this.A = null;
        }
    }

    public final void F() {
        E();
        ((j) s7.a.e(this.f62209x)).release();
        this.f62209x = null;
        this.f62207v = 0;
    }

    public final void G() {
        F();
        C();
    }

    public void H(long j10) {
        s7.a.g(isCurrentStreamFinal());
        this.C = j10;
    }

    public final void I(f fVar) {
        Handler handler = this.f62200o;
        if (handler != null) {
            handler.obtainMessage(0, fVar).sendToTarget();
        } else {
            D(fVar);
        }
    }

    @Override // d6.u1
    public int a(com.google.android.exoplayer2.m mVar) {
        if (this.f62202q.a(mVar)) {
            return u1.create(mVar.F == 0 ? 4 : 2);
        }
        return u.n(mVar.f21751m) ? u1.create(1) : u1.create(0);
    }

    @Override // com.google.android.exoplayer2.y, d6.u1
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        D((f) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.y
    public boolean isEnded() {
        return this.f62205t;
    }

    @Override // com.google.android.exoplayer2.y
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.e
    public void n() {
        this.f62208w = null;
        this.C = -9223372036854775807L;
        x();
        this.D = -9223372036854775807L;
        this.E = -9223372036854775807L;
        F();
    }

    @Override // com.google.android.exoplayer2.e
    public void p(long j10, boolean z10) {
        this.E = j10;
        x();
        this.f62204s = false;
        this.f62205t = false;
        this.C = -9223372036854775807L;
        if (this.f62207v != 0) {
            G();
        } else {
            E();
            ((j) s7.a.e(this.f62209x)).flush();
        }
    }

    @Override // com.google.android.exoplayer2.y
    public void render(long j10, long j11) throws DecoderException {
        boolean z10;
        this.E = j10;
        if (isCurrentStreamFinal()) {
            long j12 = this.C;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                E();
                this.f62205t = true;
            }
        }
        if (this.f62205t) {
            return;
        }
        if (this.A == null) {
            ((j) s7.a.e(this.f62209x)).setPositionUs(j10);
            try {
                this.A = ((j) s7.a.e(this.f62209x)).dequeueOutputBuffer();
            } catch (SubtitleDecoderException e10) {
                B(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f62211z != null) {
            long jZ = z();
            z10 = false;
            while (jZ <= j10) {
                this.B++;
                jZ = z();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        n nVar = this.A;
        if (nVar != null) {
            if (nVar.g()) {
                if (!z10 && z() == Long.MAX_VALUE) {
                    if (this.f62207v == 2) {
                        G();
                    } else {
                        E();
                        this.f62205t = true;
                    }
                }
            } else if (nVar.f62108c <= j10) {
                n nVar2 = this.f62211z;
                if (nVar2 != null) {
                    nVar2.l();
                }
                this.B = nVar.getNextEventTimeIndex(j10);
                this.f62211z = nVar;
                this.A = null;
                z10 = true;
            }
        }
        if (z10) {
            s7.a.e(this.f62211z);
            I(new f(this.f62211z.getCues(j10), A(y(j10))));
        }
        if (this.f62207v == 2) {
            return;
        }
        while (!this.f62204s) {
            try {
                m mVarDequeueInputBuffer = this.f62210y;
                if (mVarDequeueInputBuffer == null) {
                    mVarDequeueInputBuffer = ((j) s7.a.e(this.f62209x)).dequeueInputBuffer();
                    if (mVarDequeueInputBuffer == null) {
                        return;
                    } else {
                        this.f62210y = mVarDequeueInputBuffer;
                    }
                }
                if (this.f62207v == 1) {
                    mVarDequeueInputBuffer.k(4);
                    ((j) s7.a.e(this.f62209x)).queueInputBuffer(mVarDequeueInputBuffer);
                    this.f62210y = null;
                    this.f62207v = 2;
                    return;
                }
                int iU = u(this.f62203r, mVarDequeueInputBuffer, 0);
                if (iU == -4) {
                    if (mVarDequeueInputBuffer.g()) {
                        this.f62204s = true;
                        this.f62206u = false;
                    } else {
                        com.google.android.exoplayer2.m mVar = this.f62203r.f59724b;
                        if (mVar == null) {
                            return;
                        }
                        mVarDequeueInputBuffer.f62197j = mVar.f21755q;
                        mVarDequeueInputBuffer.n();
                        this.f62206u &= !mVarDequeueInputBuffer.j();
                    }
                    if (!this.f62206u) {
                        ((j) s7.a.e(this.f62209x)).queueInputBuffer(mVarDequeueInputBuffer);
                        this.f62210y = null;
                    }
                } else if (iU == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e11) {
                B(e11);
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.e
    public void t(com.google.android.exoplayer2.m[] mVarArr, long j10, long j11) {
        this.D = j11;
        this.f62208w = mVarArr[0];
        if (this.f62209x != null) {
            this.f62207v = 1;
        } else {
            C();
        }
    }

    public final void x() {
        I(new f(ImmutableList.of(), A(this.E)));
    }

    public final long y(long j10) {
        int nextEventTimeIndex = this.f62211z.getNextEventTimeIndex(j10);
        if (nextEventTimeIndex == 0) {
            return this.f62211z.f62108c;
        }
        if (nextEventTimeIndex != -1) {
            return this.f62211z.getEventTime(nextEventTimeIndex - 1);
        }
        return this.f62211z.getEventTime(r2.getEventTimeCount() - 1);
    }

    public final long z() {
        if (this.B == -1) {
            return Long.MAX_VALUE;
        }
        s7.a.e(this.f62211z);
        if (this.B >= this.f62211z.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.f62211z.getEventTime(this.B);
    }
}
