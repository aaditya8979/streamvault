package com.ironsource;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class M5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<String> f29834a = new ArrayList<>(new L5().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final S6 f29835b = new S6();

    @NotNull
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f29835b.a(this.f29834a);
        tn.p.j(jSONObjectA, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return jSONObjectA;
    }
}
