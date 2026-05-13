package io.bidmachine;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.core.Utils;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.IUserRestrictionsParams;
import io.bidmachine.protobuf.RegsCcpaExtension;
import io.bidmachine.protobuf.sdk.User;
import java.util.List;

/* JADX INFO: compiled from: UserRestrictionParams.java */
/* JADX INFO: loaded from: classes4.dex */
public final class w5 implements IUserRestrictionsParams<w5>, DataRestrictions {

    @Nullable
    private String gdprConsentString;

    @Nullable
    private List<Integer> gppIds;

    @Nullable
    private String gppString;

    @Nullable
    private Boolean hasConsent;

    @Nullable
    private Boolean hasCoppa;

    @Nullable
    private Boolean subjectToGDPR;

    @Nullable
    private String usPrivacyString;

    @Nullable
    private String getGDPRString() {
        z3 iabSharedPreference = j2.get().getIabSharedPreference();
        return (String) Utils.oneOf(this.gdprConsentString, iabSharedPreference.getTcfTcString(), iabSharedPreference.getGDPRConsentString());
    }

    private boolean hasCoppa() {
        Boolean bool = this.hasCoppa;
        return bool != null && bool.booleanValue();
    }

    private boolean subjectToGDPR() {
        z3 iabSharedPreference = j2.get().getIabSharedPreference();
        Boolean bool = (Boolean) Utils.oneOf(this.subjectToGDPR, iabSharedPreference.getTcfGdprApplies(), iabSharedPreference.getSubjectToGDPR());
        return bool != null && bool.booleanValue();
    }

    public void build(@NonNull Context.Regs.Builder builder) {
        builder.setCoppa(hasCoppa());
        builder.setGdpr(subjectToGDPR());
        String uSPrivacyString = getUSPrivacyString();
        if (!TextUtils.isEmpty(uSPrivacyString)) {
            builder.addExtProto(Any.pack(RegsCcpaExtension.newBuilder().setUsPrivacy(uSPrivacyString).build()));
        }
        String gPPString = getGPPString();
        if (!TextUtils.isEmpty(gPPString)) {
            builder.setGpp(gPPString);
        }
        List<Integer> gPPIds = getGPPIds();
        if (Utils.isEmpty(gPPIds)) {
            return;
        }
        builder.addAllGppSid(gPPIds);
    }

    public void build(@NonNull Context.User.Builder builder) {
        builder.setConsent(getIABGDPRString());
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean canSendBmIfv() {
        return !hasCoppa();
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean canSendDeviceInfo() {
        return !hasCoppa();
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean canSendGeoPosition() {
        return (hasCoppa() || isUserGdprProtected()) ? false : true;
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean canSendIfa() {
        return (hasCoppa() || isUserGdprProtected()) ? false : true;
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean canSendUserInfo() {
        return (hasCoppa() || isUserGdprProtected()) ? false : true;
    }

    public void fill(@NonNull User.Builder builder) {
        builder.setCoppa(hasCoppa());
        builder.setGdpr(subjectToGDPR());
        builder.setConsent(getIABGDPRString());
        String uSPrivacyString = getUSPrivacyString();
        if (!TextUtils.isEmpty(uSPrivacyString)) {
            builder.setCcpa(uSPrivacyString);
        }
        String gPPString = getGPPString();
        if (!TextUtils.isEmpty(gPPString)) {
            builder.setGpp(gPPString);
        }
        List<Integer> gPPIds = getGPPIds();
        if (Utils.isEmpty(gPPIds)) {
            return;
        }
        builder.addAllGppSid(gPPIds);
    }

    @Override // io.bidmachine.models.DataRestrictions
    @Nullable
    public List<Integer> getGPPIds() {
        return (List) Utils.oneOf(this.gppIds, j2.get().getIabSharedPreference().getGPPIds());
    }

    @Override // io.bidmachine.models.DataRestrictions
    @Nullable
    public String getGPPString() {
        return (String) Utils.oneOf(this.gppString, j2.get().getIabSharedPreference().getGPPString());
    }

    @Override // io.bidmachine.models.DataRestrictions
    @NonNull
    public String getIABGDPRString() {
        String gDPRString = getGDPRString();
        return TextUtils.isEmpty(gDPRString) ? hasConsent() ? "1" : "0" : gDPRString;
    }

    @Override // io.bidmachine.models.DataRestrictions
    @Nullable
    public String getUSPrivacyString() {
        return (String) Utils.oneOf(this.usPrivacyString, j2.get().getIabSharedPreference().getUSPrivacyString());
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean hasConsent() {
        Boolean bool = this.hasConsent;
        return bool != null && bool.booleanValue();
    }

    @VisibleForTesting
    public boolean hasFusedConsent() {
        return hasConsent() || !TextUtils.isEmpty(getGDPRString());
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean isUserAgeRestricted() {
        return hasCoppa();
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean isUserGdprProtected() {
        return subjectToGDPR() && !hasFusedConsent();
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean isUserHasCcpaConsent() {
        String uSPrivacyString = getUSPrivacyString();
        if (uSPrivacyString != null && uSPrivacyString.length() == 4 && uSPrivacyString.charAt(0) == '1') {
            return uSPrivacyString.charAt(2) == 'N' || uSPrivacyString.charAt(2) == 'n';
        }
        return false;
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean isUserHasConsent() {
        return hasFusedConsent();
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean isUserInCcpaScope() {
        String uSPrivacyString = getUSPrivacyString();
        return uSPrivacyString != null && uSPrivacyString.length() == 4 && uSPrivacyString.charAt(0) == '1' && !uSPrivacyString.contains("---");
    }

    @Override // io.bidmachine.models.DataRestrictions
    public boolean isUserInGdprScope() {
        return subjectToGDPR();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.IUserRestrictionsParams
    @NonNull
    public w5 setConsentConfig(boolean z10, @Nullable String str) {
        this.gdprConsentString = str;
        this.hasConsent = Boolean.valueOf(z10);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.IUserRestrictionsParams
    @NonNull
    public w5 setCoppa(@Nullable Boolean bool) {
        this.hasCoppa = bool;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.IUserRestrictionsParams
    @NonNull
    public w5 setGPP(@Nullable String str, @Nullable List<Integer> list) {
        this.gppString = str;
        this.gppIds = list;
        return this;
    }

    @Override // io.bidmachine.models.IUserRestrictionsParams
    @NonNull
    public /* bridge */ /* synthetic */ w5 setGPP(@Nullable String str, @Nullable List list) {
        return setGPP(str, (List<Integer>) list);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.IUserRestrictionsParams
    @NonNull
    public w5 setSubjectToGDPR(@Nullable Boolean bool) {
        this.subjectToGDPR = bool;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.models.IUserRestrictionsParams
    @NonNull
    public w5 setUSPrivacyString(@Nullable String str) {
        this.usPrivacyString = str;
        return this;
    }
}
