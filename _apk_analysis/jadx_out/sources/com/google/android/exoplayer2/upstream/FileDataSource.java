package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import r7.e;
import r7.k;
import s7.m0;

/* JADX INFO: loaded from: classes8.dex */
public final class FileDataSource extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public RandomAccessFile f22851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Uri f22852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22854h;

    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception exc) {
            super(exc, 2000);
        }

        @Deprecated
        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException, 2000);
        }

        public FileDataSourceException(@Nullable String str, @Nullable Throwable th2, int i10) {
            super(str, th2, i10);
        }

        public FileDataSourceException(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    @RequiresApi(21)
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        @DoNotInline
        public static boolean b(@Nullable Throwable th2) {
            return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
        }
    }

    public FileDataSource() {
        super(false);
    }

    public static RandomAccessFile g(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) s7.a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e10, (m0.f79487a < 21 || !a.b(e10.getCause())) ? 2005 : 2006);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new FileDataSourceException(e11, 2006);
        } catch (RuntimeException e12) {
            throw new FileDataSourceException(e12, 2000);
        }
    }

    @Override // r7.h
    public long a(k kVar) throws FileDataSourceException {
        Uri uri = kVar.f78755a;
        this.f22852f = uri;
        e(kVar);
        RandomAccessFile randomAccessFileG = g(uri);
        this.f22851e = randomAccessFileG;
        try {
            randomAccessFileG.seek(kVar.f78761g);
            long length = kVar.f78762h;
            if (length == -1) {
                length = this.f22851e.length() - kVar.f78761g;
            }
            this.f22853g = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.f22854h = true;
            f(kVar);
            return this.f22853g;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }

    @Override // r7.h
    public void close() throws FileDataSourceException {
        this.f22852f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f22851e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new FileDataSourceException(e10, 2000);
            }
        } finally {
            this.f22851e = null;
            if (this.f22854h) {
                this.f22854h = false;
                d();
            }
        }
    }

    @Override // r7.h
    @Nullable
    public Uri getUri() {
        return this.f22852f;
    }

    @Override // r7.f
    public int read(byte[] bArr, int i10, int i11) throws FileDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f22853g == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) m0.j(this.f22851e)).read(bArr, i10, (int) Math.min(this.f22853g, i11));
            if (i12 > 0) {
                this.f22853g -= (long) i12;
                c(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }
}
