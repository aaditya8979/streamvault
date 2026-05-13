package com.google.android.exoplayer.metadata;

import a6.k0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.metadata.Metadata;
import e4.e;
import e4.f0;
import e4.q0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w4.b;
import w4.c;
import w4.d;

/* JADX INFO: compiled from: MetadataRenderer.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends e implements Handler.Callback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f20218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f20219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final Handler f20220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f20221p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Metadata[] f20222q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long[] f20223r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20224s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f20225t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public w4.a f20226u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20227v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f20228w;

    public a(d dVar, @Nullable Looper looper) {
        this(dVar, looper, b.f86323a);
    }

    public a(d dVar, @Nullable Looper looper, b bVar) {
        super(4);
        this.f20219n = (d) a6.a.e(dVar);
        this.f20220o = looper == null ? null : k0.w(looper, this);
        this.f20218m = (b) a6.a.e(bVar);
        this.f20221p = new c();
        this.f20222q = new Metadata[5];
        this.f20223r = new long[5];
    }

    public final void A(Metadata metadata) {
        this.f20219n.k(metadata);
    }

    @Override // e4.q0
    public int a(Format format) {
        if (this.f20218m.a(format)) {
            return q0.create(e.w(null, format.f19930m) ? 4 : 2);
        }
        return q0.create(0);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        A((Metadata) message.obj);
        return true;
    }

    @Override // e4.p0
    public boolean isEnded() {
        return this.f20227v;
    }

    @Override // e4.p0
    public boolean isReady() {
        return true;
    }

    @Override // e4.e
    public void n() {
        y();
        this.f20226u = null;
    }

    @Override // e4.e
    public void p(long j10, boolean z10) {
        y();
        this.f20227v = false;
    }

    @Override // e4.p0
    public void render(long j10, long j11) {
        if (!this.f20227v && this.f20225t < 5) {
            this.f20221p.clear();
            f0 f0VarI = i();
            int iU = u(f0VarI, this.f20221p, false);
            if (iU == -4) {
                if (this.f20221p.isEndOfStream()) {
                    this.f20227v = true;
                } else if (!this.f20221p.isDecodeOnly()) {
                    c cVar = this.f20221p;
                    cVar.f86324h = this.f20228w;
                    cVar.c();
                    Metadata metadataA = ((w4.a) k0.i(this.f20226u)).a(this.f20221p);
                    if (metadataA != null) {
                        ArrayList arrayList = new ArrayList(metadataA.e());
                        x(metadataA, arrayList);
                        if (!arrayList.isEmpty()) {
                            Metadata metadata = new Metadata(arrayList);
                            int i10 = this.f20224s;
                            int i11 = this.f20225t;
                            int i12 = (i10 + i11) % 5;
                            this.f20222q[i12] = metadata;
                            this.f20223r[i12] = this.f20221p.f63713e;
                            this.f20225t = i11 + 1;
                        }
                    }
                }
            } else if (iU == -5) {
                this.f20228w = ((Format) a6.a.e(f0VarI.f60107c)).f19931n;
            }
        }
        if (this.f20225t > 0) {
            long[] jArr = this.f20223r;
            int i13 = this.f20224s;
            if (jArr[i13] <= j10) {
                z((Metadata) k0.i(this.f20222q[i13]));
                Metadata[] metadataArr = this.f20222q;
                int i14 = this.f20224s;
                metadataArr[i14] = null;
                this.f20224s = (i14 + 1) % 5;
                this.f20225t--;
            }
        }
    }

    @Override // e4.e
    public void t(Format[] formatArr, long j10) {
        this.f20226u = this.f20218m.b(formatArr[0]);
    }

    public final void x(Metadata metadata, List<Metadata.Entry> list) {
        for (int i10 = 0; i10 < metadata.e(); i10++) {
            Format wrappedMetadataFormat = metadata.d(i10).getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !this.f20218m.a(wrappedMetadataFormat)) {
                list.add(metadata.d(i10));
            } else {
                w4.a aVarB = this.f20218m.b(wrappedMetadataFormat);
                byte[] bArr = (byte[]) a6.a.e(metadata.d(i10).getWrappedMetadataBytes());
                this.f20221p.clear();
                this.f20221p.b(bArr.length);
                ((ByteBuffer) k0.i(this.f20221p.f63711c)).put(bArr);
                this.f20221p.c();
                Metadata metadataA = aVarB.a(this.f20221p);
                if (metadataA != null) {
                    x(metadataA, list);
                }
            }
        }
    }

    public final void y() {
        Arrays.fill(this.f20222q, (Object) null);
        this.f20224s = 0;
        this.f20225t = 0;
    }

    public final void z(Metadata metadata) {
        Handler handler = this.f20220o;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            A(metadata);
        }
    }
}
