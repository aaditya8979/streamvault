package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f18682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f18683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f18684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AssetFileDescriptor f18685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FileInputStream f18686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18688g;

    public f(Context context, m mVar) {
        this.f18682a = context.getContentResolver();
        this.f18683b = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws e {
        try {
            Uri uri = kVar.f18696a;
            this.f18684c = uri;
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f18682a.openAssetFileDescriptor(uri, "r");
            this.f18685d = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.f18684c);
            }
            this.f18686e = new FileInputStream(this.f18685d.getFileDescriptor());
            long startOffset = this.f18685d.getStartOffset();
            if (this.f18686e.skip(kVar.f18698c + startOffset) - startOffset != kVar.f18698c) {
                throw new EOFException();
            }
            long j10 = kVar.f18699d;
            if (j10 != -1) {
                this.f18687f = j10;
            } else {
                long length = this.f18685d.getLength();
                this.f18687f = length;
                if (length == -1) {
                    long jAvailable = this.f18686e.available();
                    this.f18687f = jAvailable;
                    if (jAvailable == 0) {
                        this.f18687f = -1L;
                    }
                }
            }
            this.f18688g = true;
            m mVar = this.f18683b;
            if (mVar != null) {
                synchronized (mVar) {
                    if (mVar.f18708b == 0) {
                        mVar.f18709c = SystemClock.elapsedRealtime();
                    }
                    mVar.f18708b++;
                }
            }
            return this.f18687f;
        } catch (IOException e10) {
            throw new e(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f18684c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f18684c = null;
        try {
            try {
                FileInputStream fileInputStream = this.f18686e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f18686e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f18685d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new e(e10);
                    }
                } finally {
                    this.f18685d = null;
                    if (this.f18688g) {
                        this.f18688g = false;
                        m mVar = this.f18683b;
                        if (mVar != null) {
                            mVar.a();
                        }
                    }
                }
            } catch (IOException e11) {
                throw new e(e11);
            }
        } catch (Throwable th2) {
            this.f18686e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f18685d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f18685d = null;
                    if (this.f18688g) {
                        this.f18688g = false;
                        m mVar2 = this.f18683b;
                        if (mVar2 != null) {
                            mVar2.a();
                        }
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new e(e12);
                }
            } finally {
                this.f18685d = null;
                if (this.f18688g) {
                    this.f18688g = false;
                    m mVar3 = this.f18683b;
                    if (mVar3 != null) {
                        mVar3.a();
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws e {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f18687f;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new e(e10);
            }
        }
        int i12 = this.f18686e.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f18687f == -1) {
                return -1;
            }
            throw new e(new EOFException());
        }
        long j11 = this.f18687f;
        if (j11 != -1) {
            this.f18687f = j11 - ((long) i12);
        }
        m mVar = this.f18683b;
        if (mVar != null) {
            synchronized (mVar) {
                mVar.f18710d += (long) i12;
            }
        }
        return i12;
    }
}
