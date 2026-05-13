package com.mgs.carparking.shorttk;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import androidx.lifecycle.Observer;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityMainBinding;
import com.mgs.carparking.netbean.TKBean;
import com.pp.hls;
import ed.l0;
import ed.x;
import java.io.IOException;
import me.goldze.mvvmhabit.base.BaseApplication;
import okhttp3.Response;
import zp.n;
import zp.r;

/* JADX INFO: loaded from: classes2.dex */
public class ShortTkActivity extends BaseActivity<ActivityMainBinding, SHORTTKVIEWMODEL> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TKBean f44392t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f44393u;

    public class a implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f44394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f44395b;

        public a(int i10, String str) {
            this.f44394a = i10;
            this.f44395b = str;
        }

        @Override // ed.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // ed.x.b
        public void b(Response response) {
            try {
                ((SHORTTKVIEWMODEL) ShortTkActivity.this.f42501p).m(this.f44394a, this.f44395b, response.body().string(), 0);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(TKBean tKBean) {
        this.f44392t = tKBean;
        getSupportFragmentManager().beginTransaction().replace(R.id.main, TKFragment.newInstance(true, this.f44392t, 0)).commit();
    }

    public void getSign(int i10) {
        if (AppApplication.port > 0) {
            String str = System.currentTimeMillis() + "";
            x.a("http://127.0.0.1:" + AppApplication.port + "/control?msg=verify&device_id=" + ec.a.a(r.b()) + i10 + "&ts=" + str, new a(i10, str));
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_short_tk;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        n.a(this);
        this.f44392t = (TKBean) getIntent().getSerializableExtra("netcineVarVideoBean");
        String stringExtra = getIntent().getStringExtra("netcineVarVideoId");
        this.f44393u = stringExtra;
        if (this.f44392t == null) {
            loadP2pSdk(Integer.parseInt(stringExtra));
            return;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.main, TKFragment.newInstance(true, this.f44392t, getIntent().getIntExtra("netcineVarVideoPos", -1))).commit();
        loadP2pSdk(this.f44392t.getNetCineVarListVod_id());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public SHORTTKVIEWMODEL initViewModel() {
        return new SHORTTKVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((SHORTTKVIEWMODEL) this.f42501p).f44390f.observe(this, new Observer() { // from class: jc.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f72392b.p((TKBean) obj);
            }
        });
    }

    public void loadP2pSdk(int i10) {
        if (AppApplication.port <= 0) {
            hls hlsVar = new hls();
            String absolutePath = getExternalFilesDir("").getAbsolutePath();
            if (Environment.getExternalStorageDirectory() != null) {
                absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            }
            AppApplication.port = hlsVar.load("c456f75b75d7a1b0b2e0fa85833292a6", "com.dramarush.shortin", "63", absolutePath, getExternalFilesDir("").getAbsolutePath(), l0.J(), "1");
            Log.i("wangyi", "端口号为：" + AppApplication.port);
            getSign(i10);
        }
        getSign(i10);
    }
}
