package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.RootConfig;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3853x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f28506a;

    static {
        String simpleName = AbstractC3853x8.class.getSimpleName();
        a(AbstractC3804v9.a());
        tn.p.j(simpleName, "TAG");
        AbstractC3804v9.a();
    }

    public static String a() {
        Boolean bool = Tg.f26361b;
        boolean zBooleanValue = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = Ji.f25747a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Ea eaA = Da.a(context, "user_info_store");
                tn.p.k("user_age_restricted", "key");
                Tg.f26361b = Boolean.valueOf(eaA.f25373a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = Tg.f26361b;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            }
        }
        if (zBooleanValue) {
            tn.p.j("x8", "TAG");
            return null;
        }
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(RootConfig.class, "clazz");
        C3476i4 c3476i42 = Y3.f26611a;
        if (cn.f0.i0(((RootConfig) c3476i42.a(RootConfig.class)).getIPAddrTPSupport(), Ki.f25816b)) {
            tn.p.j("x8", "TAG");
            return f28506a;
        }
        tn.p.j("x8", "TAG");
        tn.p.k(RootConfig.class, "clazz");
        Objects.toString(((RootConfig) c3476i42.a(RootConfig.class)).getIPAddrTPSupport());
        return null;
    }

    public static void a(String str) {
        Boolean bool = Tg.f26361b;
        boolean zBooleanValue = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = Ji.f25747a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Ea eaA = Da.a(context, "user_info_store");
                tn.p.k("user_age_restricted", "key");
                Tg.f26361b = Boolean.valueOf(eaA.f25373a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = Tg.f26361b;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            }
        }
        if (zBooleanValue) {
            f28506a = null;
            AbstractC3804v9.a(null);
        } else {
            f28506a = str;
            AbstractC3804v9.a(str);
        }
    }
}
