package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u0;
import com.applovin.impl.v0;
import com.applovin.impl.x0;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f10993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10994b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f10996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v0 f10998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u0.c f10999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v0 f11000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Dialog f11001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f11002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f11003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f11004l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0 f10995c = new t0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private u0.b f11005m = new u0.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.applovin.impl.b f11006n = new a();

    public class a extends com.applovin.impl.b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || z0.this.f11000h == null) {
                return;
            }
            if (z0.this.f11001i != null) {
                z0 z0Var = z0.this;
                if (!com.applovin.impl.d.d(z0Var.a(z0Var.f11001i))) {
                    z0.this.f11001i.dismiss();
                }
                z0.this.f11001i = null;
            }
            v0 v0Var = z0.this.f11000h;
            z0.this.f11000h = null;
            z0 z0Var2 = z0.this;
            z0Var2.a(z0Var2.f10998f, v0Var, activity);
        }
    }

    public class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f11008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0 f11009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v0 f11010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f11011d;

        public b(boolean z10, x0 x0Var, v0 v0Var, Activity activity) {
            this.f11008a = z10;
            this.f11009b = x0Var;
            this.f11010c = v0Var;
            this.f11011d = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            z0.this.f11000h = null;
            z0.this.f11001i = null;
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - z0.this.f11004l));
            CollectionUtils.putStringIfValid("details", String.valueOf(this.f11008a), mapHashMap);
            z0.this.f10993a.v0().d(d2.f8023p, mapHashMap);
            v0 v0VarA = z0.this.a(this.f11009b.a());
            if (v0VarA == null) {
                z0.this.a("Destination state for TOS/PP alert is null");
                return;
            }
            z0.this.a(this.f11010c, v0VarA, this.f11011d);
            if (v0VarA.d() != v0.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    public class c extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Uri f11013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f11014b;

        public c(Uri uri, Activity activity) {
            this.f11013a = uri;
            this.f11014b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            n7.a(this.f11013a, this.f11014b, z0.this.f10993a);
        }
    }

    public class d extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Uri f11016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f11017b;

        public d(Uri uri, Activity activity) {
            this.f11016a = uri;
            this.f11017b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            n7.a(this.f11016a, this.f11017b, z0.this.f10993a);
        }
    }

    public class e implements CmpServiceImpl.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f11019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f11020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f11021c;

        public e(long j10, v0 v0Var, Activity activity) {
            this.f11019a = j10;
            this.f11020b = v0Var;
            this.f11021c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            z0.this.f11005m.a(appLovinCmpError);
            z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f11019a);
            z0.this.a(this.f11020b, this.f11021c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    public class f implements CmpServiceImpl.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f11023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f11024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f11025c;

        public f(long j10, v0 v0Var, Activity activity) {
            this.f11023a = j10;
            this.f11024b = v0Var;
            this.f11025c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            z0.this.f11005m.a(appLovinCmpError);
            z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f11023a);
            z0.this.a(this.f11024b, this.f11025c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    public class g implements CmpServiceImpl.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f11027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v0 f11028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f11029c;

        public g(long j10, v0 v0Var, Activity activity) {
            this.f11027a = j10;
            this.f11028b = v0Var;
            this.f11029c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
        public void a(AppLovinCmpError appLovinCmpError) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f11027a));
            if (appLovinCmpError != null) {
                z0.this.f11005m.a(appLovinCmpError);
                mapHashMap.putAll(z0.this.a(appLovinCmpError));
                z0.this.f10993a.v0().d(d2.f8033u, mapHashMap);
            } else {
                z0.this.f11005m.c();
                z0.this.f10993a.v0().d(d2.f8035v, mapHashMap);
            }
            z0.this.b(this.f11028b, this.f11029c);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v0 f11031a;

        public h(v0 v0Var) {
            this.f11031a = v0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z0 z0Var = z0.this;
            z0Var.a(z0Var.f10998f, this.f11031a, z0.this.f10993a.u0());
        }
    }

    public z0(com.applovin.impl.sdk.k kVar) {
        this.f10993a = kVar;
        this.f10994b = ((Integer) kVar.a(x4.f10682a7)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v0 a(int i10) {
        List<v0> list = this.f10996d;
        if (list == null) {
            return null;
        }
        for (v0 v0Var : list) {
            if (i10 == v0Var.c()) {
                return v0Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(AppLovinCmpError appLovinCmpError) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", appLovinCmpError.getMessage());
        CollectionUtils.putStringIfValid("mediated_network_error_message", appLovinCmpError.getCmpMessage(), mapHashMap);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinCmpError.getCode().getValue()), mapHashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(appLovinCmpError.getCmpCode()), mapHashMap);
        return mapHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, Activity activity, boolean z10, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f10994b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
        this.f11004l = SystemClock.elapsedRealtime();
        this.f10993a.v0().d(d2.f8021o, CollectionUtils.hashMap("details", String.valueOf(z10)));
    }

    private void a(v0 v0Var) {
        this.f10995c.b();
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(v0Var), TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(v0 v0Var, final Activity activity) {
        boolean z10;
        if (v0Var == null) {
            a("Consent flow state is null");
            return;
        }
        this.f10993a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f10993a.O().a("ConsentFlowStateMachine", "Transitioning to state: " + v0Var);
        }
        long jElapsedRealtime = this.f10998f != null ? SystemClock.elapsedRealtime() - this.f11003k : 0L;
        this.f11003k = SystemClock.elapsedRealtime();
        this.f10995c.a(v0Var, jElapsedRealtime);
        if (v0Var.d() == v0.b.ALERT) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            }
            this.f10993a.F().trackEvent("cf_start");
            w0 w0Var = (w0) v0Var;
            this.f11000h = w0Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            Uri uriH = this.f10993a.x().h();
            final boolean z11 = uriH != null;
            for (x0 x0Var : w0Var.f()) {
                b bVar = new b(z11, x0Var, v0Var, activity);
                if (x0Var.c() == x0.a.POSITIVE) {
                    builder.setPositiveButton(x0Var.d(), bVar);
                } else if (x0Var.c() == x0.a.NEGATIVE) {
                    builder.setNegativeButton(x0Var.d(), bVar);
                } else {
                    builder.setNeutralButton(x0Var.d(), bVar);
                }
            }
            String strH = w0Var.h();
            SpannableString spannableString = null;
            if (StringUtils.isValidString(strH)) {
                spannableString = new SpannableString(strH);
                String strA = com.applovin.impl.sdk.k.a(R.string.applovin_terms_of_service_text);
                String strA2 = com.applovin.impl.sdk.k.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(strH, Arrays.asList(strA, strA2))) {
                    if (z11) {
                        StringUtils.addLinks(spannableString, Pattern.compile(strA), new c(uriH, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(strA2), new d(this.f10993a.x().f(), activity), true);
                }
            }
            final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(w0Var.g()).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.jg
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f8583a.a(alertDialogCreate, activity, z11, dialogInterface);
                }
            });
            this.f11001i = alertDialogCreate;
            alertDialogCreate.show();
            this.f11005m.d();
            return;
        }
        if (v0Var.d() == v0.b.POST_ALERT) {
            if (!this.f10993a.x().k() || !this.f10993a.x().m()) {
                a(v0Var, activity, Boolean.FALSE);
                return;
            } else if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            } else {
                this.f10993a.v0().a(d2.f8025q);
                this.f10993a.s().loadCmp(activity, new e(SystemClock.elapsedRealtime(), v0Var, activity));
                return;
            }
        }
        if (v0Var.d() == v0.b.EVENT) {
            y0 y0Var = (y0) v0Var;
            String strG = y0Var.g();
            Map<String, ?> mapF = y0Var.f();
            if (mapF == null) {
                mapF = new HashMap<>(1);
            }
            mapF.put("flow_type", "unified");
            this.f10993a.F().trackEvent(strG, mapF);
            b(y0Var, activity);
            return;
        }
        if (v0Var.d() == v0.b.CMP_LOAD) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            } else if (this.f10993a.x().m()) {
                this.f10993a.s().preloadCmp(activity);
                a(v0Var, activity, Boolean.FALSE);
                return;
            } else {
                this.f10993a.v0().a(d2.f8025q);
                this.f10993a.s().loadCmp(activity, new f(SystemClock.elapsedRealtime(), v0Var, activity));
                return;
            }
        }
        if (v0Var.d() == v0.b.CMP_SHOW) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            }
            if (!this.f10993a.x().m()) {
                this.f10993a.F().trackEvent("cf_start");
            }
            this.f10993a.v0().a(d2.f8031t);
            this.f10993a.s().showCmp(activity, new g(SystemClock.elapsedRealtime(), v0Var, activity));
            return;
        }
        if (v0Var.d() != v0.b.DECISION) {
            if (v0Var.d() == v0.b.REINIT) {
                b();
                return;
            }
            a("Invalid consent flow destination state: " + v0Var);
            return;
        }
        v0.a aVarA = v0Var.a();
        if (aVarA == v0.a.IS_AL_GDPR) {
            boolean zK = this.f10993a.x().k();
            this.f10995c.a(v0Var, zK, jElapsedRealtime);
            a(v0Var, activity, Boolean.valueOf(zK));
        } else if (aVarA == v0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
            z10 = (this.f10993a.z0() ^ true) || ((Boolean) this.f10993a.a(z4.f11055t, Boolean.FALSE)).booleanValue();
            this.f10995c.a(v0Var, z10, jElapsedRealtime);
            a(v0Var, activity, Boolean.valueOf(z10));
        } else if (aVarA == v0.a.HAS_TERMS_OF_SERVICE_URI) {
            z10 = this.f10993a.x().h() != null;
            this.f10995c.a(v0Var, z10, jElapsedRealtime);
            a(v0Var, activity, Boolean.valueOf(z10));
        } else {
            a("Invalid consent flow decision type: " + aVarA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v0 v0Var, Activity activity, Boolean bool) {
        a(v0Var, a(v0Var.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v0 v0Var, v0 v0Var2, Activity activity) {
        this.f10998f = v0Var;
        c(v0Var2, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinCmpError appLovinCmpError, long j10) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(j10));
        if (appLovinCmpError == null) {
            this.f10993a.v0().d(d2.f8027r, mapHashMap);
        } else {
            mapHashMap.putAll(a(appLovinCmpError));
            this.f10993a.v0().d(d2.f8029s, mapHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        l1.a(str, new Object[0]);
        this.f10993a.D().a(d2.O0, str, CollectionUtils.hashMap("details", "Last started states: " + this.f10997e + "\nLast successful state: " + this.f10998f));
        this.f10995c.b(str);
        u0.b bVar = this.f11005m;
        if (bVar != null) {
            bVar.a(new s0(s0.f9799e, str));
        }
        b();
    }

    private void b() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f11002j));
        CollectionUtils.putStringIfValid("details", this.f10995c.toString(), mapHashMap);
        this.f10993a.v0().d(d2.f8037w, mapHashMap);
        this.f10996d = null;
        this.f10998f = null;
        this.f11002j = 0L;
        this.f11003k = 0L;
        this.f11004l = 0L;
        this.f10995c.a();
        this.f10993a.e().b(this.f11006n);
        u0.c cVar = this.f10999g;
        if (cVar != null) {
            cVar.a(this.f11005m);
            this.f10999g = null;
        }
        this.f11005m = new u0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(v0 v0Var, Activity activity) {
        a(v0Var, activity, (Boolean) null);
    }

    private void c(final v0 v0Var, final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.kg
            @Override // java.lang.Runnable
            public final void run() {
                this.f8633b.a(v0Var, activity);
            }
        });
    }

    public void a(int i10, Activity activity, u0.c cVar) {
        if (this.f10996d != null) {
            this.f10993a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10993a.O().a("ConsentFlowStateMachine", "Unable to start states: " + this.f10996d);
            }
            this.f10993a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10993a.O().a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.f10996d);
            }
            cVar.a(new u0.b(new s0(s0.f9798d, "Consent flow is already in progress.")));
            return;
        }
        List listA = a1.a(this.f10993a);
        this.f10996d = listA;
        this.f10997e = String.valueOf(listA);
        this.f10999g = cVar;
        v0 v0VarA = a(i10);
        this.f10993a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f10993a.O().a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.f10996d + "\nInitial state: " + v0VarA);
        }
        com.applovin.impl.sdk.k.a(activity).a(this.f11006n);
        this.f10993a.v0().a(d2.f8019n);
        this.f11002j = SystemClock.elapsedRealtime();
        a((v0) null, v0VarA, activity);
    }

    public void a(Activity activity, u0.c cVar) {
        a(v0.a.IS_AL_GDPR.b(), activity, cVar);
    }

    public boolean a() {
        return this.f10996d != null;
    }
}
