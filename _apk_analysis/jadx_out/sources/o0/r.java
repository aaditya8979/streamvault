package o0;

import android.content.Context;
import b0.a;
import com.ironsource.C4157n2;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lo0/r;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lb0/a;", "a", "b", "Lb0/a;", C4157n2.f33007p, "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f75991a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static b0.a instance;

    @NotNull
    public final synchronized b0.a a(@NotNull Context context) {
        b0.a aVarA;
        aVarA = instance;
        if (aVarA == null) {
            aVarA = new a.C0120a().b(on.i.x(i.n(context), "image_cache")).a();
            instance = aVarA;
        }
        return aVarA;
    }
}
