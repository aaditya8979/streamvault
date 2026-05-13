package com.yandex.mobile.ads.features.debugpanel.ui;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import bn.g;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.features.debugpanel.common.BaseActivity;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import java.util.Iterator;
import kotlin.b;
import p000do.i;
import p000do.l0;
import yads.ac1;
import yads.b90;
import yads.cc1;
import yads.e90;
import yads.et;
import yads.kc1;
import yads.m70;
import yads.o90;
import yads.q90;
import yads.vb1;
import yads.xb1;
import yads.xk3;
import yads.y80;
import yads.z70;
import yads.zb1;

/* JADX INFO: loaded from: classes4.dex */
public final class IntegrationInspectorActivity extends BaseActivity<kc1> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f59186d = b.b(new vb1(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f59187e = b.b(new cc1(this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f59188f = b.b(new ac1(this));

    public static final m70 a(IntegrationInspectorActivity integrationInspectorActivity) {
        return (m70) integrationInspectorActivity.f59186d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IntegrationInspectorActivity integrationInspectorActivity, View view) {
        integrationInspectorActivity.b().a(e90.f89170a);
    }

    public static final o90 b(IntegrationInspectorActivity integrationInspectorActivity) {
        return (o90) integrationInspectorActivity.f59188f.getValue();
    }

    public static final q90 c(IntegrationInspectorActivity integrationInspectorActivity) {
        return (q90) integrationInspectorActivity.f59187e.getValue();
    }

    private final void d() {
        ((ImageButton) findViewById(R$id.toolbar_share_button)).setOnClickListener(new View.OnClickListener() { // from class: bh.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntegrationInspectorActivity.a(this.f5589b, view);
            }
        });
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity
    public final xk3 c() {
        return ((m70) this.f59186d.getValue()).a();
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f53151y, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b().a(b90.f87949a);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_debug);
        d();
        b().a(y80.f97023a);
        l0 l0VarA = a();
        i.d(l0VarA, null, null, new xb1(this, null), 3, null);
        i.d(l0VarA, null, null, new zb1(this, null), 3, null);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    public final void onDestroy() {
        z70 z70Var = (z70) ((m70) this.f59186d.getValue()).f92293r.getValue();
        Iterator it = z70Var.f97415b.iterator();
        while (it.hasNext()) {
            ((et) it.next()).cancel();
        }
        z70Var.f97415b.clear();
        super.onDestroy();
    }
}
