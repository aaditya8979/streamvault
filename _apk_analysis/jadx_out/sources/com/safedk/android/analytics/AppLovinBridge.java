package com.safedk.android.analytics;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.k;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class AppLovinBridge {
    private static Context L = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f51529a = "SafeDK";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f51530b = "v1/events";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f51531c = "v1/image_uploaded";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f51532d = "v1/resolved";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f51533e = "platform";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f51534f = "package";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f51535g = "android";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f51536h = "body";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f51538j = "AppLovinBridge";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f51539k = "max_ad_events";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f51540l = "safedk_init";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f51541m = "user_info";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f51542n = "send_http_request";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f51543o = "receive_http_response";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f51544p = "safedk_ad_info";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f51545q = "max_revenue_events";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f51546r = "url";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f51547s = "backup_url";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f51548t = "post_body";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f51549u = "report";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f51550v = "metadata";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f51551w = "events";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f51552x = "public";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f51553y = "private";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f51554z = "ad_review_creative_id";
    private static String A = "https://edge.safedk.com/v1/events";
    private static String B = "https://edge.safedk.com/v1/events";
    private static String C = "https://edge.safedk.com/v1/image_uploaded";
    private static String D = "https://edge.safedk.com/v1/image_uploaded";
    private static String E = "https://edge.safedk.com/v1/resolved";
    private static String F = "https://edge.safedk.com/v1/resolved";
    private static final String[] G = {"platform"};
    private static final String[] H = {"sdk_uuid", "impression_id", "ad_format_type", "timestamp"};
    private static final String[] I = {k.f52628c};
    private static final String[] J = {k.f52627b};
    private static HashMap<String, ArrayList<b>> K = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static AppLovinCommunicatorSubscriber f51537i = new AppLovinCommunicatorSubscriber() { // from class: com.safedk.android.analytics.AppLovinBridge.1
        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return AppLovinBridge.f51529a;
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
            Logger.d(AppLovinBridge.f51538j, "Response received " + appLovinCommunicatorMessage.getMessageData() + ", topic=" + appLovinCommunicatorMessage.getTopic() + ", url=" + appLovinCommunicatorMessage.getMessageData().getString("url"));
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            String string = appLovinCommunicatorMessage.getMessageData().getString("url");
            if (string.endsWith(AppLovinBridge.f51530b)) {
                AppLovinBridge.b(AppLovinBridge.f51530b, messageData.getBundle("body"));
            } else if (string.endsWith(AppLovinBridge.f51531c)) {
                AppLovinBridge.b(AppLovinBridge.f51531c, messageData.getBundle("body"));
            } else if (string.endsWith(AppLovinBridge.f51532d)) {
                AppLovinBridge.b(AppLovinBridge.f51532d, messageData.getBundle("body"));
            }
        }
    };

    private static void a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        AppLovinCommunicator.getInstance(L).subscribe(appLovinCommunicatorSubscriber, Arrays.asList(str));
    }

    static void a(ArrayList<Bundle> arrayList, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        com.safedk.android.utils.k.b(f51538j, "report stats events start " + arrayList.size() + " events. edgeUrl=" + A + ", events : " + arrayList.toString());
        Bundle bundle = new Bundle();
        bundle.putString("url", A);
        bundle.putString(f51547s, B);
        Bundle bundle2 = new Bundle();
        Bundle bundleC = SafeDK.getInstance().w().c();
        synchronized (arrayList) {
            Iterator<Bundle> it = arrayList.iterator();
            while (it.hasNext()) {
                Bundle next = it.next();
                if ("impression".equals(next.getString(StatsEvent.f52830z)) && (a(next, H, "stats event") || !a(next))) {
                    Logger.d(f51538j, "report stats events not completed. removing event with missing fields.");
                    it.remove();
                }
            }
        }
        if (arrayList.isEmpty() || a(bundleC, G, "metadata")) {
            Logger.d(f51538j, "report stats events not completed. there are missing fields.");
            return;
        }
        bundle2.putBundle("metadata", bundleC);
        bundle2.putParcelableArrayList("events", arrayList);
        Bundle bundle3 = new Bundle();
        bundle3.putBundle("report", bundle2);
        bundle.putBundle(f51548t, bundle3);
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle, f51542n, appLovinCommunicatorPublisher);
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(L);
        Logger.d(f51538j, "publishing message with " + arrayList.size() + " events");
        appLovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
    }

    private static boolean a(Bundle bundle) {
        return SdksMapping.getSdkPackageByPackageUUID(bundle.getString("sdk_uuid")) != null;
    }

    private static boolean a(Bundle bundle, String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            if (!bundle.containsKey(str2)) {
                hashSet.add(str2);
            }
        }
        if (hashSet.isEmpty()) {
            return false;
        }
        Logger.d(f51538j, "missing fields in " + str + " data: " + hashSet);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Bundle bundle) {
        try {
            Logger.d(f51538j, "notify listeners started, request name=" + str + ", data=" + bundle.toString());
            ArrayList<b> arrayList = K.get(str);
            if (arrayList != null) {
                for (b bVar : arrayList) {
                    Logger.d(f51538j, "Invoking handler for request name '" + str + "', Bundle : " + bundle.toString());
                    bVar.a(str, bundle);
                }
            }
        } catch (Throwable th2) {
            Logger.e(f51538j, "Failed to read response", th2);
        }
    }

    public static void init(Context context) {
        L = context;
        registerToReceiveResponse(f51537i);
    }

    public static void receiveEdgeUrls(String str, String str2) {
        Logger.d(f51538j, "receive edge urls, url=" + str + ", backupUrl=" + str2);
        if (!TextUtils.isEmpty(str)) {
            A = str + "/" + f51530b;
            Logger.d(f51538j, "receive edge urls, edgeBrandSafetyReportUrl updated to " + A);
            C = str + "/" + f51531c;
            Logger.d(f51538j, "receive edge urls, ImageUploadedUrl updated to " + C);
            E = str + "/" + f51532d;
            Logger.d(f51538j, "receive edge urls, resolvedUrl updated to " + E);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        B = str2 + "/" + f51530b;
        Logger.d(f51538j, "Backup edgeBackupBrandSafetyReportUrl updated to " + B);
        D = str2 + "/" + f51531c;
        Logger.d(f51538j, "Backup ImageUploadedUrl updated to " + D);
        F = str2 + "/" + f51532d;
        Logger.d(f51538j, "Backup resolvedUrl updated to " + F);
    }

    public static void registerListener(String str, b bVar) {
        try {
            Logger.d(f51538j, "register listener started, request name=" + str);
            if (!K.containsKey(str)) {
                Logger.d(f51538j, "register listener, listener list created for request name=" + str);
                K.put(str, new ArrayList<>());
            }
            ArrayList<b> arrayList = K.get(str);
            Logger.d(f51538j, "register listener, listener added for request name=" + str + StringUtils.COMMA + bVar);
            arrayList.add(bVar);
        } catch (Throwable th2) {
            Logger.e(f51538j, "register listener failed. request name:" + str + ", listener: " + bVar, th2);
            new CrashReporter().caughtException(th2);
        }
    }

    public static void registerToReceiveMaxEvents(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        a(appLovinCommunicatorSubscriber, f51539k);
    }

    public static void registerToReceiveMaxRevenueEvents(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        a(appLovinCommunicatorSubscriber, f51545q);
    }

    public static void registerToReceiveResponse(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        a(appLovinCommunicatorSubscriber, f51543o);
    }

    public static void registerToReceiveSafeDKSettings(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        a(appLovinCommunicatorSubscriber, f51540l);
    }

    public static void registerToReceiveUserInfo(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        a(appLovinCommunicatorSubscriber, f51541m);
    }

    public static void reportClickUrlResolvedEvent(Bundle bundle, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        Logger.d(f51538j, "report click url resolved event start");
        Bundle bundle2 = new Bundle();
        bundle2.putString("url", E);
        bundle2.putString(f51547s, F);
        Bundle bundleC = SafeDK.getInstance().w().c();
        bundle.putBundle("metadata", bundleC);
        bundle2.putBundle(f51548t, bundle);
        if (a(bundle, J, "resolved") || a(bundleC, G, "metadata")) {
            Logger.d(f51538j, "report image upload event not completed. there are missing fields.");
            return;
        }
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle2, f51542n, appLovinCommunicatorPublisher);
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(L);
        Logger.d(f51538j, "publishing message. body=" + bundle.toString());
        appLovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
    }

    public static void reportImageUploadEvent(Bundle bundle, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        Logger.d(f51538j, "report image upload event start. Data=" + bundle.toString());
        Bundle bundle2 = new Bundle();
        bundle2.putString("url", C);
        bundle2.putString(f51547s, D);
        Bundle bundleC = SafeDK.getInstance().w().c();
        bundle.putBundle("metadata", bundleC);
        bundle2.putBundle(f51548t, bundle);
        if (a(bundle, I, "image uploaded") || a(bundleC, G, "metadata")) {
            Logger.d(f51538j, "report image upload event not completed. there are missing fields.");
            return;
        }
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle2, f51542n, appLovinCommunicatorPublisher);
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(L);
        Logger.d(f51538j, "publishing message. body=" + bundle.toString());
        appLovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
    }

    public static void reportMaxCreativeId(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        Logger.d(f51538j, "report max creative ID start, creative ID=" + str + ", appLovin max bundle=" + bundle.toString());
        Bundle bundle2 = new Bundle();
        bundle2.putString(f51554z, str);
        Bundle bundle3 = new Bundle();
        bundle3.putBundle("public", bundle2);
        bundle3.putBundle(f51553y, bundle);
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle3, f51544p, appLovinCommunicatorPublisher);
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(L);
        Logger.d(f51538j, "report max creative ID, publishing message. body=" + bundle3.toString());
        appLovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
    }
}
