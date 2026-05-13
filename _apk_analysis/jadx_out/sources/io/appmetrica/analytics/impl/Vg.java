package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.C4909kb;
import io.appmetrica.analytics.impl.Vg;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class Vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4687bl f66044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5010ob f66045c = new C5010ob();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5053q4 f66046d = new C5053q4(new C4662am(), new C5028p4(), null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Consumer f66047e;

    public Vg(Context context, final InterfaceC4749e6 interfaceC4749e6, final EnumC4703cb enumC4703cb, InterfaceC4687bl interfaceC4687bl) {
        this.f66043a = context;
        this.f66044b = interfaceC4687bl;
        this.f66047e = new Consumer() { // from class: mh.u
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Vg.a(enumC4703cb, interfaceC4749e6, this, (C4909kb) obj);
            }
        };
    }

    public static final void a(EnumC4703cb enumC4703cb, InterfaceC4749e6 interfaceC4749e6, Vg vg2, C4909kb c4909kb) {
        String str = c4909kb.f67116h;
        Q3 q32 = new Q3(str, c4909kb.f67113e, c4909kb.f67114f, c4909kb.f67115g, c4909kb.f67117i);
        String str2 = c4909kb.f67110b;
        byte[] bArr = c4909kb.f67109a;
        int i10 = c4909kb.f67111c;
        HashMap map = c4909kb.f67112d;
        String str3 = c4909kb.f67118j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = AbstractC5232x9.f67933a;
        N3 n32 = new N3(bArr, str2, enumC4703cb.f66524a, orCreatePublicLogger);
        n32.f65616q = map;
        n32.f65794g = i10;
        n32.f65790c = str3;
        ((Tg) interfaceC4749e6).a(q32, n32, vg2.f66046d);
    }
}
