package jc;

import a6.k0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer.source.dash.DashMediaSource;
import com.google.android.exoplayer.source.hls.HlsMediaSource;
import com.google.android.exoplayer.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer.upstream.HttpDataSource;
import com.google.android.exoplayer.upstream.a;
import com.google.android.exoplayer.upstream.cache.Cache;
import e5.f0;
import e5.r;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: compiled from: ExoMediaSourceHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f72387e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f72389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HttpDataSource.b f72390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Cache f72391d;

    public c(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f72389b = applicationContext;
        this.f72388a = k0.b0(applicationContext, applicationContext.getApplicationInfo().name);
    }

    public static c d(Context context) {
        if (f72387e == null) {
            synchronized (c.class) {
                if (f72387e == null) {
                    f72387e = new c(context);
                }
            }
        }
        return f72387e;
    }

    public final a.InterfaceC0296a a() {
        if (this.f72391d == null) {
            this.f72391d = h();
        }
        return new com.google.android.exoplayer.upstream.cache.b(this.f72391d, b(), 2);
    }

    public final a.InterfaceC0296a b() {
        return new com.google.android.exoplayer.upstream.c(this.f72389b, c());
    }

    public final a.InterfaceC0296a c() {
        if (this.f72390c == null) {
            this.f72390c = new com.google.android.exoplayer.upstream.e(this.f72388a, null, 8000, 8000, true);
        }
        return this.f72390c;
    }

    public r e(String str, Map<String, String> map) {
        return f(str, map, false);
    }

    public r f(String str, Map<String, String> map, boolean z10) {
        Uri uri = Uri.parse(str);
        int iG = g(str);
        a.InterfaceC0296a interfaceC0296aA = z10 ? a() : b();
        if (this.f72390c != null) {
            i(map);
        }
        return iG != 0 ? iG != 1 ? iG != 2 ? new f0.a(interfaceC0296aA).a(uri) : new HlsMediaSource.Factory(interfaceC0296aA).a(uri) : new SsMediaSource.Factory(interfaceC0296aA).a(uri) : new DashMediaSource.Factory(interfaceC0296aA).a(uri);
    }

    public final int g(String str) {
        String strK0 = k0.K0(str);
        if (strK0.contains(".mpd")) {
            return 0;
        }
        if (strK0.contains(".m3u8")) {
            return 2;
        }
        return strK0.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?") ? 1 : 3;
    }

    public final Cache h() {
        return new com.google.android.exoplayer.upstream.cache.f(new File(this.f72389b.getExternalCacheDir(), "exo-video-cache"), new com.google.android.exoplayer.upstream.cache.e(536870912L), new h4.b(this.f72389b));
    }

    public final void i(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.equals(key, "User-Agent")) {
                this.f72390c.getDefaultRequestProperties().b(key, value);
            } else if (!TextUtils.isEmpty(value)) {
                try {
                    Field declaredField = this.f72390c.getClass().getDeclaredField("userAgent");
                    declaredField.setAccessible(true);
                    declaredField.set(this.f72390c, value);
                } catch (Exception unused) {
                }
            }
        }
    }
}
