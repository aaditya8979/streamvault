package yads;

import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class oc2 extends Lambda implements sn.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f93176b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc2(Set set) {
        super(1);
        this.f93176b = set;
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f93176b.contains(((u5) obj).f95555a));
    }
}
