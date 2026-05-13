package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class X9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public U6 f30665a = new U6();

    public class a extends AbstractRunnableC4078ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EnumC4255se f30666b;

        public a(EnumC4255se enumC4255se) {
            this.f30666b = enumC4255se;
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            X9.this.f30665a.a(Q6.f30227g0, new JSONArray().put(this.f30666b.b()));
        }
    }

    public void a(int i10) {
        this.f30665a.a(Q6.f30236j0, Integer.valueOf(i10));
    }

    public void a(Context context) {
        this.f30665a.a(context);
    }

    public void a(@NotNull U7 u72) {
        try {
            HashMap map = new HashMap();
            map.put(Q6.E, u72.a());
            map.put(Q6.D, u72.b());
            map.put(Q6.V, u72.c());
            this.f30665a.a(map);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
        }
    }

    public void a(EnumC4255se enumC4255se) {
        new Thread(new a(enumC4255se)).start();
    }

    public void a(Boolean bool) {
        this.f30665a.a(Q6.U0, bool);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f30665a.a("abt", str);
    }

    public void a(JSONObject jSONObject) {
        this.f30665a.a(Q6.f30268u, (Object) jSONObject);
    }

    public void a(boolean z10) {
        this.f30665a.a(Q6.R0, Boolean.valueOf(z10));
    }

    public void b(int i10) {
        if (i10 >= 0) {
            this.f30665a.a(Q6.T0, Integer.valueOf(i10));
        }
    }

    public void b(Context context) {
        B7 b7I = Lb.U().i();
        ActivityManager.MemoryInfo memoryInfoN = b7I.n(context);
        this.f30665a.a(Q6.f30274w, b7I.c(memoryInfoN));
        this.f30665a.a("lowM", b7I.b(memoryInfoN));
    }

    public void b(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f30665a.a("adq_init_blob", str);
    }

    public void b(JSONObject jSONObject) {
        this.f30665a.a(Q6.f30225f1, (Object) jSONObject);
    }

    public void b(boolean z10) {
        this.f30665a.a("gpi", Boolean.valueOf(z10));
    }

    public void c(int i10) {
        this.f30665a.a(Q6.f30224f0, Integer.valueOf(i10));
    }

    public void c(String str) {
        this.f30665a.a(Q6.K0, str);
    }

    public void d(String str) {
        this.f30665a.a(Q6.M0, str);
    }

    public void e(String str) {
        this.f30665a.a(com.ironsource.mediationsdk.metadata.a.f32684i, str);
    }

    public void f(String str) {
        this.f30665a.a(Q6.f30210a1, str);
    }

    public void g(String str) {
        this.f30665a.a(Q6.A, str);
    }

    public void h(String str) {
        this.f30665a.a("sid", str);
    }

    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f30665a.a(Q6.f30221e0, str);
    }
}
