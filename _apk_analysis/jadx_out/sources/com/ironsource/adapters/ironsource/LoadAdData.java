package com.ironsource.adapters.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
public final class LoadAdData {

    @NotNull
    private final JSONObject localAdData;

    /* JADX WARN: Multi-variable type inference failed */
    public LoadAdData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public LoadAdData(@Nullable JSONObject jSONObject) {
        this.localAdData = jSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObject;
    }

    public /* synthetic */ LoadAdData(JSONObject jSONObject, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : jSONObject);
    }

    @Nullable
    public final String adUnitId() {
        String strOptString = this.localAdData.optString("adUnitId");
        p.j(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final boolean isMultipleAdObjectsFlow() {
        return this.localAdData.optBoolean("isMultipleAdUnits", false);
    }
}
