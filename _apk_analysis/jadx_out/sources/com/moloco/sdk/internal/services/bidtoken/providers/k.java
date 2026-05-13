package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MolocoPrivacy.PrivacySettings f47225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final s f47226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final d f47227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final u f47228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f47229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.o f47230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final o f47231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final f f47232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final a f47233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final q f47234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final y f47235l;

    public k(boolean z10, @NotNull MolocoPrivacy.PrivacySettings privacySettings, @NotNull s sVar, @NotNull d dVar, @NotNull u uVar, @NotNull h hVar, @NotNull com.moloco.sdk.internal.services.o oVar, @NotNull o oVar2, @NotNull f fVar, @NotNull a aVar, @NotNull q qVar, @NotNull y yVar) {
        tn.p.k(privacySettings, "privacySettings");
        tn.p.k(sVar, "memoryInfo");
        tn.p.k(dVar, "appDirInfo");
        tn.p.k(uVar, "networkInfoSignal");
        tn.p.k(hVar, "batteryInfoSignal");
        tn.p.k(oVar, "adDataSignal");
        tn.p.k(oVar2, "deviceSignal");
        tn.p.k(fVar, "audioSignal");
        tn.p.k(aVar, "accessibilitySignal");
        tn.p.k(qVar, "ilrdSignal");
        tn.p.k(yVar, "testConfigSignal");
        this.f47224a = z10;
        this.f47225b = privacySettings;
        this.f47226c = sVar;
        this.f47227d = dVar;
        this.f47228e = uVar;
        this.f47229f = hVar;
        this.f47230g = oVar;
        this.f47231h = oVar2;
        this.f47232i = fVar;
        this.f47233j = aVar;
        this.f47234k = qVar;
        this.f47235l = yVar;
    }

    @NotNull
    public final a a() {
        return this.f47233j;
    }

    @NotNull
    public final com.moloco.sdk.internal.services.o b() {
        return this.f47230g;
    }

    @NotNull
    public final d c() {
        return this.f47227d;
    }

    @NotNull
    public final f d() {
        return this.f47232i;
    }

    @NotNull
    public final h e() {
        return this.f47229f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f47224a == kVar.f47224a && tn.p.f(this.f47225b, kVar.f47225b) && tn.p.f(this.f47226c, kVar.f47226c) && tn.p.f(this.f47227d, kVar.f47227d) && tn.p.f(this.f47228e, kVar.f47228e) && tn.p.f(this.f47229f, kVar.f47229f) && tn.p.f(this.f47230g, kVar.f47230g) && tn.p.f(this.f47231h, kVar.f47231h) && tn.p.f(this.f47232i, kVar.f47232i) && tn.p.f(this.f47233j, kVar.f47233j) && tn.p.f(this.f47234k, kVar.f47234k) && tn.p.f(this.f47235l, kVar.f47235l);
    }

    @NotNull
    public final o f() {
        return this.f47231h;
    }

    @NotNull
    public final q g() {
        return this.f47234k;
    }

    @NotNull
    public final s h() {
        return this.f47226c;
    }

    public int hashCode() {
        return (((((((((((((((((((((Boolean.hashCode(this.f47224a) * 31) + this.f47225b.hashCode()) * 31) + this.f47226c.hashCode()) * 31) + this.f47227d.hashCode()) * 31) + this.f47228e.hashCode()) * 31) + this.f47229f.hashCode()) * 31) + this.f47230g.hashCode()) * 31) + this.f47231h.hashCode()) * 31) + this.f47232i.hashCode()) * 31) + this.f47233j.hashCode()) * 31) + this.f47234k.hashCode()) * 31) + this.f47235l.hashCode();
    }

    @NotNull
    public final u i() {
        return this.f47228e;
    }

    @NotNull
    public final MolocoPrivacy.PrivacySettings j() {
        return this.f47225b;
    }

    public final boolean k() {
        return this.f47224a;
    }

    @NotNull
    public final y l() {
        return this.f47235l;
    }

    @NotNull
    public String toString() {
        return "ClientSignals(sdkInitialized=" + this.f47224a + ", privacySettings=" + this.f47225b + ", memoryInfo=" + this.f47226c + ", appDirInfo=" + this.f47227d + ", networkInfoSignal=" + this.f47228e + ", batteryInfoSignal=" + this.f47229f + ", adDataSignal=" + this.f47230g + ", deviceSignal=" + this.f47231h + ", audioSignal=" + this.f47232i + ", accessibilitySignal=" + this.f47233j + ", ilrdSignal=" + this.f47234k + ", testConfigSignal=" + this.f47235l + ')';
    }
}
