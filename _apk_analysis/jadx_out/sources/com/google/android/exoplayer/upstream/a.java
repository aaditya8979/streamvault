package com.google.android.exoplayer.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import y5.h;
import y5.q;

/* JADX INFO: compiled from: DataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: com.google.android.exoplayer.upstream.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DataSource.java */
    public interface InterfaceC0296a {
        a createDataSource();
    }

    long a(h hVar) throws IOException;

    void b(q qVar);

    void close() throws IOException;

    default Map<String, List<String>> getResponseHeaders() {
        return Collections.emptyMap();
    }

    @Nullable
    Uri getUri();

    int read(byte[] bArr, int i10, int i11) throws IOException;
}
