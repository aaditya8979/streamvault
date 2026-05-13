package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import r7.e;
import r7.k;
import s7.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class AssetDataSource extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f22840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Uri f22841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public InputStream f22842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22844i;

    public static final class AssetDataSourceException extends DataSourceException {
        @Deprecated
        public AssetDataSourceException(IOException iOException) {
            super(iOException, 2000);
        }

        public AssetDataSourceException(@Nullable Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f22840e = context.getAssets();
    }

    @Override // r7.h
    public long a(k kVar) throws AssetDataSourceException {
        try {
            Uri uri = kVar.f78755a;
            this.f22841f = uri;
            String strSubstring = (String) s7.a.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            e(kVar);
            InputStream inputStreamOpen = this.f22840e.open(strSubstring, 1);
            this.f22842g = inputStreamOpen;
            if (inputStreamOpen.skip(kVar.f78761g) < kVar.f78761g) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j10 = kVar.f78762h;
            if (j10 != -1) {
                this.f22843h = j10;
            } else {
                long jAvailable = this.f22842g.available();
                this.f22843h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f22843h = -1L;
                }
            }
            this.f22844i = true;
            f(kVar);
            return this.f22843h;
        } catch (AssetDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new AssetDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // r7.h
    public void close() throws AssetDataSourceException {
        this.f22841f = null;
        try {
            try {
                InputStream inputStream = this.f22842g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        } finally {
            this.f22842g = null;
            if (this.f22844i) {
                this.f22844i = false;
                d();
            }
        }
    }

    @Override // r7.h
    @Nullable
    public Uri getUri() {
        return this.f22841f;
    }

    @Override // r7.f
    public int read(byte[] bArr, int i10, int i11) throws AssetDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f22843h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        }
        int i12 = ((InputStream) m0.j(this.f22842g)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f22843h;
        if (j11 != -1) {
            this.f22843h = j11 - ((long) i12);
        }
        c(i12);
        return i12;
    }
}
