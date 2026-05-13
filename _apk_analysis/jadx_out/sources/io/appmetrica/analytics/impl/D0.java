package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D0 {
    public static C6 a(Handler handler, C0 c02) {
        return new C6(handler, c02);
    }

    public static Cf a(Context context, C6 c62) {
        return new Cf(context, c62);
    }

    public static Pl a(Context context, C5241xi c5241xi, We we2, Handler handler) {
        return new Pl(c5241xi, new Xl(context, we2), handler);
    }

    public static C4731dd a(Context context) {
        return new C4731dd(C4696c4.l().f66453c.a(), C4696c4.l().b(context), "client_modules", new SystemTimeProvider());
    }

    public static C4914kg a(C5241xi c5241xi, We we2, Handler handler) {
        return new C4914kg(c5241xi, we2, handler, we2.s());
    }

    public static C4916ki a(Context context, Cf cf2, C5241xi c5241xi, Handler handler, Pl pl2) {
        return new C4916ki(context, cf2, c5241xi, handler, pl2);
    }

    public static C5241xi a(Cf cf2, Context context, ICommonExecutor iCommonExecutor) {
        C5024p0 c5024p0 = new C5024p0(context, iCommonExecutor);
        return new C5241xi(c5024p0, new Tn(new C4960mb()), new G4(cf2), new Zj(context, c5024p0));
    }
}
