package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Dd implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Tg f65153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H0 f65154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Md f65155c;

    public Dd(@NotNull Tg tg2, @NotNull H0 h02, @NotNull Md md2) {
        this.f65153a = tg2;
        this.f65154b = h02;
        this.f65155c = md2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@NotNull String str) {
        Tg tg2 = this.f65153a;
        H0 h02 = this.f65154b;
        String str2 = h02.f65299a;
        String str3 = h02.f65300b;
        Integer numValueOf = Integer.valueOf(h02.f65302d);
        H0 h03 = this.f65154b;
        Q3 q32 = new Q3(str2, str3, numValueOf, h03.f65303e, h03.f65301c);
        Md md2 = this.f65155c;
        EnumC4703cb enumC4703cb = md2.f65594b;
        G0 g02 = md2.f65593a;
        String str4 = g02.f65267c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(g02.f65270f.f65299a);
        Set set = AbstractC5232x9.f67933a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        N3 n32 = new N3("", "", enumC4703cb.f66524a, orCreatePublicLogger);
        if (str != null) {
            n32.f(str);
        }
        n32.f65800m = bundle;
        n32.f65790c = md2.f65593a.f65270f.f65304f;
        tg2.a(q32, n32, new C5053q4(new C4662am(), new C5028p4(), null));
    }
}
