package re;

import android.graphics.PointF;
import android.view.View;
import qe.i;

/* JADX INFO: compiled from: SimpleBoundaryDecider.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PointF f78895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f78896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f78897c = true;

    @Override // qe.i
    public boolean a(View view) {
        i iVar = this.f78896b;
        return iVar != null ? iVar.a(view) : se.b.a(view, this.f78895a, this.f78897c);
    }

    @Override // qe.i
    public boolean b(View view) {
        i iVar = this.f78896b;
        return iVar != null ? iVar.b(view) : se.b.b(view, this.f78895a);
    }
}
