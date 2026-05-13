package d2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DefaultsFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Class<?>, Object> f59551a;

    static {
        HashMap map = new HashMap();
        map.put(Bundle.class, new x1.a());
        map.put(Intent.class, new x1.b());
        f59551a = Collections.unmodifiableMap(map);
    }

    public static Map<Class<?>, Object> a() {
        return f59551a;
    }

    public static h2.a b() {
        return new h2.b(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    public static v1.a c() {
        return new v1.b();
    }

    public static i2.a d() {
        return new i2.b();
    }

    public static j2.b e() {
        return new j2.a(CreativeInfo.f52469an);
    }

    public static t1.b f() {
        return new t1.a();
    }

    public static w1.b g() {
        return new w1.a();
    }

    public static a2.b h() {
        return new a2.a();
    }

    public static b2.b i() {
        return new b2.a();
    }

    public static y1.b j() {
        return new y1.a();
    }

    public static z1.b k() {
        return new z1.a();
    }
}
