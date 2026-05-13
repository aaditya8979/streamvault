package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.source.i;
import r7.y;

/* JADX INFO: compiled from: WrappingMediaSource.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class t extends c<Void> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Void f22480l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f22481k;

    public t(i iVar) {
        this.f22481k = iVar;
    }

    @Nullable
    public i.b C(i.b bVar) {
        return bVar;
    }

    @Override // com.google.android.exoplayer2.source.c
    @Nullable
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final i.b w(Void r12, i.b bVar) {
        return C(bVar);
    }

    public long E(long j10) {
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final long x(Void r12, long j10) {
        return E(j10);
    }

    public int G(int i10) {
        return i10;
    }

    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final int y(Void r12, int i10) {
        return G(i10);
    }

    public abstract void I(c0 c0Var);

    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void z(Void r12, i iVar, c0 c0Var) {
        I(c0Var);
    }

    public final void K() {
        B(f22480l, this.f22481k);
    }

    public void L() {
        K();
    }

    @Override // com.google.android.exoplayer2.source.i
    @Nullable
    public c0 getInitialTimeline() {
        return this.f22481k.getInitialTimeline();
    }

    @Override // com.google.android.exoplayer2.source.i
    public com.google.android.exoplayer2.p getMediaItem() {
        return this.f22481k.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.i
    public boolean isSingleWindow() {
        return this.f22481k.isSingleWindow();
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public final void s(@Nullable y yVar) {
        super.s(yVar);
        L();
    }
}
