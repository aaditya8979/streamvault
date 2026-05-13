package sg.bigo.ads.common.v;

import android.app.KeyguardManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import sg.bigo.ads.common.f.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f82531a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f82532b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f82533c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f82534d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f82535e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f82536f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82537g = f82531a;

    public static boolean a(View view) {
        if (view == null) {
            return false;
        }
        try {
            KeyguardManager keyguardManager = (KeyguardManager) view.getContext().getSystemService("keyguard");
            if (keyguardManager != null) {
                return keyguardManager.isKeyguardLocked();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean b(View view) {
        WindowManager.LayoutParams layoutParams;
        if (view == null) {
            return false;
        }
        while (true) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams)) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    layoutParams = null;
                    break;
                }
                view = (View) parent;
            } else {
                layoutParams = (WindowManager.LayoutParams) layoutParams2;
                break;
            }
        }
        if (layoutParams == null) {
            return false;
        }
        int i10 = layoutParams.type;
        return i10 == 2002 || i10 == 2003 || i10 == 2006 || i10 == 2007 || i10 == 2010 || i10 == 2038;
    }

    public final int a() {
        int iC = b.c();
        this.f82537g = iC != 1 ? iC != 2 ? f82531a : f82535e : f82532b;
        return this.f82537g;
    }
}
