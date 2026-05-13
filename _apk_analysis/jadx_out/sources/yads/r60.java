package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class r60 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f94288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m70 f94289c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(Context context, m70 m70Var) {
        super(0);
        this.f94288b = context;
        this.f94289c = m70Var;
    }

    @Override // sn.a
    public final Object invoke() {
        return new b71(this.f94288b, (v61) this.f94289c.f92300y.getValue());
    }
}
