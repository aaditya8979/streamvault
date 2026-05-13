package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class L implements JsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f68393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f68394b;

    /* JADX WARN: Multi-variable type inference failed */
    public L() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public L(@NotNull Y y10, @NotNull X x10) {
        this.f68393a = y10;
        this.f68394b = x10;
    }

    public /* synthetic */ L(Y y10, X x10, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new Y(null, null, null, 7, null) : y10, (i10 & 2) != 0 ? new X() : x10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J parse(@NotNull JSONObject jSONObject) {
        N n10;
        P p10;
        Q q10;
        boolean zExtractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC5311o.f68467a);
        Y y10 = this.f68393a;
        X x10 = this.f68394b;
        x10.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("screenshot");
        if (jSONObjectOptJSONObject == null) {
            q10 = new Q();
            q10.f68406a = new N();
            q10.f68407b = new P();
            O o10 = new O();
            o10.f68401c = AbstractC5311o.f68468b;
            q10.f68408c = o10;
        } else {
            Q q11 = new Q();
            x10.f68416a.getClass();
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("api_captor_config");
            O o11 = null;
            if (jSONObjectOptJSONObject2 == null) {
                n10 = null;
            } else {
                n10 = new N();
                Boolean boolOptBooleanOrNull = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject2, "enabled");
                if (boolOptBooleanOrNull != null) {
                    n10.f68397a = boolOptBooleanOrNull.booleanValue();
                }
            }
            if (n10 != null) {
                q11.f68406a = n10;
            }
            x10.f68417b.getClass();
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("service_captor_config");
            if (jSONObjectOptJSONObject3 == null) {
                p10 = null;
            } else {
                p10 = new P();
                Boolean boolOptBooleanOrNull2 = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject3, "enabled");
                if (boolOptBooleanOrNull2 != null) {
                    p10.f68403a = boolOptBooleanOrNull2.booleanValue();
                }
                Long lOptLongOrNull = JsonUtils.optLongOrNull(jSONObjectOptJSONObject3, "delay_seconds");
                if (lOptLongOrNull != null) {
                    p10.f68404b = lOptLongOrNull.longValue();
                }
            }
            if (p10 != null) {
                q11.f68407b = p10;
            }
            x10.f68418c.getClass();
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("content_observer_captor_config");
            if (jSONObjectOptJSONObject4 != null) {
                o11 = new O();
                Boolean boolOptBooleanOrNull3 = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject4, "enabled");
                if (boolOptBooleanOrNull3 != null) {
                    o11.f68399a = boolOptBooleanOrNull3.booleanValue();
                }
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("media_store_column_names");
                if (jSONArrayOptJSONArray != null) {
                    zn.i iVarV = zn.n.v(0, jSONArrayOptJSONArray.length());
                    ArrayList arrayList = new ArrayList(cn.x.x(iVarV, 10));
                    Iterator<Integer> it = iVarV.iterator();
                    while (it.hasNext()) {
                        arrayList.add(jSONArrayOptJSONArray.getString(((cn.k0) it).nextInt()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    o11.f68401c = (String[]) array;
                }
                Long lOptLongOrNull2 = JsonUtils.optLongOrNull(jSONObjectOptJSONObject4, "detect_window_seconds");
                if (lOptLongOrNull2 != null) {
                    o11.f68400b = lOptLongOrNull2.longValue();
                }
            }
            if (o11 != null) {
                q11.f68408c = o11;
            }
            q10 = q11;
        }
        return new J(zExtractFeature, y10.toModel(q10));
    }

    @Nullable
    public final J b(@NotNull JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
