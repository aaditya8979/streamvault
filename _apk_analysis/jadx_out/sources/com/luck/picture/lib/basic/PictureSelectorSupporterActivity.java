package com.luck.picture.lib.basic;

import ab.q;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.luck.picture.lib.PictureSelectorFragment;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.SelectMainStyle;
import la.f;
import sa.b;

/* JADX INFO: loaded from: classes3.dex */
public class PictureSelectorSupporterActivity extends AppCompatActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(f.a(context, PictureSelectionConfig.e().C, PictureSelectionConfig.e().D));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, PictureSelectionConfig.T0.e().f35155c);
    }

    public void initAppLanguage() {
        PictureSelectionConfig pictureSelectionConfigE = PictureSelectionConfig.e();
        int i10 = pictureSelectionConfigE.C;
        if (i10 == -2 || pictureSelectionConfigE.f35001c) {
            return;
        }
        b.d(this, i10, pictureSelectionConfigE.D);
    }

    public final void k() {
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
        int iR = selectMainStyleC.R();
        int iB = selectMainStyleC.B();
        boolean zU = selectMainStyleC.U();
        if (!q.c(iR)) {
            iR = ContextCompat.getColor(this, R$color.ps_color_grey);
        }
        if (!q.c(iB)) {
            iB = ContextCompat.getColor(this, R$color.ps_color_grey);
        }
        qa.a.a(this, iR, iB, zU);
    }

    public final void l() {
        la.a.a(this, PictureSelectorFragment.C, PictureSelectorFragment.d2());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        initAppLanguage();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        k();
        setContentView(R$layout.ps_activity_container);
        l();
    }
}
