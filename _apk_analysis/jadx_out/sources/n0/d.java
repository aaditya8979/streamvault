package n0;

import android.graphics.drawable.Drawable;
import androidx.annotation.MainThread;
import kotlin.Metadata;
import l0.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransitionTarget.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ln0/d;", "Ll0/a;", "Landroid/graphics/drawable/Drawable;", "c", "()Landroid/graphics/drawable/Drawable;", "drawable", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public interface d extends l0.a {

    /* JADX INFO: compiled from: TransitionTarget.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @MainThread
        public static void a(@NotNull d dVar, @Nullable Drawable drawable) {
            a.C0869a.a(dVar, drawable);
        }

        @MainThread
        public static void b(@NotNull d dVar, @Nullable Drawable drawable) {
            a.C0869a.b(dVar, drawable);
        }

        @MainThread
        public static void c(@NotNull d dVar, @NotNull Drawable drawable) {
            a.C0869a.c(dVar, drawable);
        }
    }

    @Nullable
    Drawable c();
}
