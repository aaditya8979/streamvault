package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f18668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f18669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f18670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f18671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18673f;

    public d(Context context, m mVar) {
        this.f18668a = context.getAssets();
        this.f18669b = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws c {
        try {
            Uri uri = kVar.f18696a;
            this.f18670c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream inputStreamOpen = this.f18668a.open(path, 1);
            this.f18671d = inputStreamOpen;
            if (inputStreamOpen.skip(kVar.f18698c) < kVar.f18698c) {
                throw new EOFException();
            }
            long j10 = kVar.f18699d;
            if (j10 != -1) {
                this.f18672e = j10;
            } else {
                long jAvailable = this.f18671d.available();
                this.f18672e = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f18672e = -1L;
                }
            }
            this.f18673f = true;
            m mVar = this.f18669b;
            if (mVar != null) {
                synchronized (mVar) {
                    if (mVar.f18708b == 0) {
                        mVar.f18709c = SystemClock.elapsedRealtime();
                    }
                    mVar.f18708b++;
                }
            }
            return this.f18672e;
        } catch (IOException e10) {
            throw new c(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f18670c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f18670c = null;
        try {
            try {
                InputStream inputStream = this.f18671d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new c(e10);
            }
        } finally {
            this.f18671d = null;
            if (this.f18673f) {
                this.f18673f = false;
                m mVar = this.f18669b;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws c {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f18672e;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new c(e10);
            }
        }
        int i12 = this.f18671d.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f18672e == -1) {
                return -1;
            }
            throw new c(new EOFException());
        }
        long j11 = this.f18672e;
        if (j11 != -1) {
            this.f18672e = j11 - ((long) i12);
        }
        m mVar = this.f18669b;
        if (mVar != null) {
            synchronized (mVar) {
                mVar.f18710d += (long) i12;
            }
        }
        return i12;
    }
}
