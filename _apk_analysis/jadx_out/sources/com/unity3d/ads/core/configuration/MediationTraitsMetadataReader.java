package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: MediationTraitsMetadataReader.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class MediationTraitsMetadataReader extends MetadataReader<JSONObject> {

    @NotNull
    public static final String BOLD_SDK_ENABLED = "boldSdkEnabled";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String MEDIATION_TRAITS = "mediation.traits.value";

    @NotNull
    public static final String USE_HTTP_CLIENT = "useHttpClient";

    /* JADX INFO: compiled from: MediationTraitsMetadataReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediationTraitsMetadataReader(@NotNull JsonStorage jsonStorage) {
        super(jsonStorage, MEDIATION_TRAITS);
        p.k(jsonStorage, "jsonStorage");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean getBooleanTrait(@org.jetbrains.annotations.NotNull java.lang.String r4) throws org.json.JSONException {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            tn.p.k(r4, r0)
            com.unity3d.services.core.misc.JsonStorage r0 = r3.getJsonStorage()
            java.lang.String r1 = r3.getKey()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.String r2 = "get(key)"
            tn.p.j(r0, r2)
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 != 0) goto L22
        L21:
            r0 = r1
        L22:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 == 0) goto L38
            boolean r2 = r0.has(r4)
            if (r2 == 0) goto L2d
            goto L2e
        L2d:
            r0 = r1
        L2e:
            if (r0 == 0) goto L38
            boolean r4 = r0.optBoolean(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.configuration.MediationTraitsMetadataReader.getBooleanTrait(java.lang.String):java.lang.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getStringTrait(@org.jetbrains.annotations.NotNull java.lang.String r4) throws org.json.JSONException {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            tn.p.k(r4, r0)
            com.unity3d.services.core.misc.JsonStorage r0 = r3.getJsonStorage()
            java.lang.String r1 = r3.getKey()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.String r2 = "get(key)"
            tn.p.j(r0, r2)
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 != 0) goto L22
        L21:
            r0 = r1
        L22:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 == 0) goto L34
            boolean r2 = r0.has(r4)
            if (r2 == 0) goto L2d
            goto L2e
        L2d:
            r0 = r1
        L2e:
            if (r0 == 0) goto L34
            java.lang.String r1 = r0.optString(r4)
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.configuration.MediationTraitsMetadataReader.getStringTrait(java.lang.String):java.lang.String");
    }
}
