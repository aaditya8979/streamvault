package com.ironsource;

import com.ironsource.Q6;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3958c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Q6.a f31094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList<String> f31095b = new ArrayList<>(new C3922a2().a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final S6 f31096c = new S6();

    public C3958c2(@Nullable Q6.a aVar) {
        this.f31094a = aVar;
    }

    private final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB = T6.b(jSONObject.optJSONObject(Q6.f30268u));
        if (jSONObjectB != null) {
            jSONObject.put(Q6.f30268u, jSONObjectB);
        }
        return jSONObject;
    }

    @NotNull
    public final JSONObject a() {
        Q6.a aVar = this.f31094a;
        JSONObject jSONObjectA = aVar != null ? this.f31096c.a(this.f31095b, aVar) : null;
        if (jSONObjectA == null) {
            jSONObjectA = this.f31096c.a(this.f31095b);
            tn.p.j(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return a(jSONObjectA);
    }
}
