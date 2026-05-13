package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.VungleCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class m extends d {
    private static final String A = "creative_id";
    private static final String B = "callToActionDest";
    private static final String C = "callToActionUrl";
    private static final String D = "info";
    private static final String E = "impression auctioned but unsold";
    private static final String F = "request is rejected by filter";
    private static final String G = "url";
    private static final String H = "ORIGINAL_VIDEO_URL";
    private static final String I = "showCloseIncentivized";
    private static final int J = 9999;
    private static final String K = "placement_reference_id";
    private static final String L = "cacheable_replacements";
    private static final String M = "MAIN_VIDEO";
    private static final String N = "postBundle";
    private static final String O = "templateURL";
    private static final String P = "template_type";
    private static final String Q = "expiry";
    private static final String R = "com.applovin.mediation.adapters.VungleMediationAdapter";
    private static final String S = "adType";
    private static final String T = "ad_type";
    private static final String U = "banner";
    private static final String V = "mrec";
    private static final String W = "native";
    private static final String X = "fullscreen";
    private static final String Y = "placements";
    private static final String Z = "reference_id";
    private static final long aA = 259200000;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f52385aa = "is_incentivized";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f52386ab = "tpat";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final String f52387ac = "templateSettings";

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private static final String f52388ad = "template_settings";

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private static final String f52389ae = "normal_replacements";

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private static final String f52390af = "clickUrl";

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private static final String f52391ag = "ad_market_id";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static final String f52392ah = "APP_STORE_ID";

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private static final String f52393ai = "CTA_BUTTON_URL";

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static final String f52394aj = "EC_CTA_URL";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f52395ak = "https://privacy.vungle.com/";

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private static final String f52396al = "vungle.com";

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private static final String f52397am = "adunit";

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private static final String f52398an = "AD_SOURCE";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static final String f52399ao = "ADVERTISER_DOMAIN";

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private static final String f52400ap = "ads";

    /* JADX INFO: renamed from: aq, reason: collision with root package name */
    private static final String f52401aq = "APP_NAME";

    /* JADX INFO: renamed from: ar, reason: collision with root package name */
    private static final String f52402ar = "APP_DESCRIPTION";

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    private static final String f52403as = "CTA_BUTTON_TEXT";

    /* JADX INFO: renamed from: at, reason: collision with root package name */
    private static final String f52404at = "MAIN_IMAGE";
    private static final String au = "APP_ICON";
    private static PersistentConcurrentHashMap<String, VungleCreativeInfo> av = null;
    private static PersistentConcurrentHashMap<Integer, VungleCreativeInfo> aw = null;
    private static PersistentConcurrentHashMap<String, VungleCreativeInfo> ax = null;
    private static PersistentConcurrentHashMap<String, Boolean> ay = null;
    private static final Map<String, WeakReference<Object>> az = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52405b = "MAIN_VIDEO.mp4";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52406c = "ad_markup";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f52407d = "com.vungle.warren.BuildConfig";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52408e = "VERSION_NAME";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52409f = "ADM_HTML";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f52410g = "adx.ads.vungle.com/api/v";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f52411h = "api.vungle.com/api/v";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f52412i = "adx-stage.ads.vungle.com/api/v";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f52413j = "api.vungle.com/config";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f52414k = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var log=function(message){try{console.log(\"log Vungle privacy policy sdkId : \"+sdkId+\",address = \"+address+\", msg : \"+message);if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(\"Vungle-Liftoff detect privacy ,address \"+message)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkDebug object missing\")}}catch(error){console.log(\"log : \"+error)}};log(\"script started sdkId = \"+sdkId+\", address = \"+address);var addPrivacyObservers=function(){try{log(\"trying with DIALOGBOX\");var dialogboxElement=document.getElementById(\"DIALOGBOX\");if(!dialogboxElement){log(\"trying again with privacy-dialog\");dialogboxElement=document.getElementById(\"privacy-dialog\")}if(!dialogboxElement){log(\"trying again with privacy-popup\");dialogboxElement=document.getElementById(\"privacy-popup\")}if(!dialogboxElement){log(\"trying again with privacy-page\");dialogboxElement=document.getElementById(\"privacy-page\")}if(!dialogboxElement){log(\"trying again with privacy-popup by class \");var elements=document.querySelectorAll(\"div#privacy-popup\");if(elements&&elements.length>0){log(\"found by class : \"+JSON.stringify(elements[0]));dialogboxElement=elements[0]}}log(\"dialogboxElement = \"+dialogboxElement);try{log(\"dialogboxElement = \"+JSON.stringify(dialogboxElement))}catch(error){log(\"dialogboxElement error \"+error)}if(dialogboxElement.hasAttribute(\"id\")){log(\"dialogboxElement.id ? \"+dialogboxElement.id)}if(dialogboxElement.hasAttribute(\"aria-hidden\")){log(\"dialogboxElement.aria-hidden ? \"+dialogboxElement.getAttribute(\"aria-hidden\"))}if(dialogboxElement&&(dialogboxElement.style&&dialogboxElement.style.visibility||dialogboxElement.hasAttribute(\"id\")&&dialogboxElement.id==\"privacy-popup\")){log(\"found element \"+JSON.stringify(dialogboxElement));var element_style_visibility=dialogboxElement.style&&dialogboxElement.style.visibility||dialogboxElement.hasAttribute(\"id\")&&dialogboxElement.id==\"privacy-popup\"&&dialogboxElement.classList.contains(\"ytoTpW_show\");if(element_style_visibility){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}log(\"element is visible\")}else{log(\"element is not visible\");{dialogboxElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":log(\"Attribute name \"+mutation.attributeName+\" changed to \"+getComputedStyle(mutation.target).visibility+\" (was \"+mutation.oldValue+\")\");if(getComputedStyle(mutation.target).visibility==\"visible\"||mutation.target.classList.contains(\"ytoTpW_show\")){log(\"privacy dialog is visible \");if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}break}})});var config={attributes:true,attributeOldValue:true};observer.observe(dialogboxElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}}}}}else{var privacyPageElement=document.getElementById(\"privacy-page\");if(privacyPageElement){var privacyPageParentElement=privacyPageElement.parentElement;if(privacyPageParentElement){var computedStyle=getComputedStyle(privacyPageParentElement);if(computedStyle){var displayState=computedStyle.display;if(displayState!=\"none\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}else{{privacyPageParentElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":if(mutation.target.style.display!=\"none\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}break}})});var config={attributes:true,attributeOldValue:true,childList:true,subtree:true};observer.observe(privacyPageParentElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp object missing\")}}}}}}}}}catch(error){log(\"caught exception with error = \"+error+\", stack : \"+error.stack);if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}}};var addAdClosureObservers=function(){try{log(\"trying with incentivized-dialog\");var dialogboxElement=document.getElementById(\"incentivized-dialog\");if(dialogboxElement&&dialogboxElement.style&&dialogboxElement.style.visibility){log(\"found element \");var element_style_visibility=dialogboxElement.style.visibility;if(element_style_visibility==\"visible\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp object missing\")}log(\"element is visible\")}else{log(\"element is not visible\");if(dialogboxElement.safedkPrivacyDialogObserver!=true){dialogboxElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":if(getComputedStyle(mutation.target).visibility==\"visible\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}log(\"Attribute name \"+mutation.attributeName+\" changed to \"+getComputedStyle(mutation.target).visibility+\" (was \"+mutation.oldValue+\")\");break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\"]};observer.observe(dialogboxElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}log(\"Error : \"+\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}}}}}catch(error){log(\"caught exception with error = \"+error);if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}}};var monitorNotifications=function(){try{var divIds=[\"ad-notification-modal\",\"gdpr-notification-view\"];for(var divId of divIds){var element=document.getElementById(divId);if(element){var className=element.className;if(element.className.endsWith(\"show\")){log(\"element.className = \"+element.className);if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}else{if(element.safedkVisibilityObserver!=true){element.safedkVisibilityObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){if(mutation.type==\"attributes\"){if(mutation.target.className.endsWith(\"show\")){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"class\"]};observer.observe(element,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}}}}}}catch(error){log(\"caught exception with error = \"+error);if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}};addPrivacyObservers();addAdClosureObservers();monitorNotifications();try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){for(const mutation of mutations){if(mutation.type===\"childList\"){log(\"A child node has been added or removed.\")}else if(mutation.type===\"attributes\"){log(mutation.attributeName+\" attribute was modified to \"+mutation.target.getAttribute(mutation.attributeName))}}mutations.forEach(function(mutation){for(var i=0;i<mutation.addedNodes.length;i++){var node=mutation.addedNodes[i];log(\"node iteration \"+i+\" : \"+JSON.stringify(node));if(node&&node.nodeName!=\"#text\"){addPrivacyObservers();addAdClosureObservers();monitorNotifications()}}})});var config={attributes:true,childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}})();\n";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f52415l = "mraid://";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f52416w = "url";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f52417x = "VungleDiscovery";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f52418y = "id";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f52419z = "campaign";

    public m() {
        super(g.f53130d, f52417x, true);
        try {
            av = new PersistentConcurrentHashMap<>("VungleDiscoverycreativeToIdMap");
            Logger.d(f52417x, "CI to ID map loaded, key set: " + av.keySet());
            aw = new PersistentConcurrentHashMap<>("VungleDiscoverymediaPlayerIdToCreativeInfo");
            Logger.d(f52417x, "media player to CI loaded, key set: " + aw.keySet());
            ax = new PersistentConcurrentHashMap<>("VungleDiscoveryadToIdMap");
            Logger.d(f52417x, "ad to ID map loaded, key set: " + ax.keySet());
            ay = new PersistentConcurrentHashMap<>("VungleDiscoveryplacementData");
            Logger.d(f52417x, "placement data loaded, key set: " + ay.keySet());
        } catch (InvalidParameterException e10) {
            Logger.e(f52417x, "Error initializing VungleDiscovery, caching will not be available", e10);
        }
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.f52208p.b(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, f52414k);
        this.f52208p.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, aA);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.f52208p.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.f52208p.b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION, true);
        this.f52208p.b(AdNetworkConfiguration.SHOULD_DELAY_BANNER_VIEWS_SCANNER, true);
        this.f52208p.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:248:0x07ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo a(org.json.JSONObject r24, java.lang.String r25, boolean r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.discoveries.m.a(org.json.JSONObject, java.lang.String, boolean):com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo");
    }

    private VungleCreativeInfo a(File file) {
        if (file == null) {
            Logger.d(f52417x, "get ad ID by video file - file is null");
            return null;
        }
        String strR = r(file.getAbsolutePath());
        Logger.d(f52417x, "get ad ID by video file - creative to ID map iteration, looking for '" + strR + "', key set: " + av.keySet().toString());
        if (av != null && strR != null) {
            VungleCreativeInfo vungleCreativeInfoRemove = av.remove(strR);
            if (vungleCreativeInfoRemove != null) {
                Logger.d(f52417x, "get ad ID by video file - CI MATCH! creative found: " + strR);
                return vungleCreativeInfoRemove;
            }
            Iterator<String> it = av.keySet().iterator();
            while (it.hasNext()) {
                VungleCreativeInfo vungleCreativeInfo = av.get(it.next());
                if (vungleCreativeInfo.N().equals(strR)) {
                    Logger.d(f52417x, "get ad ID by video file - CI MATCH! creative found: " + strR);
                    return vungleCreativeInfo;
                }
            }
        }
        Logger.d(f52417x, "get ad ID by video file - creative not found");
        return null;
    }

    private String a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject;
        try {
            if (jSONObject.has(f52397am)) {
                String strA = com.safedk.android.utils.c.a(Base64.decode(jSONObject.getString(f52397am), 0));
                if (k.v(strA) && (jSONArrayOptJSONArray = new JSONObject(strA).optJSONArray("ads")) != null && jSONArrayOptJSONArray.length() > 0 && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.getJSONObject(0).optJSONObject(f52406c)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    Logger.d(f52417x, "get ad id from prefetch - ad id found= " + strOptString);
                    return strOptString;
                }
            }
        } catch (JSONException e10) {
            Logger.d(f52417x, "get ad id from prefetch - exception: " + e10);
        }
        Logger.d(f52417x, "get ad id from prefetch - could not find ad id");
        return null;
    }

    private HashMap<String, String> a(JSONObject jSONObject, String str) {
        HashMap<String, String> map = new HashMap<>();
        try {
            if (jSONObject.has("tpat")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("tpat");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String string = itKeys.next().toString();
                    if (jSONObject2.get(string) instanceof JSONArray) {
                        JSONArray jSONArray = jSONObject2.getJSONArray(string);
                        Logger.d(f52417x, "iterating over key '" + string + "' , content: " + jSONArray.toString());
                        if (jSONArray.length() > 0) {
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                if (map.values().contains(jSONArray.getString(i10))) {
                                    Logger.d(f52417x, "url already in map. skipping: " + jSONArray.getString(i10));
                                } else {
                                    map.put(string + "_" + i10, jSONArray.getString(i10));
                                    Logger.d(f52417x, "collecting additional url: " + jSONArray.getString(i10));
                                }
                            }
                        }
                    } else {
                        Logger.d(f52417x, "key '" + string + "' is not a JSONArray, skipping");
                    }
                }
            } else {
                Logger.d(f52417x, "tpat key does not exist, exiting");
            }
        } catch (JSONException e10) {
            Logger.e(f52417x, "Error collecting urls under tpat key", e10);
        }
        return map;
    }

    private static void a(CreativeInfo creativeInfo, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f52387ac);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject(f52388ad);
        }
        if (jSONObjectOptJSONObject != null) {
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(f52389ae);
            if (jSONObjectOptJSONObject2 != null) {
                String strOptString = jSONObjectOptJSONObject2.optString("APP_NAME");
                if (!TextUtils.isEmpty(strOptString)) {
                    creativeInfo.B(CreativeInfo.aM + strOptString);
                }
                String strOptString2 = jSONObjectOptJSONObject2.optString("APP_DESCRIPTION");
                if (!TextUtils.isEmpty(strOptString2)) {
                    creativeInfo.B(CreativeInfo.aP + strOptString2);
                }
                String strOptString3 = jSONObjectOptJSONObject2.optString("CTA_BUTTON_TEXT");
                if (!TextUtils.isEmpty(strOptString3)) {
                    creativeInfo.B(CreativeInfo.aQ + strOptString3);
                }
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(L);
            if (jSONObjectOptJSONObject3 != null) {
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("MAIN_IMAGE");
                if (jSONObjectOptJSONObject4 != null) {
                    String strOptString4 = jSONObjectOptJSONObject4.optString("url");
                    if (!TextUtils.isEmpty(strOptString4)) {
                        creativeInfo.B(CreativeInfo.aN + strOptString4);
                    }
                }
                JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject3.optJSONObject("APP_ICON");
                if (jSONObjectOptJSONObject5 != null) {
                    String strOptString5 = jSONObjectOptJSONObject5.optString("url");
                    if (TextUtils.isEmpty(strOptString5)) {
                        return;
                    }
                    creativeInfo.B(CreativeInfo.aO + strOptString5);
                }
            }
        }
    }

    private void a(String str, VungleCreativeInfo vungleCreativeInfo, String str2) {
        if (str == null) {
            Logger.d(f52417x, "app package name from " + str2 + " not valid, skipping value " + str);
        } else {
            vungleCreativeInfo.q(str);
            Logger.d(f52417x, "app package name will be updated from " + str2 + " to " + str);
        }
    }

    private boolean b(JSONObject jSONObject) throws JSONException {
        if (!((JSONObject) jSONObject.get(f52406c)).has(P)) {
        }
        return true;
    }

    private void l(String str) throws JSONException {
        k.b(f52417x, "process placements started, buffer = " + str);
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has("placements")) {
            Logger.d(f52417x, "process placements no placements array");
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("placements");
        for (int i10 = 0; i10 < jSONArray.length() - 1; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            if (jSONObject2.has(Z) && jSONObject2.has(f52385aa)) {
                ay.put(jSONObject2.getString(Z), Boolean.valueOf(jSONObject2.getBoolean(f52385aa)));
                Logger.d(f52417x, "process placements added " + jSONObject2.getString(Z) + " : " + jSONObject2.getBoolean(f52385aa));
            } else {
                Logger.d(f52417x, "process placements placement does not contains ref_id/is_incentivized data : " + jSONObject2);
            }
        }
    }

    private String r(String str) {
        if (str == null || str.split("/").length <= 1) {
            Logger.d(f52417x, "file path is not according to the expected pattern: " + str + ", cannot extract CreativeId");
            return null;
        }
        String str2 = str.split("/")[str.split("/").length - 2];
        Logger.d(f52417x, "ad ID to be searched: " + str2);
        return str2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        Logger.d(f52417x, "match info - started. ad instance= " + obj);
        Logger.d(f52417x, "match info - creative id to ci keys: " + av.keySet());
        if (obj instanceof String) {
            String strA = (String) obj;
            if (k.v(strA)) {
                try {
                    strA = a(new JSONObject(strA));
                } catch (JSONException e10) {
                    Logger.d(f52417x, "match info - exception: " + e10);
                }
            }
            Logger.d(f52417x, "match info - started. ad id found= " + strA);
            if (!TextUtils.isEmpty(strA)) {
                VungleCreativeInfo vungleCreativeInfo = ax.get(strA);
                Logger.d(f52417x, "match info - FOUND by ad id= " + obj + ",    ci= " + vungleCreativeInfo);
                return vungleCreativeInfo;
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(Object obj, Object obj2) {
        Logger.d(f52417x, "save matching object for reverse matching - matching object= " + obj2);
        if (obj instanceof String) {
            String str = (String) obj;
            if (k.v(str)) {
                try {
                    String strA = a(new JSONObject(str));
                    if (TextUtils.isEmpty(strA) || obj2 == null) {
                        return;
                    }
                    az.put(strA, new WeakReference<>(obj2));
                    Logger.d(f52417x, "save matching object for reverse matching - saving ad id= " + strA + ",     matching object= " + obj2);
                } catch (JSONException e10) {
                    Logger.d(f52417x, "match info - exception: " + e10);
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String b(Object obj) {
        try {
            Logger.d(f52417x, "get CI after media player start call, media player: " + obj);
            VungleCreativeInfo vungleCreativeInfoRemove = aw.remove(Integer.valueOf(System.identityHashCode(obj)));
            if (vungleCreativeInfoRemove == null) {
                Logger.d(f52417x, "get CI after media player start call - cannot find creative in media player ID to CI map");
                return null;
            }
            if (av.remove(vungleCreativeInfoRemove.N()) == null) {
                Logger.d(f52417x, "Cannot find " + vungleCreativeInfoRemove.N() + " in creative to ID map");
            } else {
                Logger.d(f52417x, "creative to ID map key '" + vungleCreativeInfoRemove.N() + "'removed, key set: " + av.keySet().toString());
            }
            Logger.d(f52417x, "get CI after media player start call - returning " + vungleCreativeInfoRemove.L() + " as ad ID");
            return vungleCreativeInfoRemove.L();
        } catch (Exception e10) {
            Logger.e(f52417x, "exception when trying to remove from media player ID to CI map" + e10.getMessage());
            return null;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> b(String str, String str2, Map<String, List<String>> map, c.a aVar) throws JSONException {
        JSONObject jSONObject;
        CreativeInfo creativeInfoA;
        k.b(f52417x, "generate info started, url: " + str + ", buffer: " + str2 + ", maxParams: " + aVar);
        ArrayList arrayList = new ArrayList();
        try {
            jSONObject = new JSONObject(str2);
        } catch (Throwable th2) {
            Logger.d(f52417x, "Exception parsing prefetch : " + th2.getMessage(), th2);
        }
        if (str.contains(f52413j)) {
            k.b(f52417x, "Config request intercepted: " + str2);
            l(str2);
            return null;
        }
        if (CreativeInfoManager.g(str) || str.equals("@!1:ad_fetch@!")) {
            Logger.d(f52417x, "Url is a mediation url");
            if (jSONObject.has(f52397am)) {
                Logger.d(f52417x, "content contains an AdUnit field");
                String strA = com.safedk.android.utils.c.a(Base64.decode(jSONObject.getString(f52397am), 0));
                k.b(f52417x, "decodedAdUnitContent = " + strA);
                if (k.v(strA)) {
                    JSONObject jSONObject2 = new JSONObject(strA);
                    Logger.d(f52417x, "decodedAdUnitContent new JSONObject created");
                    jSONObject = jSONObject2;
                }
            }
        }
        boolean z10 = aVar != null && aVar.f52179b == BrandSafetyEvent.AdFormatType.NATIVE;
        if (jSONObject.has("id")) {
            CreativeInfo creativeInfoA2 = a(jSONObject, (String) null, z10);
            if (creativeInfoA2 != null) {
                if (creativeInfoA2.K().equals(BrandSafetyUtils.AdType.NATIVE)) {
                    Logger.d(f52417x, "ci is a native ad, skipping: " + creativeInfoA2);
                } else {
                    arrayList.add(creativeInfoA2);
                    av.put(creativeInfoA2.N(), (VungleCreativeInfo) creativeInfoA2);
                    Logger.d(f52417x, "ci to ID map key added " + creativeInfoA2.N() + ", key set: " + av.keySet());
                    creativeInfoA2.f(aVar.f52178a);
                }
                arrayList.add(creativeInfoA2);
                av.put(creativeInfoA2.N(), (VungleCreativeInfo) creativeInfoA2);
                Logger.d(f52417x, "ci to ID map key added " + creativeInfoA2.N() + ", key set: " + av.keySet().toString());
            }
        } else if (jSONObject.has("ads")) {
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                JSONObject jSONObject4 = jSONObject3.getJSONObject(f52406c);
                String string = jSONObject3.getString(K);
                if (b(jSONObject3) && (creativeInfoA = a(jSONObject4, string, z10)) != null) {
                    arrayList.add(creativeInfoA);
                    av.put(creativeInfoA.N(), (VungleCreativeInfo) creativeInfoA);
                    Logger.d(f52417x, "ci to ID map key added " + creativeInfoA.N() + ", key set: " + av.keySet());
                    if (z10) {
                        creativeInfoA.f(aVar.f52178a);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(Object obj, Object obj2) {
        try {
            Logger.d(f52417x, "handle media player set data source call, media player: " + obj + ", video file: " + obj2);
            Uri uri = (Uri) obj2;
            Logger.d(f52417x, "handle media player set data source call, uri: " + uri.toString());
            VungleCreativeInfo vungleCreativeInfoA = a(new File(uri.getPath()));
            if (vungleCreativeInfoA == null || aw.containsKey(Integer.valueOf(System.identityHashCode(obj)))) {
                return;
            }
            Logger.d(f52417x, "handle media player set data source call, adding CI to map");
            aw.put(Integer.valueOf(System.identityHashCode(obj)), vungleCreativeInfoA);
        } catch (Exception e10) {
            Logger.e(f52417x, "exception when trying to add mediaPlayer id and VungleCreativeInfo " + e10.getMessage());
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean z10 = str.contains(f52410g) || str.contains(f52411h) || str.contains(f52412i) || str.contains(f52413j);
        if (z10) {
            Logger.d(f52417x, "should follow input stream, url: " + str);
        }
        return z10;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int c(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        String strR = r(str2);
        if (strR == null) {
            strR = r(str);
        }
        if (strR == null) {
            return null;
        }
        Logger.d(f52417x, "get ad ID from resource returned ad ID: " + strR);
        return strR;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType f(String str) {
        if (str == null || !str.startsWith("mraid://")) {
            return RedirectDetails.RedirectType.REDIRECT;
        }
        if (str.contains("open")) {
            return RedirectDetails.RedirectType.REDIRECT;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return R;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String g(String str) {
        return (str == null || !str.contains("mraid://")) ? str : k.c(str, "url");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean h(String str) {
        VungleCreativeInfo vungleCreativeInfo = ax.get(str);
        WeakReference<Object> weakReferenceRemove = az.remove(str);
        Logger.d(f52417x, "try reverse matching - value= " + str + ",   matching ref= " + weakReferenceRemove + ",    ci= " + vungleCreativeInfo);
        if (vungleCreativeInfo == null || vungleCreativeInfo.K() != BrandSafetyUtils.AdType.NATIVE || weakReferenceRemove == null) {
            return false;
        }
        CreativeInfoManager.b(g.f53130d, str, weakReferenceRemove.get());
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(av, "VungleDiscovery:creativeToIdMap", false);
        com.safedk.android.utils.e.a(aw, "VungleDiscovery:mediaPlayerIdToCreativeInfo", false);
        com.safedk.android.utils.e.a(ax, "VungleDiscovery:adToIdMap", false);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean k(String str) {
        Logger.d(f52417x, "should follow get url: " + str);
        if (str.toLowerCase().endsWith(f52405b.toLowerCase())) {
            Logger.d(f52417x, "should follow get url - returning true for url: " + str);
            return true;
        }
        if (str.equals(f52395ak)) {
            Logger.d(f52417x, "Vungle privacy policy url invoked");
            CreativeInfoManager.d(g.f53130d, null);
        }
        String strR = r(str);
        if (strR != null && strR.length() > 0) {
            if (ax.containsKey(strR)) {
                Logger.d(f52417x, "ad to ID map contains creative ID: " + strR + ", returning true");
                return true;
            }
            Logger.d(f52417x, "ad to ID map does not contain creative ID: " + strR + " , key set : " + ax.keySet());
        }
        return false;
    }
}
