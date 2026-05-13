package com.unity3d.ads.core.domain.privacy;

import cn.v;
import cn.w;
import com.inmobi.sdk.InMobiSdk;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeveloperConsentFlattenerRulesUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DeveloperConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    @NotNull
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(w.s("privacy", InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, "pipl", "user"), v.e("value"), w.s("ts"));
    }
}
