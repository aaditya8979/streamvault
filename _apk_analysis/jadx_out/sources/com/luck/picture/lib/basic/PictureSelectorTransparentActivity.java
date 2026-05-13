package com.luck.picture.lib.basic;

import ab.q;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.luck.picture.lib.PictureOnlyCameraFragment;
import com.luck.picture.lib.PictureSelectorPreviewFragment;
import com.luck.picture.lib.PictureSelectorSystemFragment;
import com.luck.picture.lib.R$anim;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.SelectMainStyle;
import java.util.ArrayList;
import ra.i;

/* JADX INFO: loaded from: classes11.dex */
public class PictureSelectorTransparentActivity extends AppCompatActivity {
    @Override // android.app.Activity
    public void finish() {
        super.finish();
        PictureSelectionConfig pictureSelectionConfigE = PictureSelectionConfig.e();
        if (getIntent().getIntExtra("com.luck.picture.lib.mode_type_source", 0) != 2 || pictureSelectionConfigE.M) {
            overridePendingTransition(0, R$anim.ps_anim_fade_out);
        } else {
            overridePendingTransition(0, PictureSelectionConfig.T0.e().f35155c);
        }
    }

    public final void k() {
        if (PictureSelectionConfig.T0 == null) {
            PictureSelectionConfig.e();
        }
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

    public final boolean l() {
        return getIntent().getIntExtra("com.luck.picture.lib.mode_type_source", 0) == 2;
    }

    @SuppressLint({"RtlHardcoded"})
    public final void m() {
        Window window = getWindow();
        window.setGravity(51);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        attributes.height = 1;
        attributes.width = 1;
        window.setAttributes(attributes);
    }

    public final void n() {
        String strA1;
        PictureSelectorPreviewFragment pictureSelectorPreviewFragmentP1;
        Fragment fragmentO0;
        int intExtra = getIntent().getIntExtra("com.luck.picture.lib.mode_type_source", 0);
        if (intExtra == 1) {
            strA1 = PictureSelectorSystemFragment.f34816r;
            fragmentO0 = PictureSelectorSystemFragment.d1();
        } else if (intExtra == 2) {
            i iVar = PictureSelectionConfig.Y0;
            PictureSelectorPreviewFragment pictureSelectorPreviewFragmentA = iVar != null ? iVar.a() : null;
            if (pictureSelectorPreviewFragmentA != null) {
                pictureSelectorPreviewFragmentP1 = pictureSelectorPreviewFragmentA;
                strA1 = pictureSelectorPreviewFragmentA.A1();
            } else {
                strA1 = PictureSelectorPreviewFragment.Q;
                pictureSelectorPreviewFragmentP1 = PictureSelectorPreviewFragment.P1();
            }
            int intExtra2 = getIntent().getIntExtra("com.luck.picture.lib.current_preview_position", 0);
            ArrayList<LocalMedia> arrayList = new ArrayList<>(va.a.m());
            pictureSelectorPreviewFragmentP1.d2(intExtra2, arrayList.size(), arrayList, getIntent().getBooleanExtra("com.luck.picture.lib.external_preview_display_delete", false));
            fragmentO0 = pictureSelectorPreviewFragmentP1;
        } else {
            strA1 = PictureOnlyCameraFragment.f34713n;
            fragmentO0 = PictureOnlyCameraFragment.O0();
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(strA1);
        if (fragmentFindFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        }
        la.a.b(supportFragmentManager, strA1, fragmentO0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        k();
        setContentView(R$layout.ps_empty);
        if (!l()) {
            m();
        }
        n();
    }
}
