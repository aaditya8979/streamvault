package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class a60 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f87591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m70 f87592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(Context context, m70 m70Var) {
        super(0);
        this.f87591b = context;
        this.f87592c = m70Var;
    }

    @Override // sn.a
    public final Object invoke() {
        return new kg(this.f87591b, (jg0) this.f87592c.f92278c.getValue());
    }
}
