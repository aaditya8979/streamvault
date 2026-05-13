package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.google.android.gms.ads.MobileAds;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class BrandSafetyUtils {
    private static final float A = 0.2f;
    private static final float B = 0.2f;
    private static int H = 0;
    private static int I = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f51644a = ".jpg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f51645b = ".txt";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f51646c = "unknown";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f51647d = "com.appsaholic";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f51648e = 1000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f51649f = 500;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f51650g = 86400000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f51651h = 20000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f51652i = 5000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f51653j = "INTER";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f51654k = "REWARDED";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f51655l = "APPOPEN";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f51656m = "BANNER";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f51657n = "LEADER";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f51658o = "MREC";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f51659p = "NATIVE";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f51660q = "BrandSafetyUtils";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Set<String> f51662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set<String> f51663t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f51665v = 100;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f51666w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f51667x = 8947848;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final float f51668y = 0.2f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final float f51669z = 0.2f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final List<Integer> f51664u = new LinkedList();
    private static m C = null;
    private static RedirectDetails D = null;
    private static String E = null;
    private static String F = null;
    private static final ExecutorService G = Executors.newSingleThreadExecutor();
    private static final String INTERSTITIAL_ACTIVITIES = "Y29tLnZ1bmdsZS5wdWJsaXNoZXIuRmxleFZpZXdBZEFjdGl2aXR5fGNvbS5pbm1vYmkuYWRzLnJlbmRlcmluZy5Jbk1vYmlBZEFjdGl2aXR5fGNvbS52dW5nbGUucHVibGlzaGVyLlZpZGVvRnVsbFNjcmVlbkFkQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRURnVsbFNjcmVlblZpZGVvQWN0aXZpdHl8Y29tLmdvb2dsZS5hZHMuQWRBY3Rpdml0eXxjb20uc21hYXRvLnNkay5pbnRlcnN0aXRpYWwudmlldy5JbnRlcnN0aXRpYWxBZEFjdGl2aXR5fGNvbS51bml0eTNkLmFkcy5hZHVuaXQuQWRVbml0QWN0aXZpdHl8Y29tLmFwcGxvdmluLmFkdmlldy5BcHBMb3ZpbkludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5tYnJpZGdlLm1zZGsucmV3YXJkLnBsYXllci5NQlJld2FyZFZpZGVvQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRUUmV3YXJkVmlkZW9BY3Rpdml0eXxjb20udW5pdHkzZC5hZHMuYW5kcm9pZC52aWV3LlVuaXR5QWRzRnVsbHNjcmVlbkFjdGl2aXR5fGNvbS5tYnJpZGdlLm1zZGsuaW50ZXJhY3RpdmVhZHMuYWN0aXZpdHkuSW50ZXJhY3RpdmVTaG93QWN0aXZpdHl8Y29tLnNtYWF0by5zZGsucmV3YXJkZWQudmlldy5SZXdhcmRlZEludGVyc3RpdGlhbEFkQWN0aXZpdHl8Y29tLnZ1bmdsZS53YXJyZW4udWkuVnVuZ2xlQWN0aXZpdHl8Y29tLnVuaXR5M2Quc2VydmljZXMuYWRzLmFkdW5pdC5BZFVuaXRTb2Z0d2FyZUFjdGl2aXR5fGNvbS52dW5nbGUucHVibGlzaGVyLk1yYWlkRnVsbFNjcmVlbkFkQWN0aXZpdHl8Y29tLmdvb2dsZS5hbmRyb2lkLmdtcy5hZHMuQWRBY3Rpdml0eXxjb20ubW9sb2NvLnNkay54ZW5vc3Muc2RrZGV2a2l0LmFuZHJvaWQuYWRyZW5kZXJlci5pbnRlcm5hbC5tcmFpZC5NcmFpZEFjdGl2aXR5fGNvbS5zbWFhdG8uc2RrLmludGVyc3RpdGlhbC5JbnRlcnN0aXRpYWxBZEFjdGl2aXR5fGNvbS51bml0eTNkLnNlcnZpY2VzLmFkcy5hZHVuaXQuQWRVbml0QWN0aXZpdHl8Y29tLmFwcGxvdmluLmltcGwuYWR2aWV3LkFwcExvdmluT3JpZW50YXRpb25Bd2FyZUludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5taW50ZWdyYWwubXNkay5yZXdhcmQucGxheWVyLk1UR1Jld2FyZFZpZGVvQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRUQXBwT3BlbkFkQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRURnVsbFNjcmVlbkV4cHJlc3NWaWRlb0FjdGl2aXR5fGNvbS5hcHBsb3Zpbi5hZHZpZXcuQXBwTG92aW5GdWxsc2NyZWVuVGhlbWVkQWN0aXZpdHl8Y29tLm1vbG9jby5zZGsueGVub3NzLnNka2RldmtpdC5hbmRyb2lkLmFkcmVuZGVyZXIuaW50ZXJuYWwuc3RhdGljcmVuZGVyZXIuU3RhdGljQWRBY3Rpdml0eXxjb20udW5pdHkzZC5hZHMuYWR1bml0LkFkVW5pdFNvZnR3YXJlQWN0aXZpdHl8Y29tLmlyb25zb3VyY2Uuc2RrLmNvbnRyb2xsZXIuSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLmFkY29sb255LnNkay5BZENvbG9ueUFkVmlld0FjdGl2aXR5fGNvbS5taW50ZWdyYWwubXNkay5pbnRlcnN0aXRpYWwudmlldy5NVEdJbnRlcnN0aXRpYWxBY3Rpdml0eXxjb20ubWJyaWRnZS5tc2RrLmludGVyc3RpdGlhbC52aWV3Lk1CSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLm1pbnRlZ3JhbC5tc2RrLmludGVyYWN0aXZlYWRzLmFjdGl2aXR5LkludGVyYWN0aXZlU2hvd0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVFJld2FyZEV4cHJlc3NWaWRlb0FjdGl2aXR5fGNvbS52dW5nbGUucHVibGlzaGVyLkZ1bGxTY3JlZW5BZEFjdGl2aXR5fGNvbS5zdXBlcnNvbmljYWRzLnNkay5jb250cm9sbGVyLkludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5zbWFhdG8uc2RrLnJld2FyZGVkLndpZGdldC5SZXdhcmRlZEludGVyc3RpdGlhbEFkQWN0aXZpdHl8Y29tLmFwcGxvdmluLmFkdmlldy5BcHBMb3ZpbkZ1bGxzY3JlZW5BY3Rpdml0eXxjb20uZnliZXIuaW5uZXJhY3RpdmUuc2RrLmFjdGl2aXRpZXMuSW5uZXJhY3RpdmVGdWxsc2NyZWVuQWRBY3Rpdml0eXxjb20udnVuZ2xlLndhcnJlbi51aS5WdW5nbGVGbGV4Vmlld0FjdGl2aXR5fGNvbS5zdXBlcnNvbmljYWRzLnNkay5jb250cm9sbGVyLkNvbnRyb2xsZXJBY3Rpdml0eXxjb20udnVuZ2xlLmFkcy5pbnRlcm5hbC51aS5WdW5nbGVBY3Rpdml0eXxjb20uaXJvbnNvdXJjZS5zZGsuY29udHJvbGxlci5Db250cm9sbGVyQWN0aXZpdHl8Y29tLm1vbG9jby5zZGsueGVub3NzLnNka2RldmtpdC5hbmRyb2lkLmFkcmVuZGVyZXIuaW50ZXJuYWwudmFzdC5WYXN0QWN0aXZpdHl8Y29tLmFkY29sb255LnNkay5BZENvbG9ueUludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5maXZlX2NvcnAuYWQuQWRBY3Rpdml0eQ";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Set<String> f51661r = new HashSet(Arrays.asList(new String(Base64.decode(INTERSTITIAL_ACTIVITIES, 0)).split("\\|")));

    public enum AdType {
        INTERSTITIAL,
        MREC,
        BANNER,
        NATIVE
    }

    public enum ScreenShotOrientation {
        NOT_INITIALIZED,
        PORTRAIT,
        LANDSCAPE
    }

    public enum ScreenshotValidity {
        VALID,
        UNIFORMITY_BLACK,
        UNIFORMITY_VERY_HIGH,
        UNIFORMITY_HIGH,
        UNIFORMITY_GRAY,
        NOT_SUITABLE_FOR_DASHBOARD
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f51705a = "BitmapScanResult";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f51706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f51708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f51709e = false;

        public int a() {
            return this.f51706b;
        }

        public void a(int i10) {
            this.f51706b = i10;
        }

        public void a(boolean z10) {
            this.f51709e = z10;
        }

        public int b() {
            return this.f51707c;
        }

        public void b(int i10) {
            Logger.d(f51705a, "setBlackPixelPercentage : " + i10);
            this.f51707c = i10;
        }

        public int c() {
            return this.f51708d;
        }

        public void c(int i10) {
            Logger.d(f51705a, "setGreyPixelPercentage : " + i10);
            this.f51708d = i10;
        }

        public boolean d() {
            return this.f51707c > 50 && this.f51709e;
        }

        public String toString() {
            return "{MaxPixelCount = " + this.f51706b + ", BlackPixelPercentage = " + this.f51707c + "%, GreyPixelPercentage = " + this.f51708d + "%}";
        }
    }

    static class b implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f51710a;

        public b(String str) {
            this.f51710a = null;
            this.f51710a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.contains(this.f51710a);
        }
    }

    static class c implements FilenameFilter {
        c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(BrandSafetyUtils.f51644a);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f51711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f51712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f51713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ScreenShotOrientation f51714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f51715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f51716f;

        public d(String str, String str2, String str3, ScreenShotOrientation screenShotOrientation, String str4, String str5) {
            this.f51711a = str;
            this.f51712b = str2;
            this.f51713c = str3;
            this.f51714d = screenShotOrientation;
            this.f51715e = str4;
            this.f51716f = str5;
        }

        public String a() {
            return this.f51711a;
        }

        public String b() {
            return this.f51712b;
        }

        public String c() {
            return this.f51713c;
        }

        public ScreenShotOrientation d() {
            return this.f51714d;
        }

        public String e() {
            return this.f51715e;
        }

        public String f() {
            return this.f51716f;
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f51717a = "SdkUrlRedirectManager";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Map<String, Long> f51718b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f51719c = 1000;

        private e() {
        }

        private static void a() {
            Logger.d(f51717a, "Clear data started, (" + f51718b.size() + ") : " + f51718b.toString());
            ArrayList<String> arrayList = new ArrayList();
            for (String str : f51718b.keySet()) {
                Logger.d(f51717a, "Clear System.currentTimeMillis()-sdkAndUrlToTimestamp.get(key)=" + (System.currentTimeMillis() - f51718b.get(str).longValue()));
                if (System.currentTimeMillis() - f51718b.get(str).longValue() > f51719c) {
                    Logger.d(f51717a, "Added key for removal : " + str);
                    arrayList.add(str);
                }
            }
            if (arrayList.size() > 0) {
                for (String str2 : arrayList) {
                    Logger.d(f51717a, "Removing key " + str2);
                    f51718b.remove(str2);
                }
            }
            Logger.d(f51717a, "Clear data finished, Items (" + f51718b.size() + ") : " + f51718b.toString());
        }

        private static void a(String str, String str2, long j10) {
            Logger.d(f51717a, "Update latest timestamp for Sdk and url started. sdkPackageName=" + str + ", url=" + str2);
            f51718b.put(b(str, str2), Long.valueOf(j10));
            Logger.d(f51717a, "timestamps : " + f51718b.toString());
        }

        public static boolean a(String str) {
            String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(str);
            if (sdkUUIDByPackage == null || sdkUUIDByPackage.length() <= 0 || SdksMapping.getRedirectSupportedSdks() == null) {
                Logger.d(f51717a, "Cannot determine if sdk is redirect detection supported, sdk=" + str);
                return false;
            }
            Logger.d(f51717a, "sdk=" + str + ", sdkUid=" + sdkUUIDByPackage + ", supported ? " + SdksMapping.getRedirectSupportedSdks().contains(sdkUUIDByPackage));
            return SdksMapping.getRedirectSupportedSdks().contains(sdkUUIDByPackage);
        }

        public static boolean a(String str, String str2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            a();
            long jD = d(str, str2);
            Logger.d(f51717a, "Checking if we should ignore the redirect instance sdkPackageName=" + str + ", url=" + str2 + ", timestamp=" + jCurrentTimeMillis + ",System.currentTimeMillis()=" + System.currentTimeMillis() + ", latestTimestamp=" + jD + ", diff=" + (System.currentTimeMillis() - jD));
            if (jD == 0 || System.currentTimeMillis() - jD >= f51719c) {
                a(str, str2, jCurrentTimeMillis);
                return false;
            }
            Logger.d(f51717a, "should ignore this redirect.");
            return true;
        }

        private static String b(String str, String str2) {
            return str + "_" + str2;
        }

        private static boolean c(String str, String str2) {
            Logger.d(f51717a, "Check : does timestamp exist for Sdk and url ?  sdkPackageName=" + str + ", url=" + str2 + " , result = " + f51718b.containsKey(b(str, str2)));
            return f51718b.containsKey(b(str, str2));
        }

        private static long d(String str, String str2) {
            Logger.d(f51717a, "getting latest timestamp for Sdk and url started. sdkPackageName=" + str + ", url=" + str2);
            if (c(str, str2)) {
                return f51718b.get(b(str, str2)).longValue();
            }
            return 0L;
        }
    }

    static {
        Logger.d(f51660q, "BrandSafetyUtils initialized with " + f51661r + ",  INTERSTITIAL_ACTIVITIES=" + INTERSTITIAL_ACTIVITIES);
        f51662s = new HashSet(Arrays.asList(new String(Base64.decode("Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRUTGFuZGluZ1BhZ2VBY3Rpdml0eXxjb20uZnliZXIuaW5uZXJhY3RpdmUuc2RrLmFjdGl2aXRpZXMuSW5uZXJhY3RpdmVJbnRlcm5hbEJyb3dzZXJBY3Rpdml0eXxjb20uYnl0ZWRhbmNlLnNkay5vcGVuYWRzZGsuYWN0aXZpdHkuVFRQbGF5YWJsZUxhbmRpbmdQYWdlQWN0aXZpdHl8Y29tLmlyb25zb3VyY2Uuc2RrLmNvbnRyb2xsZXIuT3BlblVybEFjdGl2aXR5", 0)).split("\\|")));
        Logger.d(f51660q, "BrandSafetyUtils initialized with " + f51662s + ",  INTERNAL_BROWSER_ACTIVITIES=" + INTERSTITIAL_ACTIVITIES);
        f51663t = new HashSet();
        H = 0;
        I = 0;
    }

    static int a() {
        if (H == 0) {
            j();
        }
        return H;
    }

    public static AdType a(long j10, long j11) {
        if (com.safedk.android.utils.k.a(j10, j11)) {
            Logger.d(f51660q, "generate info View check. banner identified");
            return AdType.BANNER;
        }
        if (com.safedk.android.utils.k.b(j10, j11)) {
            Logger.d(f51660q, "generate info View check. mrec identified");
            return AdType.MREC;
        }
        Logger.d(f51660q, "generate info View check. inter identified");
        return AdType.INTERSTITIAL;
    }

    public static AdType a(BrandSafetyEvent.AdFormatType adFormatType) {
        if (adFormatType != null) {
            switch (adFormatType) {
                case INTER:
                case REWARD:
                case APPOPEN:
                    return AdType.INTERSTITIAL;
                case BANNER:
                case LEADER:
                    return AdType.BANNER;
                case MREC:
                    return AdType.MREC;
                case NATIVE:
                    return AdType.NATIVE;
            }
        }
        return null;
    }

    public static ScreenshotValidity a(String str, a aVar) {
        return a(str, aVar, 1000, CreativeInfoManager.a(str, AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, SafeDK.getInstance().H()));
    }

    public static ScreenshotValidity a(String str, a aVar, int i10, float f10) {
        Logger.d(f51660q, "screenshot validity check started, number of samples: " + i10 + ", BitmapScanResult: " + aVar);
        if (aVar.b() > 98) {
            Logger.d(f51660q, "screenshot validity check, black pixel percentage is above threshold, image is black (not valid)");
            return ScreenshotValidity.UNIFORMITY_BLACK;
        }
        int iA = (aVar.a() * 100) / i10;
        if (iA > 98) {
            Logger.d(f51660q, "screenshot validity check, uniform pixel count is " + iA + "% => above threshold, image is uniform (not valid)");
            return ScreenshotValidity.UNIFORMITY_VERY_HIGH;
        }
        if (iA > f10) {
            Logger.d(f51660q, "screenshot validity check, uniformity check : Screenshot max color pixel count is above uniformity threshold, image is not valid (result = " + iA + "%)");
            return ScreenshotValidity.UNIFORMITY_HIGH;
        }
        if (aVar.b() > 10 && aVar.c() > 10) {
            Logger.d(f51660q, "screenshot validity check, black pixel percentage is " + aVar.b() + "% , grey pixel percentage is " + aVar.c() + "%, => above threshold, image is not valid");
            return ScreenshotValidity.UNIFORMITY_GRAY;
        }
        if (aVar.c() > 50) {
            Logger.d(f51660q, "screenshot validity check, black pixel percentage is " + aVar.b() + "%  => above threshold, image is not valid");
            return ScreenshotValidity.UNIFORMITY_GRAY;
        }
        if (CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false)) {
            if (aVar.d()) {
                Logger.d(f51660q, "screenshot validity check, Screenshot is NSFD");
                return ScreenshotValidity.NOT_SUITABLE_FOR_DASHBOARD;
            }
            Logger.d(f51660q, "screenshot validity check, Screenshot is NOT NSFD");
        }
        return ScreenshotValidity.VALID;
    }

    public static a a(String str, Bitmap bitmap) {
        return a(str, bitmap, 1000, AdType.INTERSTITIAL);
    }

    private static a a(String str, Bitmap bitmap, int i10, AdType adType) {
        int i11;
        a aVar = new a();
        Random random = new Random();
        HashMap map = new HashMap();
        Logger.d(f51660q, "scanBitmap started, sdkPackage = " + str + ", adType = " + adType.name() + " bitmap scan : margins are : top " + CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_TOP_MARGIN_PERCENT, 0.2f) + " , right " + CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_RIGHT_MARGIN_PERCENT, 0.2f) + ", left " + CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_LEFT_MARGIN_PERCENT, 0.2f) + ", right " + CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_BOTTOM_MARGIN_PERCENT, 0.2f) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        int width = bitmap.getWidth();
        int i12 = (int) (r5 * width);
        int i13 = (int) (width - (r1 * width));
        int height = bitmap.getHeight();
        int i14 = (int) (r0 * height);
        int i15 = (int) (height - (height * r6));
        for (int i16 = 0; i16 < i10; i16++) {
            int pixel = 16777215 & bitmap.getPixel(random.nextInt(i13 - i12) + i12, random.nextInt(i15 - i14) + i14);
            Integer num = (Integer) map.get(Integer.valueOf(pixel));
            if (num == null) {
                map.put(Integer.valueOf(pixel), 1);
            } else {
                map.put(Integer.valueOf(pixel), Integer.valueOf(num.intValue() + 1));
            }
        }
        int iIntValue = 0;
        Iterator it = map.values().iterator();
        while (true) {
            i11 = iIntValue;
            if (!it.hasNext()) {
                break;
            }
            iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue > i11) {
                aVar.a(iIntValue);
            } else {
                iIntValue = i11;
            }
        }
        if (map.get(0) != null && ((Integer) map.get(0)) != null) {
            int iIntValue2 = (((Integer) map.get(0)).intValue() * 100) / i10;
            Logger.d(f51660q, "bitmap scan : Black Pixel Percentage is " + iIntValue2 + " (" + map.get(0) + "/" + i10 + ")");
            aVar.b(iIntValue2);
        }
        if (map.get(Integer.valueOf(f51667x)) != null && ((Integer) map.get(Integer.valueOf(f51667x))) != null) {
            int iIntValue3 = (((Integer) map.get(Integer.valueOf(f51667x))).intValue() * 100) / i10;
            Logger.d(f51660q, "bitmap scan : Grey Pixel Percentage is " + iIntValue3 + " (" + map.get(Integer.valueOf(f51667x)) + "/" + i10 + ")");
            aVar.c(iIntValue3);
        }
        Logger.v(f51660q, "bitmap scan : maxPixelValue = " + i11);
        if (CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false)) {
            aVar.a(a((Map<Integer, Integer>) map));
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.safedk.android.analytics.brandsafety.e a(android.app.Activity r5) {
        /*
            java.lang.Class<com.safedk.android.analytics.brandsafety.BrandSafetyUtils> r1 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.class
            monitor-enter(r1)
            l()     // Catch: java.lang.Throwable -> L81
            k()     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "BrandSafetyUtils"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r2.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "handle Redirect If Needed with activity: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r2 = r2.append(r5)     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = " last redirect: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L81
            com.safedk.android.analytics.brandsafety.RedirectDetails r3 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.D     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "\nlast intent: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L81
            com.safedk.android.analytics.brandsafety.m r3 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.C     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L81
            com.safedk.android.utils.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> L81
            com.safedk.android.analytics.brandsafety.RedirectDetails r0 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.D     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L7f
            com.safedk.android.analytics.brandsafety.m r0 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.C     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L7f
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = com.safedk.android.utils.SdksMapping.getSdkPackageByClass(r0)     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "BrandSafetyUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r3.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = "handle Redirect If Needed with activity: activity sdk: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L81
            com.safedk.android.utils.Logger.d(r2, r3)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L7f
            com.safedk.android.analytics.brandsafety.m r2 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.C     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = r2.f52684c     // Catch: java.lang.Throwable -> L81
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L7f
            com.safedk.android.analytics.brandsafety.RedirectDetails r2 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.D     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = r2.f51832c     // Catch: java.lang.Throwable -> L81
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L7f
            r2 = 0
            r3 = 1
            com.safedk.android.analytics.brandsafety.e r0 = a(r0, r2, r3)     // Catch: java.lang.Throwable -> L81
        L7d:
            monitor-exit(r1)
            return r0
        L7f:
            r0 = 0
            goto L7d
        L81:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.a(android.app.Activity):com.safedk.android.analytics.brandsafety.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0125 A[Catch: all -> 0x017f, TryCatch #0 {, blocks: (B:4:0x0004, B:10:0x006a, B:7:0x0060, B:13:0x009e, B:15:0x00a4, B:17:0x0118, B:19:0x0125, B:20:0x012b, B:21:0x0130, B:23:0x013a, B:25:0x0144, B:27:0x014a, B:32:0x0182, B:34:0x018c), top: B:37:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized com.safedk.android.analytics.brandsafety.e a(java.lang.String r7, boolean r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.a(java.lang.String, boolean, boolean):com.safedk.android.analytics.brandsafety.e");
    }

    public static BrandSafetyEvent.AdFormatType a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("ad_format");
            if ("BANNER".equals(string) || f51657n.equals(string)) {
                return BrandSafetyEvent.AdFormatType.BANNER;
            }
            if (f51658o.equals(string)) {
                return BrandSafetyEvent.AdFormatType.MREC;
            }
            if (f51654k.equals(string)) {
                return BrandSafetyEvent.AdFormatType.REWARD;
            }
            if (f51653j.equals(string)) {
                return BrandSafetyEvent.AdFormatType.INTER;
            }
            if (f51655l.equals(string)) {
                return BrandSafetyEvent.AdFormatType.APPOPEN;
            }
            if ("NATIVE".equals(string)) {
                return BrandSafetyEvent.AdFormatType.NATIVE;
            }
        }
        return null;
    }

    public static BrandSafetyEvent.AdFormatType a(AdType adType) {
        if (adType != null) {
            switch (adType) {
                case INTERSTITIAL:
                    return BrandSafetyEvent.AdFormatType.INTER;
                case BANNER:
                    return BrandSafetyEvent.AdFormatType.BANNER;
                case MREC:
                    return BrandSafetyEvent.AdFormatType.MREC;
                case NATIVE:
                    return BrandSafetyEvent.AdFormatType.NATIVE;
            }
        }
        return null;
    }

    static String a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(byteArray, 0, byteArray.length);
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e10) {
            Logger.e(f51660q, "Failed to get hash value for bitmap", e10);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String a(android.graphics.Bitmap r5, com.safedk.android.analytics.brandsafety.BrandSafetyUtils.AdType r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, com.safedk.android.analytics.brandsafety.BrandSafetyUtils.ScreenShotOrientation r10) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.a(android.graphics.Bitmap, com.safedk.android.analytics.brandsafety.BrandSafetyUtils$AdType, java.lang.String, java.lang.String, java.lang.String, com.safedk.android.analytics.brandsafety.BrandSafetyUtils$ScreenShotOrientation):java.lang.String");
    }

    public static String a(AdType adType, String str, String str2, String str3, ScreenShotOrientation screenShotOrientation) {
        String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(str2);
        Logger.d(f51660q, "getFileName Sdk UUID is " + sdkUUIDByPackage + " for sdk " + str2);
        return SafeDK.getInstance().l().getDir("SafeDK_" + adType, 0) + File.separator + str + "_" + sdkUUIDByPackage + "_" + str3 + "_" + screenShotOrientation.name().toLowerCase() + f51644a;
    }

    public static String a(Class cls) {
        return e(cls.getName());
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Integer.toHexString(obj.hashCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.StringBuilder] */
    private static String a(String str, Intent intent) {
        AdNetworkDiscovery adNetworkDiscoveryH;
        Logger.d(f51660q, "Attempting to extract url from intent extra, sdkPackageName is " + str + ", intent : " + com.safedk.android.utils.k.a(intent));
        ?? string = 0;
        ?? r02 = 0;
        if (intent == null) {
            return null;
        }
        try {
            if (intent.getExtras() == null || (adNetworkDiscoveryH = CreativeInfoManager.h(str)) == null) {
                return null;
            }
            List<String> listG = adNetworkDiscoveryH.g();
            Iterator<String> it = listG.iterator();
            ?? r12 = listG;
            while (true) {
                try {
                    r12 = r02;
                    if (!it.hasNext()) {
                        return r12;
                    }
                    String next = it.next();
                    Logger.d(f51660q, "looking for url in intent extra with name : " + next);
                    string = intent.getExtras().getString(next);
                    if (string != 0) {
                        Logger.d(f51660q, "found url in intent : " + string);
                        return string;
                    }
                    r02 = string;
                    r12 = r12;
                } catch (Throwable th2) {
                    string = r12;
                }
            }
        } catch (Throwable th3) {
        }
        Logger.e(f51660q, "Exception when attempting to extract url from intent extra");
        return string;
    }

    public static String a(String str, boolean z10) {
        String str2;
        try {
            if (str == null) {
                Logger.d(f51660q, "Parameter name 'activityName' cannot be null");
                str2 = null;
            } else {
                String[] strArrSplit = str.split("@");
                str2 = strArrSplit.length > 1 ? strArrSplit[z10 ? (char) 1 : (char) 0] : "";
            }
            return str2;
        } catch (Throwable th2) {
            Logger.e(f51660q, "Failed to get activity address for " + str, th2);
            return "";
        }
    }

    public static String a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        try {
            return new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(bArr)).toString(16);
        } catch (NoSuchAlgorithmException e10) {
            return "";
        }
    }

    public static void a(final Intent intent, final String str, final boolean z10) {
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().o()) {
            return;
        }
        Logger.d(f51660q, "detect ad click invoked, sdk=" + str);
        if (com.safedk.android.utils.k.c()) {
            G.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    BrandSafetyUtils.c(intent, str, z10);
                }
            });
        } else {
            c(intent, str, z10);
        }
    }

    static synchronized void a(AdType adType, String str) {
        synchronized (BrandSafetyUtils.class) {
            Logger.d(f51660q, "remove all ad files started, adType = " + adType.name() + " , impression = " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (str.contains("_")) {
                String str2 = str.split("_")[1];
                File dir = SafeDK.getInstance().l().getDir("SafeDK_" + adType, 0);
                Logger.d(f51660q, "remove all ad files impressionId = " + str2);
                File[] fileArrListFiles = dir.listFiles(new b(str2));
                if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                    for (File file : fileArrListFiles) {
                        Logger.d(f51660q, "remove all ad files deleting file for impression " + str2 + " : " + file.getAbsolutePath());
                        d(file.getAbsolutePath());
                    }
                }
            }
        }
    }

    public static void a(String str) {
        f51662s.add(str);
    }

    private static void a(String str, long j10, long j11, String str2, String str3, String str4) {
        try {
            Logger.d(f51660q, "Report click url with no impression to server starting, sdkPackageName=" + str + ", url=" + str3 + ", currentForegroundActivityName=" + str4 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (!SafeDK.Y()) {
                Logger.d(f51660q, "Max not initialized, this is not a Max mediated App.");
            }
            if (!e.a(str)) {
                Logger.d(f51660q, "Redirect reporting not supported for Sdk " + str + ", report will not be sent");
                return;
            }
            if (str3 != null) {
                Uri uri = Uri.parse(str3);
                if (uri.getScheme() == null || uri.getHost() == null) {
                    return;
                }
                if (e.a(str, str3)) {
                    Logger.d(f51660q, "Ignoring this intent as it was already reported , sdkPackageName=" + str + " ,intentUrl=" + str);
                    return;
                }
                RedirectEvent redirectEvent = new RedirectEvent(str, str3, str2, str4, j10, j11);
                redirectEvent.a(p.a().b());
                if (SafeDK.b()) {
                    StatsCollector.c().a(redirectEvent);
                } else {
                    Logger.d(f51660q, "Reporter thread not initialized or stats collector instance is null, skipping");
                }
            }
        } catch (Throwable th2) {
            Logger.e(f51660q, "Exception during attempt to create redirect event", th2);
        }
    }

    public static synchronized void a(String str, WebView webView, String str2, RedirectDetails.RedirectType redirectType, String str3) {
        synchronized (BrandSafetyUtils.class) {
            SafeDK safeDK = SafeDK.getInstance();
            if (!SafeDK.Y() || safeDK == null) {
                Logger.d(f51660q, "handle redirect, Max/SafeDK not initialized, skipping. ");
            } else {
                String strReplaceAll = str2 != null ? str2.replaceAll("/$", "") : null;
                if (!SafeDK.P() || E == null || str2 == null || E.equals(str2) || E.equals(strReplaceAll)) {
                    AdType adTypeA = com.safedk.android.analytics.brandsafety.b.a(str, webView);
                    if (adTypeA != AdType.INTERSTITIAL) {
                        l();
                        D = new RedirectDetails(str, adTypeA, redirectType, webView != null ? a(webView) : null, str2, str3, D != null ? D : null);
                        Logger.d(f51660q, "handle redirect: last redirect - " + D);
                        e();
                    } else {
                        Logger.d(f51660q, "handle redirect, ignore interstitial redirect, sdk: " + str + ", url: " + str2);
                    }
                } else {
                    Logger.d(f51660q, "ignore redirect indication, sdk: " + str + ", url: " + str2);
                    E = null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(java.lang.String r4, com.safedk.android.analytics.brandsafety.BrandSafetyUtils.AdType r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, com.safedk.android.analytics.brandsafety.BrandSafetyUtils.ScreenShotOrientation r9) {
        /*
            if (r4 != 0) goto L3
        L2:
            return
        L3:
            java.lang.String r0 = a(r5, r6, r7, r8, r9)
            java.lang.String r1 = ".jpg"
            java.lang.String r2 = ".txt"
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r1 = "BrandSafetyUtils"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Saving ad text to file: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.safedk.android.utils.Logger.d(r1, r2)
            r2 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L50
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L50
            byte[] r0 = r4.getBytes()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L5c
            r1.write(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L5c
            r1.close()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L5c
            if (r1 == 0) goto L2
            r1.close()     // Catch: java.io.IOException -> L3d
            goto L2
        L3d:
            r0 = move-exception
            goto L2
        L3f:
            r0 = move-exception
            r1 = r2
        L41:
            java.lang.String r2 = "BrandSafetyUtils"
            java.lang.String r3 = "Failed to save ad text to file"
            com.safedk.android.utils.Logger.e(r2, r3, r0)     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L2
            r1.close()     // Catch: java.io.IOException -> L4e
            goto L2
        L4e:
            r0 = move-exception
            goto L2
        L50:
            r0 = move-exception
            r1 = r2
        L52:
            if (r1 == 0) goto L57
            r1.close()     // Catch: java.io.IOException -> L58
        L57:
            throw r0
        L58:
            r1 = move-exception
            goto L57
        L5a:
            r0 = move-exception
            goto L52
        L5c:
            r0 = move-exception
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.a(java.lang.String, com.safedk.android.analytics.brandsafety.BrandSafetyUtils$AdType, java.lang.String, java.lang.String, java.lang.String, com.safedk.android.analytics.brandsafety.BrandSafetyUtils$ScreenShotOrientation):void");
    }

    public static void a(String str, String str2, WebView webView) {
        InterstitialFinder interstitialFinderY;
        try {
            Logger.d(f51660q, "attach loaded url to detected click started, sdk=" + str + ", url=" + str2 + ", webview=" + webView.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            SafeDK safeDK = SafeDK.getInstance();
            if (!SafeDK.Y() || safeDK == null || str2 == null) {
                Logger.d(f51660q, "attach loaded url to detected click loaded url is empty or app not initialized yet, skipping.");
                return;
            }
            if (str2.equals(AndroidWebViewClient.BLANK_PAGE) || str2.equals("About:blank")) {
                Logger.d(f51660q, "url is blank, skipping");
                return;
            }
            AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
            if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.e(str2)) {
                Logger.d(f51660q, "url should be ignored (by discovery class), skipping");
                return;
            }
            if ((str2.startsWith("http://") || str2.startsWith("https://")) && (interstitialFinderY = SafeDK.getInstance().y()) != null) {
                interstitialFinderY.b(str2, str, a(webView));
            }
            if (!SafeDK.b() || StatsCollector.c() == null) {
                Logger.d(f51660q, "Reporter thread not initialized or stats collector instance is null, skipping");
                return;
            }
            ConcurrentHashMap<String, StatsEvent> concurrentHashMapA = StatsCollector.c().a(StatsCollector.EventType.redirect);
            Iterator<String> it = concurrentHashMapA.keySet().iterator();
            while (it.hasNext()) {
                RedirectEvent redirectEvent = (RedirectEvent) concurrentHashMapA.get(it.next());
                if (redirectEvent.i().equals(str) && redirectEvent.d() == null) {
                    Logger.d(f51660q, "Attaching url to url-less redirect event. event = " + redirectEvent.toString() + ", url = " + str2);
                    redirectEvent.a(str2);
                }
            }
        } catch (Throwable th2) {
            Logger.e(f51660q, "failed to attach url to detected click (internal browser)", th2);
        }
    }

    public static synchronized void a(String str, String str2, String str3, String str4) {
        synchronized (BrandSafetyUtils.class) {
            String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
            String strReplaceAll = str2 != null ? str2.replaceAll("/$", "") : null;
            if (!SafeDK.P() || F == null || str2 == null || F.equals(str2) || F.equals(strReplaceAll)) {
                k();
                C = new m(mainSdkPackage, str2, str3, str4, C != null ? C : null);
                Logger.d(f51660q, "handle redirect: last intent details - " + C);
                e();
            } else {
                Logger.d(f51660q, "ignore intent, sdk: " + mainSdkPackage + ", url: " + str2);
                F = null;
            }
        }
    }

    public static boolean a(int i10) {
        return a(i10, 1000, SafeDK.getInstance().G());
    }

    private static boolean a(int i10, int i11, float f10) {
        Logger.d(f51660q, "isScreenshotEnough Max Uniform Pixel Percentage to Stop Sampling is " + f10);
        return ((float) i10) < (f10 / 100.0f) * ((float) i11);
    }

    private static boolean a(Intent intent) {
        int iIdentityHashCode = System.identityHashCode(intent);
        if (f51664u.contains(Integer.valueOf(iIdentityHashCode))) {
            Logger.d(f51660q, "mark intent as handled found " + iIdentityHashCode);
            return true;
        }
        if (f51664u.size() >= 100) {
            Logger.d(f51660q, "mark intent as handled > MAX events");
            f51664u.remove(0);
        }
        Logger.d(f51660q, "mark intent as handled add " + iIdentityHashCode);
        f51664u.add(Integer.valueOf(iIdentityHashCode));
        return false;
    }

    public static boolean a(String str, WebView webView) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strA = a(webView);
        u uVarA = DetectTouchUtils.a(str, strA);
        long jLongValue = uVarA == null ? 0L : uVarA.f52726a.longValue();
        boolean z10 = jElapsedRealtime - jLongValue < 20000;
        Logger.d(f51660q, "is ad clicked recently - for package: " + str + " and view address: " + strA + " returned: " + z10 + "last touch event: " + jLongValue + " vs current: " + jElapsedRealtime);
        return z10;
    }

    private static boolean a(Map<Integer, Integer> map) {
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (Color.red(iIntValue) != Color.blue(iIntValue) || Color.blue(iIntValue) != Color.green(iIntValue)) {
                Logger.d(f51660q, "Image is not Greyscale");
                return false;
            }
        }
        Logger.d(f51660q, "Image is Greyscale");
        return true;
    }

    private static byte[] a(File file) {
        byte[] bArr = new byte[100];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int i10 = bufferedInputStream.read(bArr);
                if (i10 == -1) {
                    bufferedInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Exception e10) {
            Logger.d(f51660q, "Exception reading file : " + e10.getMessage(), e10);
            return null;
        }
    }

    static int b() {
        if (I == 0) {
            j();
        }
        return I;
    }

    public static int b(AdType adType) {
        try {
            Logger.d(f51660q, "get image count by ad type started, adType = " + adType.name() + " : " + adType);
            File dir = SafeDK.getInstance().l().getDir("SafeDK_" + adType, 0);
            File[] fileArrListFiles = dir.listFiles();
            String str = "";
            for (File file : fileArrListFiles) {
                str = str + ", " + file.getName();
            }
            Logger.d(f51660q, "get image count by ad type all files in " + dir.getName() + " : " + str);
            Logger.d(f51660q, "get image count by ad type returned " + fileArrListFiles.length + " for adType " + adType.name());
            return fileArrListFiles.length;
        } catch (Throwable th2) {
            Logger.d(f51660q, "get image count by ad type  error :  " + th2.getMessage(), th2);
            return -1;
        }
    }

    public static AdType b(String str) {
        if (str != null) {
            return a(BrandSafetyEvent.AdFormatType.valueOf(str));
        }
        return null;
    }

    static ScreenShotOrientation b(Bitmap bitmap) {
        return bitmap == null ? ScreenShotOrientation.NOT_INITIALIZED : bitmap.getHeight() > bitmap.getWidth() ? ScreenShotOrientation.PORTRAIT : ScreenShotOrientation.LANDSCAPE;
    }

    public static ScreenshotValidity b(String str, a aVar) {
        return a(str, aVar, 500, SafeDK.getInstance().U());
    }

    public static a b(String str, Bitmap bitmap) {
        return a(str, bitmap, 500, AdType.BANNER);
    }

    public static String b(Class cls) {
        String name = cls.getName();
        String strE = e(name);
        if (strE == null) {
            strE = name;
        }
        Logger.v(f51660q, "SDK package for class " + name + " is " + strE);
        return strE == null ? "unknown" : strE;
    }

    private static String b(String str, Intent intent) {
        AdNetworkDiscovery adNetworkDiscoveryH;
        Logger.d(f51660q, "Attempting to extract expanded ad webview address from intent extra, sdkPackageName is " + str + ", intent: " + com.safedk.android.utils.k.a(intent));
        if (intent == null) {
            return null;
        }
        try {
            if (intent.getExtras() == null || (adNetworkDiscoveryH = CreativeInfoManager.h(str)) == null) {
                return null;
            }
            return adNetworkDiscoveryH.a(intent.getExtras());
        } catch (Throwable th2) {
            Logger.e(f51660q, "Exception when attempting to extract expanded ad webview address from intent extra");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Uri uri, String str) {
        RedirectDetails redirectDetailsH;
        Logger.d(f51660q, "detect ad click Uri invoked, sdk=" + str + ", url = " + uri.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        if (com.safedk.android.utils.g.f53135i.equals(str) && SafeDK.P()) {
            u uVarA = DetectTouchUtils.a(str);
            long jLongValue = uVarA == null ? 0L : uVarA.f52726a.longValue();
            if ((jLongValue == 0 || SystemClock.elapsedRealtime() - jLongValue > ((long) SafeDK.getInstance().f())) && ((redirectDetailsH = h()) == null || redirectDetailsH.f51836g == null || !redirectDetailsH.f51836g.equals(uri.toString()))) {
                try {
                    throw new Exception("redirect potential source");
                } catch (Exception e10) {
                    Logger.d(f51660q, "detect ad click, redirect potential source", e10);
                }
            }
        }
        a(intent, str, true);
    }

    public static boolean b(int i10) {
        return a(i10, 500, SafeDK.getInstance().T());
    }

    static long c(String str) {
        try {
            return new File(str).length();
        } catch (Throwable th2) {
            Logger.e(f51660q, "Failed to create new file for screenshot", th2);
            return 0L;
        }
    }

    static ScreenShotOrientation c() {
        DisplayMetrics displayMetrics = SafeDK.getInstance().l().getResources().getDisplayMetrics();
        return displayMetrics.heightPixels > displayMetrics.widthPixels ? ScreenShotOrientation.PORTRAIT : ScreenShotOrientation.LANDSCAPE;
    }

    public static ScreenshotValidity c(String str, a aVar) {
        return a(str, aVar, 500, SafeDK.getInstance().U());
    }

    public static List<d> c(AdType adType) {
        ScreenShotOrientation screenShotOrientationValueOf;
        ArrayList arrayList = new ArrayList();
        try {
            Logger.d(f51660q, "Restoring " + adType + " images for upload, isOnUiThread = " + com.safedk.android.utils.k.c());
            File[] fileArrListFiles = SafeDK.getInstance().l().getDir("SafeDK_" + adType, 0).listFiles(new c());
            if (fileArrListFiles != null) {
                Logger.d(f51660q, "Found " + fileArrListFiles.length + " candidate images for upload");
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    Logger.d(f51660q, "Checking file " + name);
                    String absolutePath = file.getAbsolutePath();
                    File file2 = new File(absolutePath.replace(f51644a, f51645b));
                    Logger.d(f51660q, "Deleting file " + file.getAbsolutePath());
                    file.delete();
                    if (file2.exists()) {
                        file2.delete();
                    }
                    String[] strArrSplit = name.replace(f51644a, "").split("_");
                    if (strArrSplit.length == 4) {
                        String str = strArrSplit[0];
                        String sdkPackageByPackageUUID = strArrSplit[1];
                        Logger.d(f51660q, "sdk = " + strArrSplit[1]);
                        if (SdksMapping.getSdkPackageByPackageUUID(strArrSplit[1]) != null) {
                            sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(strArrSplit[1]);
                            Logger.d(f51660q, "sdk value replaced : " + sdkPackageByPackageUUID);
                        }
                        String str2 = strArrSplit[2];
                        try {
                            screenShotOrientationValueOf = ScreenShotOrientation.valueOf(strArrSplit[3].toUpperCase());
                        } catch (IllegalArgumentException e10) {
                            screenShotOrientationValueOf = ScreenShotOrientation.NOT_INITIALIZED;
                        }
                        Logger.d(f51660q, "Restore image for upload: " + absolutePath);
                        arrayList.add(new d(str, sdkPackageByPackageUUID, str2, screenShotOrientationValueOf, absolutePath, null));
                    }
                }
            }
        } catch (Throwable th2) {
            Logger.d(f51660q, "Error while restoring ads for upload", th2);
            new CrashReporter().caughtException(th2);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Intent intent, String str, boolean z10) {
        Uri uri;
        String str2;
        String string;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
            Logger.d(f51660q, "detect ad click started, current timestamp (elapsed)=" + jElapsedRealtime + ", sdk=" + mainSdkPackage + ", intent=" + com.safedk.android.utils.k.a(intent) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (SafeDK.getInstance().r()) {
                Logger.d(f51660q, "detect ad click - should monitor");
                if (intent != null) {
                    Intent intent2 = (Intent) intent.clone();
                    Logger.d(f51660q, "detect ad click - intent cloned");
                    int iF = SafeDK.getInstance().f();
                    Logger.d(f51660q, "detect ad click - redirect click timeout is " + iF);
                    Uri data = intent2.getData();
                    String strA = a(mainSdkPackage, intent2);
                    if (strA != null) {
                        Logger.d(f51660q, "detect ad click - uri extracted from intent extras");
                        uri = Uri.parse(strA);
                    } else {
                        uri = data;
                    }
                    String str3 = null;
                    if (uri != null) {
                        String string2 = uri.toString();
                        try {
                            if (com.safedk.android.utils.k.w(uri.toString())) {
                                Logger.d(f51660q, "detect ad click - Uri is a store url: " + uri);
                                string = uri.toString();
                            } else {
                                URL url = new URL(uri.toString());
                                Logger.d(f51660q, "detect ad click - Uri is a standard url: " + url);
                                string = url.toString();
                            }
                            str3 = string;
                            str2 = string2;
                        } catch (MalformedURLException e10) {
                            Logger.d(f51660q, "detect ad click - Uri is not a valid url: " + uri);
                            str2 = string2;
                        }
                    } else {
                        str2 = null;
                    }
                    String strB = b(mainSdkPackage, intent2);
                    u uVarA = DetectTouchUtils.a(mainSdkPackage);
                    long jLongValue = uVarA == null ? 0L : uVarA.f52726a.longValue();
                    long jLongValue2 = uVarA == null ? 0L : uVarA.f52727b.longValue();
                    String str4 = uVarA == null ? null : uVarA.f52728c;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    if ((!"android.intent.action.VIEW".equals(intent2.getAction()) && intent2.getAction() != null) || str3 == null) {
                        Logger.d(f51660q, "detect ad click - Intent doesn't have url");
                        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
                        if (foregroundActivity == null) {
                            Logger.d(f51660q, "detect ad click - current foreground activity is null");
                            return;
                        }
                        if (a(intent)) {
                            return;
                        }
                        a(mainSdkPackage, str2, strB, z10 ? RedirectEvent.f52817j : null);
                        if (!g(foregroundActivity.getClass().getName())) {
                            Logger.d(f51660q, "detect ad click - activity " + foregroundActivity.getClass().getName() + " is not in the redirect tracked activities, ignoring");
                            return;
                        }
                        Logger.d(f51660q, "detect ad click - current elapsed realtime: " + jElapsedRealtime2 + ", webview last touched: " + jLongValue + ", diff: " + (jElapsedRealtime2 - jLongValue));
                        if (jLongValue == 0 || jElapsedRealtime2 - jLongValue > iF) {
                            Logger.d(f51660q, "detect ad click - Redirecting through ad");
                            a(mainSdkPackage, jElapsedRealtime, jLongValue2, o(mainSdkPackage) ? RedirectEvent.f52818k : RedirectEvent.f52816i, str3, foregroundActivity.getClass().getName());
                            return;
                        }
                        return;
                    }
                    Logger.d(f51660q, "detect ad click - has URL, intentUrl: " + str3);
                    AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(mainSdkPackage);
                    if (adNetworkDiscoveryH != null && adNetworkDiscoveryH.e(str3)) {
                        Logger.d(f51660q, "detect ad click - url should be ignored (by discovery class), skipping");
                        return;
                    }
                    if (a(intent)) {
                        return;
                    }
                    Logger.d(f51660q, "detect ad click - not handled (yet)");
                    Activity foregroundActivity2 = com.safedk.android.internal.b.getInstance().getForegroundActivity();
                    StatsCollector statsCollectorC = StatsCollector.c();
                    if (foregroundActivity2 == null || statsCollectorC == null) {
                        return;
                    }
                    Logger.d(f51660q, "detect ad click - has foreground");
                    InterstitialFinder interstitialFinderY = SafeDK.getInstance().y();
                    n nVarD = interstitialFinderY != null ? interstitialFinderY.d(foregroundActivity2) : null;
                    boolean z11 = false;
                    if (SafeDK.getInstance().z() != null && SafeDK.getInstance().z().i(str4)) {
                        z11 = true;
                    }
                    if (interstitialFinderY == null || nVarD == null || z11) {
                        Logger.d(f51660q, "detect ad click - no interstitial");
                        a(mainSdkPackage, str2, strB, z10 ? RedirectEvent.f52817j : null);
                        if (jElapsedRealtime2 - jLongValue < 20000) {
                            Logger.d(f51660q, "detect ad click - updating click URL. address : " + str4);
                            for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(SafeDK.getInstance().z(), SafeDK.getInstance().B())) {
                                if (aVar != null && aVar.a(str3, mainSdkPackage, str4) && str4 != null) {
                                    ImpressionLog.a[] aVarArr = new ImpressionLog.a[2];
                                    aVarArr[0] = new ImpressionLog.a("url", str3);
                                    aVarArr[1] = new ImpressionLog.a(ImpressionLog.E, z10 ? RedirectEvent.f52817j : "normal");
                                    com.safedk.android.analytics.brandsafety.b.a(str4, ImpressionLog.f51744n, aVarArr);
                                }
                            }
                        }
                        String strA2 = t.a(mainSdkPackage, jLongValue);
                        Logger.d(f51660q, "detect ad click - last touch event(elapsed): " + jLongValue + ", last touch event(current time millis): " + jLongValue2 + ", redirectInfoKey: " + strA2);
                        Logger.d(f51660q, "detect ad click - current elapsed realtime: " + jElapsedRealtime2 + ", last touch event(elapsed): " + jLongValue + ", diff: " + (jElapsedRealtime2 - jLongValue));
                        if (!SafeDK.b() || statsCollectorC.a(mainSdkPackage, strA2) || (jLongValue != 0 && jElapsedRealtime2 - jLongValue <= iF)) {
                            Logger.d(f51660q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                            return;
                        } else {
                            a(mainSdkPackage, jElapsedRealtime, jLongValue2, o(mainSdkPackage) ? RedirectEvent.f52818k : "external", str3, foregroundActivity2.getClass().getName());
                            return;
                        }
                    }
                    Logger.d(f51660q, "detect ad click - has interstitial");
                    boolean zD = nVarD.d();
                    Logger.d(f51660q, "detect ad click - clicked " + zD);
                    Logger.d(f51660q, "detect ad click - last touch event(elapsed): " + jLongValue + " last touch event(current time millis): " + jLongValue2 + ", activityAddress=" + a(foregroundActivity2.getClass().getName(), true));
                    if (jElapsedRealtime2 - jLongValue < 20000 && interstitialFinderY.a(str3, mainSdkPackage, str4)) {
                        if (str4 != null) {
                            ImpressionLog.a[] aVarArr2 = new ImpressionLog.a[2];
                            aVarArr2[0] = new ImpressionLog.a("url", str3);
                            aVarArr2[1] = new ImpressionLog.a(ImpressionLog.E, z10 ? RedirectEvent.f52817j : "external");
                            com.safedk.android.analytics.brandsafety.b.a(str4, ImpressionLog.f51744n, aVarArr2);
                        } else {
                            n nVarD2 = interstitialFinderY.d(foregroundActivity2);
                            ImpressionLog.a[] aVarArr3 = new ImpressionLog.a[2];
                            aVarArr3[0] = new ImpressionLog.a("url", str3);
                            aVarArr3[1] = new ImpressionLog.a(ImpressionLog.E, z10 ? RedirectEvent.f52817j : "external");
                            nVarD2.a(ImpressionLog.f51744n, aVarArr3);
                        }
                    }
                    String strA3 = t.a(mainSdkPackage, jLongValue);
                    boolean z12 = true;
                    if (SafeDK.b() && statsCollectorC.a(mainSdkPackage, strA3)) {
                        z12 = false;
                    } else {
                        Logger.d(f51660q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                    }
                    Logger.d(f51660q, "detect ad click - should handle click " + z12);
                    if (z12) {
                        Logger.d(f51660q, "detect ad click - current elapsed realtime: " + jElapsedRealtime2 + ", activity last touched: " + jLongValue + ", diff: " + (jElapsedRealtime2 - jLongValue) + ", isClicked: " + zD);
                        if ((jLongValue == 0 || jElapsedRealtime2 - jLongValue > iF) && !zD) {
                            Logger.d(f51660q, "detect ad click - redirect");
                            a(mainSdkPackage, jElapsedRealtime, jLongValue2, o(mainSdkPackage) ? RedirectEvent.f52818k : "external", str3, foregroundActivity2.getClass().getName());
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            Logger.d(f51660q, "error in detect ad click", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    public static boolean c(int i10) {
        return a(i10, 500, SafeDK.getInstance().T());
    }

    public static boolean c(Class cls) {
        return g(cls.getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.String d() {
        /*
            r4 = 0
            r0 = 0
            java.lang.Class<com.safedk.android.analytics.brandsafety.BrandSafetyUtils> r1 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.class
            monitor-enter(r1)
            l()     // Catch: java.lang.Throwable -> Lbb
            k()     // Catch: java.lang.Throwable -> Lbb
            com.safedk.android.analytics.brandsafety.RedirectDetails r2 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.D     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto Lb9
            com.safedk.android.analytics.brandsafety.m r2 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.C     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto Lb9
            com.safedk.android.analytics.brandsafety.m r2 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.C     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = r2.f52684c     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto Lb9
            com.safedk.android.analytics.brandsafety.m r2 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.C     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = r2.f52684c     // Catch: java.lang.Throwable -> Lbb
            com.safedk.android.analytics.brandsafety.RedirectDetails r3 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.D     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = r3.f51832c     // Catch: java.lang.Throwable -> Lbb
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto Lb9
            com.safedk.android.analytics.brandsafety.RedirectDetails r2 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.D     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = r2.f51832c     // Catch: java.lang.Throwable -> Lbb
            com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration r3 = com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION     // Catch: java.lang.Throwable -> Lbb
            r6 = 0
            boolean r2 = com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.a(r2, r3, r6)     // Catch: java.lang.Throwable -> Lbb
            com.safedk.android.analytics.brandsafety.RedirectDetails r3 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.D     // Catch: java.lang.Throwable -> Lbb
            com.safedk.android.analytics.brandsafety.RedirectDetails$RedirectType r3 = r3.f51834e     // Catch: java.lang.Throwable -> Lbb
            com.safedk.android.analytics.brandsafety.RedirectDetails$RedirectType r6 = com.safedk.android.analytics.brandsafety.RedirectDetails.RedirectType.REDIRECT     // Catch: java.lang.Throwable -> Lbb
            if (r3 != r6) goto Lb9
            if (r2 == 0) goto Lb9
            com.safedk.android.analytics.brandsafety.m r2 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.C     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = r2.f52684c     // Catch: java.lang.Throwable -> Lbb
            com.safedk.android.analytics.brandsafety.RedirectDetails r3 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.D     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = r3.f51835f     // Catch: java.lang.Throwable -> Lbb
            com.safedk.android.analytics.brandsafety.u r2 = com.safedk.android.analytics.brandsafety.DetectTouchUtils.a(r2, r3)     // Catch: java.lang.Throwable -> Lbb
            if (r2 != 0) goto Lb2
            r2 = r4
        L4c:
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lbb
            com.safedk.android.SafeDK r8 = com.safedk.android.SafeDK.getInstance()     // Catch: java.lang.Throwable -> Lbb
            int r8 = r8.f()     // Catch: java.lang.Throwable -> Lbb
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L63
            long r2 = r6 - r2
            long r4 = (long) r8     // Catch: java.lang.Throwable -> Lbb
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L64
        L63:
            r0 = 1
        L64:
            if (r0 == 0) goto Lb9
            java.lang.String r0 = "BrandSafetyUtils"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
            r2.<init>()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = "check for potential auto redirect, identified for "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Lbb
            com.safedk.android.analytics.brandsafety.m r3 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.C     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = r3.f52684c     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = ", view address: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Lbb
            com.safedk.android.analytics.brandsafety.RedirectDetails r3 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.D     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = r3.f51835f     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = ", webviewReqURL: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Lbb
            com.safedk.android.analytics.brandsafety.RedirectDetails r3 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.D     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = r3.f51836g     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = ", landingPageURL: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Lbb
            com.safedk.android.analytics.brandsafety.m r3 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.C     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = r3.f52685d     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lbb
            com.safedk.android.utils.Logger.d(r0, r2)     // Catch: java.lang.Throwable -> Lbb
            com.safedk.android.analytics.brandsafety.m r0 = com.safedk.android.analytics.brandsafety.BrandSafetyUtils.C     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = r0.f52685d     // Catch: java.lang.Throwable -> Lbb
        Lb0:
            monitor-exit(r1)
            return r0
        Lb2:
            java.lang.Long r2 = r2.f52726a     // Catch: java.lang.Throwable -> Lbb
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> Lbb
            goto L4c
        Lb9:
            r0 = 0
            goto Lb0
        Lbb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.d():java.lang.String");
    }

    static synchronized void d(String str) {
        if (str != null) {
            Logger.d(f51660q, "remove ad files started, filepath " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (!new File(str).exists()) {
                Logger.d(f51660q, "remove ad files filePath does not exist. file=" + str);
            } else if (new File(str).delete()) {
                Logger.d(f51660q, "remove ad files deleted file " + str);
            } else {
                Logger.d(f51660q, "remove ad files failed to delete file " + str);
            }
            File file = new File(str.replace(f51644a, f51645b));
            if (file.exists()) {
                Logger.d(f51660q, "remove ad files deleting file " + file.getAbsolutePath());
                if (!file.delete()) {
                    Logger.d(f51660q, "remove ad files failed to delete file " + file.getAbsolutePath());
                }
            }
        }
    }

    public static boolean d(Class cls) {
        return h(cls.getName());
    }

    public static void detectAdClick(Intent intent, String str) {
        a(intent, str, false);
    }

    public static void detectAdClick(final Uri uri, final String str) {
        if (com.safedk.android.utils.k.c()) {
            G.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.2
                @Override // java.lang.Runnable
                public void run() {
                    BrandSafetyUtils.b(uri, str);
                }
            });
        } else {
            b(uri, str);
        }
    }

    public static String e(String str) {
        if (str != null) {
            return r(str) ? com.safedk.android.utils.g.f53134h : SdksMapping.getSdkPackageByClass(str);
        }
        return null;
    }

    public static synchronized void e() {
        l();
        k();
        if (D != null && C != null && C.f52684c != null && C.f52684c.equals(D.f51832c)) {
            a(C.f52684c, true, false);
        }
    }

    public static synchronized void f() {
        l();
        k();
        if (D != null && C != null && D.f51834e == RedirectDetails.RedirectType.EXPAND && C.f52684c != null && C.f52684c.equals(D.f51832c) && CreativeInfoManager.a(D.f51832c, AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, false)) {
            a(C.f52684c, false, true);
        }
    }

    public static boolean f(String str) {
        return r(str) || SdksMapping.getSdkPackageByClass(str) != null;
    }

    public static synchronized void g() {
        l();
        k();
        if (D != null && C != null && C.f52684c != null && C.f52684c.equals(D.f51832c)) {
            a(C.f52684c, true, true);
        }
    }

    public static boolean g(String str) {
        Logger.d(f51660q, "Redirect detection interstitial activity check started, Activity name : " + str + ", result : " + f51662s.contains(str) + ", redirectDetectionInterstitialActivities= " + f51662s);
        return f51662s.contains(str);
    }

    public static RedirectDetails h() {
        l();
        return D;
    }

    public static boolean h(String str) {
        Logger.d(f51660q, "Interstitial activity check started, Activity name : " + str + ", result : " + f51661r.contains(str) + ", interstitialActivities= " + f51661r);
        return f51661r.contains(str);
    }

    public static String i(String str) {
        for (String str2 : f51661r) {
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return "";
    }

    public static void i() {
        E = null;
        F = null;
    }

    private static void j() {
        DisplayMetrics displayMetrics = SafeDK.getInstance().l().getResources().getDisplayMetrics();
        I = displayMetrics.heightPixels;
        H = displayMetrics.widthPixels;
    }

    public static void j(String str) {
        Logger.d(f51660q, "addInterstitialActivity started name=" + str);
        f51661r.add(str);
    }

    private static void k() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iG = SafeDK.getInstance().g();
        if (C == null || jElapsedRealtime - C.f52683b.longValue() <= iG) {
            return;
        }
        Logger.d(f51660q, "remove old intent: " + C);
        C = null;
    }

    public static void k(String str) {
        Logger.d(f51660q, "removeInterstitialActivity started name=" + str);
        f51661r.remove(str);
    }

    public static String l(String str) {
        if (str != null) {
            String[] strArrSplit = str.split("@");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
        }
        return "";
    }

    private static void l() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iG = SafeDK.getInstance().g();
        if (D == null || jElapsedRealtime - D.f51831b.longValue() <= iG) {
            return;
        }
        Logger.d(f51660q, "remove old redirect: " + D);
        D = null;
    }

    public static void m(String str) {
        Logger.d(f51660q, "adding to redirect current open fullscreen ad collection. sdk = " + str + ", redirectDetectionCurrentInterstitialBySdk = " + f51663t.toString());
        f51663t.add(str);
    }

    public static void n(String str) {
        Logger.d(f51660q, "removing from redirect current open fullscreen ad collection. sdk = " + str + ", redirectDetectionCurrentInterstitialBySdk = " + f51663t.toString());
        f51663t.remove(str);
    }

    public static boolean o(String str) {
        Logger.d(f51660q, "checking if there is a redirect current open fullscreen ad in collection. sdk = " + str + ", result is " + f51663t.contains(str) + ", redirectDetectionCurrentInterstitialBySdk = " + f51663t.toString());
        return f51663t.contains(str);
    }

    public static void onMraidExpand(String str, String str2, Object obj, String str3) {
        String strOptString;
        Logger.d(f51660q, "on mraid expand, sdk: " + str + ", urlJsonString: " + str2 + ", object: " + obj + ", originated method: " + str3);
        if (obj == null || str2 == null) {
            return;
        }
        try {
            strOptString = new JSONObject(str2).optString("url");
        } catch (JSONException e10) {
            Logger.d(f51660q, "on mraid expand, failed to get url from: " + str2);
            strOptString = null;
        }
        for (Field field : obj.getClass().getFields()) {
            try {
                if (field.get(obj) instanceof WebView) {
                    onMraidExpand(str, null, strOptString, (WebView) field.get(obj), str3);
                }
            } catch (IllegalAccessException e11) {
                Logger.d(f51660q, "on mraid expand, failed to get webview from: " + obj);
            }
        }
    }

    public static void onMraidExpand(final String str, String str2, final String str3, final WebView webView, final String str4) {
        Logger.d(f51660q, "on mraid expand, sdk: " + str + ", str: " + str2 + ", url: " + str3 + ", webview: " + webView + ", originated method: " + str4);
        if (str != null) {
            G.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        BrandSafetyUtils.a(str, webView, str3, RedirectDetails.RedirectType.EXPAND, str4);
                    } catch (Throwable th2) {
                        Logger.e(BrandSafetyUtils.f51660q, "exception while handling mraid expand", th2);
                    }
                }
            });
        }
    }

    public static void onMraidOpen(String str, String str2, Object obj, String str3) {
        String strOptString;
        Logger.d(f51660q, "on mraid open, sdk: " + str + ", urlJsonString: " + str2 + ", object: " + obj + ", originated method: " + str3);
        if (obj == null || str2 == null) {
            return;
        }
        try {
            strOptString = new JSONObject(str2).optString("url");
        } catch (JSONException e10) {
            Logger.d(f51660q, "on mraid open, failed to get url from: " + str2);
            strOptString = null;
        }
        for (Field field : obj.getClass().getFields()) {
            try {
                if (field.get(obj) instanceof WebView) {
                    onMraidOpen(str, null, strOptString, (WebView) field.get(obj), str3);
                }
            } catch (IllegalAccessException e11) {
                Logger.d(f51660q, "on mraid open, failed to get webview from: " + obj);
            }
        }
    }

    public static void onMraidOpen(final String str, String str2, final String str3, final WebView webView, final String str4) {
        Logger.d(f51660q, "on mraid open, sdk: " + str + ", str: " + str2 + ", url: " + str3 + ", webview: " + webView + ", originated method: " + str4);
        if (str == null || str3 == null) {
            return;
        }
        G.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    BrandSafetyUtils.a(str, webView, str3, RedirectDetails.RedirectType.REDIRECT, str4);
                } catch (Throwable th2) {
                    Logger.e(BrandSafetyUtils.f51660q, "exception while handling mraid open", th2);
                }
            }
        });
    }

    public static void onShouldOverrideUrlLoading(final String str, final WebView webView, final String str2, boolean z10) {
        Logger.d(f51660q, "on should override url loading, sdk: " + str + ", webview: " + webView + ", url: " + str2 + ", ret: " + z10);
        CreativeInfoManager.a(str, webView, str2);
        final String strA = a(webView);
        if (CreativeInfoManager.a(str, AdNetworkConfiguration.IGNORE_SHOULD_OVERRIDE_URL_CALLS, false)) {
            Logger.d(f51660q, "on should override url loading - ignoring the call because there is another way to handle this calls");
            return;
        }
        if (z10 && str != null && webView != null && str2 != null) {
            G.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AdNetworkDiscovery adNetworkDiscoveryH = CreativeInfoManager.h(str);
                        if (adNetworkDiscoveryH != null) {
                            RedirectDetails.RedirectType redirectTypeF = adNetworkDiscoveryH.f(str2);
                            String strG = adNetworkDiscoveryH.g(str2);
                            Logger.d(BrandSafetyUtils.f51660q, "on should override url loading: target url is: " + strG + " redirect type is: " + redirectTypeF);
                            if (redirectTypeF == null) {
                                Logger.d(BrandSafetyUtils.f51660q, "on should override url loading, ignore redirect, sdk: " + str + ", webview: " + webView + ", url: " + str2);
                                return;
                            }
                            Logger.d(BrandSafetyUtils.f51660q, "on should override url loading: webView's ancestors are: " + com.safedk.android.analytics.brandsafety.b.a((View) webView));
                            BrandSafetyUtils.a(str, webView, strG, redirectTypeF, "shouldOverrideUrlLoading");
                            if (BrandSafetyUtils.a(str, webView)) {
                                Logger.d(BrandSafetyUtils.f51660q, "on should override url loading, updating click URL. address : " + strA);
                                for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(SafeDK.getInstance().z(), SafeDK.getInstance().B())) {
                                    if (aVar != null && aVar.a(strG, str, strA)) {
                                        com.safedk.android.analytics.brandsafety.b.a(strA, ImpressionLog.f51744n, new ImpressionLog.a("url", strG), new ImpressionLog.a(ImpressionLog.E, RedirectEvent.f52816i));
                                    }
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        Logger.e(BrandSafetyUtils.f51660q, "exception while handling should override url loading", th2);
                    }
                }
            });
        } else {
            if (z10) {
                return;
            }
            com.safedk.android.analytics.brandsafety.b.a(strA, ImpressionLog.f51752v, new ImpressionLog.a("api", "so"), new ImpressionLog.a("url", str2), new ImpressionLog.a(ImpressionLog.L, "allow"));
        }
    }

    public static void onShouldOverrideUrlLoadingWithHeaders(String str, WebView webView, WebResourceRequest webResourceRequest, boolean z10) {
        Logger.d(f51660q, "onShouldOverrideUrlLoadingWithHeaders started with: " + str + " and view: " + webView + " request: " + webResourceRequest + " and ret: " + z10);
        if (Build.VERSION.SDK_INT >= 21) {
            onShouldOverrideUrlLoading(str, webView, webResourceRequest.getUrl().toString(), z10);
        }
    }

    public static String p(String str) {
        byte[] bArr = new byte[0];
        if (!new File(str).exists()) {
            return "";
        }
        byte[] bArr2 = new byte[0];
        try {
            return new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(a(new File(str)))).toString(16);
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void q(String str) {
        if (SafeDK.P()) {
            E = str;
            F = str;
        }
    }

    private static boolean r(String str) {
        return str.startsWith("maps.bi.f") || str.startsWith("avu") || str.startsWith(MobileAds.ERROR_DOMAIN);
    }
}
