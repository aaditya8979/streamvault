package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.C3784ue;
import com.inmobi.media.ads.network.common.model.LandingPageParam;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.Link;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3784ue extends AbstractC3869y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3738si f28260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sg f28261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D4 f28262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC3371e1 f28263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Nc f28264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ec f28265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p000do.l0 f28266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bn.g f28267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bn.g f28268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final bn.g f28269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bn.g f28270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bn.g f28271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bn.g f28272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bn.g f28273o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bn.g f28274p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3784ue(C3738si c3738si, Sg sg2, D4 d42, AbstractC3371e1 abstractC3371e1, Nc nc2, Ec ec2) {
        super(ec2.f25379a);
        tn.p.k(c3738si, "renderedStateCache");
        tn.p.k(sg2, "publisherNativeViewData");
        tn.p.k(d42, "contextualDataHandler");
        tn.p.k(abstractC3371e1, "adSessionManager");
        tn.p.k(nc2, "nativeBeaconProcessor");
        tn.p.k(ec2, "nativeAdUnitComponent");
        this.f28260b = c3738si;
        this.f28261c = sg2;
        this.f28262d = d42;
        this.f28263e = abstractC3371e1;
        this.f28264f = nc2;
        this.f28265g = ec2;
        this.f28266h = P4.a(k());
        this.f28267i = kotlin.b.b(new sn.a() { // from class: n9.na
            @Override // sn.a
            public final Object invoke() {
                return C3784ue.g(this.f75527b);
            }
        });
        this.f28268j = kotlin.b.b(new sn.a() { // from class: n9.oa
            @Override // sn.a
            public final Object invoke() {
                return C3784ue.c(this.f75549b);
            }
        });
        this.f28269k = kotlin.b.b(new sn.a() { // from class: n9.pa
            @Override // sn.a
            public final Object invoke() {
                return C3784ue.e(this.f75573b);
            }
        });
        this.f28270l = kotlin.b.b(new sn.a() { // from class: n9.qa
            @Override // sn.a
            public final Object invoke() {
                return C3784ue.h(this.f75591b);
            }
        });
        this.f28271m = kotlin.b.b(new sn.a() { // from class: n9.ra
            @Override // sn.a
            public final Object invoke() {
                return C3784ue.b(this.f75603b);
            }
        });
        this.f28272n = kotlin.b.b(new sn.a() { // from class: n9.sa
            @Override // sn.a
            public final Object invoke() {
                return C3784ue.a(this.f75616b);
            }
        });
        this.f28273o = kotlin.b.b(new sn.a() { // from class: n9.ta
            @Override // sn.a
            public final Object invoke() {
                return C3784ue.f(this.f75631b);
            }
        });
        this.f28274p = kotlin.b.b(new sn.a() { // from class: n9.ua
            @Override // sn.a
            public final Object invoke() {
                return C3784ue.d(this.f75649b);
            }
        });
    }

    public static final C3614ni a(C3784ue c3784ue) {
        return new C3614ni(c3784ue.f28262d, c3784ue.f28263e, c3784ue.f28265g);
    }

    public static final Sc b(C3784ue c3784ue) {
        Ec ec2 = c3784ue.f28265g;
        AbstractC3371e1 abstractC3371e1 = c3784ue.f28263e;
        D4 d42 = c3784ue.f28262d;
        Nc nc2 = c3784ue.f28264f;
        C3509jd c3509jd = (C3509jd) c3784ue.f28274p.getValue();
        InterfaceC3580m9 interfaceC3580m9L = c3784ue.l();
        tn.p.k(ec2, "<this>");
        tn.p.k(abstractC3371e1, "clickSession");
        tn.p.k(d42, "contextualDataHandler");
        tn.p.k(nc2, "nativeBeaconProcessor");
        tn.p.k(c3509jd, "nativeLandingPageHandler");
        tn.p.k(ec2, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonAssetObject assetsObject = ec2.f25380b.getAssetsObject();
        if (assetsObject != null) {
            Title title = assetsObject.getTitle();
            if (title != null) {
                Link link = title.getLink();
                linkedHashMap.put((short) 3, new Kc(link != null ? link.getUrl() : null, title.getTrackers()));
            }
            Description description = assetsObject.getDescription();
            if (description != null) {
                Link link2 = description.getLink();
                linkedHashMap.put((short) 4, new Kc(link2 != null ? link2.getUrl() : null, description.getTrackers()));
            }
            Icon icon = assetsObject.getIcon();
            if (icon != null) {
                Link link3 = icon.getLink();
                linkedHashMap.put((short) 5, new Kc(link3 != null ? link3.getUrl() : null, icon.getTrackers()));
            }
            CTA cta = assetsObject.getCta();
            if (cta != null) {
                Link link4 = cta.getLink();
                linkedHashMap.put((short) 6, new Kc(link4 != null ? link4.getUrl() : null, cta.getTrackers()));
            }
            Image adChoice = assetsObject.getAdChoice();
            if (adChoice != null) {
                Link link5 = adChoice.getLink();
                linkedHashMap.put((short) 7, new Kc(link5 != null ? link5.getUrl() : null, adChoice.getTrackers()));
            } else {
                linkedHashMap.put((short) 7, new Kc(ec2.f25379a.f28473b.f25488a.f27824b.getNative().getAdChoiceConfig().getLink(), cn.w.m()));
            }
        }
        return new Sc(c3509jd, abstractC3371e1, d42, nc2, new Rc(ec2.f25383e, new C3863xi(linkedHashMap, ec2.f25380b.getMainLink(), ec2.f25379a.f28473b.f25494g)), interfaceC3580m9L);
    }

    public static final C3409fd c(C3784ue c3784ue) {
        p000do.l0 l0Var = c3784ue.f28266h;
        C3793un c3793un = (C3793un) c3784ue.f28267i.getValue();
        Ec ec2 = c3784ue.f28265g;
        tn.p.k(ec2, "<this>");
        AdConfig.NativeViewabilityConfig viewabilityConfig = ec2.f25379a.f28473b.f25488a.f27824b.getNative().getViewabilityConfig();
        F f10 = ec2.f25379a.f28473b.f25500m;
        C3868xn c3868xn = new C3868xn(viewabilityConfig.getImpressionConfig().getPollInterval(), f10.f25410d, AbstractC3468hl.a(viewabilityConfig.getParentMinDimension().getDimensions()), f10.f25409c);
        go.l lVar = ((yo) c3784ue.f28270l.getValue()).f28614b;
        c3784ue.l();
        return new C3409fd(l0Var, c3793un, c3868xn, lVar);
    }

    public static final C3509jd d(C3784ue c3784ue) {
        String creativeType;
        String openMode;
        List<LandingPageParam> landingPageParams;
        LandingPageParam landingPageParam;
        List<LandingPageParam> landingPageParams2;
        LandingPageParam landingPageParam2;
        Context context = c3784ue.f28265g.f25379a.f28472a.f27734b;
        G g10 = c3784ue.f28550a.f28473b;
        MetaInfo metaInfo = g10.f25491d;
        boolean z10 = (metaInfo == null || (landingPageParams2 = metaInfo.getLandingPageParams()) == null || (landingPageParam2 = (LandingPageParam) cn.f0.w0(landingPageParams2, 0)) == null || !landingPageParam2.getSupportLockScreen()) ? false : true;
        G g11 = c3784ue.f28550a.f28473b;
        Jg jg2 = g11.f25488a.f27823a;
        long j10 = jg2.f25731a;
        String str = g11.f25500m.f25408b;
        String str2 = jg2.f25737g;
        String str3 = g11.f25490c;
        MetaInfo metaInfo2 = g11.f25491d;
        if (metaInfo2 == null || (creativeType = metaInfo2.getCreativeType()) == null) {
            creativeType = "unknown";
        }
        String str4 = creativeType;
        String str5 = c3784ue.f28265g.f25379a.f28473b.f25496i;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = str5;
        G g12 = c3784ue.f28550a.f28473b;
        boolean z11 = g12.f25489b.f25281a;
        MetaInfo metaInfo3 = g12.f25491d;
        if (metaInfo3 == null || (landingPageParams = metaInfo3.getLandingPageParams()) == null || (landingPageParam = (LandingPageParam) cn.f0.w0(landingPageParams, 0)) == null || (openMode = landingPageParam.getOpenMode()) == null) {
            openMode = "DEFAULT";
        }
        return new C3509jd(new C3534kd(context, g10, z10, new Za(j10, str, str2, "native", str3, str4, str6, z11, openMode), (Dc) c3784ue.f28265g.f25384f.getValue(), c3784ue.f28265g.f25381c, c3784ue.l()));
    }

    public static final Fd e(C3784ue c3784ue) {
        Vb k52;
        NativeMedia media;
        NativeVideo video;
        p000do.l0 l0Var = c3784ue.f28266h;
        Ec ec2 = c3784ue.f28265g;
        C3793un c3793un = (C3793un) c3784ue.f28267i.getValue();
        tn.p.k(ec2, "<this>");
        tn.p.k(c3793un, "viewHolderConfig");
        E e10 = ec2.f25379a.f28473b.f25501n;
        InMobiJsonResponse inMobiJsonResponse = ec2.f25380b;
        tn.p.k(inMobiJsonResponse, "<this>");
        JsonAssetObject assetsObject = inMobiJsonResponse.getAssetsObject();
        if ((assetsObject == null || (media = assetsObject.getMedia()) == null || (video = media.getVideo()) == null) ? false : video.getRequired()) {
            k52 = new Nm(((C3558lc) ec2.f25385g.getValue()).f27564e, e10.f25350a);
        } else {
            AdConfig.NativeViewabilityConfig viewabilityConfig = ec2.f25379a.f28473b.f25488a.f27824b.getNative().getViewabilityConfig();
            k52 = new K5(c3793un, new C3868xn(viewabilityConfig.getImpressionConfig().getPollInterval(), e10.f25351b, AbstractC3468hl.a(viewabilityConfig.getParentMinDimension().getDimensions()), e10.f25350a));
        }
        return new Fd(l0Var, k52, ((yo) c3784ue.f28270l.getValue()).f28614b);
    }

    public static final Ug f(C3784ue c3784ue) {
        c3784ue.getClass();
        return new Ug();
    }

    public static final C3793un g(C3784ue c3784ue) {
        NativeMedia media;
        NativeImage image;
        Icon icon;
        NativeMedia media2;
        NativeVideo video;
        NativeMedia media3;
        NativeMedia media4;
        Ec ec2 = c3784ue.f28265g;
        Sg sg2 = c3784ue.f28261c;
        tn.p.k(ec2, "<this>");
        tn.p.k(sg2, "publisherNativeViewData");
        AdConfig.NativeConfig nativeConfig = ec2.f25379a.f28473b.f25488a.f27824b.getNative();
        JsonAssetObject assetsObject = ec2.f25380b.getAssetsObject();
        Boolean boolValueOf = null;
        String type = (assetsObject == null || (media4 = assetsObject.getMedia()) == null) ? null : media4.getType();
        InMobiJsonResponse inMobiJsonResponse = ec2.f25380b;
        tn.p.k(inMobiJsonResponse, "<this>");
        JsonAssetObject assetsObject2 = inMobiJsonResponse.getAssetsObject();
        if (tn.p.f((assetsObject2 == null || (media3 = assetsObject2.getMedia()) == null) ? null : media3.getType(), "video")) {
            JsonAssetObject assetsObject3 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject3 != null && (media2 = assetsObject3.getMedia()) != null && (video = media2.getVideo()) != null) {
                boolValueOf = Boolean.valueOf(video.getRequired());
            }
        } else {
            JsonAssetObject assetsObject4 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject4 != null && (media = assetsObject4.getMedia()) != null && (image = media.getImage()) != null) {
                boolValueOf = Boolean.valueOf(image.getRequired());
            }
        }
        boolean required = false;
        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
        if (tn.p.f(type, "video")) {
            if (!zBooleanValue) {
                required = true;
            }
        } else if (assetsObject != null && (icon = assetsObject.getIcon()) != null) {
            required = icon.getRequired();
        }
        return new C3793un(required, zBooleanValue, AbstractC3468hl.a(nativeConfig.getViewabilityConfig().getIconMinDimension().getDimensions()), AbstractC3468hl.a(nativeConfig.getViewabilityConfig().getMediaMinDimension().getDimensions()), sg2);
    }

    public static final yo h(C3784ue c3784ue) {
        return new yo(c3784ue.f28550a.f28473b.f25488a.f27824b.getViewability().getWindowPollingInterval(), c3784ue.f28266h, c3784ue.f28261c.f26319a.getParentView$media_release(), c3784ue.l());
    }
}
