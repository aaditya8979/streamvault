package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.bidder.adm.y f16292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.global.r f16293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f16295d;

    public c0(h0 h0Var, com.fyber.inneractive.sdk.bidder.adm.y yVar, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        this.f16295d = h0Var;
        this.f16292a = yVar;
        this.f16293b = rVar;
        this.f16294c = str;
    }

    public final void a() {
        com.fyber.inneractive.sdk.config.global.q qVar;
        com.fyber.inneractive.sdk.config.global.b bVar;
        com.fyber.inneractive.sdk.config.global.k kVar;
        com.fyber.inneractive.sdk.config.global.l lVar;
        com.fyber.inneractive.sdk.config.global.q qVar2;
        IAlog.a("%s : InneractiveAdSpotImpl markup data available", h0.a(this.f16295d));
        if (this.f16295d.f16409m.get()) {
            h0 h0Var = this.f16295d;
            p pVar = h0Var.f16408l;
            h0Var.a(h0Var.f16401e);
            return;
        }
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f16292a.f15828a;
        if (admParametersOuterClass$AdmParameters != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f16293b;
            List<AdmParametersOuterClass$AdmParameters.Experiment> abExperimentsList = admParametersOuterClass$AdmParameters.getAbExperimentsList();
            rVar.getClass();
            com.fyber.inneractive.sdk.config.global.a aVar = IAConfigManager.O.f15980z;
            aVar.getClass();
            for (com.fyber.inneractive.sdk.config.global.features.h hVar : rVar.f16058b.values()) {
                if (hVar != null && (lVar = aVar.f16024a) != null && (qVar2 = (com.fyber.inneractive.sdk.config.global.q) lVar.f16052a.get(hVar.f16039b)) != null) {
                    hVar.f16054a = qVar2.f16054a;
                }
            }
            if (abExperimentsList == null || abExperimentsList.size() <= 0) {
                return;
            }
            com.fyber.inneractive.sdk.config.global.a aVar2 = IAConfigManager.O.f15980z;
            aVar2.f16025b = rVar;
            for (com.fyber.inneractive.sdk.config.global.features.h hVar2 : rVar.f16058b.values()) {
                for (AdmParametersOuterClass$AdmParameters.Experiment experiment : abExperimentsList) {
                    String identifier = experiment.getIdentifier();
                    String variant = experiment.getVariant();
                    com.fyber.inneractive.sdk.config.global.l lVar2 = aVar2.f16024a;
                    if (lVar2 != null && (qVar = (com.fyber.inneractive.sdk.config.global.q) lVar2.f16052a.get(hVar2.f16039b)) != null && (bVar = (com.fyber.inneractive.sdk.config.global.b) qVar.f16056c.get(identifier)) != null) {
                        Iterator it = bVar.f16028c.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                kVar = (com.fyber.inneractive.sdk.config.global.k) it.next();
                                if (kVar.f16050b.equals(variant)) {
                                    break;
                                }
                            } else {
                                kVar = null;
                                break;
                            }
                        }
                        hVar2.f16040c.put(bVar.f16026a, bVar);
                        if (kVar != null) {
                            hVar2.f16041d.put(bVar.f16026a, kVar);
                        }
                    }
                }
            }
        }
    }

    public final void a(Exception exc, InneractiveErrorCode inneractiveErrorCode, com.fyber.inneractive.sdk.response.e... eVarArr) {
        if (this.f16295d.f16409m.get()) {
            IAlog.a("%s : onResponseDataError: spot is already destroyed won't continue", h0.a(this.f16295d));
            h0 h0Var = this.f16295d;
            p pVar = h0Var.f16408l;
            h0Var.a(h0Var.f16401e);
            return;
        }
        IAlog.a("%s : InneractiveAdSpotImpl data error", h0.a(this.f16295d));
        com.fyber.inneractive.sdk.response.e eVar = eVarArr.length > 0 ? eVarArr[0] : null;
        this.f16295d.getClass();
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode, exc.getCause() instanceof com.fyber.inneractive.sdk.response.nativead.a ? i.NATIVE_AD_PARSING_ERROR : i.ADM_FETCH_FAILED);
        e0 e0Var = this.f16295d.f16400d;
        if (e0Var != null) {
            e0Var.a(null, eVar, inneractiveInfrastructureError);
        }
        p pVar2 = this.f16295d.f16408l;
        if (pVar2 != null) {
            IAlog.e("%sgot handleFailedLoading! with: %s", pVar2.d(), inneractiveInfrastructureError);
            n nVar = pVar2.f16508b;
            if (nVar != null) {
                ((e0) nVar).a(null, eVar, inneractiveInfrastructureError);
            }
            if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() != i.NATIVE_AD_PARSING_ERROR) {
                pVar2.a(null, eVar);
            }
        }
        h0 h0Var2 = this.f16295d;
        String str = this.f16294c;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f16293b;
        h0Var2.getClass();
        int i10 = f0.f16392a[inneractiveErrorCode.ordinal()];
        com.fyber.inneractive.sdk.network.t tVar = (i10 == 1 || i10 == 2) ? com.fyber.inneractive.sdk.network.t.FATAL_ADM_MARKUP_FETCHING_ERROR : i10 != 3 ? com.fyber.inneractive.sdk.network.t.FATAL_ADM_PARSING_ERROR : com.fyber.inneractive.sdk.network.t.NATIVE_ERROR_INVALID_NATIVE_RESPONSE;
        if (eVar != null) {
            eVar.D = false;
        }
        String name = exc.getClass().getName();
        if (exc instanceof k1) {
            name = "NetworkStackException";
        }
        JSONArray jSONArrayB = rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.f17077b = tVar;
        wVar.f17076a = null;
        wVar.f17079d = jSONArrayB;
        com.fyber.inneractive.sdk.network.x xVar = new com.fyber.inneractive.sdk.network.x();
        xVar.a(name, "exception").a(exc.getLocalizedMessage() != null ? exc.getLocalizedMessage() : exc, "message");
        InneractiveErrorCode inneractiveErrorCode2 = InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD;
        if (inneractiveErrorCode == inneractiveErrorCode2 && exc.getCause() != null && exc.getCause().getCause() != null) {
            xVar.a(exc.getCause().getCause().getMessage(), "reason");
        } else if (inneractiveErrorCode != inneractiveErrorCode2) {
            xVar.a(str, "admPayload");
        }
        wVar.f17081f.put(xVar.f17083a);
        wVar.a((String) null);
    }
}
