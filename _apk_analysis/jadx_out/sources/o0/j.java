package o0;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Calls.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lo0/j;", "Lokhttp3/Callback;", "Lkotlin/Function1;", "", "Lbn/r;", "Lkotlinx/coroutines/CompletionHandler;", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Response;", "response", "onResponse", "Ljava/io/IOException;", "e", "onFailure", "cause", "a", "b", "Lokhttp3/Call;", "Ldo/k;", "c", "Ldo/k;", "continuation", "<init>", "(Lokhttp3/Call;Ldo/k;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class j implements Callback, sn.l<Throwable, bn.r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Call call;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p000do.k<Response> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull Call call, @NotNull p000do.k<? super Response> kVar) {
        this.call = call;
        this.continuation = kVar;
    }

    public void a(@Nullable Throwable th2) {
        try {
            this.call.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // sn.l
    public /* bridge */ /* synthetic */ bn.r invoke(Throwable th2) {
        a(th2);
        return bn.r.f5635a;
    }

    @Override // okhttp3.Callback
    public void onFailure(@NotNull Call call, @NotNull IOException iOException) {
        if (call.isCanceled()) {
            return;
        }
        p000do.k<Response> kVar = this.continuation;
        Result.a aVar = Result.Companion;
        kVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(iOException)));
    }

    @Override // okhttp3.Callback
    public void onResponse(@NotNull Call call, @NotNull Response response) {
        this.continuation.resumeWith(Result.m7534constructorimpl(response));
    }
}
