package z0;

import com.danikula.videocache.ProxyCacheException;

/* JADX INFO: compiled from: Source.java */
/* JADX INFO: loaded from: classes10.dex */
public interface n {
    void a(long j10) throws ProxyCacheException;

    void close() throws ProxyCacheException;

    long length() throws ProxyCacheException;

    int read(byte[] bArr) throws ProxyCacheException;
}
