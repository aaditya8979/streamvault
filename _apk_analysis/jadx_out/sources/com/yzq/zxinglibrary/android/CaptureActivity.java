package com.yzq.zxinglibrary.android;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import com.ironsource.C3978d4;
import com.safedk.android.utils.Logger;
import com.yzq.zxinglibrary.R$drawable;
import com.yzq.zxinglibrary.R$id;
import com.yzq.zxinglibrary.R$layout;
import com.yzq.zxinglibrary.R$string;
import com.yzq.zxinglibrary.bean.ZxingConfig;
import com.yzq.zxinglibrary.view.ViewfinderView;
import eh.b;
import eh.c;
import gh.d;
import gh.e;
import gh.g;
import java.io.IOException;
import k8.i;

/* JADX INFO: loaded from: classes12.dex */
public class CaptureActivity extends AppCompatActivity implements SurfaceHolder.Callback, View.OnClickListener {
    public static final String C = CaptureActivity.class.getSimpleName();
    public CaptureActivityHandler A;
    public SurfaceHolder B;
    public ZxingConfig config;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SurfaceView f59321o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewfinderView f59322p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AppCompatImageView f59323q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f59324r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AppCompatImageView f59325s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayoutCompat f59326t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinearLayoutCompat f59327u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayoutCompat f59328v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f59329w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f59330x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public eh.a f59331y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public fh.c f59332z;

    public class a implements d {
        public a() {
        }

        @Override // gh.d
        public void a(i iVar) {
            CaptureActivity.this.handleDecode(iVar);
        }

        @Override // gh.d
        public void b() {
            Toast.makeText(CaptureActivity.this, R$string.scan_failed_tip, 0).show();
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public static boolean isSupportCameraLedFlash(PackageManager packageManager) {
        FeatureInfo[] systemAvailableFeatures;
        if (packageManager != null && (systemAvailableFeatures = packageManager.getSystemAvailableFeatures()) != null) {
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                if (featureInfo != null && "android.hardware.camera.flash".equals(featureInfo.name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity componentActivity, Intent intent, int i10) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (intent == null) {
            return;
        }
        componentActivity.startActivityForResult(intent, i10);
    }

    public void drawViewfinder() {
        this.f59322p.g();
    }

    public fh.c getCameraManager() {
        return this.f59332z;
    }

    public Handler getHandler() {
        return this.A;
    }

    public ViewfinderView getViewfinderView() {
        return this.f59322p;
    }

    public void handleDecode(i iVar) {
        this.f59330x.e();
        this.f59331y.d();
        Intent intent = getIntent();
        intent.putExtra("codedContent", iVar.f());
        setResult(-1, intent);
        finish();
    }

    public final void k() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("扫一扫");
        builder.setMessage(getString(R$string.msg_camera_framework_bug));
        builder.setPositiveButton(R$string.button_ok, new b(this));
        builder.setOnCancelListener(new b(this));
        builder.show();
    }

    public final void l(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalStateException("No SurfaceHolder provided");
        }
        if (this.f59332z.e()) {
            return;
        }
        try {
            this.f59332z.f(surfaceHolder);
            if (this.A == null) {
                this.A = new CaptureActivityHandler(this, this.f59332z);
            }
        } catch (IOException e10) {
            Log.w(C, e10);
            k();
        } catch (RuntimeException e11) {
            Log.w(C, "Unexpected error initializing camera", e11);
            k();
        }
    }

    public final void m() {
        SurfaceView surfaceView = (SurfaceView) findViewById(R$id.preview_view);
        this.f59321o = surfaceView;
        surfaceView.setOnClickListener(this);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R$id.viewfinder_view);
        this.f59322p = viewfinderView;
        viewfinderView.setZxingConfig(this.config);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R$id.backIv);
        this.f59325s = appCompatImageView;
        appCompatImageView.setOnClickListener(this);
        this.f59323q = (AppCompatImageView) findViewById(R$id.flashLightIv);
        this.f59324r = (TextView) findViewById(R$id.flashLightTv);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) findViewById(R$id.flashLightLayout);
        this.f59326t = linearLayoutCompat;
        linearLayoutCompat.setOnClickListener(this);
        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) findViewById(R$id.albumLayout);
        this.f59327u = linearLayoutCompat2;
        linearLayoutCompat2.setOnClickListener(this);
        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) findViewById(R$id.bottomLayout);
        this.f59328v = linearLayoutCompat3;
        n(linearLayoutCompat3, this.config.isShowbottomLayout());
        n(this.f59326t, this.config.isShowFlashLight());
        n(this.f59327u, this.config.isShowAlbum());
        if (isSupportCameraLedFlash(getPackageManager())) {
            this.f59326t.setVisibility(0);
        } else {
            this.f59326t.setVisibility(8);
        }
    }

    public final void n(View view, boolean z10) {
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10 && i11 == -1) {
            new e(g.b(this, intent.getData()), new a()).run();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R$id.flashLightLayout) {
            this.f59332z.k(this.A);
            return;
        }
        if (id2 != R$id.albumLayout) {
            if (id2 == R$id.backIv) {
                finish();
            }
        } else {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.PICK");
            intent.setType("image/*");
            safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, intent, 10);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.addFlags(128);
        window.setStatusBarColor(ViewCompat.MEASURED_STATE_MASK);
        try {
            this.config = (ZxingConfig) getIntent().getExtras().get("zxingConfig");
        } catch (Exception e10) {
            Log.i("config", e10.toString());
        }
        if (this.config == null) {
            this.config = new ZxingConfig();
        }
        setContentView(R$layout.activity_capture);
        m();
        this.f59329w = false;
        this.f59330x = new c(this);
        eh.a aVar = new eh.a(this);
        this.f59331y = aVar;
        aVar.e(this.config.isPlayBeep());
        this.f59331y.f(this.config.isShake());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f59330x.h();
        this.f59322p.j();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Log.i("CaptureActivity", C3978d4.i.f31364t0);
        CaptureActivityHandler captureActivityHandler = this.A;
        if (captureActivityHandler != null) {
            captureActivityHandler.a();
            this.A = null;
        }
        this.f59330x.f();
        this.f59331y.close();
        this.f59332z.b();
        if (!this.f59329w) {
            this.B.removeCallback(this);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        fh.c cVar = new fh.c(getApplication(), this.config);
        this.f59332z = cVar;
        this.f59322p.setCameraManager(cVar);
        this.A = null;
        SurfaceHolder holder = this.f59321o.getHolder();
        this.B = holder;
        if (this.f59329w) {
            l(holder);
        } else {
            holder.addCallback(this);
        }
        this.f59331y.h();
        this.f59330x.g();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f59329w) {
            return;
        }
        this.f59329w = true;
        l(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f59329w = false;
    }

    public void switchFlashImg(int i10) {
        if (i10 == 8) {
            this.f59323q.setImageResource(R$drawable.ic_open);
            this.f59324r.setText(R$string.close_flash);
        } else {
            this.f59323q.setImageResource(R$drawable.ic_close);
            this.f59324r.setText(R$string.open_flash);
        }
    }
}
