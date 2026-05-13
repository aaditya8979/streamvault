package com.moloco.sdk.publisher.privacy;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.compose.runtime.internal.StabilityInferred;
import bo.d0;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.z3;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class InternalMolocoPrivacySettingsImpl implements InternalMolocoPrivacySettings {
    public static final int $stable = 8;

    @NotNull
    private final Context context;

    public InternalMolocoPrivacySettingsImpl(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
    }

    private final Boolean gdprApplies(Context context) {
        Boolean bool;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (!defaultSharedPreferences.contains("IABTCF_gdprApplies")) {
            return null;
        }
        try {
            int i10 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", 0);
            if (i10 == 0) {
                bool = Boolean.FALSE;
            } else {
                if (i10 != 1) {
                    return null;
                }
                bool = Boolean.TRUE;
            }
            return bool;
        } catch (ClassCastException unused) {
            return Boolean.valueOf(defaultSharedPreferences.getBoolean("IABTCF_gdprApplies", false));
        }
    }

    private final String getTCFConsent(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("IABTCF_TCString", null);
        if (string == null || d0.u0(string)) {
            return null;
        }
        return string;
    }

    private final String getUSPrivacyConsentString(Context context, String str) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString(z3.IAB_US_PRIVACY_STRING, null);
        return (string == null || d0.u0(string)) ? str : string;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettings
    @NotNull
    public MolocoPrivacy.PrivacySettings getUpdatedPrivacySettings(@NotNull MolocoPrivacy.PrivacySettings privacySettings) {
        p.k(privacySettings, "privacySettings");
        Boolean boolGdprApplies = gdprApplies(this.context);
        if (boolGdprApplies == null) {
            boolGdprApplies = privacySettings.isUserConsent();
        }
        return new MolocoPrivacy.PrivacySettings(boolGdprApplies, privacySettings.isAgeRestrictedUser(), privacySettings.isDoNotSell(), getTCFConsent(this.context), getUSPrivacyConsentString(this.context, privacySettings.getUsPrivacy()));
    }
}
