package coil.util;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.a;

/* JADX INFO: compiled from: Time.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcoil/util/Time;", "", "", "a", "Lkotlin/Function0;", "b", "Lsn/a;", IronSourceConstants.EVENTS_PROVIDER, "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class Time {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Time f6996a = new Time();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static a<Long> provider = Time$provider$1.INSTANCE;

    public final long a() {
        return provider.invoke().longValue();
    }
}
