package com.applovin.impl;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.core.net.MailTo;
import androidx.webkit.internal.AssetHelper;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.d;
import com.applovin.impl.m1;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.ironsource.C3978d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class e1 implements m1.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static WeakReference f8146m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AtomicBoolean f8147n = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f8149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8150c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d1 f8152e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private m1 f8154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g7 f8155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f8158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8159l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8151d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f8153f = new WeakReference(null);

    public class a extends LinkedHashMap {
        public a(int i10) {
            super(i10);
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 10;
        }
    }

    public class b extends com.applovin.impl.b {
        public b() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started Creative Debugger");
                if (!e1.this.h() || e1.f8146m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = e1.f8146m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(e1.this.f8152e, e1.this.f8148a.e());
                }
                e1.f8147n.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = e1.f8146m = null;
            }
        }
    }

    public class c implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f8162a;

        public c(Object obj) {
            this.f8162a = obj;
        }

        @Override // com.applovin.impl.d.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new q1(this.f8162a, e1.this.f8148a.H().b()), e1.this.f8148a);
            e1.f8147n.set(false);
        }
    }

    public e1(com.applovin.impl.sdk.k kVar) {
        this.f8148a = kVar;
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f8149b = contextO;
        this.f8150c = new a(10);
        this.f8152e = new d1(contextO);
    }

    private Bundle a(Object obj) {
        this.f8148a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8148a.O().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String strA = n7.a(obj);
        Bundle bundleA = this.f8148a.j().a(strA);
        this.f8148a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8148a.O().a("CreativeDebuggerService", "Serve id: " + strA);
        }
        this.f8148a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8148a.O().a("CreativeDebuggerService", "Public data: " + bundleA);
        }
        if (bundleA == null) {
            return null;
        }
        for (String str : bundleA.keySet()) {
            Object obj2 = bundleA.get(str);
            bundleA.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, bundleA);
        }
        return bundleA;
    }

    private View a(final FrameLayout frameLayout, Activity activity) {
        View view;
        int iDpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i10 = iDpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 8388629);
        layoutParams.setMargins(i10, i10, i10, i10);
        try {
            ImageButton imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i10, i10, i10, i10 * 2);
            view = imageButton;
        } catch (Throwable unused) {
            Button button = new Button(activity);
            button.setText("ⓘ");
            button.setTextColor(-1);
            button.setAllCaps(false);
            button.setTextSize(2, 20.0f);
            button.setPadding(0, 0, 0, 0);
            view = button;
        }
        view.setLayoutParams(layoutParams);
        view.setBackground(f());
        if (this.f8157j) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.r9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f9783b.a(frameLayout, view2, motionEvent);
                }
            });
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.s9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f9844b.a(view2);
                }
            });
        }
        if (o0.d()) {
            view.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f8153f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.f8158k <= 0 || !this.f8157j) {
            b(view, frameLayout);
        } else {
            view.setVisibility(4);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f8158k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.v9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10553b.i();
                }
            }, TimeUnit.SECONDS.toMillis(10L));
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (view.getVisibility() == 0) {
                this.f8158k = 0L;
                n();
            } else {
                b(view, frameLayout);
            }
        }
        return true;
    }

    private String b(Object obj) {
        String mediationServeId = obj instanceof com.applovin.impl.sdk.ad.b ? ((com.applovin.impl.sdk.ad.b) obj).getMediationServeId() : obj instanceof y2 ? ((y2) obj).Q() : null;
        return StringUtils.isValidString(mediationServeId) ? mediationServeId : UUID.randomUUID().toString();
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.f8157j) {
            view.setOnTouchListener(null);
            this.f8158k = 0L;
        }
        frameLayout.removeView(view);
        this.f8153f = new WeakReference(null);
    }

    private boolean c(Object obj) {
        MaxAdFormat maxAdFormatD = obj instanceof com.applovin.impl.sdk.ad.b ? ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d() : obj instanceof y2 ? ((y2) obj).getFormat() : null;
        return maxAdFormatD != null && maxAdFormatD.isFullscreenAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (g() && this.f8153f.get() == null && !h()) {
            Activity activityB = this.f8148a.e().b();
            if (activityB == null) {
                this.f8148a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8148a.O().b("AppLovinSdk", "Failed to display Creative Debugger button");
                    return;
                }
                return;
            }
            View viewFindViewById = activityB.findViewById(android.R.id.content);
            if (viewFindViewById instanceof FrameLayout) {
                final FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                final View viewA = a(frameLayout, activityB);
                frameLayout.addView(viewA);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150L);
                viewA.startAnimation(alphaAnimation);
                final ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
                final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.t9
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        this.f10437b.a(viewA, frameLayout);
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.u9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10492b.a(viewA, frameLayout, viewTreeObserver, onGlobalLayoutListener);
                    }
                }, TimeUnit.SECONDS.toMillis(5L));
                this.f8153f = new WeakReference(viewA);
            }
        }
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        d.a(this.f8149b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f8148a.e(), new c(obj));
    }

    private Drawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        WeakReference weakReference = f8146m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f8158k);
        if (this.f8158k == 0 || seconds < 10) {
            return;
        }
        this.f8148a.D().a(d2.f7999d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.f8148a.W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.f8156i = 0;
    }

    private void m() {
        this.f8148a.e().a(new b());
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53127a);
        context.startActivity(intent);
    }

    public String a(q1 q1Var) {
        v2 v2Var = new v2();
        v2Var.b("Ad Info:\n");
        y2 y2VarE = q1Var.e();
        com.applovin.impl.sdk.ad.b bVarC = q1Var.c();
        if (y2VarE != null) {
            v2Var.a(y2VarE);
        } else if (bVarC != null) {
            v2Var.a(AndroidInitializeBoldSDK.MSG_NETWORK, "APPLOVIN").a(bVarC).b(bVarC);
        }
        v2Var.a(this.f8148a);
        v2Var.a("Epoch Timestamp (ms)", Long.valueOf(q1Var.b()));
        v2 v2Var2 = new v2();
        v2Var2.a("Platform", "fireos".equals(this.f8148a.A().A()) ? "Fire OS" : C3978d4.f31183d).a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f8148a.a(x4.L3)).a("App Package Name", this.f8149b.getPackageName()).a("Device", String.format("%s %s (%s)", Build.BRAND, Build.MODEL, Build.DEVICE)).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f8148a.h0()).a("Ad Review Version", j.b()).a(a(q1Var.a())).a("User ID", this.f8148a.w0().e() != null ? this.f8148a.w0().e() : "None").a("MD", this.f8148a.a(x4.f10837t));
        v2Var.a("\nDebug Info:\n").a(u4.b(v2Var2.toString(), n7.a(this.f8148a), u4.a.V2, this.f8148a.i0(), this.f8148a));
        return v2Var.toString();
    }

    @Override // com.applovin.impl.m1.a
    public void a() {
        int i10 = this.f8156i;
        if (i10 % 2 == 1) {
            this.f8156i = i10 + 1;
        }
        if (this.f8156i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.q9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9675b.e();
                }
            });
            this.f8156i = 0;
            this.f8155h.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Serializable, java.lang.Object[]] */
    public void a(q1 q1Var, Context context, boolean z10) {
        String strA = a(q1Var);
        v2 v2Var = new v2();
        if (z10) {
            v2Var.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        v2Var.b(strA);
        String strB = b(q1Var);
        if (strB != null) {
            v2Var.a("\nBid Response:\n");
            v2Var.a(strB);
        }
        String str = q1Var.c() != null ? "AppLovin Ad Report" : "MAX Ad Report";
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType(AssetHelper.DEFAULT_MIME_TYPE).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", v2Var.toString()).setPackage(null), "Share Ad Report");
        if (!z10) {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentCreateChooser);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(MailTo.MAILTO_SCHEME)).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", v2Var.toString()).setPackage("com.google.android.gm");
            String str2 = this.f8148a.n0().getExtraParameters().get("creative_debugger_email_recipients");
            if (StringUtils.isValidString(str2)) {
                intent.putExtra("android.intent.extra.EMAIL", (Serializable) CollectionUtils.explode(str2).toArray());
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        } catch (ActivityNotFoundException unused) {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentCreateChooser);
        }
    }

    public String b(q1 q1Var) {
        com.applovin.impl.sdk.ad.b bVarC = q1Var.c();
        y2 y2VarE = q1Var.e();
        if (bVarC == null) {
            if (y2VarE != null) {
                return y2VarE.D();
            }
            return null;
        }
        return "json_v3!" + Base64.encodeToString(bVarC.getOriginalFullResponse().toString().getBytes(), 2);
    }

    @Override // com.applovin.impl.m1.a
    public void b() {
        if (this.f8156i == 0) {
            this.f8155h = g7.a(TimeUnit.SECONDS.toMillis(3L), this.f8148a, new Runnable() { // from class: com.applovin.impl.p9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9557b.j();
                }
            });
        }
        int i10 = this.f8156i;
        if (i10 % 2 == 0) {
            this.f8156i = i10 + 1;
        }
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!w3.a(obj) || c(obj)) {
                String strB = b(obj);
                synchronized (this.f8151d) {
                    q1 q1Var = (q1) this.f8150c.get(strB);
                    if (q1Var != null) {
                        q1Var.a(obj);
                    } else {
                        this.f8150c.put(strB, new q1(obj, System.currentTimeMillis()));
                    }
                }
            }
        }
    }

    public boolean g() {
        return ((Boolean) this.f8148a.a(x4.f10765k1)).booleanValue() && this.f8148a.n0().isCreativeDebuggerEnabled();
    }

    public void k() {
        m1 m1Var = this.f8154g;
        if (m1Var != null) {
            m1Var.b();
        }
    }

    public void l() {
        if (g()) {
            this.f8157j = ((Boolean) this.f8148a.a(x4.f10774l1)).booleanValue();
            if (this.f8154g == null) {
                this.f8154g = new m1(this.f8148a, this);
            }
            this.f8154g.a();
        }
    }

    public void n() {
        ArrayList arrayList;
        if (h() || !f8147n.compareAndSet(false, true)) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object objA = this.f8148a.H().a();
        if (objA != null) {
            e(objA);
            return;
        }
        synchronized (this.f8151d) {
            arrayList = new ArrayList(this.f8150c.values());
        }
        Collections.reverse(arrayList);
        this.f8152e.a(arrayList, this.f8148a);
        if (!this.f8159l) {
            m();
            this.f8159l = true;
        }
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger...");
        d.a(this.f8149b, MaxCreativeDebuggerActivity.class);
    }
}
