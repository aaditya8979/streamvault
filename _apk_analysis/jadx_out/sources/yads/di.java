package yads;

import android.app.ApplicationExitInfo;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class di extends Lambda implements sn.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ei f88857b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(ei eiVar) {
        super(1);
        this.f88857b = eiVar;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return ei.a(this.f88857b, (ApplicationExitInfo) obj);
    }
}
