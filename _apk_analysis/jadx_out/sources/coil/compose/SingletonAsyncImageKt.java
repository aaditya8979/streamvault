package coil.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import bn.r;
import coil.compose.AsyncImagePainter;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;
import z.b;

/* JADX INFO: compiled from: SingletonAsyncImage.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0095\u0001\u0010\u0015\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"", "model", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$b;", "transform", "Lbn/r;", "onState", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "a", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lsn/l;Lsn/l;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;II)V", "coil-compose-singleton_release"}, k = 2, mv = {1, 7, 1})
public final class SingletonAsyncImageKt {
    @Composable
    public static final void a(@Nullable final Object obj, @Nullable final String str, @Nullable Modifier modifier, @Nullable l<? super AsyncImagePainter.b, ? extends AsyncImagePainter.b> lVar, @Nullable l<? super AsyncImagePainter.b, r> lVar2, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f10, @Nullable ColorFilter colorFilter, int i10, @Nullable Composer composer, final int i11, final int i12) {
        l<? super AsyncImagePainter.b, ? extends AsyncImagePainter.b> lVarA;
        int i13;
        int iM2115getDefaultFilterQualityfv9h1I;
        Composer composerStartRestartGroup = composer.startRestartGroup(-941517612);
        final Modifier modifier2 = (i12 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if ((i12 & 8) != 0) {
            i13 = i11 & (-7169);
            lVarA = AsyncImagePainter.INSTANCE.a();
        } else {
            lVarA = lVar;
            i13 = i11;
        }
        l<? super AsyncImagePainter.b, r> lVar3 = (i12 & 16) != 0 ? null : lVar2;
        Alignment center = (i12 & 32) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i12 & 64) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f11 = (i12 & 128) != 0 ? 1.0f : f10;
        ColorFilter colorFilter2 = (i12 & 256) != 0 ? null : colorFilter;
        if ((i12 & 512) != 0) {
            i13 &= -1879048193;
            iM2115getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m2115getDefaultFilterQualityfv9h1I();
        } else {
            iM2115getDefaultFilterQualityfv9h1I = i10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-941517612, i13, -1, "coil.compose.AsyncImage (SingletonAsyncImage.kt:99)");
        }
        int i14 = i13 << 3;
        AsyncImageKt.a(obj, str, ImageLoaderProvidableCompositionLocal.c(b.a(), composerStartRestartGroup, 6), modifier2, lVarA, lVar3, center, fit, f11, colorFilter2, iM2115getDefaultFilterQualityfv9h1I, composerStartRestartGroup, (i13 & 112) | IronSourceError.ERROR_NO_INTERNET_CONNECTION | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), (i13 >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final l<? super AsyncImagePainter.b, ? extends AsyncImagePainter.b> lVar4 = lVarA;
        final l<? super AsyncImagePainter.b, r> lVar5 = lVar3;
        final Alignment alignment2 = center;
        final ContentScale contentScale2 = fit;
        final float f12 = f11;
        final ColorFilter colorFilter3 = colorFilter2;
        final int i15 = iM2115getDefaultFilterQualityfv9h1I;
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, r>() { // from class: coil.compose.SingletonAsyncImageKt$AsyncImage$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo2invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return r.f5635a;
            }

            public final void invoke(@Nullable Composer composer2, int i16) {
                SingletonAsyncImageKt.a(obj, str, modifier2, lVar4, lVar5, alignment2, contentScale2, f12, colorFilter3, i15, composer2, i11 | 1, i12);
            }
        });
    }
}
