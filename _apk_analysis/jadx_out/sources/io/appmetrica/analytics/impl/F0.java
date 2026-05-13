package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cb f65227a = new Cb(C4696c4.l().d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Db f65228b = new Db();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fb f65229c = new Fb();

    public static final void a(F0 f02, String str, String str2, String str3) {
        List list;
        Context contextA;
        Fb fb2 = f02.f65229c;
        fb2.getClass();
        Pair[] pairArr = new Pair[3];
        if (str == null) {
            str = "null";
        }
        pairArr[0] = bn.h.a(NotificationCompat.MessagingStyle.Message.KEY_SENDER, str);
        if (str2 == null) {
            str2 = "null";
        }
        pairArr[1] = bn.h.a("event", str2);
        if (str3 == null) {
            str3 = "null";
        }
        pairArr[2] = bn.h.a("payload", str3);
        Map<String, Object> mapO = kotlin.collections.a.o(pairArr);
        ModuleEvent.Builder builderWithName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (fb2) {
            if (fb2.f65244a == null && (contextA = C4696c4.l().f66457g.a()) != null) {
                fb2.f65244a = cn.w.p(new Qd(), new C4818gn(contextA), new Ko());
            }
            list = fb2.f65244a;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC5122t) it.next()).a(mapO);
            }
        }
        ModulesFacade.reportEvent(builderWithName.withAttributes(mapO).build());
    }

    public final void a(final String str, final String str2, final String str3) {
        Cb cb2 = this.f65227a;
        if (cb2.f65103c.a((Void) null).f67631a && cb2.f65104d.a(str).f67631a && cb2.f65105e.a(str2).f67631a && cb2.f65106f.a(str3).f67631a) {
            this.f65228b.getClass();
            ((A9) C4696c4.l().f66453c.a()).f64970b.post(new Runnable() { // from class: mh.c
                @Override // java.lang.Runnable
                public final void run() {
                    F0.a(this.f74254b, str, str2, str3);
                }
            });
            return;
        }
        String str4 = "Failed report event from sender: " + str + " with name = " + str2 + " and payload = " + str3;
        PublicLogger.INSTANCE.getAnonymousInstance().warning("[AppMetricaLibraryAdapterProxy]" + str4, new Object[0]);
    }
}
