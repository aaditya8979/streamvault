package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4779fa {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C4779fa f66768d = new C4779fa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5136td f66769a = new C5136td();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ServiceComponentsInitializer f66770b = AbstractC4712ck.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f66771c = false;

    public static C4731dd a() {
        C4944lk c4944lk = C5009oa.I.f67421d;
        if (c4944lk.f67241b == null) {
            synchronized (c4944lk) {
                if (c4944lk.f67241b == null) {
                    c4944lk.f67240a.getClass();
                    HandlerThreadC4729db handlerThreadC4729dbA = A9.a("IAA-SC");
                    c4944lk.f67241b = new A9(handlerThreadC4729dbA, handlerThreadC4729dbA.getLooper(), new Handler(handlerThreadC4729dbA.getLooper()));
                }
            }
        }
        return new C4731dd(c4944lk.f67241b, C5009oa.I.y(), "service_modules", new SystemTimeProvider());
    }

    public final void a(Context context) {
        C4705cd c4705cd;
        C5009oa.a(context);
        this.f66770b.onCreate(context);
        this.f66769a.getClass();
        List<String> listA = C5009oa.I.f67436s.a();
        ArrayList arrayList = new ArrayList(cn.x.x(listA, 10));
        for (String str : listA) {
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor == null) {
                c4705cd = new C4705cd(str, false);
            } else {
                C5009oa.I.p().a((ModuleServiceEntryPoint<Object>) objLoadAndInstantiateClassWithDefaultConstructor);
                c4705cd = new C4705cd(str, true);
            }
            arrayList.add(c4705cd);
        }
        new C5019ok(C5009oa.I.D().f65062d).a(context);
        xo xoVar = C5009oa.I.D().f65061c;
        synchronized (xoVar) {
            xoVar.f67993a.a();
        }
        C5009oa.I.q().a();
        a().a(arrayList);
    }

    public final void b(Context context) {
        if (this.f66771c) {
            return;
        }
        synchronized (this) {
            if (!this.f66771c) {
                a(context);
                this.f66771c = true;
            }
        }
    }
}
