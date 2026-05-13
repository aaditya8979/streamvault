package com.unity3d.mediation.impression;

import java.text.DecimalFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class LevelPlayImpressionData {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";

    @NotNull
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f53513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final DecimalFormat f53514b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public LevelPlayImpressionData(@NotNull JSONObject jSONObject) {
        p.k(jSONObject, "allData");
        this.f53513a = jSONObject;
        this.f53514b = new DecimalFormat("#.#####");
    }

    @Nullable
    public final String getAb() {
        String strOptString = this.f53513a.optString("ab", "");
        p.j(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getAdFormat() {
        String strOptString = this.f53513a.optString("adFormat", "");
        p.j(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getAdNetwork() {
        String strOptString = this.f53513a.optString("adNetwork", "");
        p.j(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @NotNull
    public final JSONObject getAllData() {
        return this.f53513a;
    }

    @Nullable
    public final String getAuctionId() {
        String strOptString = this.f53513a.optString("auctionId", "");
        p.j(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getCountry() {
        String strOptString = this.f53513a.optString("country", "");
        p.j(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getCreativeId() {
        String strOptString = this.f53513a.optString("creativeId", "");
        p.j(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getEncryptedCPM() {
        String strOptString = this.f53513a.optString("encryptedCPM", "");
        p.j(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getInstanceId() {
        String strOptString = this.f53513a.optString("instanceId", "");
        p.j(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getInstanceName() {
        String strOptString = this.f53513a.optString("instanceName", "");
        p.j(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getMediationAdUnitId() {
        String strOptString = this.f53513a.optString("mediationAdUnitId", "");
        p.j(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getMediationAdUnitName() {
        String strOptString = this.f53513a.optString("mediationAdUnitName", "");
        p.j(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getPlacement() {
        String strOptString = this.f53513a.optString("placement", "");
        p.j(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final String getPrecision() {
        String strOptString = this.f53513a.optString("precision", "");
        p.j(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @Nullable
    public final Double getRevenue() {
        Double dValueOf = Double.valueOf(this.f53513a.optDouble("revenue"));
        if (Double.isNaN(dValueOf.doubleValue())) {
            return null;
        }
        return dValueOf;
    }

    @Nullable
    public final String getSegmentName() {
        String strOptString = this.f53513a.optString("segmentName", "");
        p.j(strOptString, "it");
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    @NotNull
    public String toString() {
        return "auctionId: '" + getAuctionId() + "', mediationAdUnitName: '" + getMediationAdUnitName() + "', mediationAdUnitId: '" + getMediationAdUnitId() + "', adFormat: '" + getAdFormat() + "', country: '" + getCountry() + "', ab: '" + getAb() + "', segmentName: '" + getSegmentName() + "', placement: '" + getPlacement() + "', adNetwork: '" + getAdNetwork() + "', instanceName: '" + getInstanceName() + "', instanceId: '" + getInstanceId() + "', revenue: " + (getRevenue() == null ? null : this.f53514b.format(getRevenue())) + ", precision: '" + getPrecision() + "', encryptedCPM: '" + getEncryptedCPM() + "', creativeId: '" + getCreativeId() + "'";
    }
}
