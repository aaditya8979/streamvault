package z;

import android.graphics.drawable.Drawable;
import androidx.annotation.MainThread;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import bn.r;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.unified.UnifiedMediationParams;
import j0.f;
import k0.c;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import n0.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: AsyncImagePainter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u001c\u001ai\u0010\u000e\u001a\u00020\r2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0002\u001a\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u001b\u0010#\u001a\u00020 *\u00020\u00188BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"", "model", "Lcoil/ImageLoader;", "imageLoader", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$b;", "transform", "Lbn/r;", "onState", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "Lcoil/compose/AsyncImagePainter;", "d", "(Ljava/lang/Object;Lcoil/ImageLoader;Lsn/l;Lsn/l;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "Lj0/f;", AdActivity.REQUEST_KEY_EXTRA, "h", "", "name", UnifiedMediationParams.KEY_DESCRIPTION, "", InneractiveMediationDefs.GENDER_FEMALE, "Landroidx/compose/ui/geometry/Size;", "Lk0/g;", "e", "(J)Lk0/g;", "z/a$a", "a", "Lz/a$a;", "FakeTransitionTarget", "", "c", "(J)Z", "isPositive", "coil-compose-base_release"}, k = 2, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1114a f98122a = new C1114a();

    /* JADX INFO: renamed from: z.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AsyncImagePainter.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"z/a$a", "Ln0/d;", "Landroid/graphics/drawable/Drawable;", "c", "()Landroid/graphics/drawable/Drawable;", "drawable", "coil-compose-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class C1114a implements d {
        @Override // l0.a
        @MainThread
        public void a(@Nullable Drawable drawable) {
            d.a.b(this, drawable);
        }

        @Override // l0.a
        @MainThread
        public void b(@Nullable Drawable drawable) {
            d.a.a(this, drawable);
        }

        @Override // n0.d
        @Nullable
        public Drawable c() {
            return null;
        }

        @Override // l0.a
        @MainThread
        public void onSuccess(@NotNull Drawable drawable) {
            d.a.c(this, drawable);
        }
    }

    public static final boolean c(long j10) {
        return ((double) Size.m1452getWidthimpl(j10)) >= 0.5d && ((double) Size.m1449getHeightimpl(j10)) >= 0.5d;
    }

    @Composable
    @NotNull
    public static final AsyncImagePainter d(@Nullable Object obj, @NotNull ImageLoader imageLoader, @Nullable l<? super AsyncImagePainter.b, ? extends AsyncImagePainter.b> lVar, @Nullable l<? super AsyncImagePainter.b, r> lVar2, @Nullable ContentScale contentScale, int i10, @Nullable Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(-2020614074);
        if ((i12 & 4) != 0) {
            lVar = AsyncImagePainter.INSTANCE.a();
        }
        if ((i12 & 8) != 0) {
            lVar2 = null;
        }
        if ((i12 & 16) != 0) {
            contentScale = ContentScale.INSTANCE.getFit();
        }
        if ((i12 & 32) != 0) {
            i10 = DrawScope.INSTANCE.m2115getDefaultFilterQualityfv9h1I();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020614074, i11, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:131)");
        }
        f fVarD = c.d(obj, composer, 8);
        h(fVarD);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new AsyncImagePainter(fVarD, imageLoader);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objRememberedValue;
        asyncImagePainter.x(lVar);
        asyncImagePainter.s(lVar2);
        asyncImagePainter.p(contentScale);
        asyncImagePainter.q(i10);
        asyncImagePainter.u(((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue());
        asyncImagePainter.r(imageLoader);
        asyncImagePainter.v(fVarD);
        asyncImagePainter.onRemembered();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asyncImagePainter;
    }

    public static final k0.Size e(long j10) {
        if (j10 == Size.INSTANCE.m1460getUnspecifiedNHjbRc()) {
            return k0.Size.f72688d;
        }
        if (!c(j10)) {
            return null;
        }
        float fM1452getWidthimpl = Size.m1452getWidthimpl(j10);
        k0.c cVarA = !Float.isInfinite(fM1452getWidthimpl) && !Float.isNaN(fM1452getWidthimpl) ? k0.a.a(vn.c.d(Size.m1452getWidthimpl(j10))) : c.b.f72682a;
        float fM1449getHeightimpl = Size.m1449getHeightimpl(j10);
        return new k0.Size(cVarA, (Float.isInfinite(fM1449getHeightimpl) || Float.isNaN(fM1449getHeightimpl)) ? false : true ? k0.a.a(vn.c.d(Size.m1449getHeightimpl(j10))) : c.b.f72682a);
    }

    public static final Void f(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    public static /* synthetic */ Void g(String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return f(str, str2);
    }

    public static final void h(f fVar) {
        Object data = fVar.getData();
        if (data instanceof f.a) {
            f("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new KotlinNothingValueException();
        }
        if (data instanceof ImageBitmap) {
            g("ImageBitmap", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (data instanceof ImageVector) {
            g("ImageVector", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (data instanceof Painter) {
            g("Painter", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (!(fVar.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET java.lang.String() == null)) {
            throw new IllegalArgumentException("request.target must be null.".toString());
        }
    }
}
