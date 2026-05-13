package no;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RealSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j f75925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f75927d;

    public k(@NotNull j jVar) {
        tn.p.k(jVar, "source");
        this.f75925b = jVar;
        this.f75927d = new a();
    }

    @Override // no.r
    public void D(@NotNull i iVar, long j10) throws EOFException {
        tn.p.k(iVar, "sink");
        try {
            require(j10);
            this.f75927d.D(iVar, j10);
        } catch (EOFException e10) {
            iVar.p(this.f75927d, this.f75927d.n());
            throw e10;
        }
    }

    @Override // no.j, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f75926c) {
            return;
        }
        this.f75926c = true;
        this.f75925b.close();
        this.f75927d.d();
    }

    @Override // no.r
    public boolean exhausted() {
        if (!this.f75926c) {
            return this.f75927d.exhausted() && this.f75925b.s(this.f75927d, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
        }
        throw new IllegalStateException("Source is closed.".toString());
    }

    @Override // no.r
    public int g0(@NotNull byte[] bArr, int i10, int i11) {
        tn.p.k(bArr, "sink");
        u.a(bArr.length, i10, i11);
        if (this.f75927d.n() == 0 && this.f75925b.s(this.f75927d, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f75927d.g0(bArr, i10, ((int) Math.min(i11 - i10, this.f75927d.n())) + i10);
    }

    @Override // no.r, no.q
    @NotNull
    public a getBuffer() {
        return this.f75927d;
    }

    @Override // no.r
    public long i(@NotNull i iVar) {
        tn.p.k(iVar, "sink");
        long j10 = 0;
        while (this.f75925b.s(this.f75927d, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long jH = this.f75927d.h();
            if (jH > 0) {
                j10 += jH;
                iVar.p(this.f75927d, jH);
            }
        }
        if (this.f75927d.n() <= 0) {
            return j10;
        }
        long jN = j10 + this.f75927d.n();
        a aVar = this.f75927d;
        iVar.p(aVar, aVar.n());
        return jN;
    }

    @Override // no.r
    @NotNull
    public r peek() {
        if (!this.f75926c) {
            return e.a(new h(this));
        }
        throw new IllegalStateException("Source is closed.".toString());
    }

    @Override // no.r
    public byte readByte() throws EOFException {
        require(1L);
        return this.f75927d.readByte();
    }

    @Override // no.r
    public boolean request(long j10) {
        if (!(!this.f75926c)) {
            throw new IllegalStateException("Source is closed.".toString());
        }
        if (j10 >= 0) {
            while (this.f75927d.n() < j10) {
                if (this.f75925b.s(this.f75927d, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException(("byteCount: " + j10).toString());
    }

    @Override // no.r
    public void require(long j10) throws EOFException {
        if (request(j10)) {
            return;
        }
        throw new EOFException("Source doesn't contain required number of bytes (" + j10 + ").");
    }

    @Override // no.j
    public long s(@NotNull a aVar, long j10) {
        tn.p.k(aVar, "sink");
        if (!(!this.f75926c)) {
            throw new IllegalStateException("Source is closed.".toString());
        }
        if (j10 >= 0) {
            if (this.f75927d.n() == 0 && this.f75925b.s(this.f75927d, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            return this.f75927d.s(aVar, Math.min(j10, this.f75927d.n()));
        }
        throw new IllegalArgumentException(("byteCount: " + j10).toString());
    }

    @NotNull
    public String toString() {
        return "buffered(" + this.f75925b + ')';
    }
}
