package com.google.android.exoplayer.upstream;

import a6.k0;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.upstream.a;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import y5.h;
import y5.q;

/* JADX INFO: loaded from: classes9.dex */
public final class FileDataSource extends y5.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public RandomAccessFile f21008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Uri f21009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f21010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21011h;

    public static class FileDataSourceException extends IOException {
        public FileDataSourceException(IOException iOException) {
            super(iOException);
        }

        public FileDataSourceException(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public static final class a implements a.InterfaceC0296a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public q f21012a;

        @Override // com.google.android.exoplayer.upstream.a.InterfaceC0296a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDataSource createDataSource() {
            FileDataSource fileDataSource = new FileDataSource();
            q qVar = this.f21012a;
            if (qVar != null) {
                fileDataSource.b(qVar);
            }
            return fileDataSource;
        }
    }

    public FileDataSource() {
        super(false);
    }

    public static RandomAccessFile g(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) a6.a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e10);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10);
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public long a(h hVar) throws FileDataSourceException {
        try {
            Uri uri = hVar.f87270a;
            this.f21009f = uri;
            e(hVar);
            RandomAccessFile randomAccessFileG = g(uri);
            this.f21008e = randomAccessFileG;
            randomAccessFileG.seek(hVar.f87275f);
            long length = hVar.f87276g;
            if (length == -1) {
                length = this.f21008e.length() - hVar.f87275f;
            }
            this.f21010g = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f21011h = true;
            f(hVar);
            return this.f21010g;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10);
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void close() throws FileDataSourceException {
        this.f21009f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f21008e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new FileDataSourceException(e10);
            }
        } finally {
            this.f21008e = null;
            if (this.f21011h) {
                this.f21011h = false;
                d();
            }
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f21009f;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws FileDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f21010g == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) k0.i(this.f21008e)).read(bArr, i10, (int) Math.min(this.f21010g, i11));
            if (i12 > 0) {
                this.f21010g -= (long) i12;
                c(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10);
        }
    }
}
