package yads;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class kd extends hb2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final od f91570l;

    public kd(@NotNull Context context) {
        this(context, new ji1());
    }

    public /* synthetic */ kd(Context context, ji1 ji1Var) {
        this(context, ji1Var, new od(new dd(context)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kd(Context context, ji1 ji1Var, od odVar) {
        super(context, null, 0 == true ? 1 : 0, 62);
        this.f91570l = odVar;
        if (ji1Var.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(odVar);
    }

    @Override // yads.hb2, yads.m11
    public final void a(Context context, String str) {
        this.f91570l.a(str);
    }

    @Override // yads.hb2
    public final void e() {
    }

    public final void setAdtuneWebViewListener(@NotNull pd pdVar) {
        this.f91570l.f93179c = pdVar;
    }

    public final void setOptOutUrl(@Nullable String str) {
        this.f91570l.f93180d = str;
    }
}
