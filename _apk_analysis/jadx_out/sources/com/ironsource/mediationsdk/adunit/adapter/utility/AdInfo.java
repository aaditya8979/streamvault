package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.Bb;
import com.ironsource.C4228r4;
import com.ironsource.Z8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class AdInfo {

    @Nullable
    private final Z8 impressionData;

    @Nullable
    private final Bb loadArmData;

    public AdInfo(@Nullable Z8 z82, @Nullable Bb bb2) {
        this.impressionData = z82;
        this.loadArmData = bb2;
    }

    @NotNull
    public final String getAb() {
        Z8 z82 = this.impressionData;
        return (z82 == null || z82.a() == null) ? "" : this.impressionData.a();
    }

    @NotNull
    public final String getAdNetwork() {
        Z8 z82 = this.impressionData;
        return (z82 == null || z82.c() == null) ? "" : this.impressionData.c();
    }

    @NotNull
    public final String getAuctionId() {
        Z8 z82 = this.impressionData;
        return (z82 == null || z82.e() == null) ? "" : this.impressionData.e();
    }

    @NotNull
    public final String getCountry() {
        Z8 z82 = this.impressionData;
        return (z82 == null || z82.f() == null) ? "" : this.impressionData.f();
    }

    @NotNull
    public final String getEncryptedCPM() {
        Z8 z82 = this.impressionData;
        return (z82 == null || z82.h() == null) ? "" : this.impressionData.h();
    }

    @NotNull
    public final String getInstanceId() {
        Z8 z82 = this.impressionData;
        return (z82 == null || z82.i() == null) ? "" : this.impressionData.i();
    }

    @NotNull
    public final String getInstanceName() {
        Z8 z82 = this.impressionData;
        return (z82 == null || z82.j() == null) ? "" : this.impressionData.j();
    }

    @NotNull
    public final String getPrecision() {
        Bb bb2 = this.loadArmData;
        if (bb2 != null) {
            return bb2.c();
        }
        Z8 z82 = this.impressionData;
        return (z82 == null || z82.n() == null) ? "" : this.impressionData.n();
    }

    public final double getRevenue() {
        Bb bb2 = this.loadArmData;
        if (bb2 != null) {
            return bb2.d();
        }
        Z8 z82 = this.impressionData;
        if (z82 == null) {
            return 0.0d;
        }
        z82.o();
        return this.impressionData.o();
    }

    @NotNull
    public final String getSegmentName() {
        Z8 z82 = this.impressionData;
        return (z82 == null || z82.p() == null) ? "" : this.impressionData.p();
    }

    @NotNull
    public String toString() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("auctionId", getAuctionId());
            jSONObjectJsonObjectInit.put("country", getCountry());
            jSONObjectJsonObjectInit.put("ab", getAb());
            jSONObjectJsonObjectInit.put("segmentName", getSegmentName());
            jSONObjectJsonObjectInit.put("adNetwork", getAdNetwork());
            jSONObjectJsonObjectInit.put("instanceName", getInstanceName());
            jSONObjectJsonObjectInit.put("instanceId", getInstanceId());
            jSONObjectJsonObjectInit.put("revenue", getRevenue());
            jSONObjectJsonObjectInit.put("precision", getPrecision());
            jSONObjectJsonObjectInit.put("encryptedCPM", getEncryptedCPM());
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error("error while parsing ad info " + e10.getMessage());
        }
        String string = jSONObjectJsonObjectInit.toString();
        p.j(string, "adInfoData.toString()");
        return string;
    }
}
