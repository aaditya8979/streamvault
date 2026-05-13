package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.a3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y2 f8804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f8807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a3 f8809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f8810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f8811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f8812i;

    public MaxAdWaterfallInfoImpl(y2 y2Var, long j10, List<MaxNetworkResponseInfo> list, String str) {
        this(y2Var, y2Var.U(), y2Var.V(), j10, list, y2Var.N(), y2Var.T(), str, y2Var.Q());
    }

    public MaxAdWaterfallInfoImpl(@Nullable y2 y2Var, String str, String str2, long j10, List<MaxNetworkResponseInfo> list, a3 a3Var, List<String> list2, String str3, String str4) {
        this.f8804a = y2Var;
        this.f8805b = str;
        this.f8806c = str2;
        this.f8808e = j10;
        this.f8807d = list;
        this.f8809f = a3Var;
        this.f8810g = list2;
        this.f8811h = str3;
        this.f8812i = str4;
    }

    public String getEventId() {
        return this.f8812i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f8808e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f8804a;
    }

    public String getMCode() {
        return this.f8811h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f8805b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f8807d;
    }

    public List<String> getPostbackUrls() {
        return this.f8810g;
    }

    public a3 getRequestParameters() {
        return this.f8809f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f8806c;
    }

    @NonNull
    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f8805b + ", testName=" + this.f8806c + ", networkResponses=" + this.f8807d + ", latencyMillis=" + this.f8808e + '}';
    }
}
