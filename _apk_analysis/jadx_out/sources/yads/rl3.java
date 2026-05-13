package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class rl3 implements de1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f94491b;

    public rl3(boolean z10) {
        this.f94491b = z10;
    }

    @Override // yads.de1
    public final String a() {
        tn.x xVar = tn.x.f85368a;
        String str = String.format("viewable: %s", Arrays.copyOf(new Object[]{Boolean.valueOf(this.f94491b)}, 1));
        tn.p.j(str, "format(...)");
        return str;
    }
}
