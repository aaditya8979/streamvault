package yads;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import org.jetbrains.annotations.NotNull;
import yads.p61;

/* JADX INFO: loaded from: classes12.dex */
public final class p61 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final og0 f93441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final er f93442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f93443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View.OnClickListener f93444d;

    public p61(Context context, og0 og0Var) {
        super(context);
        this.f93441a = og0Var;
        this.f93442b = new er(context, og0Var);
        this.f93443c = new TextView(context);
        this.f93444d = new View.OnClickListener() { // from class: bt.z7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p61.a(this.f6446b, view);
            }
        };
        a(context);
    }

    public static final void a(p61 p61Var, View view) {
        boolean z10 = !p61Var.f93442b.isSelected();
        p61Var.f93442b.setSelected(z10);
        p61Var.f93443c.setVisibility(z10 ? 0 : 8);
    }

    public final void a(Context context) {
        setOrientation(0);
        this.f93441a.getClass();
        int iA = og0.a(context, 4.0f);
        setPadding(iA, iA, iA, iA);
        this.f93442b.setOnClickListener(this.f93444d);
        addView(this.f93442b);
        this.f93441a.getClass();
        int iD = vn.c.d(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.f93443c.setPadding(iD, iD, iD, iD);
        this.f93441a.getClass();
        int iD2 = vn.c.d(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(iD2, SupportMenu.CATEGORY_MASK);
        this.f93443c.setBackgroundDrawable(gradientDrawable);
        addView(this.f93443c);
        this.f93441a.getClass();
        int iD3 = vn.c.d(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams = this.f93443c.getLayoutParams();
        tn.p.i(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(iD3, 0, iD3, iD3);
        this.f93443c.setLayoutParams(layoutParams2);
        this.f93443c.setVisibility(8);
    }

    public final void setDescription(@NotNull String str) {
        this.f93443c.setText(str);
    }
}
