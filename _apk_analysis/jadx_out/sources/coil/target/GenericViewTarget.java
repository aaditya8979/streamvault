package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;
import l0.b;
import n0.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GenericViewTarget.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0004J\b\u0010\u0014\u001a\u00020\bH\u0004R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcoil/target/GenericViewTarget;", "Landroid/view/View;", "T", "Ll0/b;", "Ln0/d;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/graphics/drawable/Drawable;", "placeholder", "Lbn/r;", "a", "error", "b", "result", "onSuccess", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "onStop", "drawable", InneractiveMediationDefs.GENDER_FEMALE, "e", "", "Z", "isStarted", "c", "()Landroid/graphics/drawable/Drawable;", "d", "(Landroid/graphics/drawable/Drawable;)V", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public abstract class GenericViewTarget<T extends View> implements b<T>, d, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean isStarted;

    @Override // l0.a
    public void a(@Nullable Drawable drawable) {
        f(drawable);
    }

    @Override // l0.a
    public void b(@Nullable Drawable drawable) {
        f(drawable);
    }

    @Override // n0.d
    @Nullable
    public abstract Drawable c();

    public abstract void d(@Nullable Drawable drawable);

    public final void e() {
        Object objC = c();
        Animatable animatable = objC instanceof Animatable ? (Animatable) objC : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void f(@Nullable Drawable drawable) {
        Object objC = c();
        Animatable animatable = objC instanceof Animatable ? (Animatable) objC : null;
        if (animatable != null) {
            animatable.stop();
        }
        d(drawable);
        e();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull LifecycleOwner lifecycleOwner) {
        this.isStarted = true;
        e();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner lifecycleOwner) {
        this.isStarted = false;
        e();
    }

    @Override // l0.a
    public void onSuccess(@NotNull Drawable drawable) {
        f(drawable);
    }
}
