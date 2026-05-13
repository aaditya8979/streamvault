package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: GeckoConfig.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static IThreadPoolCallback f11394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static ThreadPoolExecutor f11395s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.c f11397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IStatisticMonitor f11398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final INetWork f11399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f11400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f11401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.a f11402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f11403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f11404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f11405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f11406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f11407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f11408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f11409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f11410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f11411p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JSONObject f11412q;

    /* JADX INFO: compiled from: GeckoConfig.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private INetWork f11413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f11414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f11415c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Context f11416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.c f11417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IStatisticMonitor f11418f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f11419g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.a f11420h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Long f11421i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f11422j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f11423k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f11424l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private File f11425m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f11426n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f11427o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f11428p;

        public a(Context context) {
            this.f11416d = context.getApplicationContext();
        }

        public final a a() {
            this.f11419g = false;
            return this;
        }

        public final a a(long j10) {
            this.f11428p = j10;
            return this;
        }

        public final a a(com.bykv.vk.openvk.preload.geckox.a.a.a aVar) {
            this.f11420h = aVar;
            return this;
        }

        public final a a(INetWork iNetWork) {
            this.f11413a = iNetWork;
            return this;
        }

        public final a a(IStatisticMonitor iStatisticMonitor) {
            this.f11418f = iStatisticMonitor;
            return this;
        }

        public final a a(File file) {
            this.f11425m = file;
            return this;
        }

        public final a a(String str) {
            this.f11422j = str;
            return this;
        }

        public final a a(String... strArr) {
            this.f11415c = Arrays.asList(strArr);
            return this;
        }

        public final a b() {
            this.f11421i = 38L;
            return this;
        }

        public final a b(String str) {
            this.f11423k = str;
            return this;
        }

        public final a b(String... strArr) {
            this.f11414b = Arrays.asList(strArr);
            return this;
        }

        public final a c(String str) {
            this.f11424l = str;
            return this;
        }
    }

    private b(a aVar) {
        Context context = aVar.f11416d;
        this.f11396a = context;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        List<String> list = aVar.f11414b;
        this.f11400e = list;
        this.f11401f = aVar.f11415c;
        this.f11397b = aVar.f11417e;
        this.f11402g = aVar.f11420h;
        Long l10 = aVar.f11421i;
        this.f11403h = l10;
        if (TextUtils.isEmpty(aVar.f11422j)) {
            this.f11404i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
        } else {
            this.f11404i = aVar.f11422j;
        }
        String str = aVar.f11423k;
        this.f11405j = str;
        this.f11407l = aVar.f11426n;
        this.f11408m = aVar.f11427o;
        this.f11411p = aVar.f11428p;
        if (aVar.f11425m == null) {
            this.f11409n = new File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.f11409n = aVar.f11425m;
        }
        String str2 = aVar.f11424l;
        this.f11406k = str2;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("host == null");
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        if (l10 == null) {
            throw new IllegalArgumentException("appId == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("deviceId key empty");
        }
        this.f11399d = aVar.f11413a;
        this.f11398c = aVar.f11418f;
        this.f11410o = aVar.f11419g;
    }

    public /* synthetic */ b(a aVar, byte b10) {
        this(aVar);
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        f11394r = iThreadPoolCallback;
    }

    public static Executor g() {
        return t();
    }

    public static Executor h() {
        return t();
    }

    public static ExecutorService t() {
        IThreadPoolCallback iThreadPoolCallback = f11394r;
        ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (f11395s == null) {
            synchronized (b.class) {
                if (f11395s == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    f11395s = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f11395s;
    }

    public final Context a() {
        return this.f11396a;
    }

    public final void a(JSONObject jSONObject) {
        this.f11412q = jSONObject;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
        return this.f11402g;
    }

    public final boolean c() {
        return this.f11410o;
    }

    public final List<String> d() {
        return this.f11401f;
    }

    public final List<String> e() {
        return this.f11400e;
    }

    public final JSONObject f() {
        return this.f11412q;
    }

    public final INetWork i() {
        return this.f11399d;
    }

    public final String j() {
        return this.f11406k;
    }

    public final long k() {
        return this.f11403h.longValue();
    }

    public final String l() {
        return this.f11408m;
    }

    public final String m() {
        return this.f11407l;
    }

    public final File n() {
        return this.f11409n;
    }

    public final String o() {
        return this.f11404i;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.c p() {
        return this.f11397b;
    }

    public final IStatisticMonitor q() {
        return this.f11398c;
    }

    public final String r() {
        return this.f11405j;
    }

    public final long s() {
        return this.f11411p;
    }
}
