package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import r7.e;
import r7.k;
import s7.m0;

/* JADX INFO: loaded from: classes11.dex */
public final class RawResourceDataSource extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f22875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Uri f22877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public AssetFileDescriptor f22878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public InputStream f22879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f22880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22881k;

    public static class RawResourceDataSourceException extends DataSourceException {
        @Deprecated
        public RawResourceDataSourceException(String str) {
            super(str, null, 2000);
        }

        public RawResourceDataSourceException(@Nullable String str, @Nullable Throwable th2, int i10) {
            super(str, th2, i10);
        }

        @Deprecated
        public RawResourceDataSourceException(Throwable th2) {
            super(th2, 2000);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f22875e = context.getResources();
        this.f22876f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // r7.h
    public long a(k kVar) throws RawResourceDataSourceException {
        int identifier;
        String str;
        Uri uri = kVar.f78755a;
        this.f22877g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) s7.a.e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) s7.a.e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new RawResourceDataSourceException("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String strSubstring = (String) s7.a.e(uri.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + StringUtils.PROCESS_POSTFIX_DELIMITER;
            }
            sb2.append(str);
            sb2.append(strSubstring);
            identifier = this.f22875e.getIdentifier(sb2.toString(), "raw", this.f22876f);
            if (identifier == 0) {
                throw new RawResourceDataSourceException("Resource not found.", null, 2005);
            }
        }
        e(kVar);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f22875e.openRawResourceFd(identifier);
            this.f22878h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSourceException("Resource is compressed: " + uri, null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f22879i = fileInputStream;
            if (length != -1) {
                try {
                    if (kVar.f78761g > length) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                } catch (RawResourceDataSourceException e10) {
                    throw e10;
                } catch (IOException e11) {
                    throw new RawResourceDataSourceException(null, e11, 2000);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(kVar.f78761g + startOffset) - startOffset;
            if (jSkip != kVar.f78761g) {
                throw new RawResourceDataSourceException(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f22880j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f22880j = size;
                    if (size < 0) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f22880j = j10;
                if (j10 < 0) {
                    throw new DataSourceException(2008);
                }
            }
            long jMin = kVar.f78762h;
            if (jMin != -1) {
                long j11 = this.f22880j;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f22880j = jMin;
            }
            this.f22881k = true;
            f(kVar);
            long j12 = kVar.f78762h;
            return j12 != -1 ? j12 : this.f22880j;
        } catch (Resources.NotFoundException e12) {
            throw new RawResourceDataSourceException(null, e12, 2005);
        }
    }

    @Override // r7.h
    public void close() throws RawResourceDataSourceException {
        this.f22877g = null;
        try {
            try {
                InputStream inputStream = this.f22879i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f22879i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f22878h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f22878h = null;
                        if (this.f22881k) {
                            this.f22881k = false;
                            d();
                        }
                    }
                } catch (IOException e10) {
                    throw new RawResourceDataSourceException(null, e10, 2000);
                }
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(null, e11, 2000);
            }
        } catch (Throwable th2) {
            this.f22879i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f22878h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f22878h = null;
                    if (this.f22881k) {
                        this.f22881k = false;
                        d();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new RawResourceDataSourceException(null, e12, 2000);
                }
            } finally {
                this.f22878h = null;
                if (this.f22881k) {
                    this.f22881k = false;
                    d();
                }
            }
        }
    }

    @Override // r7.h
    @Nullable
    public Uri getUri() {
        return this.f22877g;
    }

    @Override // r7.f
    public int read(byte[] bArr, int i10, int i11) throws RawResourceDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f22880j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new RawResourceDataSourceException(null, e10, 2000);
            }
        }
        int i12 = ((InputStream) m0.j(this.f22879i)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f22880j == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f22880j;
        if (j11 != -1) {
            this.f22880j = j11 - ((long) i12);
        }
        c(i12);
        return i12;
    }
}
