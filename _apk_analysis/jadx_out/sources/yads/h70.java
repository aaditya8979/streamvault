package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class h70 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f90263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m70 f90264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h70(Context context, m70 m70Var) {
        super(0);
        this.f90263b = context;
        this.f90264c = m70Var;
    }

    @Override // sn.a
    public final Object invoke() {
        return new cv2(this.f90263b, (au1) this.f90264c.f92286k.getValue());
    }
}
