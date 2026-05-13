package com.luck.picture.lib;

import ab.l;
import ab.r;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import ra.p;
import xa.b;
import xa.c;

/* JADX INFO: loaded from: classes4.dex */
public class PictureOnlyCameraFragment extends PictureCommonFragment {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f34713n = PictureOnlyCameraFragment.class.getSimpleName();

    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f34714a;

        public a(String[] strArr) {
            this.f34714a = strArr;
        }

        @Override // xa.c
        public void a() {
            PictureOnlyCameraFragment.this.Q(this.f34714a);
        }

        @Override // xa.c
        public void onGranted() {
            PictureOnlyCameraFragment.this.u0();
        }
    }

    public static PictureOnlyCameraFragment O0() {
        return new PictureOnlyCameraFragment();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void F(LocalMedia localMedia) {
        if (u(localMedia, false) == 0) {
            H();
        } else {
            j0();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public int N() {
        return R$layout.ps_empty;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    public void R(String[] strArr) {
        boolean zC;
        m0(false, null);
        p pVar = PictureSelectionConfig.f34981a1;
        if (pVar != null) {
            zC = pVar.a(this, strArr);
        } else {
            zC = xa.a.c(getContext());
            if (!l.e()) {
                zC = xa.a.i(getContext());
            }
        }
        if (zC) {
            u0();
        } else {
            if (!xa.a.c(getContext())) {
                r.c(getContext(), getString(R$string.ps_camera));
            } else if (!xa.a.i(getContext())) {
                r.c(getContext(), getString(R$string.ps_jurisdiction));
            }
            j0();
        }
        b.f86887a = new String[0];
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            j0();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            if (l.e()) {
                u0();
            } else {
                String[] strArrB = b.b(this.f34945f.f34999b);
                xa.a.b().requestPermissions(this, strArrB, new a(strArrB));
            }
        }
    }
}
