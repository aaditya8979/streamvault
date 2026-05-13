package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3668pm extends AbstractC3876y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f27893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f27894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdConfig.VastVideoConfig f27895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Qm f27896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ml f27897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3694qn f27898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V3 f27899h;

    public C3668pm(String str, ArrayList arrayList, ArrayList arrayList2, AdConfig.VastVideoConfig vastVideoConfig, Qm qm2, Ml ml2, C3694qn c3694qn, V3 v32) {
        tn.p.k(str, "mediaDuration");
        tn.p.k(arrayList, "companionAds");
        tn.p.k(arrayList2, "mediaFiles");
        tn.p.k(vastVideoConfig, "vastVideoConfig");
        tn.p.k(qm2, "videoPlayerConfig");
        tn.p.k(ml2, "videoBeaconProcessor");
        tn.p.k(c3694qn, "videoTelemetryHelper");
        tn.p.k(v32, "companionTelemetryHelper");
        this.f27892a = str;
        this.f27893b = arrayList;
        this.f27894c = arrayList2;
        this.f27895d = vastVideoConfig;
        this.f27896e = qm2;
        this.f27897f = ml2;
        this.f27898g = c3694qn;
        this.f27899h = v32;
    }
}
