package yads;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class rl2 extends hk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io2 f94490c;

    public rl2(View view, io2 io2Var) {
        super(view);
        this.f94490c = io2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.hk3
    public final void a(View view) {
        ((tl2) view).setRating(0.0f);
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    @Override // yads.hk3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.hk3
    public final void b(View view, Object obj) {
        String str = (String) obj;
        try {
            ((tl2) view).setRating(zn.n.d(Float.parseFloat(str), 0.0f));
        } catch (NumberFormatException e10) {
            tn.x xVar = tn.x.f85368a;
            tn.p.j(String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            boolean z10 = ad1.f87661a;
            this.f94490c.reportError("Could not parse rating value", e10);
        }
    }
}
