package com.google.android.exoplayer.upstream;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.upstream.HttpDataSource;
import com.google.android.exoplayer.upstream.Loader;
import java.io.FileNotFoundException;
import java.io.IOException;
import y5.m;

/* JADX INFO: compiled from: DefaultLoadErrorHandlingPolicy.java */
/* JADX INFO: loaded from: classes2.dex */
public class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21149a;

    public f() {
        this(-1);
    }

    public f(int i10) {
        this.f21149a = i10;
    }

    @Override // y5.m
    public long a(int i10, long j10, IOException iOException, int i11) {
        if (!(iOException instanceof HttpDataSource.InvalidResponseCodeException)) {
            return -9223372036854775807L;
        }
        int i12 = ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode;
        return (i12 == 404 || i12 == 410 || i12 == 416) ? 60000L : -9223372036854775807L;
    }

    @Override // y5.m
    public long b(int i10, long j10, IOException iOException, int i11) {
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof Loader.UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        return Math.min((i11 - 1) * 1000, 5000);
    }

    @Override // y5.m
    public int getMinimumLoadableRetryCount(int i10) {
        int i11 = this.f21149a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }
}
