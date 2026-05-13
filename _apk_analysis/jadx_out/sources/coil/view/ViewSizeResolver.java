package coil.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import bn.r;
import coil.view.ViewSizeResolver;
import com.mbridge.msdk.MBridgeConstans;
import jn.f;
import k0.Size;
import k0.c;
import k0.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k;
import sn.l;

/* JADX INFO: compiled from: ViewSizeResolver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\bH\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\bH\u0002J\u0014\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0014\u0010\u0015\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcoil/size/ViewSizeResolver;", "Landroid/view/View;", "T", "Lk0/h;", "", "paramSize", "viewSize", "paddingSize", "Lk0/c;", "getDimension", "getHeight", "Lk0/g;", "getSize", "getWidth", "Landroid/view/ViewTreeObserver;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "victim", "Lbn/r;", "removePreDrawListenerSafe", "getView", "()Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "b", "()Z", "subtractPadding", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public interface ViewSizeResolver<T extends View> extends h {

    /* JADX INFO: compiled from: ViewSizeResolver.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {

        /* JADX INFO: compiled from: ViewSizeResolver.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"coil/size/ViewSizeResolver$DefaultImpls$a", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "b", "Z", "isResumed", "coil-base_release"}, k = 1, mv = {1, 7, 1})
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public boolean isResumed;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ViewSizeResolver<T> f6990c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver f6991d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ k<Size> f6992e;

            /* JADX WARN: Multi-variable type inference failed */
            public a(ViewSizeResolver<T> viewSizeResolver, ViewTreeObserver viewTreeObserver, k<? super Size> kVar) {
                this.f6990c = viewSizeResolver;
                this.f6991d = viewTreeObserver;
                this.f6992e = kVar;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Size sizeE = DefaultImpls.e(this.f6990c);
                if (sizeE != null) {
                    DefaultImpls.g(this.f6990c, this.f6991d, this);
                    if (!this.isResumed) {
                        this.isResumed = true;
                        this.f6992e.resumeWith(Result.m7534constructorimpl(sizeE));
                    }
                }
                return true;
            }
        }

        public static <T extends View> c c(ViewSizeResolver<T> viewSizeResolver, int i10, int i11, int i12) {
            if (i10 == -2) {
                return c.b.f72682a;
            }
            int i13 = i10 - i12;
            if (i13 > 0) {
                return k0.a.a(i13);
            }
            int i14 = i11 - i12;
            if (i14 > 0) {
                return k0.a.a(i14);
            }
            return null;
        }

        public static <T extends View> c d(ViewSizeResolver<T> viewSizeResolver) {
            ViewGroup.LayoutParams layoutParams = viewSizeResolver.getView().getLayoutParams();
            return c(viewSizeResolver, layoutParams != null ? layoutParams.height : -1, viewSizeResolver.getView().getHeight(), viewSizeResolver.getSubtractPadding() ? viewSizeResolver.getView().getPaddingTop() + viewSizeResolver.getView().getPaddingBottom() : 0);
        }

        public static <T extends View> Size e(ViewSizeResolver<T> viewSizeResolver) {
            c cVarD;
            c cVarF = f(viewSizeResolver);
            if (cVarF == null || (cVarD = d(viewSizeResolver)) == null) {
                return null;
            }
            return new Size(cVarF, cVarD);
        }

        public static <T extends View> c f(ViewSizeResolver<T> viewSizeResolver) {
            ViewGroup.LayoutParams layoutParams = viewSizeResolver.getView().getLayoutParams();
            return c(viewSizeResolver, layoutParams != null ? layoutParams.width : -1, viewSizeResolver.getView().getWidth(), viewSizeResolver.getSubtractPadding() ? viewSizeResolver.getView().getPaddingLeft() + viewSizeResolver.getView().getPaddingRight() : 0);
        }

        public static <T extends View> void g(ViewSizeResolver<T> viewSizeResolver, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                viewSizeResolver.getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }

        @Nullable
        public static <T extends View> Object h(@NotNull final ViewSizeResolver<T> viewSizeResolver, @NotNull hn.c<? super Size> cVar) {
            Size sizeE = e(viewSizeResolver);
            if (sizeE != null) {
                return sizeE;
            }
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
            cVar2.K();
            final ViewTreeObserver viewTreeObserver = viewSizeResolver.getView().getViewTreeObserver();
            final a aVar = new a(viewSizeResolver, viewTreeObserver, cVar2);
            viewTreeObserver.addOnPreDrawListener(aVar);
            cVar2.P(new l<Throwable, r>() { // from class: coil.size.ViewSizeResolver$size$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                    invoke2(th2);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th2) {
                    ViewSizeResolver.DefaultImpls.g(viewSizeResolver, viewTreeObserver, aVar);
                }
            });
            Object objB = cVar2.B();
            if (objB == in.a.g()) {
                f.c(cVar);
            }
            return objB;
        }
    }

    /* JADX INFO: renamed from: b */
    boolean getSubtractPadding();

    @NotNull
    T getView();
}
