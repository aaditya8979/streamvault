package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import cn.b0;
import cn.f0;
import cn.p0;
import cn.x;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import tn.p;
import zn.n;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f48818d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f48819e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> f48820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f48821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final bn.g f48822c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull Set<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> set, @NotNull com.moloco.sdk.acm.recorder.a aVar) {
        p.k(set, "eventHandlers");
        p.k(aVar, "metricsRecorder");
        this.f48820a = set;
        this.f48821b = aVar;
        this.f48822c = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e
            @Override // sn.a
            public final Object invoke() {
                return g.b(this.f48807b);
            }
        });
    }

    public static final Map b(g gVar) {
        Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> set = gVar.f48820a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            b0.F(arrayList, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) it.next()).a());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(p0.f(x.x(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            String str = (String) obj;
            Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> set2 = gVar.f48820a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : set2) {
                if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) obj2).a().contains(str)) {
                    arrayList2.add(obj2);
                }
            }
            linkedHashMap.put(obj, arrayList2);
        }
        return linkedHashMap;
    }

    public final Map<String, List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a>> a() {
        return (Map) this.f48822c.getValue();
    }

    public final void c(@NotNull String str) throws JSONException {
        com.moloco.sdk.acm.e eVar;
        String str2;
        String str3;
        com.moloco.sdk.acm.e eVar2;
        com.moloco.sdk.acm.e eVar3;
        com.moloco.sdk.internal.client_metrics_data.d dVar;
        p.k(str, "event");
        com.moloco.sdk.acm.e eVarC = this.f48821b.c(com.moloco.sdk.internal.client_metrics_data.e.f45996s.c());
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("event");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "CompositeEventHandler", "Event received: " + string, false, 4, null);
        List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> list = a().get(string);
        if (list == null || list.isEmpty()) {
            MolocoLogger.error$default(molocoLogger, "CompositeEventHandler", "Event not handled: " + string, null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar = this.f48821b;
            com.moloco.sdk.acm.b bVar = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.K.c());
            com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
            com.moloco.sdk.acm.b bVarE = bVar.e(dVar2.c(), "failure");
            com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.f45969b;
            com.moloco.sdk.acm.b bVarE2 = bVarE.e(dVar3.c(), "no_handler");
            p.h(string);
            aVar.b(bVarE2.e("event", string));
            this.f48821b.a(eVarC.f(dVar2.c(), "failure").f(dVar3.c(), "no_handler").f("event", string));
            return;
        }
        if (list.size() > 1) {
            eVar = eVarC;
            str2 = "failure";
            MolocoLogger.warn$default(molocoLogger, "CompositeEventHandler", "Found multiple event handlers for event: " + string + ", using first one", null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar2 = this.f48821b;
            com.moloco.sdk.acm.b bVarE3 = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.L.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), str2);
            p.h(string);
            aVar2.b(bVarE3.e("event", string));
        } else {
            eVar = eVarC;
            str2 = "failure";
        }
        com.moloco.sdk.acm.e eVarC2 = this.f48821b.c(com.moloco.sdk.internal.client_metrics_data.e.f45997t.c());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a aVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) f0.t0(list);
        try {
            aVar3.a(jSONObject);
            str3 = str2;
            eVar2 = eVarC2;
            try {
                MolocoLogger.info$default(molocoLogger, "CompositeEventHandler", "Event handled: " + string, null, false, 12, null);
                com.moloco.sdk.acm.recorder.a aVar4 = this.f48821b;
                p.h(string);
                com.moloco.sdk.acm.e eVarF = eVar2.f("event", string).f("handler", aVar3.b());
                dVar = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                aVar4.a(eVarF.f(dVar.c(), "success"));
                this.f48821b.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.K.c()).e(dVar.c(), "success").e("handler", aVar3.b()).e("event", string));
                eVar3 = eVar;
            } catch (Exception e10) {
                e = e10;
                eVar3 = eVar;
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "CompositeEventHandler", "Event handling failed: " + string, e, false, 8, null);
                com.moloco.sdk.acm.recorder.a aVar5 = this.f48821b;
                p.h(string);
                com.moloco.sdk.acm.e eVarF2 = eVar2.f("event", string).f("handler", aVar3.b());
                com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.f45969b;
                String strC = dVar4.c();
                String simpleName = e.getClass().getSimpleName();
                p.j(simpleName, "getSimpleName(...)");
                com.moloco.sdk.acm.e eVarF3 = eVarF2.f(strC, simpleName);
                com.moloco.sdk.internal.client_metrics_data.d dVar5 = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                String str4 = str3;
                aVar5.a(eVarF3.f(dVar5.c(), str4));
                com.moloco.sdk.acm.recorder.a aVar6 = this.f48821b;
                com.moloco.sdk.acm.b bVarE4 = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.K.c()).e(dVar5.c(), str4);
                String strC2 = dVar4.c();
                String simpleName2 = e.getClass().getSimpleName();
                p.j(simpleName2, "getSimpleName(...)");
                aVar6.b(bVarE4.e(strC2, simpleName2).e("handler", aVar3.b()).e("event", string));
                com.moloco.sdk.acm.recorder.a aVar7 = this.f48821b;
                com.moloco.sdk.acm.e eVarF4 = eVar3.f(dVar5.c(), str4);
                String strC3 = dVar4.c();
                String simpleName3 = e.getClass().getSimpleName();
                p.j(simpleName3, "getSimpleName(...)");
                aVar7.a(eVarF4.f(strC3, simpleName3).f("handler", aVar3.b()).f("event", string));
            }
            try {
                this.f48821b.a(eVar3.f(dVar.c(), "success").f("handler", aVar3.b()).f("event", string));
            } catch (Exception e11) {
                e = e11;
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "CompositeEventHandler", "Event handling failed: " + string, e, false, 8, null);
                com.moloco.sdk.acm.recorder.a aVar52 = this.f48821b;
                p.h(string);
                com.moloco.sdk.acm.e eVarF22 = eVar2.f("event", string).f("handler", aVar3.b());
                com.moloco.sdk.internal.client_metrics_data.d dVar42 = com.moloco.sdk.internal.client_metrics_data.d.f45969b;
                String strC4 = dVar42.c();
                String simpleName4 = e.getClass().getSimpleName();
                p.j(simpleName4, "getSimpleName(...)");
                com.moloco.sdk.acm.e eVarF32 = eVarF22.f(strC4, simpleName4);
                com.moloco.sdk.internal.client_metrics_data.d dVar52 = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                String str42 = str3;
                aVar52.a(eVarF32.f(dVar52.c(), str42));
                com.moloco.sdk.acm.recorder.a aVar62 = this.f48821b;
                com.moloco.sdk.acm.b bVarE42 = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.K.c()).e(dVar52.c(), str42);
                String strC22 = dVar42.c();
                String simpleName22 = e.getClass().getSimpleName();
                p.j(simpleName22, "getSimpleName(...)");
                aVar62.b(bVarE42.e(strC22, simpleName22).e("handler", aVar3.b()).e("event", string));
                com.moloco.sdk.acm.recorder.a aVar72 = this.f48821b;
                com.moloco.sdk.acm.e eVarF42 = eVar3.f(dVar52.c(), str42);
                String strC32 = dVar42.c();
                String simpleName32 = e.getClass().getSimpleName();
                p.j(simpleName32, "getSimpleName(...)");
                aVar72.a(eVarF42.f(strC32, simpleName32).f("handler", aVar3.b()).f("event", string));
            }
        } catch (Exception e12) {
            e = e12;
            str3 = str2;
            eVar2 = eVarC2;
        }
    }
}
