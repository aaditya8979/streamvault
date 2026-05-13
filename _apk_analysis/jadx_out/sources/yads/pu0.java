package yads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f93775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f93776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lv f93777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l12 f93778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uz1 f93779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ou0 f93780f;

    public pu0(d4 d4Var, lu2 lu2Var, lv lvVar, l12 l12Var, uz1 uz1Var, ou0 ou0Var) {
        this.f93775a = d4Var;
        this.f93776b = lu2Var;
        this.f93777c = lvVar;
        this.f93778d = l12Var;
        this.f93779e = uz1Var;
        this.f93780f = ou0Var;
    }

    public final void a(Context context, gu0 gu0Var) {
        View viewA = this.f93778d.f91863c.a("feedback");
        ImageView imageView = viewA instanceof ImageView ? (ImageView) viewA : null;
        if (imageView == null) {
            return;
        }
        List list = gu0Var.f90120b;
        if (!list.isEmpty()) {
            try {
                za zaVar = new za(context, this.f93776b, this.f93775a);
                this.f93780f.getClass();
                PopupMenu popupMenuA = ou0.a(context, imageView, list);
                popupMenuA.setOnMenuItemClickListener(new dg2(zaVar, list, this.f93777c, this.f93779e));
                popupMenuA.show();
            } catch (Exception e10) {
                boolean z10 = ad1.f87661a;
                ((iu3) this.f93776b).a().reportError("Failed to render feedback", e10);
            }
        }
    }
}
