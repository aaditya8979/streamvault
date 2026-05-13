package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.compose.runtime.internal.StabilityInferred;
import cn.v0;
import com.moloco.sdk.acm.e;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f48789a;

    public a(@NotNull com.moloco.sdk.acm.recorder.a aVar) {
        p.k(aVar, "metricsRecorder");
        this.f48789a = aVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public Set<String> a() {
        return v0.d("metric");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(@NotNull JSONObject jSONObject) throws JSONException {
        p.k(jSONObject, "event");
        String string = jSONObject.getString("event");
        String string2 = jSONObject.getString("metricName");
        String string3 = jSONObject.getString("type");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tags");
        String string4 = jSONObject.getString("value");
        if (p.f(string3, "counter")) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Count metric recorded: " + string2 + " = " + string4, false, 4, null);
            p.h(string2);
            com.moloco.sdk.acm.b bVar = new com.moloco.sdk.acm.b(string2);
            p.h(string4);
            bVar.d(Integer.parseInt(string4));
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                p.j(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    p.h(next);
                    String string5 = jSONObjectOptJSONObject.getString(next);
                    p.j(string5, "getString(...)");
                    bVar = bVar.e(next, string5);
                }
            }
            this.f48789a.b(bVar);
            return;
        }
        if (!p.f(string3, "timer")) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, b(), "Unknown event type: " + string, null, false, 12, null);
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Timer metric recorded: " + string2 + " = " + string4, false, 4, null);
        e.a aVar = com.moloco.sdk.acm.e.Companion;
        p.h(string2);
        com.moloco.sdk.acm.e eVarA = aVar.a(string2);
        p.h(string4);
        eVarA.g(Long.parseLong(string4));
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
            p.j(itKeys2, "keys(...)");
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                p.h(next2);
                String string6 = jSONObjectOptJSONObject.getString(next2);
                p.j(string6, "getString(...)");
                eVarA = eVarA.f(next2, string6);
            }
        }
        this.f48789a.a(eVarA);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    @NotNull
    public String b() {
        return "ACMHandler";
    }
}
