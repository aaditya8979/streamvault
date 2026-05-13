package com.applovin.impl;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.d;
import com.applovin.impl.e3;
import com.applovin.impl.g3;
import com.applovin.impl.s2;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes8.dex */
public abstract class f3 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g3 f8269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListView f8270b;

    public class a implements s2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e3 f8271a;

        /* JADX INFO: renamed from: com.applovin.impl.f3$a$a, reason: collision with other inner class name */
        public class C0144a implements d.b {
            public C0144a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f8271a);
            }
        }

        public a(e3 e3Var) {
            this.f8271a = e3Var;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            if (j2Var.b() != g3.a.TEST_ADS.ordinal()) {
                n7.a(r2Var.c(), r2Var.b(), f3.this);
                return;
            }
            com.applovin.impl.sdk.k kVarO = this.f8271a.o();
            e3.b bVarY = this.f8271a.y();
            if (!f3.this.f8269a.a(j2Var)) {
                n7.a(r2Var.c(), r2Var.b(), f3.this);
                return;
            }
            if (e3.b.READY == bVarY) {
                d.a(f3.this, MaxDebuggerMultiAdActivity.class, kVarO.e(), new C0144a());
            } else if (e3.b.DISABLED != bVarY) {
                n7.a(r2Var.c(), r2Var.b(), f3.this);
            } else {
                kVarO.s0().a();
                n7.a(r2Var.c(), r2Var.b(), f3.this);
            }
        }
    }

    public f3() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f53127a, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        g3 g3Var = this.f8269a;
        if (g3Var != null) {
            return g3Var.h().o();
        }
        return null;
    }

    public void initialize(e3 e3Var) {
        setTitle(e3Var.g());
        g3 g3Var = new g3(e3Var, this);
        this.f8269a = g3Var;
        g3Var.a(new a(e3Var));
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f8270b = listView;
        listView.setAdapter((ListAdapter) this.f8269a);
    }

    @Override // com.applovin.impl.n3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f8269a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f8269a.k();
            this.f8269a.c();
        }
    }
}
