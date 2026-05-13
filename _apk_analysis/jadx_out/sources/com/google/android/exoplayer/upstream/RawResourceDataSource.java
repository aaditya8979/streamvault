package com.google.android.exoplayer.upstream;

import a6.k0;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import y5.h;

/* JADX INFO: loaded from: classes11.dex */
public final class RawResourceDataSource extends y5.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f21036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Uri f21037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public AssetFileDescriptor f21038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public InputStream f21039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21041j;

    public static class RawResourceDataSourceException extends IOException {
        public RawResourceDataSourceException(IOException iOException) {
            super(iOException);
        }

        public RawResourceDataSourceException(String str) {
            super(str);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f21036e = context.getResources();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // com.google.android.exoplayer.upstream.a
    public long a(h hVar) throws RawResourceDataSourceException {
        try {
            Uri uri = hVar.f87270a;
            this.f21037f = uri;
            if (!TextUtils.equals("rawresource", uri.getScheme())) {
                throw new RawResourceDataSourceException("URI must use scheme rawresource");
            }
            try {
                int i10 = Integer.parseInt((String) a6.a.e(uri.getLastPathSegment()));
                e(hVar);
                AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f21036e.openRawResourceFd(i10);
                this.f21038g = assetFileDescriptorOpenRawResourceFd;
                if (assetFileDescriptorOpenRawResourceFd == null) {
                    throw new RawResourceDataSourceException("Resource is compressed: " + uri);
                }
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
                this.f21039h = fileInputStream;
                fileInputStream.skip(assetFileDescriptorOpenRawResourceFd.getStartOffset());
                if (fileInputStream.skip(hVar.f87275f) < hVar.f87275f) {
                    throw new EOFException();
                }
                long j10 = hVar.f87276g;
                long j11 = -1;
                if (j10 != -1) {
                    this.f21040i = j10;
                } else {
                    long length = assetFileDescriptorOpenRawResourceFd.getLength();
                    if (length != -1) {
                        j11 = length - hVar.f87275f;
                    }
                    this.f21040i = j11;
                }
                this.f21041j = true;
                f(hVar);
                return this.f21040i;
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.");
            }
        } catch (IOException e10) {
            throw new RawResourceDataSourceException(e10);
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void close() throws RawResourceDataSourceException {
        this.f21037f = null;
        try {
            try {
                InputStream inputStream = this.f21039h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f21039h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f21038g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f21038g = null;
                        if (this.f21041j) {
                            this.f21041j = false;
                            d();
                        }
                    }
                } catch (IOException e10) {
                    throw new RawResourceDataSourceException(e10);
                }
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(e11);
            }
        } catch (Throwable th2) {
            this.f21039h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f21038g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f21038g = null;
                    if (this.f21041j) {
                        this.f21041j = false;
                        d();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new RawResourceDataSourceException(e12);
                }
            } finally {
                this.f21038g = null;
                if (this.f21041j) {
                    this.f21041j = false;
                    d();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f21037f;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws RawResourceDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f21040i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new RawResourceDataSourceException(e10);
            }
        }
        int i12 = ((InputStream) k0.i(this.f21039h)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f21040i == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException(new EOFException());
        }
        long j11 = this.f21040i;
        if (j11 != -1) {
            this.f21040i = j11 - ((long) i12);
        }
        c(i12);
        return i12;
    }
}
