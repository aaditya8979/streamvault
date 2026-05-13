package yads;

import android.view.MenuItem;
import android.widget.PopupMenu;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dg2 implements PopupMenu.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za f88849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f88850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lv f88851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz1 f88852d;

    public dg2(za zaVar, List list, lv lvVar, uz1 uz1Var) {
        this.f88849a = zaVar;
        this.f88850b = list;
        this.f88851c = lvVar;
        this.f88852d = uz1Var;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId >= this.f88850b.size()) {
            return true;
        }
        za.a(this.f88849a, ((fu0) this.f88850b.get(itemId)).f89676b, k83.f91512c);
        lv lvVar = this.f88851c;
        co2 co2Var = co2.f88552v;
        lvVar.getClass();
        lvVar.f92118d.a(lvVar.a(co2Var, new HashMap()));
        this.f88852d.f95882a.a();
        return true;
    }
}
