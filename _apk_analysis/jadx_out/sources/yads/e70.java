package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class e70 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f89133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m70 f89134c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e70(Context context, m70 m70Var) {
        super(0);
        this.f89133b = context;
        this.f89134c = m70Var;
    }

    @Override // sn.a
    public final Object invoke() {
        return new cn2(this.f89133b, (yo2) this.f89134c.f92296u.getValue(), (da0) this.f89134c.f92297v.getValue(), new d71());
    }
}
