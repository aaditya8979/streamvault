package com.applovin.shadow.okio;

import bn.d;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.n;
import tn.p;

/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class Okio__OkioKt {
    @NotNull
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    @NotNull
    public static final BufferedSink buffer(@NotNull Sink sink) {
        p.k(sink, "<this>");
        return new RealBufferedSink(sink);
    }

    @NotNull
    public static final BufferedSource buffer(@NotNull Source source) {
        p.k(source, "<this>");
        return new RealBufferedSource(source);
    }

    public static final <T extends Closeable, R> R use(T t10, @NotNull l<? super T, ? extends R> lVar) throws Throwable {
        R rInvoke;
        p.k(lVar, "block");
        Throwable th2 = null;
        try {
            rInvoke = lVar.invoke(t10);
            n.b(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            n.a(1);
        } catch (Throwable th4) {
            n.b(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th5) {
                    d.a(th4, th5);
                }
            }
            n.a(1);
            th2 = th4;
            rInvoke = null;
        }
        if (th2 != null) {
            throw th2;
        }
        p.h(rInvoke);
        return rInvoke;
    }
}
