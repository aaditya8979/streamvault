package yads;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class z43 implements de1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f97391b;

    public z43(hb2 hb2Var) {
        this.f97391b = hb2Var;
    }

    @Override // yads.de1
    public final String a() {
        boolean zIsHardwareAccelerated = this.f97391b.isHardwareAccelerated();
        tn.x xVar = tn.x.f85368a;
        String str = String.format("supports: {inlineVideo: %s}", Arrays.copyOf(new Object[]{Boolean.valueOf(zIsHardwareAccelerated)}, 1));
        tn.p.j(str, "format(...)");
        return str;
    }
}
