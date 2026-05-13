package yads;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes11.dex */
public abstract class fa3 {
    public static final int a(int i10) {
        return i10 >= 0 ? vn.c.d(i10 / Resources.getSystem().getDisplayMetrics().density) : i10;
    }
}
