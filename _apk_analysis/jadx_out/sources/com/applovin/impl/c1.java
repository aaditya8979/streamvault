package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.d;
import com.applovin.impl.d1;
import com.applovin.impl.s2;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c1 extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d1 f7908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FrameLayout f7909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ListView f7910c;

    public class a implements s2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f7911a;

        /* JADX INFO: renamed from: com.applovin.impl.c1$a$a, reason: collision with other inner class name */
        public class C0142a implements d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j2 f7913a;

            public C0142a(j2 j2Var) {
                this.f7913a = j2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((q1) c1.this.f7908a.d().get(this.f7913a.a()), c1.this.f7908a.e());
            }
        }

        public a(c cVar) {
            this.f7911a = cVar;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            if (j2Var.b() != d1.a.RECENT_ADS.ordinal()) {
                return;
            }
            d.a(c1.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f7911a, new C0142a(j2Var));
        }
    }

    private void a(int i10) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i10);
        this.f7909b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f7909b.bringChildToFront(textView);
    }

    public void a(d1 d1Var, c cVar) {
        this.f7908a = d1Var;
        d1Var.a(new a(cVar));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f53127a, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f7909b = (FrameLayout) findViewById(android.R.id.content);
        this.f7910c = (ListView) findViewById(R.id.listView);
        e8.a(this.f7909b, com.applovin.impl.sdk.k.C0);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d1 d1Var = this.f7908a;
        if (d1Var != null) {
            d1Var.a((s2.a) null);
            this.f7908a.g();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        d1 d1Var = this.f7908a;
        if (d1Var == null) {
            finish();
            return;
        }
        this.f7910c.setAdapter((ListAdapter) d1Var);
        d1 d1Var2 = this.f7908a;
        if (d1Var2 != null && !d1Var2.e().y().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        d1 d1Var3 = this.f7908a;
        if (d1Var3 == null || !d1Var3.f()) {
            return;
        }
        a(R.string.applovin_creative_debugger_no_ads_text);
    }
}
