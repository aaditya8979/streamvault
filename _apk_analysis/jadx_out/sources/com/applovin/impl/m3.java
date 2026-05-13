package com.applovin.impl;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.webkit.internal.AssetHelper;
import com.applovin.impl.d;
import com.applovin.impl.o3;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m3 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o3 f8754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataSetObserver f8755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f8756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ListView f8757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.a f8758e;

    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            m3.this.a();
            m3 m3Var = m3.this;
            m3Var.b((Context) m3Var);
        }
    }

    public class b implements s2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.applovin.impl.c f8760a;

        public class a implements d.b {
            public a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(m3.this.f8754a.t());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.m3$b$b, reason: collision with other inner class name */
        public class C0146b implements d.b {
            public C0146b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(m3.this.f8754a.d(), m3.this.f8754a.t());
            }
        }

        public class c implements d.b {
            public c() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(m3.this.f8754a.d(), m3.this.f8754a.t());
            }
        }

        public class d implements d.b {
            public d() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(m3.this.f8754a.f(), false, m3.this.f8754a.t());
            }
        }

        public class e implements d.b {
            public e() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(m3.this.f8754a.k(), m3.this.f8754a.w(), m3.this.f8754a.t());
            }
        }

        public class f implements d.b {
            public f() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(m3.this.f8754a.v(), m3.this.f8754a.t());
            }
        }

        public class g implements d.b {
            public g() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(m3.this.f8754a.o(), true, m3.this.f8754a.t());
            }
        }

        public class h implements d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r2 f8769a;

            public h(r2 r2Var) {
                this.f8769a = r2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((z3) this.f8769a).r());
            }
        }

        public b(com.applovin.impl.c cVar) {
            this.f8760a = cVar;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            int iB = j2Var.b();
            if (iB == o3.e.APP_INFO.ordinal()) {
                n7.a(r2Var.c(), r2Var.b(), m3.this);
                return;
            }
            if (iB == o3.e.MAX.ordinal()) {
                if (m3.this.f8754a.a(r2Var)) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerUnifiedFlowActivity.class, this.f8760a, new a());
                    return;
                } else {
                    n7.a(r2Var.c(), r2Var.b(), m3.this);
                    return;
                }
            }
            if (iB == o3.e.PRIVACY.ordinal()) {
                if (j2Var.a() != o3.d.CMP.ordinal()) {
                    if (j2Var.a() == o3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                        com.applovin.impl.d.a(m3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f8760a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(m3.this.f8754a.t().r0().j())) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerTcfInfoListActivity.class, this.f8760a, new C0146b());
                    return;
                } else {
                    n7.a(r2Var.c(), r2Var.b(), m3.this);
                    return;
                }
            }
            if (iB != o3.e.ADS.ordinal()) {
                if ((iB == o3.e.INCOMPLETE_NETWORKS.ordinal() || iB == o3.e.COMPLETED_NETWORKS.ordinal()) && (r2Var instanceof z3)) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerDetailActivity.class, this.f8760a, new h(r2Var));
                    return;
                }
                return;
            }
            if (j2Var.a() == o3.b.AD_UNITS.ordinal()) {
                if (m3.this.f8754a.f().size() > 0) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerAdUnitsListActivity.class, this.f8760a, new d());
                    return;
                } else {
                    n7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", m3.this);
                    return;
                }
            }
            if (j2Var.a() == o3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (m3.this.f8754a.k().size() <= 0 && m3.this.f8754a.w().size() <= 0) {
                    n7.a("Complete Integrations", "Please complete integrations in order to access this.", m3.this);
                    return;
                } else if (m3.this.f8754a.t().s0().c()) {
                    n7.a("Restart Required", r2Var.b(), m3.this);
                    return;
                } else {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerTestLiveNetworkActivity.class, this.f8760a, new e());
                    return;
                }
            }
            if (j2Var.a() != o3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (j2Var.a() == o3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerAdUnitsListActivity.class, this.f8760a, new g());
                }
            } else if (!m3.this.f8754a.t().s0().c()) {
                m3.this.getSdk().s0().a();
                n7.a("Restart Required", r2Var.b(), m3.this);
            } else if (m3.this.f8754a.v().size() > 0) {
                com.applovin.impl.d.a(m3.this, MaxDebuggerTestModeNetworkActivity.class, this.f8760a, new f());
            } else {
                n7.a("Complete Integrations", "Please complete integrations in order to access this.", m3.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.a aVar = this.f8758e;
        if (aVar != null) {
            aVar.b();
            this.f8756c.removeView(this.f8758e);
            this.f8758e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        n7.a(this.f8754a.i(), this.f8754a.h(), context);
    }

    private void b() {
        o3 o3Var = this.f8754a;
        if (o3Var == null) {
            return;
        }
        String strP = o3Var.p();
        if (TextUtils.isEmpty(strP)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", strP);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context) {
        if (!StringUtils.isValidString(this.f8754a.h()) || this.f8754a.x()) {
            return;
        }
        this.f8754a.b(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.hc
            @Override // java.lang.Runnable
            public final void run() {
                this.f8442b.a(context);
            }
        });
    }

    private void c() {
        a();
        com.applovin.impl.a aVar = new com.applovin.impl.a(this, 50, R.attr.progressBarStyleLarge);
        this.f8758e = aVar;
        aVar.setColor(-3355444);
        this.f8756c.addView(this.f8758e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f8756c.bringChildToFront(this.f8758e);
        this.f8758e.a();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53127a);
        context.startActivity(intent);
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f53127a, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        o3 o3Var = this.f8754a;
        if (o3Var != null) {
            return o3Var.t();
        }
        return null;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.f8756c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.f8757d = listView;
        listView.setAdapter((ListAdapter) this.f8754a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        o3 o3Var = this.f8754a;
        if (o3Var != null) {
            o3Var.unregisterDataSetObserver(this.f8755b);
            this.f8754a.a((s2.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        o3 o3Var = this.f8754a;
        if (o3Var == null || o3Var.y()) {
            return;
        }
        c();
    }

    public void setListAdapter(o3 o3Var, c cVar) {
        DataSetObserver dataSetObserver;
        o3 o3Var2 = this.f8754a;
        if (o3Var2 != null && (dataSetObserver = this.f8755b) != null) {
            o3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f8754a = o3Var;
        this.f8755b = new a();
        b((Context) this);
        this.f8754a.registerDataSetObserver(this.f8755b);
        this.f8754a.a(new b(cVar));
    }
}
