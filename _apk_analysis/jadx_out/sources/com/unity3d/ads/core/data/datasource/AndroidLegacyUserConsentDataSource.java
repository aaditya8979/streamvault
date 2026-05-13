package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: AndroidLegacyUserConsentDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidLegacyUserConsentDataSource implements LegacyUserConsentDataSource {

    @NotNull
    private final FlattenerRulesUseCase flattenerRulesUseCase;

    @NotNull
    private final JsonStorage privateStorage;

    public AndroidLegacyUserConsentDataSource(@NotNull FlattenerRulesUseCase flattenerRulesUseCase, @NotNull JsonStorage jsonStorage) {
        p.k(flattenerRulesUseCase, "flattenerRulesUseCase");
        p.k(jsonStorage, "privateStorage");
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.privateStorage = jsonStorage;
    }

    @Override // com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource
    @Nullable
    public String getPrivacyData() {
        JSONObject jSONObjectFlattenJson;
        JSONObject data = this.privateStorage.getData();
        if (data == null || (jSONObjectFlattenJson = new JsonFlattener(data).flattenJson(".", this.flattenerRulesUseCase.invoke())) == null) {
            return null;
        }
        return jSONObjectFlattenJson.toString();
    }
}
