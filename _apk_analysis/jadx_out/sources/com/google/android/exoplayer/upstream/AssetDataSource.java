package com.google.android.exoplayer.upstream;

import a6.k0;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import y5.h;

/* JADX INFO: loaded from: classes8.dex */
public final class AssetDataSource extends y5.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f20997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Uri f20998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public InputStream f20999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f21000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21001i;

    public static final class AssetDataSourceException extends IOException {
        public AssetDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f20997e = context.getAssets();
    }

    @Override // com.google.android.exoplayer.upstream.a
    public long a(h hVar) throws AssetDataSourceException {
        try {
            Uri uri = hVar.f87270a;
            this.f20998f = uri;
            String strSubstring = (String) a6.a.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            e(hVar);
            InputStream inputStreamOpen = this.f20997e.open(strSubstring, 1);
            this.f20999g = inputStreamOpen;
            if (inputStreamOpen.skip(hVar.f87275f) < hVar.f87275f) {
                throw new EOFException();
            }
            long j10 = hVar.f87276g;
            if (j10 != -1) {
                this.f21000h = j10;
            } else {
                long jAvailable = this.f20999g.available();
                this.f21000h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f21000h = -1L;
                }
            }
            this.f21001i = true;
            f(hVar);
            return this.f21000h;
        } catch (IOException e10) {
            throw new AssetDataSourceException(e10);
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void close() throws AssetDataSourceException {
        this.f20998f = null;
        try {
            try {
                InputStream inputStream = this.f20999g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10);
            }
        } finally {
            this.f20999g = null;
            if (this.f21001i) {
                this.f21001i = false;
                d();
            }
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f20998f;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws AssetDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f21000h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10);
            }
        }
        int i12 = ((InputStream) k0.i(this.f20999g)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f21000h == -1) {
                return -1;
            }
            throw new AssetDataSourceException(new EOFException());
        }
        long j11 = this.f21000h;
        if (j11 != -1) {
            this.f21000h = j11 - ((long) i12);
        }
        c(i12);
        return i12;
    }
}
