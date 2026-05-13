package gq;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: HttpContent.java */
/* JADX INFO: loaded from: classes2.dex */
public interface f {
    InputStream b() throws IOException;

    hq.d c();

    long d();

    hq.d e();

    hq.d getContentType();

    hq.d getETag();

    hq.d getLastModified();

    wq.e getResource();
}
