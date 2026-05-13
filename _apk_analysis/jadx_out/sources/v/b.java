package v;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: ParamsCreator.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85851b;

    public b(@NonNull Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f85850a = windowManager.getDefaultDisplay().getWidth();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.f85851b = displayMetrics.densityDpi;
    }

    public int a() {
        int i10 = this.f85850a;
        if (i10 >= 1400) {
            return 50;
        }
        if (i10 >= 1000) {
            return 48;
        }
        return i10 >= 700 ? 34 : 30;
    }

    public int b() {
        int i10 = this.f85850a;
        if (i10 < 1400 && i10 < 1000) {
            return i10 >= 700 ? 8 : 5;
        }
        return 12;
    }
}
