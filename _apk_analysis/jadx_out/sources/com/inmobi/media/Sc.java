package com.inmobi.media;

import android.webkit.URLUtil;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.inmobi.media.ads.network.inmobiJson.model.MainLink;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3509jd f26295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X2 f26296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D4 f26297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Nc f26298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rc f26299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3580m9 f26300f;

    public Sc(C3509jd c3509jd, X2 x22, D4 d42, Nc nc2, Rc rc2, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(c3509jd, "nativeLandingPageHandler");
        tn.p.k(x22, "clickSession");
        tn.p.k(d42, "contextualDataHandler");
        tn.p.k(nc2, "nativeBeaconProcessor");
        tn.p.k(rc2, "nativeClickModel");
        this.f26295a = c3509jd;
        this.f26296b = x22;
        this.f26297c = d42;
        this.f26298d = nc2;
        this.f26299e = rc2;
        this.f26300f = interfaceC3580m9;
    }

    public final void a() {
        Rc rc2 = this.f26299e;
        tn.p.k(rc2, "<this>");
        Kc kc2 = (Kc) rc2.f26246b.f28529a.get((short) 7);
        String str = kc2 != null ? kc2.f25808a : null;
        InterfaceC3580m9 interfaceC3580m9 = this.f26300f;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("NativeClickProcessor", "processAdChoiceAssetClick: url=" + str + ", isNetworkUrl=" + (str != null ? Boolean.valueOf(URLUtil.isNetworkUrl(str)) : null));
        }
        if (str != null && URLUtil.isNetworkUrl(str)) {
            this.f26295a.b(str, null);
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26300f;
        if (interfaceC3580m92 != null) {
            ((C3605n9) interfaceC3580m92).a("NativeClickProcessor", "AdChoice URL is null or not a network URL, skipping");
        }
    }

    public final void a(Q3 q32) {
        C3567ll c3567ll = this.f26299e.f26245a;
        String str = c3567ll != null ? c3567ll.f27583a : null;
        ArrayList arrayList = q32.f26162a;
        boolean zIsEmpty = arrayList.isEmpty();
        List listA = arrayList;
        if (zIsEmpty) {
            listA = Qc.a(this.f26299e);
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f26300f;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("NativeClickProcessor", "processCompanionClick: VAST clickThroughUrl=" + str + ", companion trackers count=" + q32.f26162a.size() + ", using VAST trackers=" + q32.f26162a.isEmpty());
        }
        a((short) 1, str, listA);
    }

    public final void a(AbstractC3305bc abstractC3305bc) {
        tn.p.k(abstractC3305bc, "mediaEvent");
        InterfaceC3580m9 interfaceC3580m9 = this.f26300f;
        if (interfaceC3580m9 != null) {
            String simpleName = tn.t.b(abstractC3305bc.getClass()).getSimpleName();
            tn.p.k(abstractC3305bc, "<this>");
            ((C3605n9) interfaceC3580m9).a("NativeClickProcessor", "processIfMediaClickEvent: mediaEvent type=" + simpleName + ", isClickEvent=" + ((abstractC3305bc instanceof C3490ij) || (abstractC3305bc instanceof Ol) || (abstractC3305bc instanceof Q3)));
        }
        tn.p.k(abstractC3305bc, "<this>");
        boolean z10 = abstractC3305bc instanceof C3490ij;
        if (z10 || (abstractC3305bc instanceof Ol) || (abstractC3305bc instanceof Q3)) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26300f;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("NativeClickProcessor", "Media click event detected, tracking user interaction");
            }
            this.f26297c.f();
            ((AbstractC3371e1) this.f26296b).a(InteractionType.CLICK);
            if (z10) {
                InterfaceC3580m9 interfaceC3580m93 = this.f26300f;
                if (interfaceC3580m93 != null) {
                    ((C3605n9) interfaceC3580m93).a("NativeClickProcessor", "Processing StaticClick event");
                }
                a((C3490ij) abstractC3305bc);
                return;
            }
            if (abstractC3305bc instanceof Ol) {
                InterfaceC3580m9 interfaceC3580m94 = this.f26300f;
                if (interfaceC3580m94 != null) {
                    ((C3605n9) interfaceC3580m94).a("NativeClickProcessor", "Processing VideoClick event");
                }
                b();
                return;
            }
            if (abstractC3305bc instanceof Q3) {
                InterfaceC3580m9 interfaceC3580m95 = this.f26300f;
                if (interfaceC3580m95 != null) {
                    ((C3605n9) interfaceC3580m95).a("NativeClickProcessor", "Processing CompanionClick event");
                }
                a((Q3) abstractC3305bc);
                return;
            }
            InterfaceC3580m9 interfaceC3580m96 = this.f26300f;
            if (interfaceC3580m96 != null) {
                ((C3605n9) interfaceC3580m96).a("NativeClickProcessor", "Unknown media event type, ignoring");
            }
        }
    }

    public final void a(C3490ij c3490ij) {
        Rc rc2 = this.f26299e;
        C3567ll c3567ll = rc2.f26245a;
        String str = c3567ll != null ? c3567ll.f27583a : null;
        List listA = Qc.a(rc2);
        InterfaceC3580m9 interfaceC3580m9 = this.f26300f;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("NativeClickProcessor", "processStaticClickEvent: VAST clickThroughUrl=" + str);
        }
        List list = listA;
        if (!G3.a(str)) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26300f;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("NativeClickProcessor", "VAST URL is not a network URL, using static click URL");
            }
            str = c3490ij.f27359a;
            ArrayList arrayList = c3490ij.f27360b;
            InterfaceC3580m9 interfaceC3580m93 = this.f26300f;
            list = arrayList;
            if (interfaceC3580m93 != null) {
                ((C3605n9) interfaceC3580m93).a("NativeClickProcessor", "Static click URL=" + str + ", trackers count=" + arrayList.size());
                list = arrayList;
            }
        }
        a((short) 0, str, list);
    }

    public final void a(short s10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26300f;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("NativeClickProcessor", "onAssetClickEvent: assetType=" + ((int) s10));
        }
        if (s10 == 7) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26300f;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("NativeClickProcessor", "Processing AD_CHOICE asset click");
            }
            a();
            return;
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f26300f;
        if (interfaceC3580m93 != null) {
            ((C3605n9) interfaceC3580m93).a("NativeClickProcessor", "Processing native asset click, tracking user interaction");
        }
        this.f26297c.f();
        ((AbstractC3371e1) this.f26296b).a(InteractionType.CLICK);
        b(s10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(short s10, String str, List list) {
        List list2;
        InterfaceC3580m9 interfaceC3580m9 = this.f26300f;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("NativeClickProcessor", "processAssetData: assetType=" + ((int) s10) + ", url=" + str + ", assetTrackers count=" + list.size());
        }
        Rc rc2 = this.f26299e;
        tn.p.k(rc2, "<this>");
        ArrayList arrayListA = AbstractC3899z4.a("click", rc2.f26246b.f28531c);
        List listO0 = cn.f0.O0(list, arrayListA);
        InterfaceC3580m9 interfaceC3580m92 = this.f26300f;
        if (interfaceC3580m92 != null) {
            ((C3605n9) interfaceC3580m92).a("NativeClickProcessor", "Response click trackers count=" + arrayListA.size() + ", combined trackers count=" + listO0.size());
        }
        if (G3.a(str)) {
            list2 = listO0;
        } else {
            InterfaceC3580m9 interfaceC3580m93 = this.f26300f;
            if (interfaceC3580m93 != null) {
                ((C3605n9) interfaceC3580m93).a("NativeClickProcessor", "URL is not a network URL, using main link from response");
            }
            MainLink mainLink = this.f26299e.f26246b.f28530b;
            str = mainLink != null ? mainLink.getUrl() : null;
            MainLink mainLink2 = this.f26299e.f26246b.f28530b;
            fallbackUrl = mainLink2 != null ? mainLink2.getFallbackUrl() : null;
            InterfaceC3580m9 interfaceC3580m94 = this.f26300f;
            list2 = arrayListA;
            if (interfaceC3580m94 != null) {
                ((C3605n9) interfaceC3580m94).a("NativeClickProcessor", "Main link URL=" + str + ", fallbackUrl=" + fallbackUrl);
                list2 = arrayListA;
            }
        }
        if (str == null) {
            InterfaceC3580m9 interfaceC3580m95 = this.f26300f;
            if (interfaceC3580m95 != null) {
                ((C3605n9) interfaceC3580m95).a("NativeClickProcessor", "Final URL is null, skipping click processing");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m96 = this.f26300f;
        if (interfaceC3580m96 != null) {
            ((C3605n9) interfaceC3580m96).a("NativeClickProcessor", "Handling click: finalUrl=" + str + ", fallbackUrl=" + fallbackUrl + ", firing " + list2.size() + " beacons");
        }
        this.f26295a.b(str, fallbackUrl);
        this.f26298d.a(s10, list2);
    }

    public final void b() {
        Rc rc2 = this.f26299e;
        C3567ll c3567ll = rc2.f26245a;
        String str = c3567ll != null ? c3567ll.f27583a : null;
        List listA = Qc.a(rc2);
        InterfaceC3580m9 interfaceC3580m9 = this.f26300f;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("NativeClickProcessor", "processVideoClickEvent: VAST clickThroughUrl=" + str + ", trackers count=" + listA.size());
        }
        a((short) 0, str, listA);
    }

    public final void b(short s10) {
        List list;
        Rc rc2 = this.f26299e;
        C3567ll c3567ll = rc2.f26245a;
        ArrayList arrayListA = null;
        String str = c3567ll != null ? c3567ll.f27583a : null;
        List listA = Qc.a(rc2);
        InterfaceC3580m9 interfaceC3580m9 = this.f26300f;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("NativeClickProcessor", "processNativeAssetClick: assetId=" + ((int) s10) + ", VAST clickThroughUrl=" + str + ", VAST trackers count=" + listA.size());
        }
        if (!G3.a(str)) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26300f;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("NativeClickProcessor", "VAST URL is not a network URL, using response asset click URL");
            }
            Rc rc3 = this.f26299e;
            tn.p.k(rc3, "<this>");
            Kc kc2 = (Kc) rc3.f26246b.f28529a.get(Short.valueOf(s10));
            String str2 = kc2 != null ? kc2.f25808a : null;
            Rc rc4 = this.f26299e;
            tn.p.k(rc4, "<this>");
            Kc kc3 = (Kc) rc4.f26246b.f28529a.get(Short.valueOf(s10));
            if (kc3 != null && (list = kc3.f25809b) != null) {
                arrayListA = AbstractC3899z4.a("click", list);
            }
            List listM = arrayListA == null ? cn.w.m() : arrayListA;
            InterfaceC3580m9 interfaceC3580m93 = this.f26300f;
            if (interfaceC3580m93 != null) {
                ((C3605n9) interfaceC3580m93).a("NativeClickProcessor", "Response asset URL=" + str2 + ", trackers count=" + listM.size());
            }
            str = str2;
            listA = listM;
        }
        a((short) 0, str, listA);
    }
}
