package com.ironsource;

import com.ironsource.C3978d4;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class H0 implements Cif<JSONObject>, InterfaceC4043gf<F0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, C4270tc> f29483a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC4043gf
    public void a(@NotNull F0 f02) {
        tn.p.k(f02, "record");
        String strD = f02.d();
        Map<String, C4270tc> map = this.f29483a;
        C4270tc c4270tc = map.get(strD);
        if (c4270tc == null) {
            c4270tc = new C4270tc();
            map.put(strD, c4270tc);
        }
        c4270tc.a(f02.a(new G0()));
    }

    @Override // com.ironsource.InterfaceC4053h7
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull EnumC4061hf enumC4061hf) throws JSONException {
        tn.p.k(enumC4061hf, C3978d4.a.f31224t);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        for (Map.Entry<String, C4270tc> entry : this.f29483a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectA = entry.getValue().a(enumC4061hf);
            if (jSONObjectA.length() > 0) {
                jSONObjectJsonObjectInit.put(bo.d0.i1(key, "_", null, 2, null), jSONObjectA);
            }
        }
        return jSONObjectJsonObjectInit;
    }
}
