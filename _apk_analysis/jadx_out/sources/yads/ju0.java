package yads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class ju0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f91367d = Color.parseColor("#66000000");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f91368e = Color.parseColor("#00000000");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f91369f = Color.parseColor("#7f7f7f");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f91370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y00 f91371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ku0 f91372c;

    public ju0(Context context, y00 y00Var, ku0 ku0Var) {
        this.f91370a = context;
        this.f91371b = y00Var;
        this.f91372c = ku0Var;
    }

    public static void a(FrameLayout frameLayout, GradientDrawable gradientDrawable, int i10) {
        frameLayout.setPadding(0, 0, 0, i10);
        frameLayout.setBackground(gradientDrawable);
    }
}
