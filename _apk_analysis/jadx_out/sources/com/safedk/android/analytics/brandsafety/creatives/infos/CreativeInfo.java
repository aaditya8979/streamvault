package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.C3978d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.a;
import com.safedk.android.analytics.brandsafety.creatives.e;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.io.Serializable;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class CreativeInfo implements Serializable {
    public static final String A = "details?id=";
    public static final String B = "isVideoAd";
    public static final String C = "isPlayable";
    public static final String D = "campaign_id";
    public static final String L = "buyer_id";
    public static final String S = "ad_system";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52465a = "CreativeInfo";
    public static final String aF = "native";
    public static final String aG = "native_banner";
    public static final String aH = "/ad_count_";
    public static final String aI = "/multiple_ads";
    public static final String aJ = "/multi_ad";
    public static final String aK = "webview_resource_urls_expanded";
    public static final String aL = "matchingMethodAddress";
    public static final String aM = "title:";
    public static final String aN = "mainImg:";
    public static final String aO = "icon:";
    public static final String aP = "body:";
    public static final String aQ = "cta:";
    public static final String aR = "star:";
    public static final String aS = "advertiser:";
    public static final String aT = "element:";
    public static final String aU = "ad_domain";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    public static final String f52466ak = "end_card_url";

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    public static final String f52467al = "html";

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    public static final String f52468am = "vast_ad_tag_uris";

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    public static final String f52469an = "log";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    public static final String f52470ao = "event_id";

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public static final String f52471ap = "text:";

    /* JADX INFO: renamed from: aq, reason: collision with root package name */
    public static final String f52472aq = "video:";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52473b = "prefetchTimestamp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52474c = "ad_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f52475d = "creative_id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52476e = "video_url";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52477f = "ci_matching_method";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f52478g = "ci_debug_info";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f52479h = "exact_";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f52480i = "exact_fbLabel";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f52481j = "exact_markup";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f52482k = "exact_video";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f52483l = "exact_resource";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f52484m = "exact_ad_id";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f52485n = "exact_ad_object";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f52486o = "heuristic_mediation";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f52487p = "heuristic_pending";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f52488q = "downstream_struct";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f52489r = "vast";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f52490s = "survey";
    private static final long serialVersionUID = 4107472620437040927L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f52491t = "text";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f52492u = "playable";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f52493v = "image";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f52494w = "mraid";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f52495x = "dsp_creative_id";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f52496y = "webview_resource_urls";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f52497z = "prefetch_resource_urls";
    private BrandSafetyUtils.AdType E;
    protected String F;
    protected boolean G;
    protected boolean H;
    protected boolean I;
    protected String J;
    protected String K;
    protected String M;
    protected final HashSet<String> N;
    protected final HashSet<String> O;
    protected final HashSet<String> P;
    public String Q;
    Timestamp R;
    boolean T;
    boolean U;
    boolean V;
    boolean W;
    protected String X;
    private String Y;
    private boolean Z;
    private String aA;
    private String aB;
    private boolean aC;
    private String aD;
    private String aE;
    protected String aV;
    protected String aW;
    protected String aX;
    protected String aY;
    protected final HashSet<String> aZ;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private String f52498aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private long f52499ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private String f52500ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private String f52501ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private int f52502ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private boolean f52503af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private boolean f52504ag;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private String f52505ah;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private String f52506ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private List<String> f52507aj;

    /* JADX INFO: renamed from: ar, reason: collision with root package name */
    protected String f52508ar;

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    protected String f52509as;

    /* JADX INFO: renamed from: at, reason: collision with root package name */
    protected String f52510at;
    protected final HashSet<String> au;
    boolean av;
    public final ArrayList<String> aw;
    public final Set<String> ax;
    public boolean ay;
    private transient View az;

    /* JADX INFO: renamed from: ba, reason: collision with root package name */
    boolean f52511ba;

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    public boolean f52512bb;

    /* JADX INFO: renamed from: bc, reason: collision with root package name */
    protected boolean f52513bc;

    /* JADX INFO: renamed from: bd, reason: collision with root package name */
    protected final ImpressionLog f52514bd;

    /* JADX INFO: renamed from: be, reason: collision with root package name */
    private final List<String> f52515be;

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private boolean f52516bf;

    /* JADX INFO: renamed from: bg, reason: collision with root package name */
    private boolean f52517bg;

    public CreativeInfo() {
        this.f52503af = false;
        this.f52515be = new ArrayList();
        this.az = null;
        this.Z = false;
        this.aV = null;
        this.G = false;
        this.H = false;
        this.f52499ab = 0L;
        this.aC = false;
        this.f52504ag = false;
        this.f52516bf = true;
        this.f52505ah = null;
        this.N = new HashSet<>();
        this.O = new HashSet<>();
        this.aZ = new HashSet<>();
        this.P = new HashSet<>();
        this.au = new LinkedHashSet();
        this.T = false;
        this.U = false;
        this.av = false;
        this.V = false;
        this.W = false;
        this.f52511ba = false;
        this.f52512bb = false;
        this.f52513bc = false;
        this.f52514bd = new ImpressionLog();
        this.aw = new ArrayList<>();
        this.ax = new HashSet();
        this.ay = false;
    }

    public CreativeInfo(BrandSafetyUtils.AdType adType, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f52503af = false;
        this.f52515be = new ArrayList();
        this.az = null;
        this.Z = false;
        this.aV = null;
        this.G = false;
        this.H = false;
        this.f52499ab = 0L;
        this.aC = false;
        this.f52504ag = false;
        this.f52516bf = true;
        this.f52505ah = null;
        this.N = new HashSet<>();
        this.O = new HashSet<>();
        this.aZ = new HashSet<>();
        this.P = new HashSet<>();
        this.au = new LinkedHashSet();
        this.T = false;
        this.U = false;
        this.av = false;
        this.V = false;
        this.W = false;
        this.f52511ba = false;
        this.f52512bb = false;
        this.f52513bc = false;
        this.f52514bd = new ImpressionLog();
        this.aw = new ArrayList<>();
        this.ax = new HashSet();
        this.ay = false;
        this.E = adType;
        this.f52498aa = str;
        this.Y = str2;
        i(str3);
        t(str4);
        o(str5);
        this.f52504ag = true;
        this.f52499ab = k.b(SystemClock.elapsedRealtime());
        this.F = str6;
        this.T = TextUtils.isEmpty(str5) ? false : true;
        this.f52514bd.a(ImpressionLog.f51731a, new ImpressionLog.a[0]);
        ac();
    }

    public static String D(String str) {
        return TextUtils.isEmpty(str) ? str : k.k(k.E(str));
    }

    private void H(String str) {
        if (this.O.contains(str)) {
            Logger.d(f52465a, "removing url from WebView resource urls : " + str);
            this.O.remove(str);
        }
    }

    private String a(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(A)) == -1) {
            return null;
        }
        int iIndexOf2 = str.indexOf(C3978d4.j.f31381c, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.length();
        }
        return str.substring(iIndexOf + A.length(), iIndexOf2);
    }

    public static List<String> a(List<CreativeInfo> list, String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null || list == null || list.size() == 0) {
            return arrayList;
        }
        String lowerCase = str.toLowerCase();
        for (CreativeInfo creativeInfo : list) {
            if (lowerCase.equals("id")) {
                arrayList.add(creativeInfo.f52500ac);
            } else if (lowerCase.equals("clickurl")) {
                arrayList.add(creativeInfo.f52501ad);
            } else if (lowerCase.equals("adid")) {
                arrayList.add(creativeInfo.Y);
            }
        }
        return arrayList;
    }

    public static CreativeInfo n(String str) {
        CreativeInfo creativeInfo = new CreativeInfo();
        creativeInfo.Y = str;
        return creativeInfo;
    }

    public String A() {
        return this.X;
    }

    public void A(String str) {
        if (str != null) {
            if (this.f52515be == null || this.f52515be.contains(str)) {
                Logger.d(f52465a, "add prefetch text: already in the list, will not be added: " + str);
                return;
            }
            synchronized (this.P) {
                this.P.add("text:" + str.trim());
            }
        }
    }

    public void B(String str) {
        if (str != null) {
            if (this.f52515be == null || this.f52515be.contains(str)) {
                Logger.d(f52465a, "add prefetch element: already in the list, will not be added: " + str);
                return;
            }
            synchronized (this.P) {
                this.P.add(aT + str);
            }
        }
    }

    public boolean B() {
        return this.f52513bc;
    }

    public void C() {
        this.f52517bg = true;
    }

    public void C(String str) {
        String strD = D(str);
        if (!TextUtils.isEmpty(strD)) {
            synchronized (this.au) {
                this.au.add(strD);
            }
        }
        synchronized (this.N) {
            this.N.remove(strD);
        }
    }

    public boolean D() {
        return this.f52517bg;
    }

    public ImpressionLog E() {
        return this.f52514bd;
    }

    protected String E(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable th2) {
            Logger.d(f52465a, "Failure in encode url. This url will be sent as is in the next event. " + th2.getMessage() + ". Url=" + str);
            return str;
        }
    }

    public String F() {
        return this.K;
    }

    public void F(String str) {
        this.X = str;
    }

    public String G() {
        StringBuilder sb2 = new StringBuilder();
        if (this.G) {
            sb2.append(this.Y);
        }
        sb2.append(this.f52500ac);
        sb2.append(this.J);
        return sb2.toString();
    }

    public void G(String str) {
        String strD = D(str);
        this.f52515be.add(strD);
        H(strD);
    }

    public String H() {
        return this.J;
    }

    public String I() {
        return this.aE;
    }

    public boolean J() {
        return !this.f52504ag;
    }

    public BrandSafetyUtils.AdType K() {
        return this.E;
    }

    public String L() {
        return this.Y;
    }

    public String M() {
        return this.f52501ad;
    }

    public String N() {
        return this.f52500ac;
    }

    public String O() {
        return this.aB;
    }

    public String P() {
        return this.f52508ar;
    }

    public String Q() {
        return this.f52498aa;
    }

    public String R() {
        return this.aA;
    }

    public int S() {
        return this.f52502ae;
    }

    public void T() {
        this.f52506ai = null;
    }

    public String U() {
        return this.f52506ai;
    }

    public String V() {
        return this.f52505ah;
    }

    public List<String> W() {
        return this.f52507aj;
    }

    public String X() {
        Bundle bundle = new Bundle();
        bundle.putString(f52474c, this.Y);
        if (this.aW != null) {
            bundle.putString(aL, this.aW);
        }
        if (this.aD != null) {
            bundle.putString("event_id", this.aD);
        }
        return bundle.toString();
    }

    public Timestamp Y() {
        return this.R;
    }

    public void Z() {
        this.Z = true;
    }

    public void a(int i10) {
        this.f52502ae = i10;
    }

    public void a(View view) {
        this.az = view;
    }

    public void a(BrandSafetyUtils.AdType adType) {
        if (adType == null) {
            Logger.d(f52465a, "setAdType - ad type is null, not setting");
            return;
        }
        Logger.d(f52465a, "setAdType - set to ad type: " + adType + " for ci with id: " + this.Y);
        this.E = adType;
        ac();
    }

    public void a(CreativeInfo creativeInfo) {
    }

    public void a(Long l10, Long l11, String str, ImpressionLog.a... aVarArr) {
        try {
            this.f52514bd.a(l10, l11, str, aVarArr);
        } catch (NullPointerException e10) {
            Logger.d(f52465a, "add impression log event failed: type=" + str + ", impressionLog=" + this.f52514bd);
        }
    }

    public void a(Object obj) {
        if (obj != null) {
            this.aX = obj.getClass().getCanonicalName();
            this.aW = BrandSafetyUtils.a(obj);
            Logger.d(f52465a, "set matching object - type: " + this.aX + ", address: " + this.aW + ", ad id: " + this.Y);
        }
    }

    public void a(String str, String str2) {
        this.f52505ah = str;
        u("mi=" + str2);
    }

    public void a(String str, Set<String> set) {
        a(Arrays.asList(str), set);
    }

    public void a(String str, ImpressionLog.a... aVarArr) {
        try {
            this.f52514bd.a(str, aVarArr);
        } catch (NullPointerException e10) {
            Logger.d(f52465a, "add impression log event failed: type=" + str + ", impressionLog=" + this.f52514bd);
        }
    }

    public void a(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            x(it.next());
        }
    }

    public void a(List<String> list) {
        this.f52507aj = list;
    }

    public void a(List<String> list, Set<String> set) {
        Logger.d(f52465a, "add recommendations: " + list + ", resources list: " + set);
        if (list != null) {
            synchronized (this.aw) {
                this.aw.addAll(list);
            }
            Logger.d(f52465a, "add recommendations added : " + list);
        }
        if (set != null) {
            synchronized (this.ax) {
                this.ax.addAll(set);
            }
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String strD = D(it.next());
                if (!TextUtils.isEmpty(strD)) {
                    synchronized (this.ax) {
                        this.ax.add(strD);
                    }
                    synchronized (this.O) {
                        if (this.O.contains(strD)) {
                            Logger.d(f52465a, "removing recommendation resource " + strD + " from WebView resource urls");
                            this.O.remove(strD);
                        }
                    }
                }
            }
        }
    }

    public void a(boolean z10) {
        this.aC = z10;
    }

    public boolean a(Map<Integer, CreativeInfo> map) {
        if (this.f52502ae == 0) {
            return false;
        }
        synchronized (map) {
            map.put(Integer.valueOf(this.f52502ae), this);
        }
        return true;
    }

    public String aa() {
        return this.f52500ac;
    }

    public long ab() {
        return this.f52499ab;
    }

    public void ac() {
        a aVarI = CreativeInfoManager.i(this.f52498aa);
        if (aVarI != null) {
            if (K().equals(BrandSafetyUtils.AdType.INTERSTITIAL)) {
                this.R = new Timestamp(System.currentTimeMillis() + aVarI.e(AdNetworkConfiguration.FULL_SCREEN_CI_MAX_AGE));
                Logger.d(f52465a, "set expiration time - sdk: " + this.f52498aa + ", inter max age: " + aVarI.e(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE));
            } else if (K().equals(BrandSafetyUtils.AdType.BANNER) || K().equals(BrandSafetyUtils.AdType.MREC) || K().equals(BrandSafetyUtils.AdType.NATIVE)) {
                this.R = new Timestamp(System.currentTimeMillis() + aVarI.e(AdNetworkConfiguration.BANNER_CI_MAX_AGE));
                Logger.d(f52465a, "set expiration time - sdk: " + this.f52498aa + ", banner/mrec/native max age: " + aVarI.e(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE));
            }
        }
    }

    public boolean ad() {
        return this.f52516bf;
    }

    public String ae() {
        return this.aX;
    }

    public String af() {
        return this.aW;
    }

    public void ag() {
        long j10 = this.f52499ab;
        this.f52499ab = k.b(SystemClock.elapsedRealtime());
        Logger.d(f52465a, "prefetch timestamp reset. old value = " + j10 + ", new value = " + this.f52499ab);
    }

    public boolean ah() {
        return this.f52511ba;
    }

    public void ai() {
        this.f52511ba = true;
    }

    public void b(String str, String str2) {
        this.aW = str;
        this.aX = str2;
    }

    public void b(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            y(it.next());
        }
    }

    public void b(List<String> list) {
        if (list != null) {
            for (String str : list) {
                String strD = D(str);
                String strE = E(str);
                if (!TextUtils.isEmpty(strD)) {
                    if (b(str) || b(strD) || b(strE) || str.startsWith(aT)) {
                        Logger.d(f52465a, "classifyPrefetchUrl " + this.f52498aa + " url is a prefetch url " + str);
                        z(strD);
                    } else if (!v(strD) || strD.equals(this.f52501ad)) {
                        Logger.d(f52465a, "classifyPrefetchUrl " + this.f52498aa + " url is not a prefetch nor a dsp url and will be discarded : " + str);
                    } else {
                        Logger.d(f52465a, "classifyPrefetchUrl " + this.f52498aa + " url is a dsp url " + str);
                        x(strD);
                    }
                }
            }
        }
    }

    public void b(boolean z10) {
        this.V = z10;
    }

    protected boolean b(String str) {
        return k.a(str, (Map<String, String>) null);
    }

    public boolean b(Map<Integer, CreativeInfo> map) {
        CreativeInfo creativeInfoRemove;
        if (this.f52502ae == 0) {
            return false;
        }
        synchronized (map) {
            creativeInfoRemove = map.remove(Integer.valueOf(this.f52502ae));
        }
        return creativeInfoRemove != null;
    }

    public void c(String str) {
        this.F = str;
    }

    public void c(List<String> list) {
        if (list != null) {
            k.b(f52465a, "add prefetch urls : " + list.toString());
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                z(it.next());
            }
        }
    }

    public void c(boolean z10) {
        this.av = z10;
    }

    public boolean c() {
        return this.f52500ac == null;
    }

    public boolean c(Map<String, CreativeInfo> map) {
        CreativeInfo creativeInfoRemove;
        if (!WebView.class.getCanonicalName().equals(this.aW)) {
            return false;
        }
        synchronized (map) {
            creativeInfoRemove = map.remove(this.aW);
        }
        return creativeInfoRemove != null;
    }

    public Bundle d() {
        Bundle bundle = new Bundle();
        boolean zA = CreativeInfoManager.a(this.f52498aa, AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, true);
        if (!TextUtils.isEmpty(this.Y) && zA) {
            bundle.putString(f52474c, this.Y);
        }
        if (this.H) {
            bundle.putLong(f52473b, this.f52499ab);
        }
        if (!TextUtils.isEmpty(this.f52500ac)) {
            bundle.putString("creative_id", this.f52500ac);
        }
        if (!TextUtils.isEmpty(this.aB)) {
            bundle.putString(f52495x, this.aB);
        }
        if (!TextUtils.isEmpty(this.f52508ar)) {
            bundle.putString(L, this.f52508ar);
        }
        if (!TextUtils.isEmpty(this.f52509as)) {
            bundle.putString(S, this.f52509as);
        }
        if (!TextUtils.isEmpty(this.J)) {
            bundle.putString("video_url", this.J);
        }
        if (!TextUtils.isEmpty(this.f52510at)) {
            bundle.putString(f52466ak, this.f52510at);
        }
        if (!TextUtils.isEmpty(this.f52505ah)) {
            bundle.putString(f52477f, this.f52505ah);
        }
        if (!TextUtils.isEmpty(this.f52506ai)) {
            bundle.putString(f52478g, this.f52506ai);
        }
        if (!TextUtils.isEmpty(this.F)) {
            bundle.putString(f52488q, this.F);
        }
        if (!TextUtils.isEmpty(this.K)) {
            bundle.putString("zone_id", this.K);
        }
        bundle.putString("ad_format_type", this.aE);
        if (!TextUtils.isEmpty(this.M)) {
            bundle.putString(BrandSafetyEvent.f52752g, this.M);
        }
        bundle.putString("sdk_version", this.Q);
        if (!TextUtils.isEmpty(this.aY)) {
            bundle.putString(aU, this.aY);
        }
        synchronized (this.N) {
            if (this.N != null && !this.N.isEmpty()) {
                bundle.putStringArrayList(BrandSafetyEvent.f52753h, new ArrayList<>(this.N));
            }
        }
        synchronized (this.O) {
            if (this.O != null && !this.O.isEmpty()) {
                bundle.putStringArrayList(f52496y, new ArrayList<>(this.O));
            }
        }
        synchronized (this.aZ) {
            if (this.aZ != null && !this.aZ.isEmpty()) {
                bundle.putStringArrayList(aK, new ArrayList<>(this.aZ));
            }
        }
        synchronized (this.P) {
            if (this.P != null && !this.P.isEmpty()) {
                bundle.putStringArrayList(f52497z, new ArrayList<>(this.P));
            }
        }
        synchronized (this.au) {
            if (this.au != null && !this.au.isEmpty()) {
                bundle.putStringArrayList(f52468am, new ArrayList<>(this.au));
            }
        }
        synchronized (this.aw) {
            if (this.ay && this.aw != null && !this.aw.isEmpty()) {
                bundle.putStringArrayList(BrandSafetyEvent.f52766u, new ArrayList<>(this.aw));
            }
        }
        return bundle;
    }

    public void d(String str) {
        if (str == null) {
            return;
        }
        if (this.F == null) {
            this.F = "";
        }
        this.F += str;
    }

    public void d(boolean z10) {
        Logger.d(f52465a, "VideoAd property has been set to " + z10);
        this.T = z10;
    }

    public void e() {
        this.f52503af = true;
    }

    public void e(String str) {
        Logger.d(f52465a, "setAdUnitId started with ad unit id: " + str);
        this.aV = str;
    }

    public void e(boolean z10) {
        this.U = z10;
    }

    public View f() {
        return this.az;
    }

    public void f(String str) {
        this.aD = str;
    }

    public void f(boolean z10) {
        this.f52513bc = z10;
    }

    public void g(String str) {
        this.aY = str;
    }

    public void g(boolean z10) {
        this.I = z10;
    }

    public boolean g() {
        return this.Z;
    }

    public String h() {
        return this.F;
    }

    public void h(String str) {
        this.K = str;
    }

    public void h(boolean z10) {
        this.f52516bf = z10;
    }

    public String i() {
        Logger.d(f52465a, "getAdUnitId started with the stored value: " + this.aV);
        return this.aV;
    }

    public void i(String str) {
        this.f52500ac = str;
    }

    public void j(String str) {
        this.aB = str;
    }

    public boolean j() {
        return this.I;
    }

    public String k() {
        return this.f52509as;
    }

    public void k(String str) {
        this.f52508ar = str;
    }

    public void l(String str) {
        this.aA = str;
    }

    public boolean l() {
        return this.aC;
    }

    public String m() {
        return this.aD;
    }

    public void m(String str) {
        this.f52509as = str;
    }

    public String n() {
        return this.aY;
    }

    public String o() {
        return this.M;
    }

    public void o(String str) {
        this.J = D(str);
        z(this.J);
    }

    public HashSet<String> p() {
        return this.N;
    }

    public void p(String str) {
        if (BrandSafetyEvent.AdFormatType.LEADER.name().equals(str)) {
            this.aE = BrandSafetyEvent.AdFormatType.BANNER.name();
        } else {
            this.aE = str;
        }
    }

    public HashSet<String> q() {
        return this.O;
    }

    public void q(String str) {
        this.M = str;
    }

    public HashSet<String> r() {
        return this.aZ;
    }

    public void r(String str) {
        this.Y = str;
    }

    public HashSet<String> s() {
        return this.P;
    }

    public void s(String str) {
        this.f52498aa = str;
    }

    public String t() {
        return this.Q;
    }

    public void t(String str) {
        this.f52501ad = str;
        if (TextUtils.isEmpty(this.M)) {
            this.M = a(str);
        }
    }

    public String toString() {
        Bundle bundleD = d();
        bundleD.putBoolean(B, this.T | this.V);
        bundleD.putBoolean(C, this.W);
        return "matchingObjectAddress=" + this.aW + ", event_id=" + this.aD + ", id=" + this.Y + ", " + bundleD;
    }

    public HashSet<String> u() {
        return this.au;
    }

    public void u(String str) {
        if (str != null) {
            if (this.f52506ai == null) {
                this.f52506ai = str;
            } else if (this.f52506ai.contains(str)) {
                Logger.d(f52465a, "setDebugInfo ci debug info already contains the string. skipping. content : " + str);
            } else {
                this.f52506ai += ImpressionLog.P + str;
            }
        }
    }

    public boolean v() {
        return this.T || this.V;
    }

    protected boolean v(String str) {
        return e.a(this.f52498aa, str);
    }

    public void w(String str) {
        if (v(str)) {
            x(str);
        }
    }

    public boolean w() {
        return this.W;
    }

    public void x(String str) {
        String strD = D(str);
        if (TextUtils.isEmpty(strD) || this.au.contains(strD)) {
            return;
        }
        if (this.ax.contains(strD)) {
            Logger.d(f52465a, "add dsp domain url: avoid adding a recommendation resource" + strD);
            this.ay = true;
        } else {
            Logger.d(f52465a, "add dsp domain url - adding the following url: " + strD);
            synchronized (this.N) {
                this.N.add(strD);
            }
        }
    }

    public boolean x() {
        return this.U;
    }

    public void y(String str) {
        String strD = !str.startsWith("text:") ? D(str) : str;
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        if (this.ax.contains(strD)) {
            Logger.d(f52465a, "add resource url: avoid adding a recommendation resource: " + strD);
            this.ay = true;
            return;
        }
        if (this.f52515be == null || this.f52515be.contains(strD)) {
            Logger.d(f52465a, "add resource url: Url is in the WebView urls exclusion list, will not be added : " + strD);
            return;
        }
        if (this.f52503af) {
            if (str.startsWith("text:")) {
                return;
            }
            this.aZ.add(strD);
        } else {
            synchronized (this.O) {
                this.O.add(strD);
            }
            Logger.d(f52465a, "Resource was added successfully to CI, resource: " + strD);
        }
    }

    public boolean y() {
        return this.V;
    }

    public void z(String str) {
        String strD = D(str);
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        if (this.f52515be == null || this.f52515be.contains(strD)) {
            Logger.d(f52465a, "add prefetch Url: Url is in the WebView urls exclusion list , will not be added : " + strD);
            return;
        }
        synchronized (this.P) {
            this.P.add(strD);
        }
    }

    public boolean z() {
        return this.av;
    }
}
