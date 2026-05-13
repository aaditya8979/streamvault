package com.ironsource;

import com.ironsource.C3978d4;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4270tc implements Cif<JSONObject>, InterfaceC4043gf<C4236rc> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, C4047h1> f34104a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC4043gf
    public void a(@NotNull C4236rc c4236rc) {
        tn.p.k(c4236rc, "record");
        String strC = c4236rc.c();
        Map<String, C4047h1> map = this.f34104a;
        C4047h1 c4047h1 = map.get(strC);
        if (c4047h1 == null) {
            c4047h1 = new C4047h1();
            map.put(strC, c4047h1);
        }
        c4047h1.a(c4236rc.a(new C4253sc()));
    }

    @Override // com.ironsource.InterfaceC4053h7
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull EnumC4061hf enumC4061hf) throws JSONException {
        tn.p.k(enumC4061hf, C3978d4.a.f31224t);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        for (Map.Entry<String, C4047h1> entry : this.f34104a.entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArrayA = entry.getValue().a(enumC4061hf);
            if (jSONArrayA.length() > 0) {
                jSONObjectJsonObjectInit.put(key, jSONArrayA);
            }
        }
        return jSONObjectJsonObjectInit;
    }
}
