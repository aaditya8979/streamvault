package coil.util;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import sn.a;

/* JADX INFO: compiled from: Time.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public /* synthetic */ class Time$provider$1 extends FunctionReferenceImpl implements a<Long> {
    public static final Time$provider$1 INSTANCE = new Time$provider$1();

    public Time$provider$1() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sn.a
    @NotNull
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
