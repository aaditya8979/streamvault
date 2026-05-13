package com.ironsource;

import com.ironsource.mediationsdk.d;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4213q5 implements Kb<String, d.a> {
    @Override // com.ironsource.Kb
    @NotNull
    public d.a a(@NotNull String str) throws JSONException {
        tn.p.k(str, "input");
        d.a aVarA = com.ironsource.mediationsdk.d.b().a(IronSourceVideoBridge.jsonObjectInit(str));
        tn.p.j(aVarA, "getInstance().getAuction…sponse(JSONObject(input))");
        return aVarA;
    }
}
