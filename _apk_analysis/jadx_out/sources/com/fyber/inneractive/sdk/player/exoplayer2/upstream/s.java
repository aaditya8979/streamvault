package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f18743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RandomAccessFile f18744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f18745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18747e;

    public s(m mVar) {
        this.f18743a = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws r {
        try {
            this.f18745c = kVar.f18696a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(kVar.f18696a.getPath(), "r");
            this.f18744b = randomAccessFile;
            randomAccessFile.seek(kVar.f18698c);
            long length = kVar.f18699d;
            if (length == -1) {
                length = this.f18744b.length() - kVar.f18698c;
            }
            this.f18746d = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f18747e = true;
            m mVar = this.f18743a;
            if (mVar != null) {
                synchronized (mVar) {
                    if (mVar.f18708b == 0) {
                        mVar.f18709c = SystemClock.elapsedRealtime();
                    }
                    mVar.f18708b++;
                }
            }
            return this.f18746d;
        } catch (IOException e10) {
            throw new r(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f18745c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f18745c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f18744b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new r(e10);
            }
        } finally {
            this.f18744b = null;
            if (this.f18747e) {
                this.f18747e = false;
                m mVar = this.f18743a;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws r {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f18746d;
        if (j10 == 0) {
            return -1;
        }
        try {
            int i12 = this.f18744b.read(bArr, i10, (int) Math.min(j10, i11));
            if (i12 > 0) {
                long j11 = i12;
                this.f18746d -= j11;
                m mVar = this.f18743a;
                if (mVar != null) {
                    synchronized (mVar) {
                        mVar.f18710d += j11;
                    }
                }
            }
            return i12;
        } catch (IOException e10) {
            throw new r(e10);
        }
    }
}
