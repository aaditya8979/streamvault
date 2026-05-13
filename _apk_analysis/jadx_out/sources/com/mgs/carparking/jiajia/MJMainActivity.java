package com.mgs.carparking.jiajia;

import android.os.Bundle;
import bm.a;
import bm.b;
import com.dramarush.shortin.R;
import com.mgs.carparking.basecommon.ui.BarActivity;
import dm.g;
import ic.c0;
import zp.n;

/* JADX INFO: loaded from: classes10.dex */
public class MJMainActivity extends BarActivity {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f43872v;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(c0 c0Var) throws Exception {
        setDrawerHeaderAccount();
    }

    public void m(b bVar) {
        if (this.f43872v == null) {
            this.f43872v = new a();
        }
        this.f43872v.a(bVar);
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_majia_main, false);
        this.f43872v = new a();
        n.a(this);
        m(op.a.a().d(c0.class).subscribe(new g() { // from class: dc.a
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f59741b.n((c0) obj);
            }
        }));
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f43872v.dispose();
    }

    public void setDrawerHeaderAccount() {
    }
}
