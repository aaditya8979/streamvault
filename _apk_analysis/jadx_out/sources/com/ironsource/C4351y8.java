package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.y8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4351y8 implements InterfaceC4215q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Object> f34425a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.y8$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f34426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f34427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f34428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Context f34429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f34430e;

        public a a(Context context) {
            this.f34429d = context;
            return this;
        }

        public a a(String str) {
            this.f34427b = str;
            return this;
        }

        public C4351y8 a() {
            return new C4351y8(this);
        }

        public a b(String str) {
            this.f34428c = str;
            return this;
        }

        public a c(String str) {
            this.f34426a = str;
            return this;
        }

        public a d(String str) {
            this.f34430e = str;
            return this;
        }
    }

    private C4351y8(a aVar) {
        a(aVar);
        a(aVar.f34429d);
    }

    private void a(Context context) {
        f34425a.put(G5.f29390e, C3924a4.b(context));
        f34425a.put(G5.f29391f, C3924a4.d(context));
    }

    private void a(a aVar) {
        Context context = aVar.f34429d;
        C3961c5 c3961c5B = C3961c5.b(context);
        f34425a.put(G5.f29395j, SDKUtils.encodeString(c3961c5B.e()));
        f34425a.put(G5.f29396k, SDKUtils.encodeString(c3961c5B.f()));
        f34425a.put(G5.f29397l, Integer.valueOf(c3961c5B.a()));
        f34425a.put(G5.f29398m, SDKUtils.encodeString(c3961c5B.d()));
        f34425a.put(G5.f29399n, SDKUtils.encodeString(c3961c5B.c()));
        f34425a.put(G5.f29389d, SDKUtils.encodeString(context.getPackageName()));
        f34425a.put(G5.f29392g, SDKUtils.encodeString(aVar.f34427b));
        f34425a.put("sessionid", SDKUtils.encodeString(aVar.f34426a));
        f34425a.put(G5.f29387b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f34425a.put(G5.f29400o, G5.f29405t);
        f34425a.put("origin", "n");
        if (TextUtils.isEmpty(aVar.f34430e)) {
            return;
        }
        f34425a.put(G5.f29394i, SDKUtils.encodeString(aVar.f34430e));
    }

    public static void a(String str) {
        f34425a.put(G5.f29390e, SDKUtils.encodeString(str));
    }

    public static void b(String str) {
        f34425a.put(G5.f29391f, SDKUtils.encodeString(str));
    }

    @Override // com.ironsource.InterfaceC4215q7
    public Map<String, Object> a() {
        return f34425a;
    }
}
