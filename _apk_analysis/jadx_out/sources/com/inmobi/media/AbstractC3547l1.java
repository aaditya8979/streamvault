package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.TextView;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.iab.omid.library.inmobi.Omid;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.media.AbstractC3547l1;
import com.inmobi.media.EnumC3273a6;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlinx.coroutines.g;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3547l1 extends AbstractC3388ei implements E2, InterfaceC3591mk, InterfaceC3820w0, ro {
    public static final /* synthetic */ int E = 0;
    public WatermarkData A;
    public final bn.g B;
    public boolean C;
    public final bn.g D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f27506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig f27507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f27508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeoutConfigurations f27509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f27510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3880ya f27511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f27512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C3605n9 f27513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f27514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f27515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C3795v0 f27516l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AdResponse f27517m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C3641ok f27518n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f27519o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f27520p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f27521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TreeSet f27522r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f27523s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f27524t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C3293b0 f27525u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C3406fa f27526v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C3608nc f27527w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Handler f27528x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f27529y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C3696r1 f27530z;

    public AbstractC3547l1(Context context, C3795v0 c3795v0, Dk dk2) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c3795v0, "adPlacement");
        String string = UUID.randomUUID().toString();
        tn.p.j(string, "toString(...)");
        this.f27505a = string;
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(AdConfig.class, "clazz");
        this.f27507c = (AdConfig) Y3.f26611a.a(AdConfig.class);
        this.f27511g = (C3880ya) AbstractC3905za.f28629a.getValue();
        this.f27512h = new ArrayList();
        this.f27516l = c3795v0;
        this.f27521q = -1L;
        this.f27522r = new TreeSet();
        this.f27528x = new Handler(Looper.getMainLooper());
        this.f27529y = new LinkedHashMap();
        this.f27530z = new C3696r1(this);
        this.B = kotlin.b.b(new sn.a() { // from class: n9.c9
            @Override // sn.a
            public final Object invoke() {
                return AbstractC3547l1.d(this.f75323b);
            }
        });
        this.f27508d = new WeakReference(context);
        this.f27510f = new WeakReference(dk2);
        Ab ab2 = Jh.f25738a;
        Jh.a(dk2, this.f27513i);
        WeakReference weakReference = this.f27510f;
        String strL = l();
        AdSet adSetR = r();
        this.f27525u = new C3293b0(weakReference, strL, adSetR != null ? adSetR.isRewarded() : false);
        L();
        this.D = kotlin.b.b(new sn.a() { // from class: n9.d9
            @Override // sn.a
            public final Object invoke() {
                return AbstractC3547l1.e(this.f75339b);
            }
        });
    }

    public static final bn.r a(AbstractC3547l1 abstractC3547l1) {
        C3696r1 c3696r1 = abstractC3547l1.f27530z;
        c3696r1.getClass();
        c3696r1.f28017e = SystemClock.elapsedRealtime();
        abstractC3547l1.g();
        return bn.r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final bn.r a(com.inmobi.media.AbstractC3547l1 r2, com.inmobi.media.EnumC3273a6 r3) {
        /*
            java.lang.String r0 = "it"
            tn.p.k(r3, r0)
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE
            r0.<init>(r1)
            java.lang.String r1 = "errorCode"
            tn.p.k(r3, r1)
            int r3 = r3.ordinal()
            if (r3 == 0) goto L31
            r1 = 21
            if (r3 == r1) goto L2e
            switch(r3) {
                case 12: goto L2b;
                case 13: goto L28;
                case 14: goto L25;
                case 15: goto L22;
                case 16: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L31
        L1f:
            r3 = 2105(0x839, float:2.95E-42)
            goto L33
        L22:
            r3 = 2104(0x838, float:2.948E-42)
            goto L33
        L25:
            r3 = 2103(0x837, float:2.947E-42)
            goto L33
        L28:
            r3 = 2102(0x836, float:2.946E-42)
            goto L33
        L2b:
            r3 = 2101(0x835, float:2.944E-42)
            goto L33
        L2e:
            r3 = 2228(0x8b4, float:3.122E-42)
            goto L33
        L31:
            r3 = 2100(0x834, float:2.943E-42)
        L33:
            r1 = 1
            r2.a(r0, r1, r3)
            bn.r r2 = bn.r.f5635a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3547l1.a(com.inmobi.media.l1, com.inmobi.media.a6):bn.r");
    }

    public static final void a(AbstractC3547l1 abstractC3547l1, W w10) {
        abstractC3547l1.getClass();
        if (w10 instanceof C3433gb) {
            C3696r1 c3696r1 = abstractC3547l1.f27530z;
            c3696r1.getClass();
            c3696r1.f28016d = SystemClock.elapsedRealtime();
            return;
        }
        if (w10 instanceof If) {
            C3696r1 c3696r12 = abstractC3547l1.f27530z;
            c3696r12.getClass();
            c3696r12.f28020h = SystemClock.elapsedRealtime();
        } else {
            if (!(w10 instanceof Oi)) {
                throw new NoWhenBranchMatchedException();
            }
            Map map = ((Oi) w10).f26094a;
            Map mapO = kotlin.collections.a.o(bn.h.a("latency", Long.valueOf(SystemClock.elapsedRealtime() - abstractC3547l1.f27530z.f28016d)), bn.h.a("networkType", C3850x5.m()), bn.h.a("plId", Long.valueOf(abstractC3547l1.f27516l.f28301a)));
            mapO.putAll(map);
            String str = abstractC3547l1.f27516l.f28306f;
            if (str != null) {
                mapO.put("plType", str);
            }
            String str2 = abstractC3547l1.f27516l.f28305e;
            if (str2 != null) {
                mapO.put("adType", str2);
            }
            abstractC3547l1.b("ServerFill", mapO);
        }
    }

    public static final void a(AbstractC3547l1 abstractC3547l1, Y y10) {
        tn.p.j("l1", "TAG");
        Objects.toString(y10);
        V v10 = y10.f26608b;
        if (v10 instanceof Pi) {
            abstractC3547l1.getClass();
            Map mapO = kotlin.collections.a.o(bn.h.a("latency", Long.valueOf(SystemClock.elapsedRealtime() - abstractC3547l1.f27530z.f28016d)), bn.h.a("networkType", C3850x5.m()), bn.h.a("plId", Long.valueOf(abstractC3547l1.f27516l.f28301a)));
            String str = abstractC3547l1.f27516l.f28306f;
            if (str != null) {
                mapO.put("plType", str);
            }
            String str2 = abstractC3547l1.f27516l.f28305e;
            if (str2 != null) {
                mapO.put("adType", str2);
            }
            abstractC3547l1.b("ServerNoFill", mapO);
            abstractC3547l1.b(y10.f26607a, (short) 0);
            return;
        }
        if (v10 instanceof J6) {
            abstractC3547l1.b(y10.f26607a, ((J6) v10).f25698a);
            return;
        }
        if (v10 instanceof K6) {
            abstractC3547l1.b(kotlin.collections.a.o(bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(((K6) v10).f25800a))));
            abstractC3547l1.b(y10.f26607a, (short) 2205);
        } else {
            if (!(v10 instanceof Ni)) {
                throw new NoWhenBranchMatchedException();
            }
            abstractC3547l1.b(((Ni) v10).f26047a);
            abstractC3547l1.b(y10.f26607a, (short) 0);
        }
    }

    public static final void a(AbstractC3547l1 abstractC3547l1, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        abstractC3547l1.a(gestureDetectorOnGestureListenerC3337ci, (short) 2137);
    }

    public static final void a(AbstractC3547l1 abstractC3547l1, C3442gk c3442gk) {
        abstractC3547l1.f27525u.a(c3442gk);
    }

    public static final void a(AbstractC3547l1 abstractC3547l1, sn.a aVar, sn.l lVar) {
        C3605n9 c3605n9 = abstractC3547l1.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            C3406fa c3406fa = abstractC3547l1.f27526v;
            c3605n9.c("l1", "Loading from retry Handler " + (c3406fa != null ? Integer.valueOf(c3406fa.f27159b) : null));
        }
        abstractC3547l1.a(aVar, lVar);
    }

    public static final void b(AbstractC3547l1 abstractC3547l1) {
        if (6 == abstractC3547l1.f27506b) {
            abstractC3547l1.a((short) 2158);
        }
    }

    public static final void b(AbstractC3547l1 abstractC3547l1, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        abstractC3547l1.o(gestureDetectorOnGestureListenerC3337ci);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:8:0x0017, B:10:0x001d, B:13:0x0028, B:12:0x0023), top: B:21:0x0017, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.inmobi.media.AbstractC3547l1 r3) {
        /*
            com.inmobi.media.Cf r0 = com.inmobi.media.Bf.f25219a
            android.content.Context r1 = r3.n()
            com.inmobi.media.core.config.models.AdConfig r3 = r3.f27507c
            r0.getClass()
            boolean r2 = com.iab.omid.library.inmobi.Omid.isActive()     // Catch: java.lang.Exception -> L43
            if (r2 != 0) goto L15
            com.iab.omid.library.inmobi.Omid.activate(r1)     // Catch: java.lang.Exception -> L43
            return
        L15:
            if (r3 == 0) goto L23
            com.inmobi.media.core.config.models.AdConfig$ViewabilityConfig r3 = r3.getViewability()     // Catch: java.lang.Exception -> L37
            if (r3 == 0) goto L23
            com.inmobi.media.core.config.models.AdConfig$OmidConfig r3 = r3.getOmidConfig()     // Catch: java.lang.Exception -> L37
            if (r3 != 0) goto L28
        L23:
            com.inmobi.media.core.config.models.AdConfig$OmidConfig r3 = new com.inmobi.media.core.config.models.AdConfig$OmidConfig     // Catch: java.lang.Exception -> L37
            r3.<init>()     // Catch: java.lang.Exception -> L37
        L28:
            java.lang.String r3 = r3.getPartnerKey()     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = r0.a()     // Catch: java.lang.Exception -> L37
            com.iab.omid.library.inmobi.adsession.Partner r3 = com.iab.omid.library.inmobi.adsession.Partner.createPartner(r3, r1)     // Catch: java.lang.Exception -> L37
            r0.f25267b = r3     // Catch: java.lang.Exception -> L37
            goto L49
        L37:
            r3 = move-exception
            bn.g r0 = com.inmobi.media.P9.f26117a     // Catch: java.lang.Exception -> L43
            com.inmobi.media.L2 r0 = new com.inmobi.media.L2     // Catch: java.lang.Exception -> L43
            r0.<init>(r3)     // Catch: java.lang.Exception -> L43
            com.inmobi.media.P9.a(r0)     // Catch: java.lang.Exception -> L43
            goto L49
        L43:
            r3 = move-exception
            bn.g r0 = com.inmobi.media.P9.f26117a
            com.inmobi.media.AbstractC3481i9.a(r3)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3547l1.c(com.inmobi.media.l1):void");
    }

    public static final ko d(AbstractC3547l1 abstractC3547l1) {
        return new ko(abstractC3547l1.f27513i);
    }

    public static final po e(AbstractC3547l1 abstractC3547l1) {
        com.inmobi.media.ads.network.common.model.Ad adB = abstractC3547l1.b(0);
        if (adB == null || abstractC3547l1.z()) {
            adB = null;
        }
        C3605n9 c3605n9 = abstractC3547l1.f27513i;
        tn.p.j("l1", "TAG");
        return new po(adB, c3605n9);
    }

    public final void A() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "initTelemetry " + this);
        }
        this.f27529y.put("AdImpressionSuccessful", this.f27530z);
    }

    public final boolean B() throws JSONException {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "isBlockingStateForLoadWithResponse getter " + this + " state=" + ((int) this.f27506b));
        }
        if (!W6.a()) {
            d();
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), true, (short) 2141);
            return true;
        }
        if (E()) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                c3605n92.b("l1", "Some of the dependency libraries for " + l() + " not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return true;
        }
        byte b10 = this.f27506b;
        if (b10 == 1) {
            C3605n9 c3605n93 = this.f27513i;
            if (c3605n93 != null) {
                tn.p.j("l1", "TAG");
                c3605n93.b("l1", "load with reasponse called while loading");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING), false, (short) 2001);
            return true;
        }
        if (b10 != 7) {
            return false;
        }
        C3605n9 c3605n94 = this.f27513i;
        if (c3605n94 != null) {
            tn.p.j("l1", "TAG");
            c3605n94.b("l1", "ad active before load");
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2003);
        return true;
    }

    public void C() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "load  " + this);
        }
        C3696r1 c3696r1 = this.f27530z;
        c3696r1.getClass();
        c3696r1.f28015c = SystemClock.elapsedRealtime();
        a(new sn.a() { // from class: n9.a9
            @Override // sn.a
            public final Object invoke() {
                return AbstractC3547l1.a(this.f75287b);
            }
        }, new sn.l() { // from class: n9.b9
            @Override // sn.l
            public final Object invoke(Object obj) {
                return AbstractC3547l1.a(this.f75303b, (EnumC3273a6) obj);
            }
        });
    }

    public final void D() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "makeUnitActive " + this);
        }
        this.f27515k = false;
    }

    public boolean E() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "missingPrerequisitesForAd " + this);
        }
        try {
            tn.t.b(CustomTabsClient.class).getSimpleName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public void F() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "onDidParseAfterFetch " + this);
        }
        c((byte) 2);
        Handler handler = this.f27514j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: n9.f9
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3547l1.c(this.f75370b);
                }
            });
        }
    }

    public final Le G() {
        Integer num;
        Integer num2;
        Integer num3;
        AdConfig.RenderingConfig rendering;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "prepareAdRequest " + this);
        }
        Context contextN = n();
        C3411ff c3411ff = contextN != null ? new C3411ff(contextN, this.f27513i) : null;
        String str = this.f27516l.f28307g;
        tn.p.h(str);
        this.f27516l.getClass();
        C3795v0 c3795v0 = this.f27516l;
        Map map = c3795v0.f28303c;
        long j10 = c3795v0.f28301a;
        String str2 = c3795v0.f28309i;
        String strL = l();
        HashMap mapK = k();
        String str3 = this.f27516l.f28304d;
        AdConfig adConfig = this.f27507c;
        C3596n0 c3596n0 = new C3596n0(str, map, j10, str2, strL, mapK, str3, adConfig != null && (rendering = adConfig.getRendering()) != null && rendering.getEnablePubMuteControl() && Ji.f25752f);
        C3608nc c3608nc = this.f27527w;
        int iIntValue = 15000;
        long jIntValue = (c3608nc == null || (num3 = c3608nc.f27687d) == null) ? 15000 : num3.intValue();
        C3608nc c3608nc2 = this.f27527w;
        long jIntValue2 = (c3608nc2 == null || (num2 = c3608nc2.f27687d) == null) ? 15000 : num2.intValue();
        C3608nc c3608nc3 = this.f27527w;
        if (c3608nc3 != null && (num = c3608nc3.f27687d) != null) {
            iIntValue = num.intValue();
        }
        C3666pk c3666pk = new C3666pk(jIntValue, jIntValue2, iIntValue);
        AdConfig adConfig2 = this.f27507c;
        String url = adConfig2 != null ? adConfig2.getUrl() : null;
        AdConfig adConfig3 = this.f27507c;
        tn.p.h(adConfig3);
        Ak ak2 = new Ak(adConfig3.getIncludeIdParams());
        C3360df c3360dfA = c3411ff != null ? c3411ff.a() : null;
        C3605n9 c3605n92 = this.f27513i;
        AdConfig adConfig4 = this.f27507c;
        return new C3646p0(url, ak2, c3596n0, c3666pk, c3360dfA, c3605n92, adConfig4 != null ? adConfig4.getApplyGzipReq() : false).a();
    }

    public final void H() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "printPublisherTestId " + this);
        }
        AbstractC3915zk.b();
    }

    public void I() throws JSONException {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "resetContainersForNextAd " + this);
        }
        int size = this.f27512h.size();
        int i10 = this.f27520p;
        if (size <= i10 || this.f27512h.get(i10) == null) {
            return;
        }
        a(this.f27520p, false);
    }

    public final void J() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.d("l1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 1);
    }

    public void K() {
        tn.p.k(ActivityChooserModel.ATTRIBUTE_ACTIVITY, "monetizationContext");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "setMonetizationContext " + this);
        }
        C3795v0 c3795v0 = this.f27516l;
        c3795v0.getClass();
        tn.p.k(ActivityChooserModel.ATTRIBUTE_ACTIVITY, "<set-?>");
        c3795v0.f28309i = ActivityChooserModel.ATTRIBUTE_ACTIVITY;
    }

    public final void L() {
        tn.p.j("l1", "TAG");
        toString();
        this.f27509e = y();
        c((byte) 0);
        this.f27514j = new Handler(Looper.getMainLooper());
        this.f27518n = new C3641ok(this);
    }

    public final boolean M() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "shouldBlockLoadAd " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        if (adB != null && 4 == this.f27506b && !z()) {
            AbstractC3423g1 abstractC3423g1M = m();
            if (abstractC3423g1M != null) {
                C3605n9 c3605n92 = this.f27513i;
                if (c3605n92 != null) {
                    tn.p.j("l1", "TAG");
                    c3605n92.a("l1", "ad is ready - load success");
                }
                d(abstractC3423g1M);
            } else {
                c((short) 2188);
            }
            return true;
        }
        if (adB == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2131);
            C3605n9 c3605n93 = this.f27513i;
            if (c3605n93 != null) {
                tn.p.j("l1", "TAG");
                c3605n93.b("l1", "ad no longer available");
            }
            return true;
        }
        if (2 == this.f27506b) {
            if (!z()) {
                return false;
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2133);
            C3605n9 c3605n94 = this.f27513i;
            if (c3605n94 != null) {
                tn.p.j("l1", "TAG");
                c3605n94.b("l1", "ad is expired");
            }
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), true, (short) 2132);
        C3605n9 c3605n95 = this.f27513i;
        if (c3605n95 != null) {
            tn.p.j("l1", "TAG");
            c3605n95.b("l1", "ad no longer available. state - " + ((int) this.f27506b));
        }
        return true;
    }

    public final void N() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad2;
        int i10;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "startLoadingHTMLAd " + this);
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = null;
        try {
            AdSet adSetR = r();
            com.inmobi.media.ads.network.common.model.Ad ad3 = (adSetR == null || (i10 = this.f27519o) < 0 || i10 >= adSetR.getAds().size()) ? null : adSetR.getAds().get(this.f27519o);
            d(this.f27519o);
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                AdSet adSetR2 = r();
                c3605n92.a("l1", "Loading ad with impressionId : " + ((adSetR2 == null || (ads = adSetR2.getAds()) == null || (ad2 = ads.get(this.f27519o)) == null) ? null : ad2.getImpressionId()));
            }
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = (GestureDetectorOnGestureListenerC3337ci) this.f27512h.get(this.f27519o);
            if (ad3 != null) {
                Gg pubContent = ad3.getPubContent();
                if (pubContent instanceof U7) {
                    C3605n9 c3605n93 = this.f27513i;
                    if (c3605n93 != null) {
                        tn.p.j("l1", "TAG");
                        c3605n93.a("l1", "Loading HTML content into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC3337ci2 != null) {
                        gestureDetectorOnGestureListenerC3337ci2.h(((U7) pubContent).f26420a);
                    }
                } else if (pubContent instanceof V7) {
                    C3605n9 c3605n94 = this.f27513i;
                    if (c3605n94 != null) {
                        tn.p.j("l1", "TAG");
                        c3605n94.a("l1", "Loading HTML URL into WebView");
                    }
                    if (gestureDetectorOnGestureListenerC3337ci2 != null) {
                        gestureDetectorOnGestureListenerC3337ci2.j(bo.d0.s1(((V7) pubContent).f26488a).toString());
                    }
                }
            }
            if (gestureDetectorOnGestureListenerC3337ci2 == null || !tn.p.f(s(), "htmlUrl")) {
                return;
            }
            m(gestureDetectorOnGestureListenerC3337ci2);
        } catch (Exception e10) {
            C3605n9 c3605n95 = this.f27513i;
            if (c3605n95 != null) {
                tn.p.j("l1", "TAG");
                c3605n95.a("l1", "Loading ad markup into container encountered an unexpected error: " + e10.getMessage());
            }
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
            int i11 = this.f27519o;
            if (i11 >= 0 && i11 < this.f27512h.size()) {
                gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) this.f27512h.get(this.f27519o);
            }
            a(gestureDetectorOnGestureListenerC3337ci, (short) 2135);
        }
    }

    public final void O() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "submitAdLoadCalled " + this);
        }
        HashMap map = new HashMap();
        c(map);
        c("AdLoadCalled", map);
    }

    public final void P() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "submitAdLoadSuccessfulEvent ADunit markuptype : " + s() + com.ironsource.Z7.f30794r + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f27530z.f28015c;
        p000do.l0 l0Var = AbstractC3492il.f27361a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO == null || (impressionId = adO.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adO2 = o();
        if (adO2 != null && (metaInfo = adO2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        C3406fa c3406fa = this.f27526v;
        if (c3406fa != null) {
            map.put("retryCount", Integer.valueOf(c3406fa.f27159b));
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.isRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        c("AdLoadSuccessful", map);
    }

    public final void Q() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "submitAdShowCalled " + this);
        }
        C3696r1 c3696r1 = this.f27530z;
        c3696r1.getClass();
        c3696r1.f28018f = SystemClock.elapsedRealtime();
        HashMap map = new HashMap();
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        long j10 = this.f27530z.f28021i;
        p000do.l0 l0Var = AbstractC3492il.f27361a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.isRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        c("AdShowCalled", map);
    }

    public final void R() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "submitAdShowSuccess " + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f27530z.f28018f;
        p000do.l0 l0Var = AbstractC3492il.f27361a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.isRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        c("AdShowSuccessful", map);
    }

    public final void S() {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "submitRenderSuccessEvent ADunit markuptype : " + s() + com.ironsource.Z7.f30794r + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f27530z.f28019g;
        p000do.l0 l0Var = AbstractC3492il.f27361a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        C3406fa c3406fa = this.f27526v;
        if (c3406fa != null) {
            map.put("retryCount", Integer.valueOf(c3406fa.f27159b));
        }
        map.put("plType", Byte.valueOf(t()));
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.isRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        a(p(), map);
        c("RenderSuccess", map);
    }

    public final long T() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "timeSincePodShow " + this);
        }
        if (this.f27523s) {
            return System.currentTimeMillis() - this.f27521q;
        }
        return -1L;
    }

    public final void U() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.b("l1", "ad unloaded");
        }
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            tn.p.j("l1", "TAG");
            c3605n92.d("l1", "AdUnit " + this + " state - UNLOADED");
        }
        c((byte) 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0197  */
    /* JADX WARN: Type inference failed for: r39v1 */
    /* JADX WARN: Type inference failed for: r39v2, types: [int] */
    /* JADX WARN: Type inference failed for: r39v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.inmobi.media.C3621o0 a(int r49) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3547l1.a(int):com.inmobi.media.o0");
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        return ((ro) this.D.getValue()).a(d10);
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        return ((ro) this.D.getValue()).a(i10, d10);
    }

    @Override // com.inmobi.media.AbstractC3388ei, com.inmobi.media.InterfaceC3288al
    public final void a() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "onUserLeaveApplication " + this);
        }
        if (this.f27515k || n() == null) {
            return;
        }
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            tn.p.j("l1", "TAG");
            c3605n92.a("l1", "User left application");
        }
        AbstractC3423g1 abstractC3423g1M = m();
        if (abstractC3423g1M != null) {
            abstractC3423g1M.e();
        }
    }

    public void a(byte b10) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "onTimeOut " + this);
        }
        if (b10 == 0) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                c3605n92.a("l1", "AdRequestTimeOut by timer, Adstate=" + ((int) this.f27506b));
            }
            if (this.f27506b != 3) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT), (short) 2109);
                return;
            }
            return;
        }
        if (b10 != 2 && b10 != 1) {
            if (b10 != 4) {
                C3605n9 c3605n93 = this.f27513i;
                if (c3605n93 != null) {
                    tn.p.j("l1", "TAG");
                    c3605n93.a("l1", "Unknown TimeOut ignored");
                    return;
                }
                return;
            }
            C3605n9 c3605n94 = this.f27513i;
            if (c3605n94 != null) {
                tn.p.j("l1", "TAG");
                c3605n94.a("l1", "Show RequestTimeOut by show timer");
            }
            AbstractC3423g1 abstractC3423g1M = m();
            if (abstractC3423g1M != null) {
                abstractC3423g1M.d();
                return;
            }
            return;
        }
        C3605n9 c3605n95 = this.f27513i;
        if (c3605n95 != null) {
            tn.p.j("l1", "TAG");
            c3605n95.a("l1", "Internal LoadTimeOut by timer, Adstate=" + ((int) this.f27506b));
        }
        if (this.f27506b != 3) {
            this.f27528x.removeCallbacksAndMessages(null);
            C3605n9 c3605n96 = this.f27513i;
            if (c3605n96 != null) {
                tn.p.j("l1", "TAG");
                c3605n96.a("l1", "adUnitEventListener=" + m() + ", Adstate=" + ((int) this.f27506b));
            }
            byte b11 = this.f27506b;
            if (2 == b11) {
                J();
                c(Re.a() == null ? (short) 2139 : (short) 2203);
                AbstractC3423g1 abstractC3423g1M2 = m();
                if (abstractC3423g1M2 != null) {
                    abstractC3423g1M2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            if (1 == b11) {
                J();
                c((short) 2138);
                AbstractC3423g1 abstractC3423g1M3 = m();
                if (abstractC3423g1M3 != null) {
                    abstractC3423g1M3.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT));
                }
            }
        }
    }

    public void a(int i10, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, Context context) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "Show pod ad with index : " + i10 + " from creative: " + this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci) + com.ironsource.Z7.f30794r + this);
        }
        if (i10 >= 0) {
            this.f27520p = i10;
        } else {
            this.f27520p++;
        }
    }

    public final void a(int i10, boolean z10) throws JSONException {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "Destroying container for index " + i10 + com.ironsource.Z7.f30794r + this);
        }
        ArrayList arrayList = this.f27512h;
        tn.p.k(arrayList, "list");
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) this.f27512h.get(i10);
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            gestureDetectorOnGestureListenerC3337ci.I0.set(z10);
            gestureDetectorOnGestureListenerC3337ci.stopLoading();
            gestureDetectorOnGestureListenerC3337ci.b();
        }
        this.f27512h.set(i10, null);
    }

    public final void a(Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "setContext " + this);
        }
        this.f27508d = new WeakReference(context);
    }

    public final void a(Context context, C3795v0 c3795v0, Dk dk2) {
        C3795v0 c3795v02;
        String str;
        String str2;
        C3605n9 c3605n9;
        C3605n9 c3605n92;
        C3605n9 c3605n93;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c3795v0, "adPlacement");
        tn.p.j("l1", "TAG");
        toString();
        a(context);
        this.f27510f = new WeakReference(dk2);
        Ab ab2 = Jh.f25738a;
        Jh.a(dk2, this.f27513i);
        WeakReference weakReference = this.f27510f;
        String strL = l();
        AdSet adSetR = r();
        this.f27525u = new C3293b0(weakReference, strL, adSetR != null ? adSetR.isRewarded() : false);
        this.f27516l = c3795v0;
        A();
        C3605n9 c3605n94 = this.f27513i;
        if (c3605n94 != null) {
            tn.p.j("l1", "TAG");
            c3605n94.c("l1", "initInternetAvailabilityAdRetry");
        }
        if (this.f27507c == null && (c3605n93 = this.f27513i) != null) {
            tn.p.j("l1", "TAG");
            c3605n93.c("l1", "adConfig is null");
            bn.r rVar = bn.r.f5635a;
        }
        if (this.f27516l.f28306f == null && (c3605n92 = this.f27513i) != null) {
            tn.p.j("l1", "TAG");
            c3605n92.c("l1", "placement.placementType is null");
            bn.r rVar2 = bn.r.f5635a;
        }
        if (this.f27516l.f28305e == null && (c3605n9 = this.f27513i) != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "placement.adType is null");
            bn.r rVar3 = bn.r.f5635a;
        }
        AdConfig adConfig = this.f27507c;
        if (adConfig != null && (str = (c3795v02 = this.f27516l).f28306f) != null && (str2 = c3795v02.f28305e) != null) {
            C3608nc c3608ncA = AbstractC3583mc.a(adConfig.getTimeouts().X(), str, str2, Ki.f25816b);
            this.f27526v = new C3406fa(c3608ncA);
            this.f27527w = c3608ncA;
        }
        if (J5.f25696h != null) {
            tn.p.j("J5", "TAG");
        } else {
            J5.f25696h = Float.valueOf(new TextView(context).getTextSize());
            tn.p.j("J5", "TAG");
        }
        L();
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "handleMarkupFetchFailure " + this);
        }
        try {
            if (this.f27506b == 1) {
                C3605n9 c3605n92 = this.f27513i;
                if (c3605n92 != null) {
                    tn.p.j("l1", "TAG");
                    c3605n92.b("l1", "Failed to fetch ad for placement id: " + this.f27516l + ", reason - " + inMobiAdRequestStatus.getMessage());
                }
                String str = "MarkupFetch failed reason is: " + inMobiAdRequestStatus.getMessage();
                C3605n9 c3605n93 = this.f27513i;
                if (c3605n93 != null) {
                    tn.p.j("l1", "TAG");
                    c3605n93.b("l1", str);
                }
                C3605n9 c3605n94 = this.f27513i;
                if (c3605n94 != null) {
                    tn.p.j("l1", "TAG");
                    c3605n94.d("l1", "AdUnit " + this + " state - FAILED");
                }
                c((byte) 3);
                b((byte) 1);
                if (s10 != 0) {
                    b(s10);
                }
                AbstractC3423g1 abstractC3423g1M = m();
                if (abstractC3423g1M != null) {
                    abstractC3423g1M.a(inMobiAdRequestStatus);
                    return;
                }
                C3605n9 c3605n95 = this.f27513i;
                if (c3605n95 != null) {
                    c3605n95.a();
                }
            }
        } catch (Exception e10) {
            C3605n9 c3605n96 = this.f27513i;
            if (c3605n96 != null) {
                tn.p.j("l1", "TAG");
                c3605n96.a("l1", "onAdFetchFailed with error: ", e10);
            }
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus, boolean z10, short s10) {
        tn.p.k(inMobiAdRequestStatus, "requestStatus");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.b("l1", "handleAdFetchFailure " + this + " errorCode - " + ((int) s10));
        }
        if (this.f27506b == 3 && z10) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                c3605n92.d("l1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC3423g1 abstractC3423g1M = m();
        if (abstractC3423g1M != null) {
            abstractC3423g1M.a(this, inMobiAdRequestStatus);
        }
        if (s10 != 0) {
            b(s10);
        }
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad2, String str) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "updateAdForBlob " + this);
        }
        ad2.setWebVast(str);
        b(ad2);
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad2, Map map) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "updateIdsInTelemetryPayload " + this);
        }
        if (ad2 != null) {
            map.put("creativeId", ad2.getCreativeId());
        }
    }

    public final void a(AdResponse adResponse) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        tn.p.k(adResponse, "adResponse");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "handleAdFetchSuccessful " + this);
        }
        if (this.f27515k || n() == null) {
            c((short) 2185);
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                c3605n92.b("l1", "adUnit is destroyed");
                return;
            }
            return;
        }
        if (this.f27506b != 1) {
            C3605n9 c3605n93 = this.f27513i;
            if (c3605n93 != null) {
                tn.p.j("l1", "TAG");
                c3605n93.b("l1", "incorrect state - " + ((int) this.f27506b));
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2118);
            return;
        }
        this.f27517m = adResponse;
        AdSet adSetR = r();
        int size = 0;
        this.f27523s = adSetR != null ? adSetR.isPod() : false;
        AdSet adSetR2 = r();
        if (adSetR2 != null && (ads2 = adSetR2.getAds()) != null) {
            size = ads2.size();
        }
        this.f27512h = new ArrayList(size);
        AdSet adSetR3 = r();
        if (adSetR3 != null && (ads = adSetR3.getAds()) != null) {
            for (com.inmobi.media.ads.network.common.model.Ad ad2 : ads) {
                this.f27512h.add(null);
            }
        }
        F();
    }

    public void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, Activity activity) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "closeCurrentPodAd " + this);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, Integer num, int i10) {
        int iIntValue;
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            iIntValue = this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci);
        } else if (num == null) {
            return;
        } else {
            iIntValue = num.intValue();
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(iIntValue);
        if (adB != null) {
            Iterator it = AbstractC3888yi.a(adB, "pod_abort").iterator();
            while (it.hasNext()) {
                String strS = bo.a0.S(bo.a0.S((String) it.next(), "$PODINDEX", String.valueOf(iIntValue), false, 4, null), "$REASON", String.valueOf(i10), false, 4, null);
                C3823w3 c3823w3 = C3823w3.f28406a;
                C3605n9 c3605n9 = this.f27513i;
                tn.p.k(strS, "url");
                C3823w3.a(strS, true, c3605n9);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, String str, Map map) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        tn.p.k(str, "trackerName");
        tn.p.k(map, "macros");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "fireLandingPageTracker " + str + com.ironsource.Z7.f30794r + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci));
        if (adB == null) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                c3605n92.a("l1", "fireLandingPageTracker failed");
                return;
            }
            return;
        }
        for (String str2 : AbstractC3888yi.a(adB, str)) {
            String strS = str2;
            for (Map.Entry entry : map.entrySet()) {
                strS = bo.a0.S(strS, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            C3823w3 c3823w3 = C3823w3.f28406a;
            C3605n9 c3605n93 = this.f27513i;
            tn.p.k(strS, "url");
            C3823w3.a(strS, true, c3605n93);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, LinkedHashSet linkedHashSet) {
        AdConfig.ViewabilityConfig viewability;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "omidSessionForHtmlMarkup " + this);
        }
        AdConfig adConfig = this.f27507c;
        AdConfig.OmidConfig omidConfig = (adConfig == null || (viewability = adConfig.getViewability()) == null) ? null : viewability.getOmidConfig();
        if (omidConfig == null || omidConfig.isOmidEnabled()) {
            Bf.f25219a.getClass();
            if (Omid.isActive()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    C3840wk c3840wk = (C3840wk) it.next();
                    if (3 == c3840wk.f28462a) {
                        try {
                            tn.p.k("creativeType", "key");
                            tn.p.k(String.class, "classType");
                            Object obj = c3840wk.f28463b.get("creativeType");
                            String str = (String) (String.class.isInstance(obj) ? String.class.cast(obj) : null);
                            tn.p.k("customReferenceData", "key");
                            tn.p.k(String.class, "classType");
                            Object obj2 = c3840wk.f28463b.get("customReferenceData");
                            String str2 = (String) (String.class.isInstance(obj2) ? String.class.cast(obj2) : null);
                            tn.p.k("isolateVerificationScripts", "key");
                            tn.p.k(Boolean.class, "classType");
                            Object obj3 = c3840wk.f28463b.get("isolateVerificationScripts");
                            Boolean bool = (Boolean) (Boolean.class.isInstance(obj3) ? Boolean.class.cast(obj3) : null);
                            tn.p.k("impressionType", "key");
                            tn.p.k(Byte.class, "classType");
                            Object obj4 = c3840wk.f28463b.get("impressionType");
                            Byte b10 = (Byte) (Byte.class.isInstance(obj4) ? Byte.class.cast(obj4) : null);
                            C3511jf c3511jfA = (str == null || bool == null || b10 == null) ? null : AbstractC3785uf.a(str, gestureDetectorOnGestureListenerC3337ci, bool.booleanValue(), this.f27516l.f28311k, b10.byteValue(), str2);
                            if (c3511jfA != null) {
                                c3840wk.f28463b.put("omidAdSession", c3511jfA);
                                c3840wk.f28463b.put("deferred", Boolean.TRUE);
                                C3605n9 c3605n92 = this.f27513i;
                                if (c3605n92 != null) {
                                    tn.p.j("l1", "TAG");
                                    c3605n92.a("l1", "OMID ad session created and WebView container registered with OMID");
                                }
                            } else {
                                C3605n9 c3605n93 = this.f27513i;
                                if (c3605n93 != null) {
                                    tn.p.j("l1", "TAG");
                                    c3605n93.a("l1", "Ignoring IAB meta data for this ad markup");
                                }
                            }
                        } catch (Exception e10) {
                            C3605n9 c3605n94 = this.f27513i;
                            if (c3605n94 != null) {
                                tn.p.j("l1", "TAG");
                                c3605n94.b("l1", "Setting up impression tracking for IAB encountered an unexpected error: " + e10.getMessage());
                            }
                            bn.g gVar = P9.f26117a;
                            AbstractC3481i9.a(e10);
                        }
                    }
                }
            }
        }
    }

    public void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, short s10) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.b("l1", "Render view signaled ad failed, for index " + this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci) + com.ironsource.Z7.f30794r + this);
        }
        if (gestureDetectorOnGestureListenerC3337ci == null || !tn.p.f(gestureDetectorOnGestureListenerC3337ci.getMarkupType(), "htmlUrl")) {
            return;
        }
        l(gestureDetectorOnGestureListenerC3337ci);
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, boolean z10) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "onRenderProcessGone didCrash=" + z10 + " state=" + ((int) this.f27506b));
        }
        byte b10 = this.f27506b;
        if (b10 == 0) {
            short s10 = z10 ? (short) 2214 : (short) 2213;
            J();
            gestureDetectorOnGestureListenerC3337ci.a(z10, s10);
            return;
        }
        if (b10 == 1) {
            short s11 = z10 ? (short) 2216 : (short) 2215;
            J();
            c(s11);
            AbstractC3423g1 abstractC3423g1M = m();
            if (abstractC3423g1M != null) {
                abstractC3423g1M.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b10 == 3) {
            gestureDetectorOnGestureListenerC3337ci.a(z10, z10 ? (short) 2226 : (short) 2225);
            return;
        }
        if (b10 == 2) {
            J();
            c(z10 ? (short) 2218 : (short) 2217);
            AbstractC3423g1 abstractC3423g1M2 = m();
            if (abstractC3423g1M2 != null) {
                abstractC3423g1M2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                return;
            }
            return;
        }
        if (b10 == 4 || b10 == 6 || b10 == 7 || b10 != 8) {
            return;
        }
        gestureDetectorOnGestureListenerC3337ci.a(z10, z10 ? (short) 2240 : (short) 2241);
    }

    public final void a(AbstractC3423g1 abstractC3423g1) {
        tn.p.k(abstractC3423g1, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "onAdDisplayed " + this);
        }
        AdMetaInfo adMetaInfoJ = j();
        if (adMetaInfoJ == null) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                c3605n92.b("l1", "callback onAdDisplayed failed. ad meta info is null");
            }
            b(abstractC3423g1);
            return;
        }
        C3605n9 c3605n93 = this.f27513i;
        if (c3605n93 != null) {
            tn.p.j("l1", "TAG");
            c3605n93.a("l1", "callback - onAdDisplayed");
        }
        abstractC3423g1.a(adMetaInfoJ);
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void a(final C3442gk c3442gk) {
        C3467hk c3467hk;
        AtomicBoolean atomicBoolean;
        tn.p.k(c3442gk, "telemetryOnAdImpression");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "onImpressionFiredFromTemplate " + this);
        }
        c3442gk.getClass();
        tn.p.k("imraid_impressionFired", "<set-?>");
        c3442gk.f27252f = "imraid_impressionFired";
        if (!this.f27515k && n() != null) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                c3605n92.a("l1", "onImpressionFiredFromTemplate");
            }
            Handler handler = this.f27514j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: n9.z8
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC3547l1.a(this.f75721b, c3442gk);
                    }
                });
                return;
            }
            return;
        }
        C3696r1 c3696r1 = c3442gk.f27247a;
        if (c3696r1 == null || (c3467hk = c3696r1.f28014b) == null || (atomicBoolean = c3467hk.f27311a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = c3442gk.a();
            linkedHashMapA.put("networkType", C3850x5.m());
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2180);
            String str = c3442gk.f27250d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj2 = Wj.f26549a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC3287ak.f26805a);
        }
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void a(String str) {
        tn.p.k(str, CreativeInfo.f52469an);
        AbstractC3423g1 abstractC3423g1M = m();
        if (abstractC3423g1M != null) {
            abstractC3423g1M.a(str);
        }
    }

    public final void a(String str, String str2) {
        tn.p.k(str, "blob");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "saveBlob " + this);
        }
        this.f27511g.a(this.f27505a, new C3522k1(this, str2, str, null));
    }

    public final void a(String str, String str2, F2 f22, String str3) {
        tn.p.k(str, "jsCallbackNamespace");
        tn.p.k(str2, "callback");
        tn.p.k(f22, "receiver");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "getBlob " + this);
        }
        this.f27511g.a(this.f27505a, new C3473i1(this, str3, f22, str, str2, null));
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void a(String str, HashMap map) {
        tn.p.k(str, "eventType");
        tn.p.k(map, "kv");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "onRenderViewRequestedAction " + this);
        }
        c(str, map);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(String str, Map map) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "addRetryCountToTelemetryEvent event - " + str);
        }
        switch (str.hashCode()) {
            case -1959333523:
                if (!str.equals("RenderSuccess")) {
                    return;
                }
                break;
            case 167123846:
                if (!str.equals("ServerFill")) {
                    return;
                }
                break;
            case 885222501:
                if (!str.equals("ServerError")) {
                    return;
                }
                break;
            case 925075267:
                if (!str.equals("AdLoadSuccessful")) {
                    return;
                }
                break;
            case 1881615718:
                if (!str.equals("AdLoadFailed")) {
                    return;
                }
                break;
            case 1925668903:
                if (!str.equals("ServerNoFill")) {
                    return;
                }
                break;
            default:
                return;
        }
        C3406fa c3406fa = this.f27526v;
        if (c3406fa != null) {
            map.put("retryCount", Integer.valueOf(c3406fa.f27159b));
        }
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void a(HashMap map) {
        tn.p.k(map, "params");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "onAdInteraction " + this);
        }
        if (this.f27515k || n() == null) {
            return;
        }
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            tn.p.j("l1", "TAG");
            c3605n92.a("l1", "Ad interaction. Params: " + map);
        }
        AbstractC3423g1 abstractC3423g1M = m();
        if (abstractC3423g1M != null) {
            abstractC3423g1M.a(map);
        }
    }

    public final void a(Map map) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "setPublisherSuppliedExtras " + this + " - " + map);
        }
        this.f27516l.f28303c = map;
    }

    public final void a(final sn.a aVar, final sn.l lVar) {
        tn.p.k(aVar, "onSuccess");
        tn.p.k(lVar, "onMaxRetryReached");
        C3605n9 c3605n9 = this.f27513i;
        Object ub2 = null;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            C3406fa c3406fa = this.f27526v;
            c3605n9.c("l1", "loadWithRetry " + (c3406fa != null ? Integer.valueOf(c3406fa.f27159b) : null));
        }
        C3406fa c3406fa2 = this.f27526v;
        if (c3406fa2 != null) {
            EnumC3273a6 enumC3273a6A = Re.a();
            if (enumC3273a6A == null) {
                ub2 = Hf.f25615a;
            } else {
                int i10 = c3406fa2.f27159b + 1;
                c3406fa2.f27159b = i10;
                ub2 = i10 >= c3406fa2.f27158a.f27685b ? new Ub(enumC3273a6A) : C3588mh.f27630a;
            }
        }
        if (ub2 instanceof Ub) {
            lVar.invoke(((Ub) ub2).f26434a);
            return;
        }
        if (ub2 instanceof Hf) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                c3605n92.c("l1", "load with retry success");
            }
            aVar.invoke();
            return;
        }
        if (!(ub2 instanceof C3588mh)) {
            if (ub2 != null) {
                throw new NoWhenBranchMatchedException();
            }
            C3605n9 c3605n93 = this.f27513i;
            if (c3605n93 != null) {
                tn.p.j("l1", "TAG");
                c3605n93.c("l1", "shouldProceedToLoad result null. starting as if we have internet.");
            }
            aVar.invoke();
            return;
        }
        C3605n9 c3605n94 = this.f27513i;
        if (c3605n94 != null) {
            tn.p.j("l1", "TAG");
            c3605n94.c("l1", "load failed, retrying");
        }
        this.f27528x.postDelayed(new Runnable() { // from class: n9.e9
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3547l1.a(this.f75352b, aVar, lVar);
            }
        }, this.f27527w != null ? r8.f27684a : 1000L);
    }

    public final void a(short s10) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.b("l1", "handleAdShowFailure " + this + " errorCode - " + ((int) s10));
        }
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            tn.p.j("l1", "TAG");
            c3605n92.d("l1", "AdUnit " + this + " state - FAILED");
        }
        c((byte) 3);
        b((byte) 4);
        AbstractC3423g1 abstractC3423g1M = m();
        if (abstractC3423g1M != null) {
            abstractC3423g1M.b();
        }
        if (s10 != 0) {
            d(s10);
        }
    }

    public void a(byte[] bArr) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "load response " + this);
        }
        C3696r1 c3696r1 = this.f27530z;
        c3696r1.getClass();
        c3696r1.f28015c = SystemClock.elapsedRealtime();
        if (B()) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                c3605n92.a("l1", "isBlockingStateForLoadWithResponse - blocking");
                return;
            }
            return;
        }
        if (bArr == null || bArr.length == 0) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD), true, (short) 2143);
            C3605n9 c3605n93 = this.f27513i;
            if (c3605n93 != null) {
                tn.p.j("l1", "TAG");
                c3605n93.a("l1", "null response. failing");
                return;
            }
            return;
        }
        c((byte) 1);
        C3605n9 c3605n94 = this.f27513i;
        if (c3605n94 != null) {
            tn.p.j("l1", "TAG");
            c3605n94.d("l1", "AdUnit " + this + " state - LOADING");
        }
        this.f27511g.a(this.f27505a, new C3497j1(bArr, this, null));
    }

    public final boolean a(com.inmobi.media.ads.network.common.model.Ad ad2) {
        O0 features;
        boolean enableImmersive = this.f27507c.getRendering().getEnableImmersive();
        boolean z10 = J5.f25697i;
        boolean zA = (ad2 == null || (features = ad2.getFeatures()) == null) ? false : features.a(false);
        boolean z11 = enableImmersive && z10 && zA;
        if (!z11) {
            StringBuilder sb2 = new StringBuilder("Immersive not supported on");
            BitSet bitSet = new BitSet(3);
            ArrayList arrayList = new ArrayList();
            if (!enableImmersive) {
                arrayList.add(" config");
                bitSet.set(0);
            }
            if (!z10) {
                arrayList.add(" device");
                bitSet.set(1);
            }
            if (!zA) {
                arrayList.add(" ad");
                bitSet.set(2);
            }
            sb2.append(cn.f0.D0(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null));
            tn.p.k(bitSet, "bitSet");
            Short sh2 = (bitSet.get(0) && bitSet.get(1) && bitSet.get(2)) ? (short) 2202 : (bitSet.get(0) && bitSet.get(1)) ? (short) 2200 : (bitSet.get(0) && bitSet.get(2)) ? (short) 2199 : (bitSet.get(1) && bitSet.get(2)) ? (short) 2201 : bitSet.get(0) ? (short) 2196 : bitSet.get(1) ? (short) 2197 : bitSet.get(2) ? (short) 2198 : null;
            short sShortValue = sh2 != null ? sh2.shortValue() : (short) -1;
            Pair pair = sShortValue == -1 ? new Pair("Invalid Reason", (short) -1) : new Pair(sb2.toString(), Short.valueOf(sShortValue));
            String str = (String) pair.component1();
            short sShortValue2 = ((Number) pair.component2()).shortValue();
            HashMap map = new HashMap();
            map.put("reason", str);
            map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(sShortValue2));
            c("ImmersiveNotSupported", map);
        }
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "Immersive support - config, device, adResponse - (" + enableImmersive + com.ironsource.Z7.f30794r + z10 + com.ironsource.Z7.f30794r + zA + ")");
        }
        return z11;
    }

    public boolean a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 == null) {
            return false;
        }
        tn.p.j("l1", "TAG");
        c3605n9.c("l1", "hasNextAdInAdPod " + this);
        return false;
    }

    public final com.inmobi.media.ads.network.common.model.Ad b(int i10) {
        Iterable iterableM;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads3;
        tn.p.j("l1", "TAG");
        toString();
        AdSet adSetR = r();
        if (adSetR == null || (ads3 = adSetR.getAds()) == null || (iterableM = cn.w.n(ads3)) == null) {
            iterableM = cn.w.m();
        }
        if (cn.f0.i0(iterableM, Integer.valueOf(i10))) {
            AdSet adSetR2 = r();
            if (adSetR2 == null || (ads2 = adSetR2.getAds()) == null) {
                return null;
            }
            return ads2.get(i10);
        }
        AdSet adSetR3 = r();
        if (adSetR3 == null || (ads = adSetR3.getAds()) == null) {
            return null;
        }
        return ads.peekFirst();
    }

    public final void b(byte b10) {
        C3641ok c3641ok;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "cancelTimer " + this);
        }
        if (b10 == 1 && (c3641ok = this.f27518n) != null) {
            c3641ok.a((byte) 2);
        }
        C3641ok c3641ok2 = this.f27518n;
        if (c3641ok2 != null) {
            c3641ok2.a(b10);
        }
    }

    public final void b(int i10, boolean z10) {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "fireAdPodShowResult " + this);
        }
        ArrayList arrayList = this.f27512h;
        tn.p.k(arrayList, "list");
        if (i10 < 0 || i10 >= arrayList.size() || (gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) this.f27512h.get(i10)) == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3337ci.b(z10);
    }

    public final void b(InMobiAdRequestStatus inMobiAdRequestStatus, short s10) {
        tn.p.k(inMobiAdRequestStatus, "requestStatus");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "onAdFetchFailed " + this);
        }
        if (!this.f27515k && n() != null && this.f27506b != 3) {
            a(inMobiAdRequestStatus, s10);
            return;
        }
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            tn.p.j("l1", "TAG");
            c3605n92.b("l1", "callback ignored - isDestroyed - " + this.f27515k + " context - " + n() + " state- " + ((int) this.f27506b));
        }
    }

    public final void b(InMobiAdRequestStatus inMobiAdRequestStatus, boolean z10, short s10) {
        tn.p.k(inMobiAdRequestStatus, "requestStatus");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.b("l1", "handleAdLoadFailure " + this + " errorCode - " + ((int) s10));
        }
        if (this.f27506b == 1 && z10) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                c3605n92.b("l1", "load failed - " + ((int) s10));
            }
            C3605n9 c3605n93 = this.f27513i;
            if (c3605n93 != null) {
                tn.p.j("l1", "TAG");
                c3605n93.d("l1", "AdUnit " + this + " state - FAILED");
            }
            c((byte) 3);
            b((byte) 1);
        }
        AbstractC3423g1 abstractC3423g1M = m();
        if (abstractC3423g1M != null) {
            abstractC3423g1M.a(this, inMobiAdRequestStatus);
        } else {
            C3605n9 c3605n94 = this.f27513i;
            if (c3605n94 != null) {
                c3605n94.a();
            }
        }
        if (s10 != 0) {
            c(s10);
        }
    }

    public final void b(com.inmobi.media.ads.network.common.model.Ad ad2) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "updateAd " + this);
        }
        AdSet adSetR = r();
        if (adSetR == null || (ads = adSetR.getAds()) == null) {
            return;
        }
        ads.set(0, ad2);
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void b(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        MetaInfo metaInfo;
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "fireClickTracker " + this);
        }
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        com.inmobi.media.ads.network.common.model.Ad adB = b(this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci));
        if (tn.p.f((adB == null || (metaInfo = adB.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || adB == null) {
            return;
        }
        for (String str : AbstractC3888yi.a(adB, "click")) {
            C3823w3 c3823w3 = C3823w3.f28406a;
            C3605n9 c3605n92 = this.f27513i;
            tn.p.k(str, "url");
            C3823w3.a(str, true, c3605n92);
        }
    }

    public final void b(AbstractC3423g1 abstractC3423g1) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "onAdShowFailed " + this);
        }
        d((short) 85);
        abstractC3423g1.b();
    }

    public final void b(String str) {
        tn.p.k(str, "podAdContext");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "setPodAdContext " + this);
        }
        if (this.f27523s) {
            this.f27524t = str;
        }
    }

    public final void b(String str, Map map) {
        com.inmobi.media.ads.network.common.model.Ad adO;
        MetaInfo metaInfo;
        String creativeType;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "onTelemetryEvent " + this + " adState=" + ((int) this.f27506b));
        }
        if (this.f27506b != 3) {
            a(str, map);
            if ((tn.p.f(str, "ServerFill") || tn.p.f(str, "ServerError")) && (adO = o()) != null && (metaInfo = adO.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
                map.put("creativeType", creativeType);
            }
            c(str, map);
        }
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void b(HashMap map) {
        tn.p.k(map, "rewards");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "onAdRewardActionCompleted " + this);
        }
        if (this.f27515k || n() == null) {
            return;
        }
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            tn.p.j("l1", "TAG");
            c3605n92.a("l1", "Ad reward action completed. Params:" + map);
        }
        AbstractC3423g1 abstractC3423g1M = m();
        if (abstractC3423g1M != null) {
            abstractC3423g1M.b(map);
        }
    }

    public final void b(Map map) {
        MetaInfo metaInfo;
        String creativeType;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f27530z.f28016d));
        map.put("networkType", C3850x5.m());
        map.put("plId", Long.valueOf(this.f27516l.f28301a));
        AdSet adSetR = r();
        map.put("isRewarded", Boolean.valueOf(adSetR != null ? adSetR.isRewarded() : false));
        String str = this.f27516l.f28305e;
        if (str != null) {
            map.put("adType", str);
        }
        String str2 = this.f27516l.f28306f;
        if (str2 != null) {
            map.put("plType", str2);
        }
        C3406fa c3406fa = this.f27526v;
        if (c3406fa != null) {
            map.put("retryCount", Integer.valueOf(c3406fa.f27159b));
        }
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO != null && (metaInfo = adO.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        a(o(), map);
        b("ServerError", map);
    }

    public final void b(short s10) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "submitAdLoadDroppedAtSDK " + this);
        }
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
        c(map);
        c("AdLoadDroppedAtSDK", map);
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void c() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "onAdScreenDisplayFailed " + this);
        }
        if (this.f27515k || n() == null) {
            return;
        }
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            tn.p.j("l1", "TAG");
            c3605n92.b("l1", "Ad failed to display");
        }
        Handler handler = this.f27514j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: n9.x8
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3547l1.b(this.f75694b);
                }
            });
        }
    }

    public final void c(byte b10) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.d("l1", "STATE UPDATE: from " + ((int) this.f27506b) + " to " + ((int) b10));
        }
        this.f27506b = b10;
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void c(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        MetaInfo metaInfo;
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "fireImpressionTracker " + this);
        }
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        com.inmobi.media.ads.network.common.model.Ad adB = b(this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci));
        if (tn.p.f((adB == null || (metaInfo = adB.getMetaInfo()) == null) ? null : metaInfo.getCreativeType(), "video") || adB == null) {
            return;
        }
        for (String str : AbstractC3888yi.a(adB, "impression")) {
            C3442gk telemetryOnAdImpression = gestureDetectorOnGestureListenerC3337ci.getTelemetryOnAdImpression();
            telemetryOnAdImpression.getClass();
            tn.p.k("adResponseTracker", "<set-?>");
            telemetryOnAdImpression.f27252f = "adResponseTracker";
            C3823w3 c3823w3 = C3823w3.f28406a;
            C3267a0 c3267a0 = new C3267a0(this.f27525u, telemetryOnAdImpression);
            C3605n9 c3605n92 = this.f27513i;
            tn.p.k(str, "url");
            Dg.a(Ag.f25162a, new C3624o3(str, c3605n92, c3267a0, null));
        }
    }

    public final void c(AbstractC3423g1 abstractC3423g1) {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        tn.p.k(abstractC3423g1, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "onFetchSuccess " + this);
        }
        HashMap map = new HashMap();
        c(map);
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO == null || (impressionId = adO.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        long j10 = this.f27530z.f28020h;
        p000do.l0 l0Var = AbstractC3492il.f27361a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("metadataBlob", x());
        C3406fa c3406fa = this.f27526v;
        if (c3406fa != null) {
            map.put("retryCount", Integer.valueOf(c3406fa.f27159b));
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.isRewarded()));
        }
        com.inmobi.media.ads.network.common.model.Ad adO2 = o();
        if (adO2 != null && (metaInfo = adO2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        c("ParseSuccess", map);
        AdMetaInfo adMetaInfoJ = j();
        if (adMetaInfoJ == null) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                c3605n92.b("l1", "ad meta info null. fail");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2106);
            return;
        }
        C3605n9 c3605n93 = this.f27513i;
        if (c3605n93 != null) {
            tn.p.j("l1", "TAG");
            c3605n93.a("l1", "callback - onAdFetchSuccess");
        }
        abstractC3423g1.b(adMetaInfoJ);
    }

    public final void c(String str, Map map) {
        tn.p.k(str, "eventType");
        tn.p.k(map, "kv");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "submitTelemetryEvent " + this);
        }
        Wj wj2 = Wj.f26549a;
        Wj.b(str, map, EnumC3287ak.f26805a);
    }

    public final void c(HashMap map) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "constructTelemetryPayload " + this);
        }
        map.put("adType", l());
        map.put("networkType", C3850x5.m());
        map.put("plId", Long.valueOf(this.f27516l.f28301a));
        String str = this.f27516l.f28306f;
        if (str != null) {
            map.put("plType", str);
        }
    }

    public final void c(short s10) {
        long j10;
        long jElapsedRealtime;
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "submitAdLoadFailedEvent " + this);
        }
        HashMap map = new HashMap();
        if (s10 == 2138 || s10 == 2109) {
            j10 = this.f27530z.f28017e;
            p000do.l0 l0Var = AbstractC3492il.f27361a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else if (s10 == 2139) {
            j10 = this.f27530z.f28019g;
            p000do.l0 l0Var2 = AbstractC3492il.f27361a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j10 = this.f27530z.f28015c;
            p000do.l0 l0Var3 = AbstractC3492il.f27361a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        map.put("latency", Long.valueOf(jElapsedRealtime - j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adO = o();
        if (adO == null || (impressionId = adO.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adO2 = o();
        if (adO2 != null && (metaInfo = adO2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        C3406fa c3406fa = this.f27526v;
        if (c3406fa != null) {
            map.put("retryCount", Integer.valueOf(c3406fa.f27159b));
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.isRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        a(o(), map);
        c("AdLoadFailed", map);
    }

    public final boolean c(int i10) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "getAllowAutoRedirectionForIndex " + this + " index - " + i10);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(i10);
        return adB != null && adB.getAllowAutoRedirection();
    }

    public void d() throws JSONException {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "clear " + this);
        }
        if (this.f27515k) {
            return;
        }
        this.f27515k = true;
        Handler handler = this.f27514j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        e();
        C3406fa c3406fa = this.f27526v;
        if (c3406fa != null) {
            c3406fa.f27159b = 0;
        }
        I();
        c((byte) 0);
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            tn.p.j("l1", "TAG");
            c3605n92.d("l1", "AdUnit " + this + " state - CREATED");
        }
        C3880ya c3880ya = this.f27511g;
        String str = this.f27505a;
        c3880ya.getClass();
        tn.p.k(str, "id");
        List list = (List) c3880ya.f28576b.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g.a.a((kotlinx.coroutines.g) it.next(), null, 1, null);
            }
        }
        List list2 = (List) c3880ya.f28576b.get(str);
        if (list2 != null) {
            list2.clear();
        }
        this.f27517m = null;
        this.f27523s = false;
    }

    public final void d(int i10) {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "initializeHtmlAdContainer " + this);
        }
        Context contextN = n();
        if (contextN == null) {
            return;
        }
        try {
            if (this.f27512h.get(i10) == null || ((gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) this.f27512h.get(i10)) != null && gestureDetectorOnGestureListenerC3337ci.M.get())) {
                com.inmobi.media.ads.network.common.model.Ad adB = b(i10);
                C3621o0 c3621o0A = a(i10);
                GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = ((ko) this.B.getValue()).a(new Di("adUnit-" + i10, "default"), contextN, (short) 0, c3621o0A, this.f27507c);
                a(gestureDetectorOnGestureListenerC3337ciA, c3621o0A.f27728p);
                this.f27512h.set(i10, gestureDetectorOnGestureListenerC3337ciA);
                gestureDetectorOnGestureListenerC3337ciA.a(this);
                gestureDetectorOnGestureListenerC3337ciA.a(adB);
            }
        } catch (Exception e10) {
            a((GestureDetectorOnGestureListenerC3337ci) this.f27512h.get(this.f27519o), (short) 2136);
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                c3605n92.a("l1", "Exception while initializing WebView", e10);
            }
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void d(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        if (this.C) {
            return;
        }
        this.C = true;
        C3589mi c3589mi = gestureDetectorOnGestureListenerC3337ci.f26948d0;
        if (c3589mi != null) {
            Map mapA = c3589mi.a();
            Wj wj2 = Wj.f26549a;
            Wj.b("AttachedToWindow", mapA, EnumC3287ak.f26805a);
        }
    }

    public final void d(AbstractC3423g1 abstractC3423g1) {
        tn.p.k(abstractC3423g1, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "onLoadSuccess " + this);
        }
        AdMetaInfo adMetaInfoJ = j();
        if (adMetaInfoJ == null) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                c3605n92.b("l1", "load success - ad unit null");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2107);
            return;
        }
        b((byte) 1);
        C3605n9 c3605n93 = this.f27513i;
        if (c3605n93 != null) {
            tn.p.j("l1", "TAG");
            c3605n93.a("l1", "callback - onAdLoadSucceeded");
        }
        abstractC3423g1.c(adMetaInfoJ);
    }

    public final void d(short s10) {
        String impressionId;
        MetaInfo metaInfo;
        String creativeType;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "submitAdShowFailed " + this);
        }
        HashMap map = new HashMap();
        long j10 = this.f27530z.f28018f;
        p000do.l0 l0Var = AbstractC3492il.f27361a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
        map.put("markupType", s());
        com.inmobi.media.ads.network.common.model.Ad adP = p();
        if (adP == null || (impressionId = adP.getImpressionId()) == null) {
            impressionId = "";
        }
        map.put("impressionId", impressionId);
        com.inmobi.media.ads.network.common.model.Ad adP2 = p();
        if (adP2 != null && (metaInfo = adP2.getMetaInfo()) != null && (creativeType = metaInfo.getCreativeType()) != null) {
            map.put("creativeType", creativeType);
        }
        AdSet adSetR = r();
        if (adSetR != null) {
            map.put("isRewarded", Boolean.valueOf(adSetR.isRewarded()));
        }
        if (x().length() > 0) {
            map.put("metadataBlob", x());
        }
        c(map);
        a(p(), map);
        c("AdShowFailed", map);
    }

    public final boolean d(byte b10) {
        int iY;
        Integer num;
        long j10;
        Integer num2;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "startTimer " + this);
        }
        if (b10 == 0) {
            C3608nc c3608nc = this.f27527w;
            if (c3608nc != null && (num2 = c3608nc.f27687d) != null) {
                iY = num2.intValue();
                j10 = iY;
            }
            j10 = 15000;
        } else if (b10 == 1) {
            C3608nc c3608nc2 = this.f27527w;
            if (c3608nc2 != null) {
                iY = c3608nc2.f27686c;
                j10 = iY;
            }
            j10 = 15000;
        } else {
            if (b10 == 2) {
                C3608nc c3608nc3 = this.f27527w;
                if (c3608nc3 != null && (num = c3608nc3.f27688e) != null) {
                    iY = num.intValue();
                }
                j10 = 15000;
            } else {
                if (b10 != 4) {
                    C3605n9 c3605n92 = this.f27513i;
                    if (c3605n92 != null) {
                        tn.p.j("l1", "TAG");
                        c3605n92.b("l1", "Invalid value for timeOutScenario passed!. Please pass a valid value");
                    }
                    return false;
                }
                TimeoutConfigurations timeoutConfigurations = this.f27509e;
                tn.p.h(timeoutConfigurations);
                iY = timeoutConfigurations.Y();
            }
            j10 = iY;
        }
        C3641ok c3641ok = this.f27518n;
        return c3641ok != null && c3641ok.a(b10, j10);
    }

    public final void e() throws JSONException {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "clearAdPods " + this);
        }
        if (this.f27523s) {
            f();
            this.f27512h.clear();
            this.f27519o = 0;
            this.f27520p = 0;
            this.f27522r.clear();
        }
    }

    public final void e(int i10) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "resetCurrentRenderingIndex " + this);
        }
        this.f27520p = i10;
    }

    public final void e(AbstractC3423g1 abstractC3423g1) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "adUnitEventListener setter " + this);
        }
        WeakReference weakReference = new WeakReference(abstractC3423g1);
        this.f27510f = weakReference;
        AdSet adSetR = r();
        C3293b0 c3293b0 = new C3293b0(weakReference, ImpressionLog.f51753w, adSetR != null ? adSetR.isRewarded() : false);
        this.f27525u = c3293b0;
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            tn.p.k(c3605n92, "logger");
            c3293b0.f26825f = c3605n92;
        }
    }

    public final void f() throws JSONException {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "destroyAllContainer " + this);
        }
        int size = this.f27512h.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(i10, true);
        }
    }

    public final void g() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "doAdLoadWork " + this);
        }
        try {
            c((byte) 1);
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                c3605n92.d("l1", "AdUnit " + this + " state - LOADING");
            }
            H();
            C3476i4 c3476i4 = Y3.f26611a;
            tn.p.k(RootConfig.class, "clazz");
            if (((RootConfig) Y3.f26611a.a(RootConfig.class)).isMonetizationDisabled()) {
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (short) 2012);
                C3605n9 c3605n93 = this.f27513i;
                if (c3605n93 != null) {
                    tn.p.j("l1", "TAG");
                    c3605n93.b("l1", "Monetization is Disabled");
                    return;
                }
                return;
            }
            if (d((byte) 0)) {
                this.f27511g.a(this.f27505a, new C3448h1(this, null));
                C3605n9 c3605n94 = this.f27513i;
                if (c3605n94 != null) {
                    tn.p.j("l1", "TAG");
                    c3605n94.a("l1", "Fresh ad requested");
                }
            }
        } catch (Exception e10) {
            C3605n9 c3605n95 = this.f27513i;
            if (c3605n95 != null) {
                tn.p.j("l1", "TAG");
                c3605n95.b("l1", "Load failed with unexpected error: " + e10.getMessage());
            }
            bn.g gVar = P9.f26117a;
            P9.a(new L2(e10));
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2000);
        }
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void g(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "RenderView completed loading ad content, for index " + this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci) + com.ironsource.Z7.f30794r + this);
        }
    }

    public final void h() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "fireAdServedBeacon " + this);
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciI = i();
        if (gestureDetectorOnGestureListenerC3337ciI == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3337ciI.t();
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void h(final GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        Handler handler;
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "onRenderViewSignaledAdFailed " + this);
        }
        if (this.f27515k || n() == null || (handler = this.f27514j) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: n9.y8
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3547l1.a(this.f75708b, gestureDetectorOnGestureListenerC3337ci);
            }
        });
    }

    public final GestureDetectorOnGestureListenerC3337ci i() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "adMarkupContainer getter " + this);
        }
        byte b10 = this.f27506b;
        String strS = s();
        if (tn.p.f(strS, CreativeInfo.f52467al)) {
            if (b10 == 0 || 1 == b10 || 3 == b10 || 8 == b10) {
                return null;
            }
            return q();
        }
        if (!tn.p.f(strS, "htmlUrl") || b10 == 0 || 1 == b10 || 3 == b10 || 8 == b10) {
            return null;
        }
        return q();
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void i(final GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "onRenderViewSignaledAdReady " + this);
        }
        if (this.f27515k || n() == null) {
            c((short) 2186);
            return;
        }
        Handler handler = this.f27514j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: n9.g9
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3547l1.b(this.f75389b, gestureDetectorOnGestureListenerC3337ci);
                }
            });
        } else {
            c((short) 2187);
        }
    }

    public final AdMetaInfo j() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "adMetaInfo getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        if (adB != null) {
            return new AdMetaInfo(adB.getCreativeId(), adB.getTransaction());
        }
        return null;
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public void j(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "RenderView visible, for index " + this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci) + com.ironsource.Z7.f30794r + this);
        }
    }

    public HashMap k() {
        return new HashMap();
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void k(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) throws JSONException {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        byte b10 = this.f27506b;
        if (b10 == 2) {
            U();
            b((byte) 1);
            AbstractC3423g1 abstractC3423g1M = m();
            InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
            if (abstractC3423g1M != null) {
                abstractC3423g1M.a(this, inMobiAdRequestStatus);
            } else {
                C3605n9 c3605n9 = this.f27513i;
                if (c3605n9 != null) {
                    c3605n9.a();
                }
            }
            c((short) 2238);
            gestureDetectorOnGestureListenerC3337ci.b();
            return;
        }
        if (b10 == 4) {
            p(gestureDetectorOnGestureListenerC3337ci);
            gestureDetectorOnGestureListenerC3337ci.b();
            b((byte) 4);
        } else {
            if (b10 == 6 || b10 == 7) {
                q(gestureDetectorOnGestureListenerC3337ci);
                return;
            }
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "TAG");
                c3605n92.b("l1", "onUnloadCalled - invalid state - " + ((int) this.f27506b));
            }
        }
    }

    public abstract String l();

    public final void l(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        int iIndexOf = this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci);
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.b("l1", "fireLoadAdTokenUrlFailed : " + iIndexOf + com.ironsource.Z7.f30794r + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(iIndexOf);
        if (adB != null) {
            for (String str : AbstractC3888yi.a(adB, "load_ad_token_url_failure")) {
                C3823w3 c3823w3 = C3823w3.f28406a;
                C3605n9 c3605n92 = this.f27513i;
                tn.p.k(str, "url");
                C3823w3.a(str, true, c3605n92);
            }
        }
    }

    public final AbstractC3423g1 m() {
        C3605n9 c3605n9;
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            tn.p.j("l1", "TAG");
            c3605n92.c("l1", "adUnitEventListener getter " + this);
        }
        AbstractC3423g1 abstractC3423g1 = (AbstractC3423g1) this.f27510f.get();
        if (abstractC3423g1 == null && (c3605n9 = this.f27513i) != null) {
            c3605n9.b("InMobi", "Listener was garbage collected. Unable to give callback");
        }
        return abstractC3423g1;
    }

    public final void m(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        int iIndexOf = this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci);
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "fireLoadAdTokenUrlSuccessful : " + iIndexOf + com.ironsource.Z7.f30794r + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(iIndexOf);
        if (adB != null) {
            for (String str : AbstractC3888yi.a(adB, "load_ad_token_url")) {
                C3823w3 c3823w3 = C3823w3.f28406a;
                C3605n9 c3605n92 = this.f27513i;
                tn.p.k(str, "url");
                C3823w3.a(str, true, c3605n92);
            }
        }
    }

    public final int n(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "getCurrentRenderingPodAdIndex " + this);
        }
        if (!this.f27523s) {
            return -1;
        }
        int iIndexOf = this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci);
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            tn.p.j("l1", "TAG");
            c3605n92.c("l1", "getCurrentRenderingPodAdIndex " + iIndexOf);
        }
        return iIndexOf;
    }

    public final Context n() {
        WeakReference weakReference = this.f27508d;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public final com.inmobi.media.ads.network.common.model.Ad o() {
        return this.f27523s ? b(this.f27519o) : b(0);
    }

    public void o(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        Gh gh2;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.a("l1", "Render view signaled ad ready, for index " + this.f27512h.indexOf(gestureDetectorOnGestureListenerC3337ci) + com.ironsource.Z7.f30794r + this);
        }
        C3605n9 c3605n92 = this.f27513i;
        if (c3605n92 != null) {
            tn.p.j("l1", "TAG");
            c3605n92.a("l1", "==== CHECKPOINT REACHED - LOAD SUCCESS ====");
        }
        C3605n9 c3605n93 = this.f27513i;
        if (c3605n93 == null || (gh2 = c3605n93.f27675a) == null) {
            return;
        }
        gh2.a();
    }

    public final com.inmobi.media.ads.network.common.model.Ad p() {
        return this.f27523s ? b(this.f27520p) : b(0);
    }

    public void p(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        int iN;
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "onAdUnloadedAfterLoadSuccess");
        }
        if (!this.f27523s || (iN = n(gestureDetectorOnGestureListenerC3337ci)) <= this.f27520p) {
            U();
        } else {
            this.f27522r.remove(Integer.valueOf(iN));
        }
    }

    public abstract GestureDetectorOnGestureListenerC3337ci q();

    public void q(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "onAdUnloadedAfterShowSuccess");
        }
        gestureDetectorOnGestureListenerC3337ci.m();
        b((byte) 4);
    }

    public final AdSet r() {
        List<AdSet> adSets;
        AdResponse adResponse = this.f27517m;
        if (adResponse == null || (adSets = adResponse.getAdSets()) == null) {
            return null;
        }
        return (AdSet) cn.f0.v0(adSets);
    }

    public final String s() {
        String markupType;
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "markupType getter " + this);
        }
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        return (adB == null || (markupType = adB.getMarkupType()) == null) ? "unknown" : markupType;
    }

    public abstract byte t();

    public final String u() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "getPodAdContext " + this);
        }
        if (this.f27523s) {
            return this.f27524t;
        }
        return null;
    }

    public final JSONArray v() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "getRenderableAdIndexes " + this);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f27522r.iterator();
        tn.p.j(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            tn.p.j(next, "next(...)");
            jSONArray.put(((Number) next).intValue());
        }
        return jSONArray;
    }

    public final long w() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "getShowTimeStamp " + this);
        }
        if (this.f27523s) {
            return this.f27521q;
        }
        return -1L;
    }

    public final String x() {
        String telemetryMetadataBlob;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        AdSet adSetR = r();
        com.inmobi.media.ads.network.common.model.Ad ad2 = (adSetR == null || (ads = adSetR.getAds()) == null) ? null : (com.inmobi.media.ads.network.common.model.Ad) cn.f0.v0(ads);
        return (ad2 == null || (telemetryMetadataBlob = ad2.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }

    public final TimeoutConfigurations y() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "TAG");
            c3605n9.c("l1", "timeOutConfiguration getter " + this);
        }
        AdConfig adConfig = this.f27507c;
        tn.p.h(adConfig);
        return adConfig.getTimeouts();
    }

    public final boolean z() {
        AdConfig.CacheConfig cacheConfig;
        C3605n9 c3605n9;
        com.inmobi.media.ads.network.common.model.Ad adB = b(0);
        if (adB == null) {
            return false;
        }
        AdConfig adConfig = this.f27507c;
        if (adConfig != null && (cacheConfig = adConfig.getCacheConfig(l())) != null) {
            z = ((adB.getExpiryTimestampInMillis() > (-1L) ? 1 : (adB.getExpiryTimestampInMillis() == (-1L) ? 0 : -1)) == 0 ? TimeUnit.SECONDS.toMillis(cacheConfig.getTimeToLive()) + adB.getInsertionTimestampInMillis() : adB.getExpiryTimestampInMillis()) - System.currentTimeMillis() < 0;
            if (z && (c3605n9 = this.f27513i) != null) {
                tn.p.j("l1", "TAG");
                c3605n9.b("l1", "Top ad has expired, failing show of ad.");
            }
        }
        return z;
    }
}
