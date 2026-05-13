package n5;

import a6.k0;
import a6.m;
import a6.p;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.text.SubtitleDecoderException;
import e4.f0;
import e4.q0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: TextRenderer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends e4.e implements Handler.Callback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final Handler f75146m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f75147n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g f75148o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f0 f75149p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f75150q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f75151r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f75152s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Format f75153t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public f f75154u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public h f75155v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public i f75156w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public i f75157x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f75158y;

    public k(j jVar, @Nullable Looper looper) {
        this(jVar, looper, g.f75142a);
    }

    public k(j jVar, @Nullable Looper looper, g gVar) {
        super(3);
        this.f75147n = (j) a6.a.e(jVar);
        this.f75146m = looper == null ? null : k0.w(looper, this);
        this.f75148o = gVar;
        this.f75149p = new f0();
    }

    public final void A(List<b> list) {
        this.f75147n.onCues(list);
    }

    public final void B() {
        this.f75155v = null;
        this.f75158y = -1;
        i iVar = this.f75156w;
        if (iVar != null) {
            iVar.release();
            this.f75156w = null;
        }
        i iVar2 = this.f75157x;
        if (iVar2 != null) {
            iVar2.release();
            this.f75157x = null;
        }
    }

    public final void C() {
        B();
        this.f75154u.release();
        this.f75154u = null;
        this.f75152s = 0;
    }

    public final void D() {
        C();
        this.f75154u = this.f75148o.b(this.f75153t);
    }

    public final void E() {
        x();
        if (this.f75152s != 0) {
            D();
        } else {
            B();
            this.f75154u.flush();
        }
    }

    public final void F(List<b> list) {
        Handler handler = this.f75146m;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A(list);
        }
    }

    @Override // e4.q0
    public int a(Format format) {
        if (this.f75148o.a(format)) {
            return q0.create(e4.e.w(null, format.f19930m) ? 4 : 2);
        }
        return p.m(format.f19927j) ? q0.create(1) : q0.create(0);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        A((List) message.obj);
        return true;
    }

    @Override // e4.p0
    public boolean isEnded() {
        return this.f75151r;
    }

    @Override // e4.p0
    public boolean isReady() {
        return true;
    }

    @Override // e4.e
    public void n() {
        this.f75153t = null;
        x();
        C();
    }

    @Override // e4.e
    public void p(long j10, boolean z10) {
        this.f75150q = false;
        this.f75151r = false;
        E();
    }

    @Override // e4.p0
    public void render(long j10, long j11) throws Exception {
        boolean z10;
        if (this.f75151r) {
            return;
        }
        if (this.f75157x == null) {
            this.f75154u.setPositionUs(j10);
            try {
                this.f75157x = this.f75154u.dequeueOutputBuffer();
            } catch (SubtitleDecoderException e10) {
                z(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f75156w != null) {
            long jY = y();
            z10 = false;
            while (jY <= j10) {
                this.f75158y++;
                jY = y();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        i iVar = this.f75157x;
        if (iVar != null) {
            if (iVar.isEndOfStream()) {
                if (!z10 && y() == Long.MAX_VALUE) {
                    if (this.f75152s == 2) {
                        D();
                    } else {
                        B();
                        this.f75151r = true;
                    }
                }
            } else if (this.f75157x.timeUs <= j10) {
                i iVar2 = this.f75156w;
                if (iVar2 != null) {
                    iVar2.release();
                }
                i iVar3 = this.f75157x;
                this.f75156w = iVar3;
                this.f75157x = null;
                this.f75158y = iVar3.getNextEventTimeIndex(j10);
                z10 = true;
            }
        }
        if (z10) {
            F(this.f75156w.getCues(j10));
        }
        if (this.f75152s == 2) {
            return;
        }
        while (!this.f75150q) {
            try {
                if (this.f75155v == null) {
                    h hVarDequeueInputBuffer = this.f75154u.dequeueInputBuffer();
                    this.f75155v = hVarDequeueInputBuffer;
                    if (hVarDequeueInputBuffer == null) {
                        return;
                    }
                }
                if (this.f75152s == 1) {
                    this.f75155v.setFlags(4);
                    this.f75154u.queueInputBuffer(this.f75155v);
                    this.f75155v = null;
                    this.f75152s = 2;
                    return;
                }
                int iU = u(this.f75149p, this.f75155v, false);
                if (iU == -4) {
                    if (this.f75155v.isEndOfStream()) {
                        this.f75150q = true;
                    } else {
                        h hVar = this.f75155v;
                        hVar.f75143h = this.f75149p.f60107c.f19931n;
                        hVar.c();
                    }
                    this.f75154u.queueInputBuffer(this.f75155v);
                    this.f75155v = null;
                } else if (iU == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e11) {
                z(e11);
                return;
            }
        }
    }

    @Override // e4.e
    public void t(Format[] formatArr, long j10) {
        Format format = formatArr[0];
        this.f75153t = format;
        if (this.f75154u != null) {
            this.f75152s = 1;
        } else {
            this.f75154u = this.f75148o.b(format);
        }
    }

    public final void x() {
        F(Collections.emptyList());
    }

    public final long y() {
        int i10 = this.f75158y;
        if (i10 == -1 || i10 >= this.f75156w.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.f75156w.getEventTime(this.f75158y);
    }

    public final void z(SubtitleDecoderException subtitleDecoderException) {
        m.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f75153t, subtitleDecoderException);
        E();
    }
}
