package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.AbstractC3804v9;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.v9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3804v9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bn.g f28352a = kotlin.b.b(new sn.a() { // from class: n9.va
        @Override // sn.a
        public final Object invoke() {
            return AbstractC3804v9.b();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f28353b;

    static {
        String simpleName = AbstractC3804v9.class.getSimpleName();
        f28353b = simpleName;
        tn.p.h(simpleName);
    }

    public static String a() {
        Ea ea2 = (Ea) f28352a.getValue();
        String string = null;
        if (ea2 != null) {
            tn.p.k("cip", "key");
            string = ea2.f25373a.getString("cip", null);
        }
        tn.p.j(f28353b, "TAG");
        return string;
    }

    public static void a(String str) {
        Ea ea2 = (Ea) f28352a.getValue();
        if (ea2 != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f25372b;
            ea2.a("cip", str, false);
            bn.r rVar = bn.r.f5635a;
        }
        tn.p.h(f28353b);
    }

    public static final Ea b() {
        Context context = Ji.f25747a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        return Da.a(context, "inmobi_store");
    }
}
