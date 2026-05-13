package l0;

import android.graphics.drawable.Drawable;
import androidx.annotation.MainThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Target.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0017J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0017J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0017¨\u0006\n"}, d2 = {"Ll0/a;", "", "Landroid/graphics/drawable/Drawable;", "placeholder", "Lbn/r;", "a", "error", "b", "result", "onSuccess", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public interface a {

    /* JADX INFO: renamed from: l0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Target.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C0869a {
        @MainThread
        public static void a(@NotNull a aVar, @Nullable Drawable drawable) {
        }

        @MainThread
        public static void b(@NotNull a aVar, @Nullable Drawable drawable) {
        }

        @MainThread
        public static void c(@NotNull a aVar, @NotNull Drawable drawable) {
        }
    }

    @MainThread
    void a(@Nullable Drawable drawable);

    @MainThread
    void b(@Nullable Drawable drawable);

    @MainThread
    void onSuccess(@NotNull Drawable drawable);
}
