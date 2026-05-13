package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.d6;
import com.applovin.impl.e3;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.Q6;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p3 implements q0.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static WeakReference f9514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicBoolean f9515m = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f9517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f9518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o3 f9519d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f9522g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9524i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f9525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b0 f9526k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f9520e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f9521f = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f9523h = 2;

    public class a extends b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started mediation debugger");
                if (!p3.this.c() || p3.f9514l.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = p3.f9514l = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(p3.this.f9519d, p3.this.f9516a.e());
                }
                p3.f9515m.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = p3.f9514l = null;
            }
        }
    }

    public p3(com.applovin.impl.sdk.k kVar) {
        this.f9516a = kVar;
        this.f9517b = kVar.O();
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f9518c = contextO;
        o3 o3Var = new o3(contextO);
        this.f9519d = o3Var;
        this.f9526k = new b0(kVar, o3Var);
    }

    private List a(List list, com.applovin.impl.sdk.k kVar) {
        List<String> adUnitIds = kVar.J() != null ? kVar.J().getAdUnitIds() : null;
        if (adUnitIds == null || adUnitIds.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(adUnitIds.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (adUnitIds.contains(nVar.c())) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            a0 a0Var = new a0(str);
            if (a0Var.h()) {
                arrayList.add(a0Var);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f9517b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, Q6.E1, new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                e3 e3Var = new e3(jSONObject2, kVar);
                arrayList.add(e3Var);
                this.f9520e.put(e3Var.b(), e3Var);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject, List list, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new n(jSONObject2, this.f9520e, kVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i10) {
        h();
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (e3Var.z() && e3Var.q() == e3.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.gd
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8379b.d();
                    }
                }, TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        WeakReference weakReference = f9514l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Activity activityU0 = this.f9516a.u0();
        if (activityU0 == null || activityU0.isFinishing()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        } else {
            new AlertDialog.Builder(activityU0).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.id
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f8538b.a(dialogInterface, i10);
                }
            }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    private void f() {
        this.f9516a.e().a(new a());
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53127a);
        context.startActivity(intent);
    }

    public List a(String str) {
        Map map = this.f9525j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f9525j.get(str);
    }

    @Override // com.applovin.impl.q0.e
    public void a(String str, int i10, String str2, JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9517b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i10);
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f9516a.D().a("fetchMediationDebuggerInfo", str, i10, str2);
        this.f9519d.a(null, null, null, null, null, null, null, false, this.f9516a);
        this.f9521f.set(false);
    }

    @Override // com.applovin.impl.q0.e
    public void a(String str, JSONObject jSONObject, int i10) {
        List listA = a(jSONObject, this.f9516a);
        List listA2 = a(jSONObject, listA, this.f9516a);
        List listA3 = a(listA2, this.f9516a);
        List listA4 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f9519d.a(listA, listA2, listA3, listA4, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f9516a);
        if (!listA4.isEmpty()) {
            this.f9526k.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.hd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8444b.h();
                }
            }, TimeUnit.SECONDS.toMillis(this.f9523h));
        } else {
            a(listA);
        }
    }

    public void a(Map map) {
        this.f9525j = map;
        e();
        if (c() || !f9515m.compareAndSet(false, true)) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Mediation debugger is already showing");
            return;
        }
        if (!this.f9524i) {
            f();
            this.f9524i = true;
        }
        Intent intent = new Intent(this.f9518c, (Class<?>) MaxDebuggerActivity.class);
        intent.setFlags(268435456);
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting mediation debugger...");
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f9518c, intent);
    }

    public void a(boolean z10, int i10) {
        this.f9522g = z10;
        this.f9523h = i10;
    }

    public void e() {
        if (this.f9521f.compareAndSet(false, true)) {
            this.f9516a.q0().a((i5) new w5(this, this.f9516a), d6.b.OTHER);
        }
    }

    public boolean g() {
        return this.f9522g;
    }

    public void h() {
        a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f9519d + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e;
    }
}
