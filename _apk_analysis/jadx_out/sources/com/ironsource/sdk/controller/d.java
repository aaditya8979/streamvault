package com.ironsource.sdk.controller;

import com.ironsource.A8;
import com.ironsource.C3978d4;
import com.ironsource.C4024fe;
import com.ironsource.C4086j5;
import com.ironsource.C4228r4;
import com.ironsource.C4300v8;
import com.ironsource.C8;
import com.ironsource.G5;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f33620h = "controllerSourceData";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f33621i = "next_";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f33622j = "fallback_";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f33623k = "controllerSourceCode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f33624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f33626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC0399d f33627d = EnumC0399d.NONE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f33629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C4086j5 f33630g;

    public class a extends JSONObject {
        public a() throws JSONException {
            putOpt(C3978d4.a.f31214j, Integer.valueOf(d.this.f33625b));
            putOpt(d.f33623k, Integer.valueOf(d.this.f33627d.b()));
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33632a;

        static {
            int[] iArr = new int[c.values().length];
            f33632a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33632a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33632a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    public enum EnumC0399d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f33644a;

        EnumC0399d(int i10) {
            this.f33644a = i10;
        }

        public int b() {
            return this.f33644a;
        }
    }

    public d(JSONObject jSONObject, String str, String str2, C4086j5 c4086j5) {
        int iOptInt = jSONObject.optInt(C3978d4.a.f31214j, -1);
        this.f33625b = iOptInt;
        this.f33626c = a(iOptInt);
        this.f33628e = str;
        this.f33629f = str2;
        this.f33630g = c4086j5;
    }

    private c a(int i10) {
        return i10 != 1 ? i10 != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL : c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private void a(C8 c82) {
        if (this.f33630g.c()) {
            return;
        }
        this.f33630g.a(c82, this.f33629f);
    }

    private void a(EnumC0399d enumC0399d) {
        C4300v8 c4300v8A = new C4300v8().a(G5.f29410y, Integer.valueOf(this.f33625b)).a(G5.f29411z, Integer.valueOf(enumC0399d.b()));
        if (this.f33624a > 0) {
            c4300v8A.a(G5.B, Long.valueOf(System.currentTimeMillis() - this.f33624a));
        }
        A8.a(C4024fe.f31728w, c4300v8A.a());
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return false;
        }
    }

    private boolean b() throws Exception {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    private void c() {
        try {
            C8 c8G = g();
            if (c8G.exists()) {
                C8 c8H = h();
                if (c8H.exists()) {
                    c8H.delete();
                }
                IronSourceStorageUtils.renameFile(c8G.getPath(), c8H.getPath());
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private C8 h() {
        return new C8(this.f33628e, "fallback_mobileController.html");
    }

    private C8 i() {
        return new C8(this.f33628e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        C4300v8 c4300v8A = new C4300v8().a(G5.f29410y, Integer.valueOf(this.f33625b));
        if (this.f33624a > 0) {
            c4300v8A.a(G5.B, Long.valueOf(System.currentTimeMillis() - this.f33624a));
        }
        A8.a(C4024fe.f31729x, c4300v8A.a());
    }

    public void a(C4300v8 c4300v8) {
        c4300v8.a(G5.f29410y, Integer.valueOf(this.f33625b));
        A8.a(C4024fe.f31727v, c4300v8.a());
        this.f33624a = System.currentTimeMillis();
    }

    public void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.f33626c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC0399d enumC0399d = EnumC0399d.CONTROLLER_FROM_SERVER;
        this.f33627d = enumC0399d;
        a(enumC0399d);
        runnable.run();
    }

    public void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.f33626c != c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK || !a()) {
            l();
            runnable2.run();
        } else {
            EnumC0399d enumC0399d = EnumC0399d.FALLBACK_CONTROLLER_RECOVERY;
            this.f33627d = enumC0399d;
            a(enumC0399d);
            runnable.run();
        }
    }

    public JSONObject f() throws JSONException {
        return SafeIronSourceControllerBridge.com_ironsource_sdk_controller_d$a_jsonObjectInit(this);
    }

    public C8 g() {
        return new C8(this.f33628e, C3978d4.f31185f);
    }

    public boolean k() {
        int i10 = b.f33632a[this.f33626c.ordinal()];
        if (i10 == 1) {
            e();
            a(new C8(this.f33628e, SDKUtils.getFileName(this.f33629f)));
            return false;
        }
        if (i10 == 2) {
            c();
            a(new C8(this.f33628e, SDKUtils.getFileName(this.f33629f)));
            return false;
        }
        if (i10 == 3) {
            try {
                C8 c8G = g();
                C8 c8I = i();
                if (!c8I.exists() && !c8G.exists()) {
                    a(new C8(this.f33628e, SDKUtils.getFileName(this.f33629f)));
                    return false;
                }
                if (!c8I.exists() && c8G.exists()) {
                    EnumC0399d enumC0399d = EnumC0399d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                    this.f33627d = enumC0399d;
                    a(enumC0399d);
                    a(new C8(this.f33628e, c8I.getName()));
                    return true;
                }
                c();
                if (b()) {
                    EnumC0399d enumC0399d2 = EnumC0399d.PREPARED_CONTROLLER_LOADED;
                    this.f33627d = enumC0399d2;
                    a(enumC0399d2);
                    d();
                    a(new C8(this.f33628e, c8I.getName()));
                    return true;
                }
                if (!a()) {
                    a(new C8(this.f33628e, SDKUtils.getFileName(this.f33629f)));
                    return false;
                }
                EnumC0399d enumC0399d3 = EnumC0399d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                this.f33627d = enumC0399d3;
                a(enumC0399d3);
                a(new C8(this.f33628e, c8I.getName()));
                return true;
            } catch (Exception e10) {
                C4228r4.d().a(e10);
            }
        }
        return false;
    }

    public boolean m() {
        return this.f33627d != EnumC0399d.NONE;
    }
}
