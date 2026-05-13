package cl;

import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import tn.t;

/* JADX INFO: compiled from: RequestBody.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final kl.a<rl.a> f6726a;

    static {
        KType kTypeM;
        KClass kClassB = t.b(rl.a.class);
        try {
            kTypeM = t.m(rl.a.class);
        } catch (Throwable unused) {
            kTypeM = null;
        }
        f6726a = new kl.a<>("BodyTypeAttributeKey", new rl.a(kClassB, kTypeM));
    }

    @NotNull
    public static final kl.a<rl.a> a() {
        return f6726a;
    }
}
