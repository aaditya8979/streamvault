package com.ironsource;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4064i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<String> f31908a = new ArrayList<>(new C4046h0().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final S6 f31909b = new S6();

    @NotNull
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f31909b.a(this.f31908a);
        tn.p.j(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAdQualityKeyList)");
        return jSONObjectA;
    }
}
