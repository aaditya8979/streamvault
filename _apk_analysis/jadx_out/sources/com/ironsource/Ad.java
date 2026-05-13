package com.ironsource;

import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, C4355yc> f28738a;

    public static final class a extends Lambda implements sn.l<String, Pair<? extends String, ? extends C4355yc>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f28739a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(1);
            this.f28739a = jSONObject;
        }

        @Override // sn.l
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<String, C4355yc> invoke(String str) throws JSONException {
            tn.p.j(str, "networkName");
            JSONObject jSONObject = this.f28739a.getJSONObject(str);
            tn.p.j(jSONObject, "providerSettings.getJSONObject(networkName)");
            return bn.h.a(str, new C4355yc(str, jSONObject));
        }
    }

    public Ad(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "providerSettings");
        Iterator<String> itKeys = jSONObject.keys();
        tn.p.j(itKeys, "providerSettings\n          .keys()");
        Map<String, C4355yc> mapV = kotlin.collections.a.v(SequencesKt___SequencesKt.K(ao.r.g(itKeys), new a(jSONObject)));
        this.f28738a = mapV;
        for (Map.Entry<String, C4355yc> entry : mapV.entrySet()) {
            entry.getKey();
            C4355yc value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final C4355yc a(C4355yc c4355yc) {
        return this.f28738a.get(c4355yc.h());
    }

    private final boolean b(C4355yc c4355yc) {
        return c4355yc.o() && c4355yc.l().length() > 0;
    }

    @NotNull
    public final Map<String, C4355yc> a() {
        return this.f28738a;
    }
}
