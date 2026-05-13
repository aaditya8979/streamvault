package z0;

import com.danikula.videocache.ProxyCacheException;

/* JADX INFO: compiled from: Cache.java */
/* JADX INFO: loaded from: classes10.dex */
public interface a {
    void a(byte[] bArr, int i10) throws ProxyCacheException;

    long available() throws ProxyCacheException;

    int b(byte[] bArr, long j10, int i10) throws ProxyCacheException;

    void close() throws ProxyCacheException;

    void complete() throws ProxyCacheException;

    boolean d();
}
