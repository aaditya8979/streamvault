package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import r7.e;
import r7.k;
import s7.m0;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentDataSource extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f22845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Uri f22846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public AssetFileDescriptor f22847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public FileInputStream f22848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f22849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22850j;

    public static class ContentDataSourceException extends DataSourceException {
        @Deprecated
        public ContentDataSourceException(IOException iOException) {
            this(iOException, 2000);
        }

        public ContentDataSourceException(@Nullable IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f22845e = context.getContentResolver();
    }

    @Override // r7.h
    public long a(k kVar) throws ContentDataSourceException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = kVar.f78755a;
            this.f22846f = uri;
            e(kVar);
            if ("content".equals(kVar.f78755a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f22845e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f22845e.openAssetFileDescriptor(uri, "r");
            }
            this.f22847g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f22848h = fileInputStream;
            if (length != -1 && kVar.f78761g > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(kVar.f78761g + startOffset) - startOffset;
            if (jSkip != kVar.f78761g) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f22849i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f22849i = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f22849i = j10;
                if (j10 < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long jMin = kVar.f78762h;
            if (jMin != -1) {
                long j11 = this.f22849i;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f22849i = jMin;
            }
            this.f22850j = true;
            f(kVar);
            long j12 = kVar.f78762h;
            return j12 != -1 ? j12 : this.f22849i;
        } catch (ContentDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new ContentDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // r7.h
    public void close() throws ContentDataSourceException {
        this.f22846f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f22848h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f22848h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f22847g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f22847g = null;
                        if (this.f22850j) {
                            this.f22850j = false;
                            d();
                        }
                    }
                } catch (IOException e10) {
                    throw new ContentDataSourceException(e10, 2000);
                }
            } catch (IOException e11) {
                throw new ContentDataSourceException(e11, 2000);
            }
        } catch (Throwable th2) {
            this.f22848h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f22847g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f22847g = null;
                    if (this.f22850j) {
                        this.f22850j = false;
                        d();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new ContentDataSourceException(e12, 2000);
                }
            } finally {
                this.f22847g = null;
                if (this.f22850j) {
                    this.f22850j = false;
                    d();
                }
            }
        }
    }

    @Override // r7.h
    @Nullable
    public Uri getUri() {
        return this.f22846f;
    }

    @Override // r7.f
    public int read(byte[] bArr, int i10, int i11) throws ContentDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f22849i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new ContentDataSourceException(e10, 2000);
            }
        }
        int i12 = ((FileInputStream) m0.j(this.f22848h)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f22849i;
        if (j11 != -1) {
            this.f22849i = j11 - ((long) i12);
        }
        c(i12);
        return i12;
    }
}
