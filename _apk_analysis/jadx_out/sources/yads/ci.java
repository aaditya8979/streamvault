package yads;

import android.app.ApplicationExitInfo;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class ci extends Lambda implements sn.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f88465b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(long j10) {
        super(1);
        this.f88465b = j10;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((ApplicationExitInfo) obj).getTimestamp() > this.f88465b);
    }
}
