package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.PrefetchVastAdTagUri;
import com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri;
import com.safedk.android.analytics.brandsafety.creatives.a;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.f;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.k;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d implements AdNetworkDiscovery {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f52199b = "Liftoff.init";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f52200c = "LiftoffOuterEnv.init";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, ArrayList<String>> f52201d = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f52202m = "com.applovin.mediation.nativeAds.MaxNativeAdView";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f52203n = "onDataLoadedToWebView";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f52204o = "onResourceLoaded";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final String f52205s = "extra_url";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f52206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f52207f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected a f52208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected ConcurrentHashMap<VastAdTagUri, CreativeInfo> f52209q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected Set<String> f52210r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected String f52211t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected Set<String> f52212u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected Set<String> f52213v;

    private d() {
        this.f52209q = null;
        this.f52210r = new HashSet();
        this.f52212u = new HashSet();
        this.f52213v = new HashSet();
    }

    protected d(String str, String str2, boolean z10) {
        this.f52209q = null;
        this.f52210r = new HashSet();
        this.f52212u = new HashSet();
        this.f52213v = new HashSet();
        this.f52206e = str;
        this.f52207f = str2;
        try {
            if (z10) {
                this.f52209q = new PersistentConcurrentHashMap(this.f52207f + "_vastAdTagUriUrlsToFollow");
                Logger.d(this.f52207f, "vast ad tag uri to follow loaded, key set=" + this.f52209q.keySet());
            } else {
                this.f52209q = new ConcurrentHashMap<>();
                Logger.d(this.f52207f, "vast ad tag uri to follow loaded (no persistence)");
            }
        } catch (InvalidParameterException e10) {
            Logger.e(this.f52207f, "error initializing caching will not be available", e10);
        }
        j();
    }

    private String a(Object obj, List<String> list, Set<Object> set) {
        String strK = k();
        if (strK == null || obj == null || set.contains(obj)) {
            return null;
        }
        set.add(obj);
        Class<?> superclass = obj.getClass();
        ArrayList<Field> arrayList = new ArrayList();
        boolean zA = CreativeInfoManager.a(strK, AdNetworkConfiguration.SHOULD_ALLOW_REFLECTION_ON_OS_CLASSES, false);
        while (true) {
            arrayList.addAll(Arrays.asList(superclass.getDeclaredFields()));
            superclass = superclass.getSuperclass();
            if (superclass == null || (!superclass.getName().startsWith(strK) && !zA)) {
                break;
            }
        }
        for (Field field : arrayList) {
            field.setAccessible(true);
            try {
                Object obj2 = field.get(obj);
                if (obj2 == null) {
                    continue;
                } else if (obj2.getClass().getName().startsWith(strK)) {
                    list.add(field.getName());
                    String strA = a(obj2, list, set);
                    if (strA != null) {
                        return strA;
                    }
                    list.remove(list.size() - 1);
                } else {
                    String strC = c(obj2);
                    if (strC != null) {
                        list.add(field.getName());
                        return strC;
                    }
                    continue;
                }
            } catch (Throwable th2) {
                Logger.d(this.f52207f, "Exception in extract ad info : " + th2.getMessage(), th2);
            }
        }
        return null;
    }

    private String a(ArrayList<String> arrayList, Object obj) {
        try {
            String strK = k();
            if (strK == null || arrayList == null || obj == null) {
                return null;
            }
            Logger.d(this.f52207f, "extract ad info using saved traversal path: " + arrayList);
            for (String str : arrayList) {
                if (obj == null) {
                    return null;
                }
                Class<?> superclass = obj.getClass();
                Field declaredField = null;
                do {
                    try {
                        declaredField = superclass.getDeclaredField(str);
                    } catch (NoSuchFieldException e10) {
                        superclass = superclass.getSuperclass();
                    }
                    if (declaredField != null || superclass == null) {
                        break;
                    }
                } while (superclass.getName().startsWith(strK));
                if (declaredField == null) {
                    Logger.d(this.f52207f, "extract ad info using saved traversal path, field not found");
                    return null;
                }
                declaredField.setAccessible(true);
                obj = declaredField.get(obj);
            }
            if (obj != null) {
                return c(obj);
            }
        } catch (Throwable th2) {
            Logger.e(this.f52207f, "extract ad info exception: " + th2.getMessage(), th2);
        }
        return null;
    }

    private static String g(String str, String str2) {
        return str.replaceAll("([?&;]+)(" + str2 + "=.*?)(&|$|;)", "$1");
    }

    private void j() {
        this.f52208p = new a();
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST, true);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_UPDATE_CREATIVE_INFO_FROM_VAST, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT, false);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, false);
        this.f52208p.a(AdNetworkConfiguration.BITMAP_SCAN_TOP_MARGIN_PERCENT, 0.15f);
        this.f52208p.a(AdNetworkConfiguration.BITMAP_SCAN_RIGHT_MARGIN_PERCENT, 0.15f);
        this.f52208p.a(AdNetworkConfiguration.BITMAP_SCAN_LEFT_MARGIN_PERCENT, 0.15f);
        this.f52208p.a(AdNetworkConfiguration.BITMAP_SCAN_BOTTOM_MARGIN_PERCENT, 0.15f);
        this.f52208p.b(AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false);
        this.f52208p.b(AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM_VAST_IN_VAST, false);
        this.f52208p.b(AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM, false);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, false);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, false);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, false);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_MRECS, false);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_BANNERS, false);
        this.f52208p.b(AdNetworkConfiguration.AVOID_CLEANING_PENDING_CI_LIST_ON_AD_END, false);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_BIDDING_INTERSTITIAL_IMPRESSION_MATCHING_BY_MAX, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_SET_CI_AS_VIDEO_AD_ON_VIDEO_RESOURCE_LOAD, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, false);
        this.f52208p.b(AdNetworkConfiguration.AD_ID_EXTRACTED_FROM_BANNER_WEB_VIEW_IS_MAX_CREATIVE_ID, false);
        this.f52208p.b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION, false);
        this.f52208p.b(AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false);
        this.f52208p.b(AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, false);
        this.f52208p.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, false);
        this.f52208p.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_BANNER_MULTIPLE_WEBVIEWS, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_INTERSTITIAL_VIEW, false);
        this.f52208p.b(AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
        this.f52208p.b(AdNetworkConfiguration.SDK_CUSTOM_VIEW_TYPE_NAME, (String) null);
        this.f52208p.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, SafeDK.getInstance().H());
        Logger.d(this.f52207f, "SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE setting set for " + this.f52207f + ", value = " + SafeDK.getInstance().H());
        this.f52208p.b(AdNetworkConfiguration.SHOULD_TAKE_INTERSTITIAL_SCREENSHOTS_THROUGHOUT_IMPRESSION, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_OVERWRITE_REPEATED_CI_IN_CREATIVE_INFO_MANAGER_LISTS, true);
        this.f52208p.b(AdNetworkConfiguration.AD_NETWORK_INTERNAL_BROWSER_OPENS_IN_SAME_ACTIVITY, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false);
        this.f52208p.b(AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        this.f52208p.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, com.safedk.android.internal.d.L);
        this.f52208p.b(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_EXPIRATION, true);
        this.f52208p.b(AdNetworkConfiguration.APP_OPEN_IMPRESSION_TRACKING_ENABLED, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, false);
        this.f52208p.b(AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_USE_EARLY_VAST_AD_TAG_URI_PARSING, false);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, false);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, false);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, false);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, true);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_NOT_YET_ATTACHED_TO_ACTIVITY, false);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_NATIVE_BANNERS_USING_BANNER_KEY, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_EXTRACT_TEXT_FROM_NATIVE_BANNERS, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_EXTRACT_TEXT_FROM_NATIVE_BANNERS, false);
        this.f52208p.a(AdNetworkConfiguration.NUMBER_OF_VIEWS_REMOVED_IN_FULL_SCREEN_AD_THAT_INDICATES_EOV, 0L);
        this.f52208p.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID, false);
        this.f52208p.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID_MAX_NETWORK_NAMES, (String) null);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_IGNORE_BANNER_MULTI_AD_DID_CLICK_EVENT, false);
        this.f52208p.b(AdNetworkConfiguration.SET_AD_FORMAT_FROM_APPLOVIN_BUNDLE, false);
        this.f52208p.a(AdNetworkConfiguration.FULL_SCREEN_CI_MAX_AGE, com.safedk.android.internal.d.L);
        this.f52208p.a(AdNetworkConfiguration.BANNER_CI_MAX_AGE, 600000L);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_FOR_TEXT_EXTRACTION, true);
        this.f52208p.b(AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "");
        this.f52208p.b(AdNetworkConfiguration.DONT_REPORT_WEBVIEW_RESOURCE_LIST_IF_NO_CI, false);
        this.f52208p.b(AdNetworkConfiguration.WEBVIEW_REPLACE_ON_AD_DISPLAY_FAIL, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_DECODE_AD_TAG_TWICE, false);
        this.f52208p.b(AdNetworkConfiguration.DO_NOT_ADD_CI_TO_FINDER_PENDING_CI_LIST, false);
        this.f52208p.b(AdNetworkConfiguration.NOTIFY_DISCOVERY_CLASS_ABOUT_FULL_SCREEN_MATCHING, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_DECODE_URLS_IN_CLICK_URL_RESOLUTION, true);
        this.f52208p.b(AdNetworkConfiguration.AVOID_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW_BEFORE_SCANNING, false);
        this.f52208p.b(AdNetworkConfiguration.MATCH_ON_BANNER_WEBVIEW_DETECTION, false);
        this.f52208p.b(AdNetworkConfiguration.VERIFY_MATCHING_OBJECT_ADDRESS_IN_RESOURCE_URL_FILTER, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_DELAY_BANNER_VIEWS_SCANNER, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_ALLOW_CI_MATCHING_WITH_INCOMPATIBLE_EVENT_IDS, false);
        this.f52208p.b(AdNetworkConfiguration.IGNORE_SHOULD_OVERRIDE_URL_CALLS, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_ALLOW_REFLECTION_ON_OS_CLASSES, false);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_COPY_BITMAP_USING_PIXELCOPY, false);
    }

    public static String q(String str) {
        return k.k(k.E(str));
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public long a(CreativeInfo creativeInfo) {
        return SafeDK.getInstance().E();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Pair<String, List<String>> a(Set<String> set) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(Bundle bundle) {
        return null;
    }

    protected abstract String a(String str, CreativeInfo creativeInfo);

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        return c(str, str2);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, WeakReference<WebView> weakReference) {
        return null;
    }

    protected String a(String str, Set<String> set) {
        if (set != null && set.size() > 0) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                str = k.e(str, it.next());
            }
        }
        return str;
    }

    protected String a(Pattern pattern, String str) {
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find() && matcher.groupCount() > 0) {
                Logger.d(this.f52207f, "extractSubstringViaPattern found pattern=" + pattern + " , value = " + matcher.group(1));
                return matcher.group(1);
            }
        } catch (Throwable th2) {
            Logger.d(this.f52207f, "Exception while extracting with regex : " + th2.getMessage() + ", pattern : " + pattern, th2);
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public WeakReference<WebView> a(List<WeakReference<WebView>> list, String str) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar) {
        CreativeInfo creativeInfoRemove;
        if (str2 != null) {
            try {
                if (str2.length() != 0) {
                    k.b(this.f52207f, "base generate info - url = " + str + ", vast URLs to follow: " + this.f52209q.toString() + ", isOnUiThread = " + k.c());
                    VastAdTagUri vastAdTagUri = new VastAdTagUri(str);
                    if (this.f52209q.containsKey(vastAdTagUri)) {
                        Logger.d(this.f52207f, "vasts redirect url found: " + str);
                        creativeInfoRemove = this.f52209q.remove(vastAdTagUri);
                        a(vastAdTagUri);
                    } else {
                        creativeInfoRemove = null;
                    }
                    String strQ = q(str);
                    k.b(this.f52207f, "decoded URL : " + strQ);
                    if (creativeInfoRemove == null) {
                        VastAdTagUri vastAdTagUri2 = new VastAdTagUri(strQ);
                        if (this.f52209q.containsKey(vastAdTagUri2)) {
                            Logger.d(this.f52207f, "vasts redirect url found: " + str);
                            creativeInfoRemove = this.f52209q.remove(vastAdTagUri2);
                            a(vastAdTagUri2);
                        }
                    }
                    if (creativeInfoRemove == null) {
                        String strReplace = strQ.replace('+', ' ');
                        if (!strReplace.equals(strQ)) {
                            Logger.d(this.f52207f, "decoded URL with spaces : " + strReplace);
                            VastAdTagUri vastAdTagUri3 = new VastAdTagUri(strReplace);
                            if (this.f52209q.containsKey(vastAdTagUri3)) {
                                Logger.d(this.f52207f, "vasts redirect url found: " + str);
                                creativeInfoRemove = this.f52209q.remove(vastAdTagUri3);
                                a(vastAdTagUri3);
                            }
                        }
                    }
                    CreativeInfo creativeInfo = creativeInfoRemove;
                    if (creativeInfo == null) {
                        List<CreativeInfo> listB = b(str, str2, map, aVar);
                        if (listB == null) {
                            return listB;
                        }
                        i();
                        return listB;
                    }
                    k.b(this.f52207f, "found vast url: " + str + ", ci: " + creativeInfo + ", content: " + str2);
                    a(creativeInfo, str, str2, true);
                    Logger.d(this.f52207f, "vast processing was done in base.");
                    creativeInfo.h(false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(creativeInfo);
                    return arrayList;
                }
            } catch (Throwable th2) {
                Logger.d(this.f52207f, "generate info error parsing. msg: " + th2.getMessage(), th2);
                return null;
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(WeakReference<View> weakReference, String str, boolean z10) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WebView webView) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WebView webView, Object obj) {
    }

    protected void a(VastAdTagUri vastAdTagUri) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(FileInputStream fileInputStream, String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(Object obj, Object obj2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(Object obj, String str) {
    }

    protected void a(String str, VastAdTagUri vastAdTagUri) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(String str, String str2, String str3, String str4) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a() {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(View view) {
        return false;
    }

    protected boolean a(CreativeInfo creativeInfo, f.a aVar, String str) {
        if (aVar == null) {
            return false;
        }
        k.b(this.f52207f, "updating vast CI: " + creativeInfo.toString() + ", vast ad info: " + aVar);
        creativeInfo.a("vst", new ImpressionLog.a[0]);
        boolean z10 = creativeInfo.z() ? false : true;
        creativeInfo.c(true);
        if (z10) {
            String strC = aVar.c();
            if (strC != null) {
                creativeInfo.j(strC);
            }
            String strD = aVar.d();
            if (strD != null) {
                creativeInfo.m(strD);
            }
            List<String> listI = aVar.i();
            if (listI != null) {
                for (String str2 : listI) {
                    if (com.safedk.android.analytics.brandsafety.creatives.e.a(creativeInfo.Q(), str2)) {
                        Logger.d(this.f52207f, "adding impression url to dsp domains : " + str2);
                        creativeInfo.x(str2);
                    }
                }
            } else {
                Logger.d(this.f52207f, "impression list is empty");
            }
            List<String> listN = aVar.n();
            if (listN != null) {
                for (String strA : listN) {
                    Set<String> setB = b(strA, c());
                    if (setB != null && setB.size() > 0) {
                        strA = a(strA, setB);
                    }
                    this.f52212u.add(strA);
                    Logger.d(this.f52207f, "adding video completed url : " + strA);
                    this.f52213v.addAll(setB);
                }
                creativeInfo.b(true);
            } else {
                Logger.d(this.f52207f, "no video completed URLs");
            }
            List<String> listO = aVar.o();
            if (listO != null) {
                for (String str3 : listO) {
                    if (com.safedk.android.analytics.brandsafety.creatives.e.a(creativeInfo.Q(), str3)) {
                        Logger.d(this.f52207f, "adding video tracking event url to dsp domains : " + str3);
                        creativeInfo.x(str3);
                    }
                }
            } else {
                Logger.d(this.f52207f, "No video tracking events");
            }
            List<String> listP = aVar.p();
            if (listP != null) {
                for (String str4 : listP) {
                    if (com.safedk.android.analytics.brandsafety.creatives.e.a(creativeInfo.Q(), str4)) {
                        Logger.d(this.f52207f, "adding click tracking url to dsp domains : " + str4);
                        creativeInfo.x(str4);
                    }
                }
            } else {
                Logger.d(this.f52207f, "no click tracking urls");
            }
            List<String> listQ = aVar.q();
            if (listQ != null) {
                for (String str5 : listQ) {
                    if (com.safedk.android.analytics.brandsafety.creatives.e.a(creativeInfo.Q(), str5)) {
                        Logger.d(this.f52207f, "adding companion click tracking url to dsp domains : " + str5);
                        creativeInfo.x(str5);
                    }
                }
            } else {
                Logger.d(this.f52207f, "no companion click tracking urls");
            }
        } else {
            Logger.d(this.f52207f, "inner Vast - don't update dsp creative ID, ad system, impression URLs and tracking URLs in CI");
        }
        String strE = aVar.e();
        if (strE != null) {
            String strE2 = k.E(strE);
            k.b(this.f52207f, "following vast uri: " + strE2);
            PrefetchVastAdTagUri prefetchVastAdTagUri = new PrefetchVastAdTagUri(strE2);
            this.f52209q.put(prefetchVastAdTagUri, creativeInfo);
            com.safedk.android.analytics.brandsafety.creatives.f.f52440c.remove(prefetchVastAdTagUri);
            a(str, (VastAdTagUri) prefetchVastAdTagUri);
            Logger.d(this.f52207f, "adding vast ad url to list. url: " + prefetchVastAdTagUri + ", ci: " + creativeInfo);
            creativeInfo.C(strE);
            return true;
        }
        String strA2 = aVar.a();
        String strB = aVar.b();
        if (strA2 != null) {
            creativeInfo.t(strA2);
            Logger.d(this.f52207f, "will update click url: " + strA2);
        } else {
            Logger.d(this.f52207f, "click url is empty");
        }
        if (strB == null || aVar.r()) {
            Logger.d(this.f52207f, "video url is empty");
        } else {
            creativeInfo.o(strB);
            Logger.d(this.f52207f, "will update video url : " + strB);
            if (k.p(strB)) {
                String strQ = k.q(strB);
                Logger.d(this.f52207f, "google video added : " + strQ);
                this.f52210r.add(strQ);
            } else {
                Logger.d(this.f52207f, "video added : " + strB);
                this.f52210r.add(strB);
            }
        }
        List<String> listJ = aVar.j();
        if (listJ != null) {
            Iterator<String> it = listJ.iterator();
            while (it.hasNext()) {
                String strA3 = a(it.next(), creativeInfo);
                if (strA3 != null) {
                    Logger.d(this.f52207f, "will add follow url : " + strA3);
                    this.f52210r.add(strA3);
                }
            }
            creativeInfo.b(listJ);
        } else {
            Logger.d(this.f52207f, "no prefetch resource urls");
        }
        List<String> listK = aVar.k();
        creativeInfo.c(listK);
        Logger.d(this.f52207f, "added static resource : " + listK);
        List<String> listL = aVar.l();
        creativeInfo.c(listL);
        Logger.d(this.f52207f, "added iframe resource : " + listL);
        List<String> listM = aVar.m();
        creativeInfo.c(listM);
        Logger.d(this.f52207f, "added html resource : " + listM);
        if (aVar.r()) {
            creativeInfo.Z();
            Logger.d(this.f52207f, "set params " + aVar.f());
            creativeInfo.F(aVar.f());
        }
        List<String> listH = aVar.h();
        if (listH != null) {
            Logger.d(this.f52207f, "vast media list contains " + listH.toString());
            Iterator<String> it2 = listH.iterator();
            while (it2.hasNext()) {
                String strA4 = a(it2.next(), creativeInfo);
                if (strA4 != null) {
                    Logger.d(this.f52207f, "will add followUrl : " + strA4);
                    this.f52210r.add(strA4);
                }
            }
            creativeInfo.c(listH);
        } else {
            Logger.d(this.f52207f, "no prefetch resource urls");
        }
        k.b(this.f52207f, "updated vast CI = " + creativeInfo);
        return true;
    }

    protected boolean a(CreativeInfo creativeInfo, String str, String str2, boolean z10) {
        Logger.v(this.f52207f, "updating vast CI: " + creativeInfo.toString() + ", vast xml: " + str2 + ", scan for resources: " + z10);
        boolean zB = CreativeInfoManager.f51983q ? true : CreativeInfoManager.i(creativeInfo.Q()).b(AdNetworkConfiguration.SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST);
        Logger.d(this.f52207f, "sdk " + creativeInfo.Q() + " config item SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST is " + zB);
        return a(creativeInfo, com.safedk.android.analytics.brandsafety.creatives.f.b(str2, zB, creativeInfo.Q()), str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str) {
        return a(str, (Bundle) null);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, Bundle bundle) {
        String strE = k.E(str);
        m(str);
        boolean z10 = b(new VastAdTagUri(strE)) || b(new VastAdTagUri(str));
        boolean z11 = z10 || str.contains(h.f52299b) || b(str, bundle);
        if (z11) {
            Logger.d(this.f52207f, "should follow input stream ? " + z11 + ", vast? " + z10 + ", url=" + str);
        }
        return z11;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, WebView webView) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, String str2) {
        return true;
    }

    public boolean a(String str, String str2, ConcurrentHashMap<String, WeakReference<WebView>> concurrentHashMap, ConcurrentHashMap<String, CreativeInfo> concurrentHashMap2, String str3) {
        try {
            k.b(this.f52207f, "tryReverseMatching started with source: " + str + " and dataToWebviewRef keys: " + concurrentHashMap.keySet());
            k.b(this.f52207f, "keyToCIsMap keys: " + concurrentHashMap2.keySet());
        } catch (Throwable th2) {
            k.b(this.f52207f, "tryReverseMatching encountered exception: " + th2);
        }
        if (str == null || !concurrentHashMap.containsKey(str)) {
            Logger.d(this.f52207f, "tryReverseMatching: source is null or not in sourceToWebviewRef");
            return false;
        }
        WeakReference<WebView> weakReference = concurrentHashMap.get(str);
        if (!k.a((Reference<?>) weakReference)) {
            Logger.d(this.f52207f, "tryReverseMatching: webViewRef is null or points to null - webviewRef: " + weakReference);
            return false;
        }
        WebView webView = weakReference.get();
        if (concurrentHashMap2.containsKey(str)) {
            CreativeInfo creativeInfo = concurrentHashMap2.get(str);
            if (creativeInfo != null) {
                String strL = creativeInfo.L();
                if ((str3.equals(f52203n) && CreativeInfoManager.b(webView, str2, strL)) || (str3.equals(f52204o) && CreativeInfoManager.a(webView, str2, strL).size() > 0)) {
                    Logger.d(this.f52207f, "tryReverseMatching: found a match using reverse! adId=" + strL);
                    i(strL);
                    return true;
                }
            }
        } else {
            Logger.d(this.f52207f, "tryReverseMatching: keyToCIsMap does not contain source");
            k.b(this.f52207f, "tryReverseMatching: keyToCIsMap keys are: " + concurrentHashMap2.keySet());
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String b(Object obj) {
        return null;
    }

    protected abstract List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) throws JSONException;

    protected Set<String> b(String str, Set<String> set) {
        if (set == null || set.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        Map<String, String> mapB = k.b(str, false);
        if (mapB != null) {
            for (Map.Entry<String, String> entry : mapB.entrySet()) {
                if (set.contains(entry.getValue())) {
                    Logger.d(this.f52207f, "identified macro : " + entry.getValue());
                    hashSet.add(entry.getKey());
                }
            }
        }
        if (hashSet.size() > 0) {
            Logger.d(this.f52207f, "query params to ignore are " + hashSet);
        }
        return hashSet;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(CreativeInfo creativeInfo) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(Object obj, Object obj2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(View view) {
        return false;
    }

    public boolean b(VastAdTagUri vastAdTagUri) {
        boolean z10 = this.f52209q.containsKey(vastAdTagUri) || com.safedk.android.analytics.brandsafety.creatives.f.f52440c.contains(vastAdTagUri);
        if (z10) {
            Logger.d(this.f52207f, "is VIV Url result is true");
        }
        return z10;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(String str) {
        return false;
    }

    protected abstract boolean b(String str, Bundle bundle);

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(String str, String str2) {
        m(str);
        boolean zContains = this.f52210r.contains(str);
        boolean z10 = zContains || k(str);
        Logger.d(this.f52207f, "should follow get url? " + z10 + ", vast media? " + zContains + " url=" + str + " webviewAddress=" + str2);
        return z10;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int c(String str) {
        return 0;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(View view) {
        String strA;
        if (f(view)) {
            String name = view.getClass().getName();
            Logger.d(this.f52207f, "get ad ID from view started, ad view: " + view);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList<String> arrayList = f52201d.get(name);
            if (arrayList != null) {
                Logger.d(this.f52207f, "get ad ID from view, found previous traversal path of " + name + ": " + arrayList);
                strA = a(arrayList, (Object) view);
            } else {
                strA = null;
            }
            if (strA == null) {
                HashSet hashSet = new HashSet();
                ArrayList<String> arrayList2 = new ArrayList<>();
                strA = a(view, arrayList2, hashSet);
                if (strA != null) {
                    f52201d.put(name, arrayList2);
                    k.b(this.f52207f, "get ad ID from view, saving traversal path of " + name + " for later use: " + arrayList2);
                }
            }
            Logger.d(this.f52207f, "get ad ID from view - travel time " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        } else {
            strA = null;
        }
        Logger.d(this.f52207f, "get ad ID from view - ad ID: " + strA);
        return strA;
    }

    protected String c(Object obj) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return com.safedk.android.utils.a.f53066b;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public a d() {
        return this.f52208p;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(View view) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(String str, String str2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean d(String str) {
        return b(new VastAdTagUri(str));
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String e(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e() {
        Logger.d(this.f52207f, "getting SDK version: " + this.f52211t + ", adapter class name: " + f());
        if (this.f52211t != null || f() == null) {
            Logger.d(this.f52207f, "cannot get version using sdks mapping");
        } else if (SdksMapping.getSdkAdaptersUUID().containsKey(f())) {
            String str = SdksMapping.getSdkAdaptersUUID().get(f());
            this.f52211t = SdksMapping.getAllSdkVersionsMap().get(str);
            Logger.d(this.f52207f, "getting SDK version for uuid: " + str + ", version: " + this.f52211t);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(View view) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType f(String str) {
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean f(View view) {
        if (!BannerFinder.c(view)) {
            return false;
        }
        Logger.d(this.f52207f, "is ad view: " + view.getClass().getName() + " is an instance of a Max native ad view, isOnUiThread = " + k.c());
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean f(String str, String str2) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public BrandSafetyUtils.AdType g(View view) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String g(String str) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(f52205s);
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public View h(View view) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String h() {
        return this.f52207f;
    }

    protected void h(String str, String str2) {
        SdksMapping.updateSdkVersionIfNeeded(str, str2);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean h(String str) {
        return false;
    }

    public void i() {
        Logger.d(this.f52207f, "base clear old CIs started");
        com.safedk.android.utils.e.a(this.f52209q, this.f52207f + ":vastAdTagUriUrlsToFollow", false);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void i(String str) {
    }

    public boolean i(View view) {
        if (view == null || !view.getClass().getName().contains("exoplayer")) {
            return false;
        }
        Logger.d(this.f52207f, "native video player identified, view: " + view);
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> j(String str) {
        return new ArrayList();
    }

    public boolean j(View view) {
        boolean z10;
        if (view.getClass().getName().contains("exoplayer")) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            z10 = true;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                z10 = z10 && j(viewGroup.getChildAt(i10));
            }
        } else {
            z10 = true;
        }
        return z10;
    }

    protected String k() {
        return null;
    }

    protected abstract boolean k(String str);

    protected void m(String str) {
        Set<String> setB = b(str, c());
        if (setB != null && setB.size() > 0) {
            str = a(str, setB);
            Logger.d(this.f52207f, "trigger video completed event - event url without query params=" + str);
        }
        if (this.f52212u.remove(str)) {
            Logger.d(this.f52207f, "Video completed event sdk=" + this.f52206e + ", source " + str);
            SafeDK safeDK = SafeDK.getInstance();
            if (safeDK == null || safeDK.y() == null) {
                return;
            }
            safeDK.y().a(this.f52206e, (Object) null);
        }
    }

    protected String n(String str) {
        String strA;
        String strA2 = null;
        try {
            if (str.contains(f52199b) && (strA2 = a(com.safedk.android.utils.f.aG(), str)) == null) {
                strA2 = a(com.safedk.android.utils.f.aH(), str);
            }
            if (str.contains(f52200c) && (strA2 = a(com.safedk.android.utils.f.aI(), str)) != null) {
                Logger.d(this.f52207f, "LiftoffOuterEnv.init url found : " + strA2);
            }
            strA = k.E(strA2);
        } catch (Throwable th2) {
            Logger.d(this.f52207f, "Exception while getting click_url from dsp ad : " + th2.getMessage(), th2);
            strA = strA2;
        }
        if (strA == null || strA.isEmpty()) {
            strA = a(com.safedk.android.utils.f.aL(), str);
        }
        return k.E(strA);
    }

    protected String o(String str) {
        if (str.contains(f52199b)) {
            return a(com.safedk.android.utils.f.aJ(), str);
        }
        return null;
    }

    protected boolean p(String str) {
        String lowerCase = str.toLowerCase();
        return lowerCase.endsWith(".mp4") || lowerCase.endsWith(".webm") || lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".webp");
    }
}
