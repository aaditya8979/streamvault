package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import r7.k;

/* JADX INFO: loaded from: classes9.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public static final int TYPE_CLOSE = 3;
    public static final int TYPE_OPEN = 1;
    public static final int TYPE_READ = 2;
    public final k dataSpec;
    public final int type;

    @Deprecated
    public HttpDataSource$HttpDataSourceException(IOException iOException, k kVar, int i10) {
        this(iOException, kVar, 2000, i10);
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, k kVar, int i10, int i11) {
        super(iOException, a(i10, i11));
        this.dataSpec = kVar;
        this.type = i11;
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, k kVar, int i10) {
        this(str, iOException, kVar, 2000, i10);
    }

    public HttpDataSource$HttpDataSourceException(String str, @Nullable IOException iOException, k kVar, int i10, int i11) {
        super(str, iOException, a(i10, i11));
        this.dataSpec = kVar;
        this.type = i11;
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(String str, k kVar, int i10) {
        this(str, kVar, 2000, i10);
    }

    public HttpDataSource$HttpDataSourceException(String str, k kVar, int i10, int i11) {
        super(str, a(i10, i11));
        this.dataSpec = kVar;
        this.type = i11;
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(k kVar, int i10) {
        this(kVar, 2000, i10);
    }

    public HttpDataSource$HttpDataSourceException(k kVar, int i10, int i11) {
        super(a(i10, i11));
        this.dataSpec = kVar;
        this.type = i11;
    }

    public static int a(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static HttpDataSource$HttpDataSourceException createForIOException(final IOException iOException, final k kVar, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !y7.a.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException, kVar) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, kVar, i11, i10);
    }
}
