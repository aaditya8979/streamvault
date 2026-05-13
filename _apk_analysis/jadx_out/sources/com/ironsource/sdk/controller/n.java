package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4228r4;
import com.ironsource.C4266t8;
import com.ironsource.InterfaceC4313w4;
import com.ironsource.InterfaceC4330x4;
import com.ironsource.InterfaceC4347y4;
import com.ironsource.V7;
import com.ironsource.Y4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V7 f33767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33768b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l.a f33769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f.c f33770b;

        public a(l.a aVar, f.c cVar) {
            this.f33769a = aVar;
            this.f33770b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f33769a == null) {
                    return;
                }
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
                jSONObjectJsonObjectInit.put("success", false);
                jSONObjectJsonObjectInit.put("reason", n.this.f33768b);
                this.f33769a.a(new f.a(this.f33770b.f(), jSONObjectJsonObjectInit));
            } catch (JSONException e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4347y4 f33772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y4 f33773b;

        public b(InterfaceC4347y4 interfaceC4347y4, Y4 y42) {
            this.f33772a = interfaceC4347y4;
            this.f33773b = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33772a.a(C4266t8.e.RewardedVideo, this.f33773b.h(), n.this.f33768b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4347y4 f33775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f33776b;

        public c(InterfaceC4347y4 interfaceC4347y4, JSONObject jSONObject) {
            this.f33775a = interfaceC4347y4;
            this.f33776b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33775a.b(this.f33776b.optString("demandSourceName"), n.this.f33768b);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4330x4 f33778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y4 f33779b;

        public d(InterfaceC4330x4 interfaceC4330x4, Y4 y42) {
            this.f33778a = interfaceC4330x4;
            this.f33779b = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33778a.a(C4266t8.e.Interstitial, this.f33779b.h(), n.this.f33768b);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4330x4 f33781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33782b;

        public e(InterfaceC4330x4 interfaceC4330x4, String str) {
            this.f33781a = interfaceC4330x4;
            this.f33782b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33781a.a(this.f33782b, n.this.f33768b);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4330x4 f33784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y4 f33785b;

        public f(InterfaceC4330x4 interfaceC4330x4, Y4 y42) {
            this.f33784a = interfaceC4330x4;
            this.f33785b = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33784a.a(this.f33785b.h(), n.this.f33768b);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4330x4 f33787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f33788b;

        public g(InterfaceC4330x4 interfaceC4330x4, JSONObject jSONObject) {
            this.f33787a = interfaceC4330x4;
            this.f33788b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33787a.d(this.f33788b.optString("demandSourceName"), n.this.f33768b);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4330x4 f33790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y4 f33791b;

        public h(InterfaceC4330x4 interfaceC4330x4, Y4 y42) {
            this.f33790a = interfaceC4330x4;
            this.f33791b = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33790a.d(this.f33791b.h(), n.this.f33768b);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4313w4 f33793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f33794b;

        public i(InterfaceC4313w4 interfaceC4313w4, Map map) {
            this.f33793a = interfaceC4313w4;
            this.f33794b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33793a.c((String) this.f33794b.get("demandSourceName"), n.this.f33768b);
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4313w4 f33796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f33797b;

        public j(InterfaceC4313w4 interfaceC4313w4, JSONObject jSONObject) {
            this.f33796a = interfaceC4313w4;
            this.f33797b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33796a.c(this.f33797b.optString("demandSourceName"), n.this.f33768b);
        }
    }

    public n(String str, V7 v72) {
        this.f33767a = v72;
        this.f33768b = str;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42, Map<String, String> map, InterfaceC4313w4 interfaceC4313w4) {
        if (interfaceC4313w4 != null) {
            a(new i(interfaceC4313w4, map));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42, Map<String, String> map, InterfaceC4330x4 interfaceC4330x4) {
        if (interfaceC4330x4 != null) {
            a(new h(interfaceC4330x4, y42));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, @Nullable l.a aVar) {
        a(new a(aVar, cVar));
    }

    public void a(Runnable runnable) {
        V7 v72 = this.f33767a;
        if (v72 != null) {
            v72.c(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC4330x4 interfaceC4330x4) {
        if (interfaceC4330x4 != null) {
            a(new e(interfaceC4330x4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC4313w4 interfaceC4313w4) {
        if (interfaceC4313w4 != null) {
            interfaceC4313w4.a(C4266t8.e.Banner, y42.h(), this.f33768b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC4330x4 interfaceC4330x4) {
        if (interfaceC4330x4 != null) {
            a(new d(interfaceC4330x4, y42));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC4347y4 interfaceC4347y4) {
        if (interfaceC4347y4 != null) {
            a(new b(interfaceC4347y4, y42));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4313w4 interfaceC4313w4) {
        if (interfaceC4313w4 != null) {
            a(new j(interfaceC4313w4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4330x4 interfaceC4330x4) {
        if (interfaceC4330x4 != null) {
            a(new g(interfaceC4330x4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC4347y4 interfaceC4347y4) {
        if (interfaceC4347y4 != null) {
            a(new c(interfaceC4347y4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y42) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y42, Map<String, String> map, InterfaceC4330x4 interfaceC4330x4) {
        if (interfaceC4330x4 != null) {
            a(new f(interfaceC4330x4, y42));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
    }

    @Override // com.ironsource.sdk.controller.l
    public C4266t8.c h() {
        return C4266t8.c.Native;
    }
}
