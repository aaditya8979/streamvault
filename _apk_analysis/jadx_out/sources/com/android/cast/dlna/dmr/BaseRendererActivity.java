package com.android.cast.dlna.dmr;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import bo.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.b;
import tn.p;

/* JADX INFO: compiled from: BaseRendererActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseRendererActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public DLNARendererService f6999o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ServiceConnection f7000p = new a();

    /* JADX INFO: compiled from: BaseRendererActivity.kt */
    public static final class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            p.k(componentName, "name");
            p.k(iBinder, NotificationCompat.CATEGORY_SERVICE);
            BaseRendererActivity.this.f6999o = ((b) iBinder).a();
            BaseRendererActivity.this.onServiceConnected();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            p.k(componentName, "name");
            BaseRendererActivity.this.f6999o = null;
        }
    }

    @Nullable
    public final CastAction k() {
        return (CastAction) getIntent().getParcelableExtra("extra.castAction");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        CastAction castActionK = k();
        String strC = castActionK != null ? castActionK.c() : null;
        if (strC == null || d0.u0(strC)) {
            bindService(new Intent(this, (Class<?>) DLNARendererService.class), this.f7000p, 1);
        } else {
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unbindService(this.f7000p);
        DLNARendererService dLNARendererService = this.f6999o;
        if (dLNARendererService != null) {
            dLNARendererService.e(null);
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        p.k(intent, "newIntent");
        super.onNewIntent(intent);
        setIntent(intent);
        CastAction castActionK = k();
        String strC = castActionK != null ? castActionK.c() : null;
        if (strC == null || d0.u0(strC)) {
            return;
        }
        finish();
    }

    public void onServiceConnected() {
    }
}
