package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class e60 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f89115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m70 f89116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e60(Context context, m70 m70Var) {
        super(0);
        this.f89115b = context;
        this.f89116c = m70Var;
    }

    @Override // sn.a
    public final Object invoke() {
        return new x70(this.f89115b, (eq1) this.f89116c.f92280e.getValue(), new fr1(this.f89115b));
    }
}
