package com.moloco.sdk.publisher.privacy;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class MolocoPrivacy {

    @NotNull
    public static final MolocoPrivacy INSTANCE = new MolocoPrivacy();

    @NotNull
    private static PrivacySettings privacySettings = new PrivacySettings((Boolean) null, (Boolean) null, (Boolean) null, 7, (i) null);
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    public static final class PrivacySettings {
        public static final int $stable = 8;

        @Nullable
        private String TCFConsent;

        @NotNull
        private String _usPrivacy;

        @Nullable
        private final Boolean isAgeRestrictedUser;

        @Nullable
        private final Boolean isDoNotSell;

        @Nullable
        private final Boolean isUserConsent;

        public PrivacySettings() {
            this((Boolean) null, (Boolean) null, (Boolean) null, 7, (i) null);
        }

        public PrivacySettings(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
            this.isUserConsent = bool;
            this.isAgeRestrictedUser = bool2;
            this.isDoNotSell = bool3;
            this._usPrivacy = getUSPrivacy(bool3);
        }

        public /* synthetic */ PrivacySettings(Boolean bool, Boolean bool2, Boolean bool3, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, (i10 & 4) != 0 ? null : bool3);
        }

        public PrivacySettings(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str, @Nullable String str2) {
            this(bool, bool2, bool3);
            this.TCFConsent = str;
            if (str2 != null) {
                this._usPrivacy = str2;
            }
        }

        private final String getUSPrivacy(Boolean bool) {
            return bool == null ? "1---" : p.f(bool, Boolean.TRUE) ? "1-Y-" : "1-N-";
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrivacySettings)) {
                return false;
            }
            PrivacySettings privacySettings = (PrivacySettings) obj;
            return p.f(this.isUserConsent, privacySettings.isUserConsent) && p.f(this.isAgeRestrictedUser, privacySettings.isAgeRestrictedUser) && p.f(this.isDoNotSell, privacySettings.isDoNotSell) && p.f(this.TCFConsent, privacySettings.TCFConsent);
        }

        @Nullable
        public final String getTCFConsent() {
            return this.TCFConsent;
        }

        @NotNull
        public final String getUsPrivacy() {
            return this._usPrivacy;
        }

        public int hashCode() {
            Boolean bool = this.isUserConsent;
            int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
            Boolean bool2 = this.isAgeRestrictedUser;
            int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Boolean bool3 = this.isDoNotSell;
            int iHashCode3 = (iHashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            String str = this.TCFConsent;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @Nullable
        public final Boolean isAgeRestrictedUser() {
            return this.isAgeRestrictedUser;
        }

        @Nullable
        public final Boolean isDoNotSell() {
            return this.isDoNotSell;
        }

        @Nullable
        public final Boolean isUserConsent() {
            return this.isUserConsent;
        }
    }

    private MolocoPrivacy() {
    }

    public static final void setPrivacy(@NotNull PrivacySettings privacySettings2) {
        p.k(privacySettings2, "privacySettings");
        privacySettings = privacySettings2;
    }

    @NotNull
    public final PrivacySettings getPrivacySettings() {
        return privacySettings;
    }

    public final void setPrivacySettings(@NotNull PrivacySettings privacySettings2) {
        p.k(privacySettings2, "<set-?>");
        privacySettings = privacySettings2;
    }
}
