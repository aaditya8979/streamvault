package com.unity3d.ads.core.configuration;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.configuration.ConfigurationReader;
import go.l;
import go.v;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: CommonAlternativeFlowReader.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class CommonAlternativeFlowReader implements AlternativeFlowReader {

    @NotNull
    private final ConfigurationReader configurationReader;

    @NotNull
    private final l<Boolean> isAlternativeFlowEnabled;

    @NotNull
    private final l<Boolean> isAlternativeFlowRead;

    @NotNull
    private final MediationTraitsMetadataReader mediationMetadataReader;

    @NotNull
    private final SessionRepository sessionRepository;

    public CommonAlternativeFlowReader(@NotNull ConfigurationReader configurationReader, @NotNull SessionRepository sessionRepository, @NotNull MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        p.k(configurationReader, "configurationReader");
        p.k(sessionRepository, "sessionRepository");
        p.k(mediationTraitsMetadataReader, "mediationMetadataReader");
        this.configurationReader = configurationReader;
        this.sessionRepository = sessionRepository;
        this.mediationMetadataReader = mediationTraitsMetadataReader;
        this.isAlternativeFlowRead = v.a(Boolean.FALSE);
        this.isAlternativeFlowEnabled = v.a(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    @Override // com.unity3d.ads.core.configuration.AlternativeFlowReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean invoke() throws org.json.JSONException {
        /*
            r4 = this;
            go.l<java.lang.Boolean> r0 = r4.isAlternativeFlowRead
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1b
            go.l<java.lang.Boolean> r0 = r4.isAlternativeFlowEnabled
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1b:
            com.unity3d.ads.core.configuration.MediationTraitsMetadataReader r0 = r4.mediationMetadataReader
            com.unity3d.services.core.misc.JsonStorage r1 = r0.getJsonStorage()
            java.lang.String r0 = r0.getKey()
            java.lang.Object r0 = r1.get(r0)
            r1 = 0
            if (r0 == 0) goto L39
            java.lang.String r2 = "get(key)"
            tn.p.j(r0, r2)
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L36
            goto L37
        L36:
            r0 = r1
        L37:
            if (r0 != 0) goto L3a
        L39:
            r0 = r1
        L3a:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 == 0) goto L5d
            java.lang.String r2 = "boldSdkEnabled"
            boolean r3 = r0.has(r2)
            if (r3 == 0) goto L47
            r1 = r0
        L47:
            if (r1 == 0) goto L5d
            go.l<java.lang.Boolean> r0 = r4.isAlternativeFlowEnabled
            boolean r1 = r1.optBoolean(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            go.l<java.lang.Boolean> r0 = r4.isAlternativeFlowRead
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
        L5d:
            go.l<java.lang.Boolean> r0 = r4.isAlternativeFlowRead
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto La1
            com.unity3d.services.core.configuration.ConfigurationReader r0 = r4.configurationReader
            com.unity3d.services.core.configuration.Configuration r0 = r0.getCurrentConfiguration()
            com.unity3d.services.core.configuration.IExperiments r0 = r0.getExperiments()
            boolean r0 = r0.isBoldSdkNextSessionEnabled()
            if (r0 != 0) goto L83
            go.l<java.lang.Boolean> r0 = r4.isAlternativeFlowEnabled
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            goto L9a
        L83:
            go.l<java.lang.Boolean> r0 = r4.isAlternativeFlowEnabled
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r4.sessionRepository
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r1 = r1.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$FeatureFlags r1 = r1.getFeatureFlags()
            boolean r1 = r1.getBoldSdkNextSessionEnabled()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
        L9a:
            go.l<java.lang.Boolean> r0 = r4.isAlternativeFlowRead
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
        La1:
            go.l<java.lang.Boolean> r0 = r4.isAlternativeFlowEnabled
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.configuration.CommonAlternativeFlowReader.invoke():boolean");
    }
}
