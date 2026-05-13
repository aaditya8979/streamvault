package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.G0;
import io.appmetrica.analytics.impl.InterfaceC4687bl;
import io.appmetrica.analytics.impl.Jd;

/* JADX INFO: loaded from: classes7.dex */
public final class Jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sn.l f65441a;

    public Jd(Od od2) {
        this.f65441a = od2;
    }

    public static final InterfaceC4687bl a(G0 g02) {
        return new Hd(g02.f65270f.f65302d);
    }

    public static final InterfaceC4687bl b(G0 g02) {
        return new X();
    }

    public final Kd a(Context context, Tg tg2) {
        return new Kd(context, tg2, this.f65441a, new Sd() { // from class: mh.f
            @Override // io.appmetrica.analytics.impl.Sd
            public final InterfaceC4687bl a(G0 g02) {
                return Jd.a(g02);
            }
        }, EnumC4703cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final Kd b(Context context, Tg tg2) {
        return new Kd(context, tg2, this.f65441a, new Sd() { // from class: mh.e
            @Override // io.appmetrica.analytics.impl.Sd
            public final InterfaceC4687bl a(G0 g02) {
                return Jd.b(g02);
            }
        }, EnumC4703cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }
}
