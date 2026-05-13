package sg.bigo.ads.a;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import sg.bigo.ads.a.a.a;
import sg.bigo.ads.a.a.b;
import sg.bigo.ads.common.n.d;

/* JADX INFO: loaded from: classes2.dex */
final class b implements a.InterfaceC0957a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f79773c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.a.a.a f79774a = new sg.bigo.ads.a.a.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f79776d = 300000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f79777e = 200;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f79775b = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, Long> f79778f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f79779g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f79780h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f79781i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f79782j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f79783k = false;

    public static /* synthetic */ String a(int i10) {
        switch (i10) {
            case 1:
                return "Navigation Started";
            case 2:
                return "Navigation Finished";
            case 3:
                return "Navigation Failed";
            case 4:
                return "Navigation Aborted";
            case 5:
                return "Tab Shown";
            case 6:
                return "Tab Hidden";
            default:
                return "Unknown Event";
        }
    }

    public static b a() {
        return f79773c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void e() {
        Iterator<String> it;
        if (!this.f79781i) {
            this.f79783k = false;
            return;
        }
        if (!this.f79783k) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "The task of preload start.");
        }
        String str = null;
        try {
            it = this.f79775b.iterator();
        } catch (Exception unused) {
        }
        if (!it.hasNext()) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "The task of preload stop.");
            this.f79783k = false;
            return;
        }
        this.f79783k = true;
        final String next = it.next();
        try {
            this.f79775b.remove(next);
        } catch (Exception unused2) {
            str = next;
            next = str;
        }
        if (TextUtils.isEmpty(next)) {
            return;
        }
        d.a(1, new Runnable() { // from class: sg.bigo.ads.a.b.3
            @Override // java.lang.Runnable
            public final void run() {
                CustomTabsSession customTabsSessionA;
                Long l10 = (Long) b.this.f79778f.get(next);
                if (l10 == null || SystemClock.elapsedRealtime() - l10.longValue() > 300000) {
                    Uri uri = Uri.parse(next);
                    sg.bigo.ads.a.a.a aVar = b.this.f79774a;
                    boolean zMayLaunchUrl = (aVar.f79759a == null || (customTabsSessionA = aVar.a()) == null) ? false : customTabsSessionA.mayLaunchUrl(uri, null, null);
                    sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Preload url state: " + zMayLaunchUrl + ", url: " + next);
                    if (!zMayLaunchUrl) {
                        sg.bigo.ads.core.d.b.a(3002, 10115, String.valueOf(next));
                    }
                    b.this.f79778f.put(next, Long.valueOf(SystemClock.elapsedRealtime()));
                } else {
                    sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "The url that wait for preload has been preloaded before: " + next);
                }
                d.a(2, new Runnable() { // from class: sg.bigo.ads.a.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.e();
                    }
                }, 200L);
            }
        });
    }

    public final boolean a(Context context) {
        String str;
        if (!this.f79782j) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome service is unavailable.");
            return false;
        }
        boolean zBindCustomTabsService = true;
        if (this.f79781i) {
            str = "Chrome service connected";
        } else {
            if (!this.f79780h) {
                this.f79780h = true;
                sg.bigo.ads.a.a.a aVar = this.f79774a;
                aVar.f79761c = this;
                if (aVar.f79759a == null) {
                    b.a aVarA = sg.bigo.ads.a.a.b.a(context);
                    if (aVarA == null || !aVarA.f79767a) {
                        zBindCustomTabsService = false;
                    } else {
                        sg.bigo.ads.a.a.c cVar = new sg.bigo.ads.a.a.c(aVar);
                        aVar.f79760b = cVar;
                        zBindCustomTabsService = CustomTabsClient.bindCustomTabsService(context, aVarA.f79771e, cVar);
                    }
                }
                if (!zBindCustomTabsService) {
                    this.f79780h = false;
                    int i10 = this.f79779g;
                    this.f79779g = i10 + 1;
                    if (i10 < 3) {
                        this.f79782j = false;
                    }
                }
                return zBindCustomTabsService;
            }
            str = "Chrome service connect trying.";
        }
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", str);
        return true;
    }

    @MainThread
    public final void b() {
        if (this.f79783k) {
            return;
        }
        e();
    }

    @Override // sg.bigo.ads.a.a.a.InterfaceC0957a
    public final void c() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome tabs service connected.");
        this.f79781i = true;
        this.f79780h = false;
        b();
    }

    @Override // sg.bigo.ads.a.a.a.InterfaceC0957a
    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome tabs service disconnected.");
        this.f79781i = false;
        this.f79780h = false;
    }
}
