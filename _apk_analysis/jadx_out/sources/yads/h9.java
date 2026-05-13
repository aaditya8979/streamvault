package yads;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l4 f90282a = a(1, "Received unsupported ad type", "Received unsupported ad type. We are already working on this issue.");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l4 f90283b = a(1, "Internal state wasn't completely configured", "Internal state wasn't completely configured. Please try again later.");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l4 f90284c = a(1, "Incorrect data in server response", "Failed to parse server's response. We are already working on this issue.");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l4 f90285d = a(1, "Invalid server response code", "Unexpected server response code. We are already working on this issue.");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l4 f90286e = a(1, "Service temporarily unavailable", "Service temporarily unavailable. Please try again later.");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l4 f90287f = a(1, "Invalid SDK state.", "Invalid SDK state.");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l4 f90288g = a(1, "Invalid SDK state.", "Invalid SDK state.");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l4 f90289h = a(4, "Ad request completed successfully, but there are no ads available.", "Ad request completed successfully, but there are no ads available.");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l4 f90290i = a(2, "Ad request configured incorrectly", "Ad request configured incorrectly");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l4 f90291j = a(2, "Invalid request parameters", "Invalid request parameters");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l4 f90292k = a(2, "Invalid ad type in response", "Invalid ad type in response");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l4 f90293l = a(2, "Invalid Ad Unit Id. AdUnitId should be not empty string", "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l4 f90294m = a(2, "Invalid ad size. Please, specify AdSize excplicitly", "Invalid ad size. Set the ad size using the 'setAdSize' method.");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l4 f90295n = a(1, "Invalid sdk configuration. Please request another ad.", "Invalid sdk configuration. Please request another ad.");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l4 f90296o = a(5, "Device hasn't enough free memory.", "Device has not enough free memory.");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final l4 f90297p = a(2, "Feed ad preloading has already started", "Feed ad preloading was already started. You should use preloadAd method only once");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l4 f90298q = a(3, "Ad request failed with network error", "Ad request failed with network error. Please try again later.");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l4 f90299r = a(3, "Ad request failed with no connection error", "Ad request failed with network error. Please try again later.");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l4 f90300s = a(3, "Ad request failed with timeout error", "Ad request failed with network error. Please try again later.");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l4 f90301t = a(3, "Ad request failed with auth failure", "Ad request failed with network error. Please try again later.");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final l4 f90302u = a(3, "Ad request failed with client error", "Ad request failed with network error. Please try again later.");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l4 f90303v = a(3, "Ad request failed with parse error", "Failed to parse server response. Please try again later.");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final l4 f90304w = a(1, "Ad request failed with content preloading error", "Ad request failed with content preloading error. Please try again later");

    public static l4 a(int i10, int i11, int i12, int i13, int i14, int i15) {
        tn.x xVar = tn.x.f85368a;
        String str = String.format(Locale.US, "Ad was loaded successfully, but there is not enough space to display it. Requested size: [%dx%d], Received size : [%dx%d], device screen size: [%dx%d].", Arrays.copyOf(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15)}, 6));
        tn.p.j(str, "format(...)");
        return a(1, "Ad was loaded successfully, but there is not enough space to display it", str);
    }

    public static l4 a(int i10, String str, String str2) {
        return new l4(i10, str, str2, null);
    }

    public static l4 a(String str) {
        String str2;
        String str3;
        if (str == null || str.length() == 0) {
            str2 = "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
            str3 = "Invalid Ad Unit Id. AdUnitId should be not empty string";
        } else {
            str2 = "Provided AdUnitId '%s' does not exist! Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
            str3 = "Provided ad unit id doesn't exist";
        }
        tn.x xVar = tn.x.f85368a;
        String str4 = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{str}, 1));
        tn.p.j(str4, "format(...)");
        return a(2, str3, str4);
    }
}
