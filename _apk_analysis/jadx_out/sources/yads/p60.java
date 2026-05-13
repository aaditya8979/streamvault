package yads;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class p60 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f93440b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p60(Context context) {
        super(0);
        this.f93440b = context;
    }

    @Override // sn.a
    public final Object invoke() {
        return new v61(this.f93440b);
    }
}
