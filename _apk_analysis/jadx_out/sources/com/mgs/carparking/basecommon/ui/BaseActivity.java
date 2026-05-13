package com.mgs.carparking.basecommon.ui;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes9.dex */
public class BaseActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f42524o = false;

    public boolean isDestroyedCompatible() {
        return k();
    }

    @TargetApi(17)
    public final boolean k() {
        return super.isDestroyed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f42524o = true;
        super.onDestroy();
    }
}
