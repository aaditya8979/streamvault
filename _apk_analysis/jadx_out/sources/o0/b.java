package o0;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import okhttp3.Call;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Calls.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Lokhttp3/Call;", "Lokhttp3/Response;", "a", "(Lokhttp3/Call;Lhn/c;)Ljava/lang/Object;", "coil-base_release"}, k = 2, mv = {1, 7, 1})
public final class b {
    @Nullable
    public static final Object a(@NotNull Call call, @NotNull hn.c<? super Response> cVar) {
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        j jVar = new j(call, cVar2);
        call.enqueue(jVar);
        cVar2.P(jVar);
        Object objB = cVar2.B();
        if (objB == in.a.g()) {
            jn.f.c(cVar);
        }
        return objB;
    }
}
