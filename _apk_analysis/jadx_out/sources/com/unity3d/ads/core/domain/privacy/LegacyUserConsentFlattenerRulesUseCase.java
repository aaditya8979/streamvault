package com.unity3d.ads.core.domain.privacy;

import cn.v;
import cn.w;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LegacyUserConsentFlattenerRulesUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LegacyUserConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    @NotNull
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(w.s("privacy", "unity", "pipl"), v.e("value"), w.s("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }
}
