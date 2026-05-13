package ua;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;

/* JADX INFO: compiled from: MagicalViewWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup.MarginLayoutParams f85625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f85626b;

    public b(View view) {
        this.f85626b = view;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f85625a = marginLayoutParams;
        if (marginLayoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) marginLayoutParams).gravity = GravityCompat.START;
        }
    }

    public void a(float f10) {
        this.f85625a.height = Math.round(f10);
        this.f85626b.setLayoutParams(this.f85625a);
    }

    public void b(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f85625a;
        marginLayoutParams.leftMargin = i10;
        this.f85626b.setLayoutParams(marginLayoutParams);
    }

    public void c(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f85625a;
        marginLayoutParams.topMargin = i10;
        this.f85626b.setLayoutParams(marginLayoutParams);
    }

    public void d(float f10) {
        this.f85625a.width = Math.round(f10);
        this.f85626b.setLayoutParams(this.f85625a);
    }
}
