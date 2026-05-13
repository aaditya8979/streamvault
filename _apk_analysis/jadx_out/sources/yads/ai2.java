package yads;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@so.k
public final class ai2 {

    @NotNull
    public static final zh2 Companion = new zh2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KSerializer[] f87708d = {di2.Companion.serializer(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final di2 f87709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f87711c;

    public /* synthetic */ ai2(int i10, di2 di2Var, String str, Integer num) {
        if (7 != (i10 & 7)) {
            wo.c2.a(i10, 7, yh2.f97147a.getDescriptor());
        }
        this.f87709a = di2Var;
        this.f87710b = str;
        this.f87711c = num;
    }

    public ai2(di2 di2Var, String str, Integer num) {
        this.f87709a = di2Var;
        this.f87710b = str;
        this.f87711c = num;
    }
}
