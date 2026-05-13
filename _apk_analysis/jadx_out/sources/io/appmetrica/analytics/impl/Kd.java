package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.Kd;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Kd implements NativeCrashHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sn.l f65481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f65482b = C5009oa.k().w().d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Nd f65483c;

    public Kd(@NotNull Context context, @NotNull Tg tg2, @NotNull sn.l<? super String, bn.r> lVar, @NotNull Sd sd2, @NotNull EnumC4703cb enumC4703cb, @NotNull String str) {
        this.f65481a = lVar;
        this.f65483c = new Nd(context, tg2, sd2, enumC4703cb);
    }

    public static final void a(Kd kd2, NativeCrash nativeCrash, File file) {
        kd2.f65481a.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(@NotNull final NativeCrash nativeCrash) {
        G0 g02;
        C4650aa c4650aa;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String str = nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            H0 h0A = I0.a(nativeCrash.getMetadata());
            tn.p.h(h0A);
            g02 = new G0(source, handlerVersion, str, dumpFile, creationTime, h0A);
        } catch (Throwable unused) {
            g02 = null;
        }
        if (g02 == null) {
            this.f65481a.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
            return;
        }
        LoggerStorage.getOrCreatePublicLogger(g02.f65270f.f65299a).info("Detected native crash with uuid = " + g02.f65267c, new Object[0]);
        IHandlerExecutor iHandlerExecutor = this.f65482b;
        Nd nd2 = this.f65483c;
        Consumer consumer = new Consumer() { // from class: mh.j
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Kd.a(this.f74269a, nativeCrash, (File) obj);
            }
        };
        nd2.getClass();
        Gd gd2 = new Gd(new Id(g02.f65265a, g02.f65266b), nd2.f65645f);
        Dd dd2 = new Dd(nd2.f65641b, g02.f65270f, new Md(g02, nd2.f65643d));
        C4676ba c4676ba = nd2.f65644e;
        String str2 = g02.f65268d;
        c4676ba.getClass();
        File file = new File(str2);
        Context context = nd2.f65640a;
        if (C4650aa.f66359c == null) {
            synchronized (tn.t.b(C4650aa.class)) {
                if (C4650aa.f66359c == null) {
                    C4650aa.f66359c = new C4650aa(context);
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        C4650aa c4650aa2 = C4650aa.f66359c;
        if (c4650aa2 == null) {
            tn.p.C("INSTANCE");
            c4650aa = null;
        } else {
            c4650aa = c4650aa2;
        }
        iHandlerExecutor.execute(new Uf(file, gd2, consumer, dd2, c4650aa, nd2.f65642c.a(g02)));
    }
}
