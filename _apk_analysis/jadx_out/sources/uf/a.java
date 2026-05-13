package uf;

import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: compiled from: ImmersiveManager.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {
    public static void a(AppCompatActivity appCompatActivity, int i10, int i11, boolean z10) {
        b(appCompatActivity, false, false, i10, i11, z10);
    }

    public static void b(AppCompatActivity appCompatActivity, boolean z10, boolean z11, int i10, int i11, boolean z12) {
        try {
            Window window = appCompatActivity.getWindow();
            boolean z13 = true;
            if (z10 && z11) {
                window.clearFlags(201326592);
                b.d(appCompatActivity, true, true, i10 == 0, z12);
                window.addFlags(Integer.MIN_VALUE);
            } else if (!z10 && !z11) {
                window.requestFeature(1);
                window.clearFlags(201326592);
                if (i10 != 0) {
                    z13 = false;
                }
                b.d(appCompatActivity, false, false, z13, z12);
                window.addFlags(Integer.MIN_VALUE);
            } else {
                if (z10) {
                    return;
                }
                window.requestFeature(1);
                window.clearFlags(201326592);
                b.d(appCompatActivity, false, true, i10 == 0, z12);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setStatusBarColor(i10);
            window.setNavigationBarColor(i11);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
