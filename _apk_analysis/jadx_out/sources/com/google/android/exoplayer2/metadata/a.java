package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.e;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.metadata.Metadata;
import d6.u1;
import d6.z0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import s7.m0;
import v6.b;
import v6.c;
import v6.d;

/* JADX INFO: compiled from: MetadataRenderer.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends e implements Handler.Callback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f21871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f21872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final Handler f21873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f21874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f21875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public v6.a f21876t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f21877u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21878v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f21879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public Metadata f21880x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f21881y;

    public a(d dVar, @Nullable Looper looper) {
        this(dVar, looper, b.f85925a);
    }

    public a(d dVar, @Nullable Looper looper, b bVar) {
        this(dVar, looper, bVar, false);
    }

    public a(d dVar, @Nullable Looper looper, b bVar, boolean z10) {
        super(5);
        this.f21872p = (d) s7.a.e(dVar);
        this.f21873q = looper == null ? null : m0.t(looper, this);
        this.f21871o = (b) s7.a.e(bVar);
        this.f21875s = z10;
        this.f21874r = new c();
        this.f21881y = -9223372036854775807L;
    }

    public final void A(Metadata metadata) {
        this.f21872p.e(metadata);
    }

    public final boolean B(long j10) {
        boolean z10;
        Metadata metadata = this.f21880x;
        if (metadata == null || (!this.f21875s && metadata.f21870c > y(j10))) {
            z10 = false;
        } else {
            z(this.f21880x);
            this.f21880x = null;
            z10 = true;
        }
        if (this.f21877u && this.f21880x == null) {
            this.f21878v = true;
        }
        return z10;
    }

    public final void C() {
        if (this.f21877u || this.f21880x != null) {
            return;
        }
        this.f21874r.b();
        z0 z0VarI = i();
        int iU = u(z0VarI, this.f21874r, 0);
        if (iU != -4) {
            if (iU == -5) {
                this.f21879w = ((m) s7.a.e(z0VarI.f59724b)).f21755q;
            }
        } else {
            if (this.f21874r.g()) {
                this.f21877u = true;
                return;
            }
            c cVar = this.f21874r;
            cVar.f85926j = this.f21879w;
            cVar.n();
            Metadata metadataA = ((v6.a) m0.j(this.f21876t)).a(this.f21874r);
            if (metadataA != null) {
                ArrayList arrayList = new ArrayList(metadataA.f());
                x(metadataA, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f21880x = new Metadata(y(this.f21874r.f21432f), arrayList);
            }
        }
    }

    @Override // d6.u1
    public int a(m mVar) {
        if (this.f21871o.a(mVar)) {
            return u1.create(mVar.F == 0 ? 4 : 2);
        }
        return u1.create(0);
    }

    @Override // com.google.android.exoplayer2.y, d6.u1
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        A((Metadata) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.y
    public boolean isEnded() {
        return this.f21878v;
    }

    @Override // com.google.android.exoplayer2.y
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.e
    public void n() {
        this.f21880x = null;
        this.f21876t = null;
        this.f21881y = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.e
    public void p(long j10, boolean z10) {
        this.f21880x = null;
        this.f21877u = false;
        this.f21878v = false;
    }

    @Override // com.google.android.exoplayer2.y
    public void render(long j10, long j11) {
        boolean zB = true;
        while (zB) {
            C();
            zB = B(j10);
        }
    }

    @Override // com.google.android.exoplayer2.e
    public void t(m[] mVarArr, long j10, long j11) {
        this.f21876t = this.f21871o.b(mVarArr[0]);
        Metadata metadata = this.f21880x;
        if (metadata != null) {
            this.f21880x = metadata.d((metadata.f21870c + this.f21881y) - j11);
        }
        this.f21881y = j11;
    }

    public final void x(Metadata metadata, List<Metadata.Entry> list) {
        for (int i10 = 0; i10 < metadata.f(); i10++) {
            m wrappedMetadataFormat = metadata.e(i10).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.f21871o.a(wrappedMetadataFormat)) {
                list.add(metadata.e(i10));
            } else {
                v6.a aVarB = this.f21871o.b(wrappedMetadataFormat);
                byte[] bArr = (byte[]) s7.a.e(metadata.e(i10).getWrappedMetadataBytes());
                this.f21874r.b();
                this.f21874r.m(bArr.length);
                ((ByteBuffer) m0.j(this.f21874r.f21430d)).put(bArr);
                this.f21874r.n();
                Metadata metadataA = aVarB.a(this.f21874r);
                if (metadataA != null) {
                    x(metadataA, list);
                }
            }
        }
    }

    public final long y(long j10) {
        s7.a.g(j10 != -9223372036854775807L);
        s7.a.g(this.f21881y != -9223372036854775807L);
        return j10 - this.f21881y;
    }

    public final void z(Metadata metadata) {
        Handler handler = this.f21873q;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            A(metadata);
        }
    }
}
