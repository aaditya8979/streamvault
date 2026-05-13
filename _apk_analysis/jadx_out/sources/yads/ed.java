package yads;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ed extends hb2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gd f89211l;

    public ed(@NotNull Context context) {
        this(context, new ji1());
    }

    public /* synthetic */ ed(Context context, ji1 ji1Var) {
        this(context, ji1Var, new gd(new pa2(context)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ed(Context context, ji1 ji1Var, gd gdVar) {
        super(context, null, 0 == true ? 1 : 0, 62);
        this.f89211l = gdVar;
        if (ji1Var.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(gdVar);
    }

    @Override // yads.hb2, yads.m11
    public final void a(Context context, String str) {
        this.f89211l.a(str);
    }

    @Override // yads.hb2
    public final void e() {
    }

    public final void setAdtuneWebViewListener(@NotNull hd hdVar) {
        this.f89211l.f89921c = hdVar;
    }
}
