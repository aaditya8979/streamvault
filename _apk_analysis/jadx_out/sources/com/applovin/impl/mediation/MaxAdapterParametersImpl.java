package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.impl.d5;
import com.applovin.impl.k3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f8814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f8815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f8816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f8817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f8818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f8819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f8821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f8822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f8823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MaxAdFormat f8824l;

    private MaxAdapterParametersImpl() {
    }

    public static MaxAdapterParametersImpl a(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a(d5Var);
        maxAdapterParametersImplA.f8813a = str;
        maxAdapterParametersImplA.f8824l = maxAdFormat;
        return maxAdapterParametersImplA;
    }

    public static MaxAdapterParametersImpl a(k3 k3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f8813a = k3Var.getAdUnitId();
        maxAdapterParametersImpl.f8817e = k3Var.n();
        maxAdapterParametersImpl.f8818f = k3Var.o();
        maxAdapterParametersImpl.f8819g = k3Var.d();
        maxAdapterParametersImpl.f8814b = k3Var.i();
        maxAdapterParametersImpl.f8815c = k3Var.l();
        maxAdapterParametersImpl.f8816d = k3Var.f();
        maxAdapterParametersImpl.f8820h = k3Var.p();
        return maxAdapterParametersImpl;
    }

    public static MaxAdapterParametersImpl a(y2 y2Var) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a((k3) y2Var);
        maxAdapterParametersImplA.f8821i = y2Var.R();
        maxAdapterParametersImplA.f8822j = y2Var.D();
        maxAdapterParametersImplA.f8823k = y2Var.C();
        return maxAdapterParametersImplA;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f8824l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f8813a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f8823k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f8822j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public String getConsentString() {
        return this.f8819g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f8816d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f8814b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f8815c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f8821i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean hasUserConsent() {
        return this.f8817e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isDoNotSell() {
        return this.f8818f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f8820h;
    }
}
