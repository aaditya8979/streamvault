package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import cn.w;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public final class OmSdkInfo {
    private final byte impressionType;
    private final boolean isolateVerificationScripts;
    private final boolean omidEnabled;

    @NotNull
    private final String customReferenceData = "";

    @NotNull
    private final HashMap<String, String> macros = new HashMap<>();

    @NotNull
    private final List<AdVerification> adVerifications = w.m();

    public static /* synthetic */ void getImpressionType$annotations() {
    }

    @NotNull
    public final List<AdVerification> getAdVerifications() {
        return this.adVerifications;
    }

    @NotNull
    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public final byte getImpressionType() {
        return this.impressionType;
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    @NotNull
    public final HashMap<String, String> getMacros() {
        return this.macros;
    }

    public final boolean getOmidEnabled() {
        return this.omidEnabled;
    }
}
