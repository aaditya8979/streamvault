package mq;

import java.io.IOException;

/* JADX INFO: compiled from: Connector.java */
/* JADX INFO: loaded from: classes12.dex */
public interface f extends uq.f {
    boolean C(n nVar);

    boolean E();

    String H();

    void I(hq.k kVar) throws IOException;

    void K(hq.k kVar, n nVar) throws IOException;

    int P();

    int R();

    p b();

    String b0();

    int c();

    void close() throws IOException;

    int d();

    void f(p pVar);

    boolean g(n nVar);

    Object getConnection();

    String getName();

    String i();

    int j();

    boolean n();

    void open() throws IOException;
}
