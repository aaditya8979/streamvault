package mq;

import java.io.IOException;
import javax.servlet.ServletException;

/* JADX INFO: compiled from: Handler.java */
/* JADX INFO: loaded from: classes12.dex */
public interface i extends uq.f, uq.d {
    void a0(String str, n nVar, an.a aVar, an.c cVar) throws ServletException, IOException;

    p b();

    @Override // uq.d
    void destroy();

    void f(p pVar);
}
