package e0;

import com.vungle.ads.internal.ui.AdActivity;
import hn.c;
import j0.f;
import j0.g;
import k0.Size;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Interceptor.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0005J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Le0/a;", "", "Le0/a$a;", "chain", "Lj0/g;", "a", "(Le0/a$a;Lhn/c;)Ljava/lang/Object;", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public interface a {

    /* JADX INFO: renamed from: e0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Interceptor.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le0/a$a;", "", "Lj0/f;", "getRequest", "()Lj0/f;", AdActivity.REQUEST_KEY_EXTRA, "Lk0/g;", "getSize", "()Lk0/g;", "size", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public interface InterfaceC0737a {
        @NotNull
        f getRequest();

        @NotNull
        Size getSize();
    }

    @Nullable
    Object a(@NotNull InterfaceC0737a interfaceC0737a, @NotNull c<? super g> cVar);
}
