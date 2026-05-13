package org.eclipse.jetty.io;

/* JADX INFO: loaded from: classes5.dex */
public interface Buffers {

    public enum Type {
        BYTE_ARRAY,
        DIRECT,
        INDIRECT
    }

    hq.d b();

    void c(hq.d dVar);

    hq.d d(int i10);

    hq.d getBuffer();
}
