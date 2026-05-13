package com.google.android.exoplayer.upstream;

import a6.k0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import y5.h;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentDataSource extends y5.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f21002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Uri f21003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public AssetFileDescriptor f21004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public FileInputStream f21005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21007j;

    public static class ContentDataSourceException extends IOException {
        public ContentDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f21002e = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer.upstream.a
    public long a(h hVar) throws ContentDataSourceException {
        try {
            Uri uri = hVar.f87270a;
            this.f21003f = uri;
            e(hVar);
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f21002e.openAssetFileDescriptor(uri, "r");
            this.f21004g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + uri);
            }
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f21005h = fileInputStream;
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(hVar.f87275f + startOffset) - startOffset;
            if (jSkip != hVar.f87275f) {
                throw new EOFException();
            }
            long j10 = hVar.f87276g;
            long jPosition = -1;
            if (j10 != -1) {
                this.f21006i = j10;
            } else {
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size != 0) {
                        jPosition = size - channel.position();
                    }
                    this.f21006i = jPosition;
                } else {
                    this.f21006i = length - jSkip;
                }
            }
            this.f21007j = true;
            f(hVar);
            return this.f21006i;
        } catch (IOException e10) {
            throw new ContentDataSourceException(e10);
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void close() throws ContentDataSourceException {
        this.f21003f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f21005h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f21005h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f21004g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f21004g = null;
                        if (this.f21007j) {
                            this.f21007j = false;
                            d();
                        }
                    }
                } catch (IOException e10) {
                    throw new ContentDataSourceException(e10);
                }
            } catch (IOException e11) {
                throw new ContentDataSourceException(e11);
            }
        } catch (Throwable th2) {
            this.f21005h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f21004g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f21004g = null;
                    if (this.f21007j) {
                        this.f21007j = false;
                        d();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new ContentDataSourceException(e12);
                }
            } finally {
                this.f21004g = null;
                if (this.f21007j) {
                    this.f21007j = false;
                    d();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f21003f;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws ContentDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f21006i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new ContentDataSourceException(e10);
            }
        }
        int i12 = ((FileInputStream) k0.i(this.f21005h)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f21006i == -1) {
                return -1;
            }
            throw new ContentDataSourceException(new EOFException());
        }
        long j11 = this.f21006i;
        if (j11 != -1) {
            this.f21006i = j11 - ((long) i12);
        }
        c(i12);
        return i12;
    }
}
