package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
public final class b60 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m70 f87917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f87918c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(Context context, m70 m70Var) {
        super(0);
        this.f87917b = m70Var;
        this.f87918c = context;
    }

    @Override // sn.a
    public final Object invoke() {
        dw2 dw2Var = (dw2) this.f87917b.f92277b.getValue();
        ww wwVar = xw.f96901a;
        Context context = this.f87918c;
        wwVar.getClass();
        return new ez(dw2Var, ww.a(context));
    }
}
