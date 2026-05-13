package com.safedk.android.analytics.events;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.RedirectData;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.i;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class BrandSafetyEvent extends StatsEvent implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f52733a = "click_url";
    public static final String aI = "revenue_event";
    public static final String aJ = "is_redirect";
    public static final String aK = "is_expand";
    public static final String aL = "is_auto_expand";
    public static final String aM = "redirect_url";
    public static final String aN = "redirect_request_url";
    public static final String aO = "redirect_type";
    private static final String a_ = "BrandSafetyEvent";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    public static final String f52735ac = "max_network_name";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    public static final String f52736ad = "network_name";

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    public static final String f52737ae = "dsp_name";

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    public static final String f52738af = "custom_js_network_name";

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    public static final String f52739ag = "is_first_session";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    public static final String f52740ah = "event_id";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    public static final String f52741ao = "max_creative_id";

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public static final String f52742ap = "creative_id";

    /* JADX INFO: renamed from: aq, reason: collision with root package name */
    public static final String f52743aq = "did_fail_display_received";

    /* JADX INFO: renamed from: ar, reason: collision with root package name */
    public static final String f52744ar = "will_display_received";

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    public static final String f52745as = "is_banner_view_detected";

    /* JADX INFO: renamed from: at, reason: collision with root package name */
    public static final String f52746at = "image_slot";
    public static final String au = "interval_between_display_messages";
    public static final String av = "detected_view_proportions";
    public static final String aw = "device_orientation";
    public static final String ay = "multi_ad_uuid";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52747b = "foreground_activity";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52748c = "impression_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f52749d = "viewing_time";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52751f = "zone_id";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f52752g = "app_package_name";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f52753h = "dsp_domains";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f52754i = "ad_format";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f52755j = "ad_format_type";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f52756k = "third_party_ad_placement_id";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f52758m = "sdk_version";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f52759n = "impression";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f52760o = "image_file_size";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f52761p = "image_uniformity";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f52762q = "image_id";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f52763r = "image_orientation";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f52764s = "is_animated";
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f52765t = "is_clicked";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f52766u = "ad_recommendations";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f52767v = "is_next_session";
    private int L;
    private String M;
    private String N;
    private transient Bundle O;
    private String P;
    private String Q;
    private long R;
    private String S;
    private String T;
    private String U;
    private boolean V;
    private String W;
    private boolean X;
    private long Y;
    private float Z;
    private String aA;
    private String aB;
    private String aC;
    private String aD;
    private String aE;
    private boolean aF;
    private boolean aG;
    private boolean aH;
    String aP;
    HashSet<String> aQ;
    HashSet<String> aR;
    private String aS;
    private String aT;
    private String aU;
    private boolean aV;
    private RedirectData aW;
    private int aX;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private BrandSafetyUtils.ScreenShotOrientation f52768aa;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private boolean f52769ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private boolean f52770aj;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private int f52771ak;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private long f52772al;

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private float f52773am;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private String f52774an;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52750e = "slot_number";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f52757l = "max_ad_unit_id";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final Set<String> f52734ab = new HashSet(Arrays.asList("impression_id", StatsEvent.f52830z, "sdk_uuid", f52750e, "ad_format_type", "zone_id", f52757l));

    public enum AdFormatType {
        INTER,
        REWARD,
        BANNER,
        LEADER,
        MREC,
        APPOPEN,
        NATIVE
    }

    public BrandSafetyEvent(String str, int i10, String str2, boolean z10, String str3, CreativeInfo creativeInfo, long j10, String str4, String str5, String str6, long j11, boolean z11, Bundle bundle, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, boolean z12, long j12, float f10, int i11, boolean z13, String str7, String str8, boolean z14, String str9, String str10, String str11, HashSet<String> hashSet, HashSet<String> hashSet2, boolean z15) {
        super(str, StatsCollector.EventType.BrandSafety);
        this.P = null;
        this.Q = null;
        this.V = false;
        this.W = null;
        this.X = false;
        this.aE = null;
        this.aP = null;
        this.aF = false;
        this.aG = false;
        this.aV = false;
        this.f52769ai = false;
        this.f52770aj = false;
        this.f52771ak = 0;
        this.f52772al = 0L;
        this.f52773am = 0.0f;
        this.f52774an = null;
        this.aH = false;
        this.aW = null;
        this.aX = 0;
        synchronized (this) {
            this.L = i10;
            if (j10 > 0) {
                this.G = k.b(j10);
            }
            Logger.d(a_, "BrandSafetyEvent ctor creative info: " + creativeInfo + ", isOnUiThread = " + k.c());
            this.aQ = new HashSet<>();
            this.aR = new HashSet<>();
            if (creativeInfo != null) {
                if (creativeInfo.Q().equals(str)) {
                    Logger.d(a_, "creative info sdk is equal to event SDK");
                    this.N = creativeInfo.G();
                    this.O = creativeInfo.d();
                    Logger.d(a_, "addedCreativeInfoValues " + this.O);
                    if (str3 == null) {
                        Logger.d(a_, "self click url is null, setting creative info click url");
                        str3 = creativeInfo.M();
                    }
                    Logger.d(a_, "webview_resource_urls removing resource urls list and dsp urls list.");
                } else {
                    Logger.d(a_, "creative info sdk != sdk. creative info sdk: " + creativeInfo.Q() + ", actual sdk: " + creativeInfo.R() + ", sdk: " + str);
                }
                if (hashSet != null) {
                    creativeInfo.b(new ArrayList<>(hashSet));
                }
                if (hashSet2 != null) {
                    creativeInfo.a(new ArrayList<>(hashSet2));
                }
                Logger.d(a_, "webview_resource_urls setting resource urls list  = " + hashSet);
                Logger.d(a_, "webview_resource_urls setting dsp urls list = " + hashSet2);
            } else {
                boolean zA = CreativeInfoManager.a(str, AdNetworkConfiguration.DONT_REPORT_WEBVIEW_RESOURCE_LIST_IF_NO_CI, false);
                Logger.d(a_, "the don't report webview resource is: " + zA);
                if (!zA) {
                    if (hashSet != null) {
                        this.aQ.addAll(hashSet);
                    }
                    if (hashSet2 != null) {
                        this.aR.addAll(hashSet2);
                    }
                }
                Logger.d(a_, "webview_resource_urls setting resource urls list  = " + hashSet);
                Logger.d(a_, "webview_resource_urls setting dsp urls list = " + hashSet2);
            }
            if (str3 != null && !str3.isEmpty()) {
                str3 = i.a(str3);
            }
            this.M = str3;
            this.V = z10;
            this.P = str4;
            this.Q = str5;
            this.aS = str6;
            this.R = j11;
            this.aB = str8;
            if (bundle != null) {
                this.S = bundle.getString(f52757l);
                this.aA = bundle.getString(f52736ad);
                this.T = b(bundle.getString("ad_format"));
                this.U = bundle.getString(f52756k);
                this.aC = bundle.getString("dsp_name");
                this.aD = bundle.getString(f52738af);
                if (str8 == null) {
                    this.aB = bundle.getString("creative_id");
                }
            }
            this.I = z11;
            if (creativeInfo != null) {
                this.W = str2;
                this.f52768aa = screenShotOrientation;
                this.X = z12;
                if (str2 != null) {
                    this.Y = j12;
                    this.Z = f10;
                    this.f52771ak = i11;
                }
            }
            this.az = z13;
            if (str7 != null) {
                Logger.d(a_, "eventId = " + str7);
                this.aE = str7;
            }
            this.aF = z14;
            this.aT = str10;
            this.aU = str11;
            this.aP = str9;
            this.aH = z15;
            Logger.d(a_, "Revenue event value = " + str9);
            if (creativeInfo != null && z11) {
                creativeInfo.a((String) null, (String) null);
            }
        }
    }

    public BrandSafetyEvent(String str, int i10, String str2, boolean z10, String str3, CreativeInfo creativeInfo, long j10, String str4, String str5, String str6, boolean z11, Bundle bundle, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, long j11, float f10, int i11, boolean z12, boolean z13, long j12, float f11, String str7, boolean z14, String str8, String str9, boolean z15, String str10, String str11, String str12) {
        this(str, i10, str2, z10, str3, creativeInfo, j10, str4, str5, str6, 0L, z11, bundle, screenShotOrientation, false, j11, f10, i11, z14, str8, str9, z15, str10, str11, str12, (HashSet<String>) null, (HashSet<String>) null, false);
        this.aV = true;
        this.f52769ai = z12;
        this.f52770aj = z13;
        this.f52772al = j12;
        this.f52773am = f11;
        this.f52774an = str7;
    }

    public BrandSafetyEvent(String str, int i10, String str2, boolean z10, String str3, CreativeInfo creativeInfo, long j10, String str4, String str5, String str6, boolean z11, Bundle bundle, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, long j11, float f10, int i11, boolean z12, boolean z13, long j12, float f11, String str7, boolean z14, boolean z15, String str8, String str9, boolean z16, String str10, String str11, String str12, RedirectData redirectData, int i12, HashSet<String> hashSet, HashSet<String> hashSet2) {
        this(str, i10, str2, z10, str3, creativeInfo, j10, str4, str5, str6, 0L, z11, bundle, screenShotOrientation, false, j11, f10, i11, z15, str8, str9, z16, str10, str11, str12, hashSet, hashSet2, z14);
        this.aG = true;
        this.f52769ai = z12;
        this.f52770aj = z13;
        this.f52772al = j12;
        this.f52773am = f11;
        this.f52774an = str7;
        this.aW = redirectData;
        this.aX = i12;
    }

    private static Bundle a(Map<String, Object> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof ArrayList) {
                bundle.putStringArrayList(str, (ArrayList) obj);
            }
        }
        return bundle;
    }

    private static Map<String, Object> a(Bundle bundle) {
        HashMap map = new HashMap(bundle.size());
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    private String b(String str) {
        Logger.d(a_, "getAdFormatTypeFromMaxAdFormType called, input=" + str);
        String string = null;
        if (BrandSafetyUtils.f51653j.equals(str)) {
            string = AdFormatType.INTER.toString();
        } else if (BrandSafetyUtils.f51654k.equals(str)) {
            string = AdFormatType.REWARD.toString();
        } else if ("BANNER".equals(str) || BrandSafetyUtils.f51657n.equals(str)) {
            string = AdFormatType.BANNER.toString();
        } else if (BrandSafetyUtils.f51655l.equals(str)) {
            string = AdFormatType.APPOPEN.toString();
        } else if (BrandSafetyUtils.f51658o.equals(str)) {
            string = AdFormatType.MREC.toString();
        } else if ("NATIVE".equals(str)) {
            string = AdFormatType.NATIVE.toString();
        }
        Logger.d(a_, "getAdFormatTypeFromMaxAdFormType returned  " + string);
        return string;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        try {
            Map map = (Map) objectInputStream.readObject();
            if (map != null) {
                this.O = a((Map<String, Object>) map);
            }
        } catch (OptionalDataException e10) {
            if (e10.eof && e10.length == 0) {
                Logger.d(a_, "OptionalDataException in readObject (due to no CI object)");
            } else {
                Logger.d(a_, "OptionalDataException in readObject: eof: " + e10.eof + ", length: " + e10.length, e10);
            }
        }
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (this.O != null) {
            objectOutputStream.writeObject(a(this.O));
        }
    }

    public String a() {
        return this.W;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public synchronized void a(StatsEvent statsEvent) {
        boolean z10 = false;
        synchronized (this) {
            BrandSafetyEvent brandSafetyEvent = (BrandSafetyEvent) statsEvent;
            Logger.d(a_, "doAggregation removing resource urls list and dsp urls list. local resourceUrlList = " + this.aQ + ", isOnUiThread = " + k.c());
            this.aQ = new HashSet<>();
            this.aR = new HashSet<>();
            Bundle bundle = brandSafetyEvent.O;
            if (bundle != null) {
                Logger.d(a_, "Aggregating downstream struct. eventCreativeValues=" + bundle);
                this.O = bundle;
                this.N = brandSafetyEvent.N;
            } else {
                Logger.d(a_, "webview_resource_urls doAggregation setting resource urls list and dsp urls list.");
                if (brandSafetyEvent.aQ != null) {
                    this.aQ.addAll(brandSafetyEvent.aQ);
                }
                if (brandSafetyEvent.aR != null) {
                    this.aR.addAll(brandSafetyEvent.aR);
                }
            }
            String str = brandSafetyEvent.M;
            if (!TextUtils.isEmpty(str)) {
                this.M = str;
            }
            long j10 = statsEvent.j();
            if (j10 != 0 && j10 < this.G) {
                this.G = j10;
            }
            long j11 = brandSafetyEvent.R;
            if (j11 > 0 && j11 > this.R) {
                this.R = j11;
            }
            if (brandSafetyEvent.W != null) {
                Logger.d(a_, "doAggregation updating screenShotHashValue to '" + brandSafetyEvent.W + "' , image_file_size to " + brandSafetyEvent.Y + " and image_max_uniform_pixels to " + brandSafetyEvent.Z);
                this.W = brandSafetyEvent.W;
                this.Y = brandSafetyEvent.Y;
                this.Z = brandSafetyEvent.Z;
                this.f52771ak = brandSafetyEvent.f52771ak;
                BrandSafetyUtils.ScreenShotOrientation screenShotOrientation = brandSafetyEvent.f52768aa;
                if (screenShotOrientation != null && screenShotOrientation != BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED) {
                    Logger.d(a_, "doAggregation updating screenShotOrientation to '" + screenShotOrientation + "'");
                    this.f52768aa = screenShotOrientation;
                }
            } else {
                Logger.d(a_, "doAggregation updating image hash to null");
                this.W = null;
                this.Y = 0L;
                this.f52771ak = 0;
                this.f52768aa = null;
                this.Z = 0.0f;
            }
            boolean z11 = brandSafetyEvent.V;
            if (z11) {
                if (z11 && brandSafetyEvent.aS == null) {
                    z10 = true;
                }
                this.V = z10;
                Logger.d(a_, "doAggregation updating clicked to " + this.V);
            } else if (brandSafetyEvent.aS != null) {
                this.V = false;
                Logger.d(a_, "doAggregation reset clicked due to multi ad");
            }
            this.X = brandSafetyEvent.X;
            this.aB = brandSafetyEvent.aB;
            this.aS = brandSafetyEvent.aS;
            if (this.aE == null && brandSafetyEvent.aE != null) {
                this.aE = brandSafetyEvent.aE;
                Logger.d(a_, "doAggregation updating eventId to " + this.aE);
            }
            if (this.C != null && !this.C.equals(brandSafetyEvent.C) && this.O != null) {
                Logger.d(a_, "doAggregation incompatible SDK. current: " + this.C + ", new: " + brandSafetyEvent.C);
                this.O.putString(CreativeInfo.f52478g, this.O.getString(CreativeInfo.f52478g, "") + "|sdk=" + this.C + ";newSdk=" + brandSafetyEvent.C);
            }
            if (this.aP == null && brandSafetyEvent.aP != null) {
                this.aP = brandSafetyEvent.aP;
                Logger.d(a_, "doAggregation updating revenueEventValue to " + this.aP);
            }
            if (this.P == null) {
                this.P = brandSafetyEvent.P;
                Logger.d(a_, "doAggregation updating foregroundActivityName to " + this.P);
            }
            this.f52769ai = brandSafetyEvent.f52769ai;
            this.f52770aj = brandSafetyEvent.f52770aj;
            this.f52772al = brandSafetyEvent.f52772al;
            this.aW = brandSafetyEvent.aW;
            this.aX = brandSafetyEvent.aX;
            this.f52773am = brandSafetyEvent.f52773am;
            this.aT = brandSafetyEvent.aT;
            this.aU = brandSafetyEvent.aU;
            this.aF = brandSafetyEvent.aF;
        }
    }

    public void a(String str) {
        this.aP = str;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType b() {
        return StatsCollector.EventType.BrandSafety;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public String c() {
        return this.Q;
    }

    public void d() {
        this.W = null;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public synchronized Bundle e() {
        Bundle bundleE;
        bundleE = super.e();
        if (this.L > 0) {
            bundleE.putInt(f52750e, this.L);
        }
        if (!TextUtils.isEmpty(this.M)) {
            bundleE.putString("click_url", this.M);
        }
        if (this.O != null) {
            bundleE.putAll(this.O);
        } else if (this.aH) {
            bundleE.putString(CreativeInfo.f52488q, "/scar-admob");
        } else {
            Logger.d(a_, "toBundle webview_resource_urls : dspUrlList = " + this.aR + " , resourceUrlList = " + this.aQ);
            if (this.aQ != null && !this.aQ.isEmpty()) {
                bundleE.putStringArrayList(CreativeInfo.f52496y, new ArrayList<>(this.aQ));
            }
            if (this.aR != null && !this.aR.isEmpty()) {
                bundleE.putStringArrayList(f52753h, new ArrayList<>(this.aR));
            }
        }
        if (!TextUtils.isEmpty(this.P)) {
            bundleE.putString("foreground_activity", this.P);
        }
        bundleE.putString("impression_id", this.Q);
        if (this.aS != null) {
            bundleE.putString(ay, this.aS);
        }
        if (this.R > 0) {
            bundleE.putLong(f52749d, this.R);
        }
        if (this.S != null) {
            bundleE.putString(f52757l, this.S);
        }
        if (this.aA != null) {
            bundleE.putString(f52735ac, this.aA);
        }
        if (this.aB != null) {
            bundleE.putString(f52741ao, this.aB);
        }
        if (this.aD != null) {
            bundleE.putString(f52738af, this.aD);
        }
        if (this.aC != null && !bundleE.containsKey(CreativeInfo.L)) {
            bundleE.putString(CreativeInfo.L, this.aC);
        }
        if (this.C != null) {
            if (bundleE.getString("ad_format_type") == null || "com.unity3d.ads".equals(this.C) || g.f53142p.equals(this.C)) {
                bundleE.putString("ad_format_type", this.T);
            }
            if (bundleE.getString("zone_id") == null || "com.unity3d.ads".equals(this.C) || g.f53142p.equals(this.C)) {
                bundleE.putString("zone_id", this.U);
            }
        } else {
            Logger.d(a_, "Sdk field value is null.");
        }
        if (bundleE.getString("ad_format_type") == null && this.aW != null && this.aW.f51829k != null) {
            bundleE.putString("ad_format_type", this.aW.f51829k.name());
        }
        bundleE.putString(StatsEvent.f52830z, "impression");
        if (this.W != null) {
            bundleE.putString("image_id", this.W);
            if (!this.aG && !this.aV) {
                bundleE.putBoolean(f52764s, this.X);
            }
            if (this.f52768aa != null) {
                bundleE.putString("image_orientation", this.f52768aa.name().toLowerCase());
            }
            bundleE.putLong(f52760o, this.Y);
            bundleE.putFloat(f52761p, this.Z);
            bundleE.putInt(f52746at, this.f52771ak);
        }
        bundleE.putBoolean(f52765t, this.V);
        bundleE.putBoolean(f52767v, this.J);
        if (!TextUtils.isEmpty(this.aT)) {
            String string = bundleE.getString(CreativeInfo.f52478g);
            if (string != null) {
                bundleE.putString(CreativeInfo.f52478g, string + ImpressionLog.P + this.aT);
            } else {
                bundleE.putString(CreativeInfo.f52478g, this.aT);
            }
        }
        if (!TextUtils.isEmpty(this.aU)) {
            bundleE.putString(CreativeInfo.f52469an, this.aU);
        }
        if (this.aG || this.aV) {
            bundleE.putBoolean(f52744ar, this.f52769ai);
            bundleE.putBoolean(f52745as, this.f52770aj);
            if (this.aG) {
                bundleE.putLong(au, this.f52772al);
            }
            if (this.f52773am > 0.0f) {
                bundleE.putFloat(av, this.f52773am);
            }
            bundleE.putString(aw, this.f52774an);
            if (this.aG && this.aW != null) {
                if (this.aW.f51819a && this.aW.f51821c) {
                    bundleE.putBoolean("is_redirect", true);
                }
                if (this.aW.f51820b && !this.aW.f51821c) {
                    bundleE.putBoolean(aK, true);
                }
                if (this.aW.f51820b && this.aW.f51821c) {
                    bundleE.putBoolean(aL, true);
                }
                if (!TextUtils.isEmpty(this.aW.f51822d)) {
                    bundleE.putString("redirect_url", this.aW.f51822d);
                }
                if (!TextUtils.isEmpty(this.aW.f51823e)) {
                    bundleE.putString(aN, this.aW.f51823e);
                }
                if (!TextUtils.isEmpty(this.aW.f51824f)) {
                    bundleE.putString("redirect_type", this.aW.f51824f);
                }
                this.aW.a("RedirectCount=" + this.aX);
                if (!TextUtils.isEmpty(this.aW.f51826h)) {
                    String string2 = bundleE.getString(CreativeInfo.f52478g);
                    if (string2 != null) {
                        bundleE.putString(CreativeInfo.f52478g, string2 + ImpressionLog.P + this.aW.f51826h);
                    } else {
                        bundleE.putString(CreativeInfo.f52478g, this.aW.f51826h);
                    }
                }
            }
        }
        bundleE.putBoolean(f52739ag, this.az);
        if (this.aE != null) {
            bundleE.putString("event_id", this.aE);
        }
        bundleE.putBoolean(f52743aq, this.aF);
        if (this.aP != null) {
            bundleE.putString("revenue_event", this.aP);
        }
        return bundleE;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public Set<String> f() {
        HashSet hashSet = new HashSet(f52734ab);
        if (this.C != null && this.C.equals(g.f53134h)) {
            hashSet.add("click_url");
        }
        return hashSet;
    }

    public String g() {
        return this.aP;
    }
}
