package coil.compose;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.exifinterface.media.ExifInterface;
import bn.r;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.view.Precision;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.vungle.ads.internal.ui.AdActivity;
import go.e;
import go.v;
import hn.c;
import io.bidmachine.iab.vast.tags.VastAttributes;
import j0.d;
import j0.f;
import j0.g;
import j0.m;
import k0.h;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import l0.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.j2;
import p000do.l0;
import p000do.w0;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AsyncImagePainter.kt */
/* JADX INFO: loaded from: classes9.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0002s B\u0019\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010m\u001a\u00020i¢\u0006\u0004\bq\u0010rJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J\f\u0010\u0010\u001a\u00020\b*\u00020\u000fH\u0002J\f\u0010\u0012\u001a\u00020\u0001*\u00020\u0011H\u0002J\f\u0010\u0014\u001a\u00020\u0003*\u00020\u0013H\u0014J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0014J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b%\u0010&R/\u0010/\u001a\u0004\u0018\u00010\u00012\b\u0010(\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u00102\"\u0004\b3\u00104R/\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010(\u001a\u0004\u0018\u00010\u00198B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010*\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010>\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0004\u0010;\"\u0004\b<\u0010=R(\u0010A\u001a\u0004\u0018\u00010\u00012\b\u0010:\u001a\u0004\u0018\u00010\u00018\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b1\u0010?\"\u0004\b@\u0010.R.\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR0\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR\"\u0010S\u001a\u00020M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR+\u0010[\u001a\u00020T8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010a\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R+\u0010e\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010*\u001a\u0004\bb\u0010c\"\u0004\bd\u0010=R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00058F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010*\u001a\u0004\bU\u0010f\"\u0004\bg\u0010hR+\u0010m\u001a\u00020i2\u0006\u0010(\u001a\u00020i8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010*\u001a\u0004\bI\u0010j\"\u0004\bk\u0010lR\u001d\u0010p\u001a\u00020$8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bn\u0010o\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, d2 = {"Lcoil/compose/AsyncImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "Lbn/r;", "g", "Lj0/f;", AdActivity.REQUEST_KEY_EXTRA, "C", "Lcoil/compose/AsyncImagePainter$b;", "input", "D", "previous", VideoLookHistoryEntry.CURRNET, "Lcoil/compose/CrossfadePainter;", InneractiveMediationDefs.GENDER_MALE, "Lj0/g;", "B", "Landroid/graphics/drawable/Drawable;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "", "alpha", "", "applyAlpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "onRemembered", "onForgotten", "onAbandoned", "Ldo/l0;", "b", "Ldo/l0;", "rememberScope", "Lgo/l;", "Landroidx/compose/ui/geometry/Size;", "c", "Lgo/l;", "drawSize", "<set-?>", "d", "Landroidx/compose/runtime/MutableState;", CampaignEx.JSON_KEY_AD_K, "()Landroidx/compose/ui/graphics/painter/Painter;", "t", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "painter", "e", "h", "()F", "n", "(F)V", InneractiveMediationDefs.GENDER_FEMALE, "i", "()Landroidx/compose/ui/graphics/ColorFilter;", "o", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "value", "Lcoil/compose/AsyncImagePainter$b;", "z", "(Lcoil/compose/AsyncImagePainter$b;)V", "_state", "Landroidx/compose/ui/graphics/painter/Painter;", VastAttributes.VERTICAL_POSITION, "_painter", "Lkotlin/Function1;", "Lsn/l;", "getTransform$coil_compose_base_release", "()Lsn/l;", VastAttributes.HORIZONTAL_POSITION, "(Lsn/l;)V", "transform", "j", "getOnState$coil_compose_base_release", "s", "onState", "Landroidx/compose/ui/layout/ContentScale;", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale$coil_compose_base_release", "()Landroidx/compose/ui/layout/ContentScale;", "p", "(Landroidx/compose/ui/layout/ContentScale;)V", "contentScale", "Landroidx/compose/ui/graphics/FilterQuality;", "l", "I", "getFilterQuality-f-v9h1I$coil_compose_base_release", "()I", "q", "(I)V", "filterQuality", "Z", "isPreview$coil_compose_base_release", "()Z", "u", "(Z)V", "isPreview", "getState", "()Lcoil/compose/AsyncImagePainter$b;", "w", "state", "()Lj0/f;", "v", "(Lj0/f;)V", "Lcoil/ImageLoader;", "()Lcoil/ImageLoader;", "r", "(Lcoil/ImageLoader;)V", "imageLoader", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "<init>", "(Lj0/f;Lcoil/ImageLoader;)V", "a", "coil-compose-base_release"}, k = 1, mv = {1, 7, 1})
public final class AsyncImagePainter extends Painter implements RememberObserver {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final l<b, b> f6816r = new l<b, b>() { // from class: coil.compose.AsyncImagePainter$Companion$DefaultTransform$1
        @Override // sn.l
        @NotNull
        public final AsyncImagePainter.b invoke(@NotNull AsyncImagePainter.b bVar) {
            return bVar;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public l0 rememberScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final go.l<Size> drawSize = v.a(Size.m1440boximpl(Size.INSTANCE.m1461getZeroNHjbRc()));

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState painter = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState alpha = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState colorFilter = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public b _state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Painter _painter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public l<? super b, ? extends b> transform;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public l<? super b, r> onState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ContentScale contentScale;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int filterQuality;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean isPreview;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState state;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState request;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState imageLoader;

    /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AsyncImagePainter.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcoil/compose/AsyncImagePainter$a;", "", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$b;", "DefaultTransform", "Lsn/l;", "a", "()Lsn/l;", "<init>", "()V", "coil-compose-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final l<b, b> a() {
            return AsyncImagePainter.f6816r;
        }
    }

    /* JADX INFO: compiled from: AsyncImagePainter.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcoil/compose/AsyncImagePainter$b;", "", "Landroidx/compose/ui/graphics/painter/Painter;", "a", "()Landroidx/compose/ui/graphics/painter/Painter;", "painter", "<init>", "()V", "b", "c", "d", "Lcoil/compose/AsyncImagePainter$b$a;", "Lcoil/compose/AsyncImagePainter$b$b;", "Lcoil/compose/AsyncImagePainter$b$c;", "Lcoil/compose/AsyncImagePainter$b$d;", "coil-compose-base_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class b {

        /* JADX INFO: compiled from: AsyncImagePainter.kt */
        @StabilityInferred(parameters = 0)
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcoil/compose/AsyncImagePainter$b$a;", "Lcoil/compose/AsyncImagePainter$b;", "Landroidx/compose/ui/graphics/painter/Painter;", "a", "()Landroidx/compose/ui/graphics/painter/Painter;", "painter", "<init>", "()V", "coil-compose-base_release"}, k = 1, mv = {1, 7, 1})
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f6832a = new a();

            public a() {
                super(null);
            }

            @Override // coil.compose.AsyncImagePainter.b
            @Nullable
            /* JADX INFO: renamed from: a */
            public Painter getPainter() {
                return null;
            }
        }

        /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$b$b, reason: collision with other inner class name and from toString */
        /* JADX INFO: compiled from: AsyncImagePainter.kt */
        @StabilityInferred(parameters = 0)
        @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcoil/compose/AsyncImagePainter$b$b;", "Lcoil/compose/AsyncImagePainter$b;", "", "toString", "", "hashCode", "", "other", "", "equals", "Landroidx/compose/ui/graphics/painter/Painter;", "a", "Landroidx/compose/ui/graphics/painter/Painter;", "()Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Lj0/d;", "b", "Lj0/d;", "()Lj0/d;", "result", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Lj0/d;)V", "coil-compose-base_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Painter painter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final d result;

            public Error(@Nullable Painter painter, @NotNull d dVar) {
                super(null);
                this.painter = painter;
                this.result = dVar;
            }

            @Override // coil.compose.AsyncImagePainter.b
            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public Painter getPainter() {
                return this.painter;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final d getResult() {
                return this.result;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return p.f(getPainter(), error.getPainter()) && p.f(this.result, error.result);
            }

            public int hashCode() {
                return ((getPainter() == null ? 0 : getPainter().hashCode()) * 31) + this.result.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(painter=" + getPainter() + ", result=" + this.result + ')';
            }
        }

        /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$b$c, reason: from toString */
        /* JADX INFO: compiled from: AsyncImagePainter.kt */
        @StabilityInferred(parameters = 0)
        @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcoil/compose/AsyncImagePainter$b$c;", "Lcoil/compose/AsyncImagePainter$b;", "", "toString", "", "hashCode", "", "other", "", "equals", "Landroidx/compose/ui/graphics/painter/Painter;", "a", "Landroidx/compose/ui/graphics/painter/Painter;", "()Landroidx/compose/ui/graphics/painter/Painter;", "painter", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "coil-compose-base_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class Loading extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Painter painter;

            public Loading(@Nullable Painter painter) {
                super(null);
                this.painter = painter;
            }

            @Override // coil.compose.AsyncImagePainter.b
            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public Painter getPainter() {
                return this.painter;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && p.f(getPainter(), ((Loading) other).getPainter());
            }

            public int hashCode() {
                if (getPainter() == null) {
                    return 0;
                }
                return getPainter().hashCode();
            }

            @NotNull
            public String toString() {
                return "Loading(painter=" + getPainter() + ')';
            }
        }

        /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$b$d, reason: from toString */
        /* JADX INFO: compiled from: AsyncImagePainter.kt */
        @StabilityInferred(parameters = 0)
        @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcoil/compose/AsyncImagePainter$b$d;", "Lcoil/compose/AsyncImagePainter$b;", "", "toString", "", "hashCode", "", "other", "", "equals", "Landroidx/compose/ui/graphics/painter/Painter;", "a", "Landroidx/compose/ui/graphics/painter/Painter;", "()Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Lj0/m;", "b", "Lj0/m;", "()Lj0/m;", "result", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Lj0/m;)V", "coil-compose-base_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class Success extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Painter painter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final m result;

            public Success(@NotNull Painter painter, @NotNull m mVar) {
                super(null);
                this.painter = painter;
                this.result = mVar;
            }

            @Override // coil.compose.AsyncImagePainter.b
            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public Painter getPainter() {
                return this.painter;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final m getResult() {
                return this.result;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return p.f(getPainter(), success.getPainter()) && p.f(this.result, success.result);
            }

            public int hashCode() {
                return (getPainter().hashCode() * 31) + this.result.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(painter=" + getPainter() + ", result=" + this.result + ')';
            }
        }

        public b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public abstract Painter getPainter();
    }

    /* JADX INFO: compiled from: ImageRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"coil/compose/AsyncImagePainter$c", "Ll0/a;", "Landroid/graphics/drawable/Drawable;", "placeholder", "Lbn/r;", "a", "error", "b", "result", "onSuccess", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements a {
        public c() {
        }

        @Override // l0.a
        public void a(@Nullable Drawable drawable) {
            AsyncImagePainter.this.D(new b.Loading(drawable != null ? AsyncImagePainter.this.A(drawable) : null));
        }

        @Override // l0.a
        public void b(@Nullable Drawable drawable) {
        }

        @Override // l0.a
        public void onSuccess(@NotNull Drawable drawable) {
        }
    }

    /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$onRemembered$1, reason: invalid class name */
    /* JADX INFO: compiled from: AsyncImagePainter.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @jn.d(c = "coil.compose.AsyncImagePainter$onRemembered$1", f = "AsyncImagePainter.kt", l = {246}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {
        public int label;

        /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$onRemembered$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: AsyncImagePainter.kt */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj0/f;", "it", "Lcoil/compose/AsyncImagePainter$b;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @jn.d(c = "coil.compose.AsyncImagePainter$onRemembered$1$2", f = "AsyncImagePainter.kt", l = {245}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements sn.p<f, hn.c<? super b>, Object> {
            public Object L$0;
            public int label;
            public final /* synthetic */ AsyncImagePainter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AsyncImagePainter asyncImagePainter, hn.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.this$0 = asyncImagePainter;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
                return new AnonymousClass2(this.this$0, cVar);
            }

            @Override // sn.p
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo2invoke(@NotNull f fVar, @Nullable hn.c<? super b> cVar) {
                return ((AnonymousClass2) create(fVar, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                AsyncImagePainter asyncImagePainter;
                Object objG = in.a.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    AsyncImagePainter asyncImagePainter2 = this.this$0;
                    ImageLoader imageLoaderJ = asyncImagePainter2.j();
                    AsyncImagePainter asyncImagePainter3 = this.this$0;
                    f fVarC = asyncImagePainter3.C(asyncImagePainter3.l());
                    this.L$0 = asyncImagePainter2;
                    this.label = 1;
                    Object objD = imageLoaderJ.d(fVarC, this);
                    if (objD == objG) {
                        return objG;
                    }
                    asyncImagePainter = asyncImagePainter2;
                    obj = objD;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    asyncImagePainter = (AsyncImagePainter) this.L$0;
                    kotlin.c.b(obj);
                }
                return asyncImagePainter.B((g) obj);
            }
        }

        /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$onRemembered$1$a */
        /* JADX INFO: compiled from: AsyncImagePainter.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class a implements e, tn.l {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsyncImagePainter f6839b;

            public a(AsyncImagePainter asyncImagePainter) {
                this.f6839b = asyncImagePainter;
            }

            @Override // go.e
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@NotNull b bVar, @NotNull hn.c<? super r> cVar) {
                Object objC = AnonymousClass1.c(this.f6839b, bVar, cVar);
                return objC == in.a.g() ? objC : r.f5635a;
            }

            public final boolean equals(@Nullable Object obj) {
                if ((obj instanceof e) && (obj instanceof tn.l)) {
                    return p.f(getFunctionDelegate(), ((tn.l) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // tn.l
            @NotNull
            public final bn.e<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.f6839b, AsyncImagePainter.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public AnonymousClass1(hn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        public static final /* synthetic */ Object c(AsyncImagePainter asyncImagePainter, b bVar, hn.c cVar) {
            asyncImagePainter.D(bVar);
            return r.f5635a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return AsyncImagePainter.this.new AnonymousClass1(cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable hn.c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                final AsyncImagePainter asyncImagePainter = AsyncImagePainter.this;
                go.d dVarE = go.f.E(SnapshotStateKt.snapshotFlow(new sn.a<f>() { // from class: coil.compose.AsyncImagePainter.onRemembered.1.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final f invoke() {
                        return asyncImagePainter.l();
                    }
                }), new AnonymousClass2(AsyncImagePainter.this, null));
                a aVar = new a(AsyncImagePainter.this);
                this.label = 1;
                if (dVarE.collect(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    public AsyncImagePainter(@NotNull f fVar, @NotNull ImageLoader imageLoader) {
        b.a aVar = b.a.f6832a;
        this._state = aVar;
        this.transform = f6816r;
        this.contentScale = ContentScale.INSTANCE.getFit();
        this.filterQuality = DrawScope.INSTANCE.m2115getDefaultFilterQualityfv9h1I();
        this.state = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(aVar, null, 2, null);
        this.request = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fVar, null, 2, null);
        this.imageLoader = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(imageLoader, null, 2, null);
    }

    public final Painter A(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return BitmapPainterKt.m2185BitmapPainterQZhYCtY$default(AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.filterQuality, 6, null);
        }
        return drawable instanceof ColorDrawable ? new ColorPainter(ColorKt.Color(((ColorDrawable) drawable).getColor()), null) : new DrawablePainter(drawable.mutate());
    }

    public final b B(g gVar) {
        if (gVar instanceof m) {
            m mVar = (m) gVar;
            return new b.Success(A(mVar.getDrawable()), mVar);
        }
        if (!(gVar instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        Drawable drawable = gVar.getDrawable();
        return new b.Error(drawable != null ? A(drawable) : null, (d) gVar);
    }

    public final f C(f request) {
        f.a aVarL = f.Q(request, null, 1, null).l(new c());
        if (request.getDefined().getSizeResolver() == null) {
            aVarL.k(new h() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1
                @Override // k0.h
                @Nullable
                public final Object a(@NotNull c<? super k0.Size> cVar) {
                    final go.l lVar = this.f6840b.drawSize;
                    return go.f.v(new go.d<k0.Size>() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1

                        /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lbn/r;", "emit", "(Ljava/lang/Object;Lhn/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
                        public static final class AnonymousClass2<T> implements e {

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ e f6842b;

                            /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            /* JADX INFO: compiled from: Emitters.kt */
                            @jn.d(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", l = {225}, m = "emit")
                            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                public Object L$0;
                                public int label;
                                public /* synthetic */ Object result;

                                public AnonymousClass1(c cVar) {
                                    super(cVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(e eVar) {
                                this.f6842b = eVar;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // go.e
                            @org.jetbrains.annotations.Nullable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull hn.c r8) {
                                /*
                                    r6 = this;
                                    boolean r0 = r8 instanceof coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L13
                                    r0 = r8
                                    coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 r0 = (coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r1 & r2
                                    if (r3 == 0) goto L13
                                    int r1 = r1 - r2
                                    r0.label = r1
                                    goto L18
                                L13:
                                    coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 r0 = new coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1
                                    r0.<init>(r8)
                                L18:
                                    java.lang.Object r8 = r0.result
                                    java.lang.Object r1 = in.a.g()
                                    int r2 = r0.label
                                    r3 = 1
                                    if (r2 == 0) goto L31
                                    if (r2 != r3) goto L29
                                    kotlin.c.b(r8)
                                    goto L4b
                                L29:
                                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                                    r7.<init>(r8)
                                    throw r7
                                L31:
                                    kotlin.c.b(r8)
                                    go.e r8 = r6.f6842b
                                    androidx.compose.ui.geometry.Size r7 = (androidx.compose.ui.geometry.Size) r7
                                    long r4 = r7.getPackedValue()
                                    k0.g r7 = z.a.b(r4)
                                    if (r7 == 0) goto L4b
                                    r0.label = r3
                                    java.lang.Object r7 = r8.emit(r7, r0)
                                    if (r7 != r1) goto L4b
                                    return r1
                                L4b:
                                    bn.r r7 = bn.r.f5635a
                                    return r7
                                */
                                throw new UnsupportedOperationException("Method not decompiled: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, hn.c):java.lang.Object");
                            }
                        }

                        @Override // go.d
                        @Nullable
                        public Object collect(@NotNull e<? super k0.Size> eVar, @NotNull c cVar2) {
                            Object objCollect = lVar.collect(new AnonymousClass2(eVar), cVar2);
                            return objCollect == in.a.g() ? objCollect : r.f5635a;
                        }
                    }, cVar);
                }
            });
        }
        if (request.getDefined().getScale() == null) {
            aVarL.j(z.c.f(this.contentScale));
        }
        if (request.getDefined().getPrecision() != Precision.EXACT) {
            aVarL.d(Precision.INEXACT);
        }
        return aVarL.a();
    }

    public final void D(b bVar) {
        b bVar2 = this._state;
        b bVarInvoke = this.transform.invoke(bVar);
        z(bVarInvoke);
        Painter painterM = m(bVar2, bVarInvoke);
        if (painterM == null) {
            painterM = bVarInvoke.getPainter();
        }
        y(painterM);
        if (this.rememberScope != null && bVar2.getPainter() != bVarInvoke.getPainter()) {
            Object painter = bVar2.getPainter();
            RememberObserver rememberObserver = painter instanceof RememberObserver ? (RememberObserver) painter : null;
            if (rememberObserver != null) {
                rememberObserver.onForgotten();
            }
            Object painter2 = bVarInvoke.getPainter();
            RememberObserver rememberObserver2 = painter2 instanceof RememberObserver ? (RememberObserver) painter2 : null;
            if (rememberObserver2 != null) {
                rememberObserver2.onRemembered();
            }
        }
        l<? super b, r> lVar = this.onState;
        if (lVar != null) {
            lVar.invoke(bVarInvoke);
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        n(alpha);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        o(colorFilter);
        return true;
    }

    public final void g() {
        l0 l0Var = this.rememberScope;
        if (l0Var != null) {
            kotlinx.coroutines.d.e(l0Var, null, 1, null);
        }
        this.rememberScope = null;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        Painter painterK = k();
        return painterK != null ? painterK.getIntrinsicSize() : Size.INSTANCE.m1460getUnspecifiedNHjbRc();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float h() {
        return ((Number) this.alpha.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ColorFilter i() {
        return (ColorFilter) this.colorFilter.getValue();
    }

    @NotNull
    public final ImageLoader j() {
        return (ImageLoader) this.imageLoader.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Painter k() {
        return (Painter) this.painter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final f l() {
        return (f) this.request.getValue();
    }

    public final CrossfadePainter m(b previous, b current) {
        g result;
        if (!(current instanceof b.Success)) {
            if (current instanceof b.Error) {
                result = ((b.Error) current).getResult();
            }
            return null;
        }
        result = ((b.Success) current).getResult();
        n0.c cVarA = result.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getTransitionFactory().a(z.a.f98122a, result);
        if (cVarA instanceof n0.a) {
            n0.a aVar = (n0.a) cVarA;
            return new CrossfadePainter(previous instanceof b.Loading ? previous.getPainter() : null, current.getPainter(), this.contentScale, aVar.getDurationMillis(), ((result instanceof m) && ((m) result).getIsPlaceholderCached()) ? false : true, aVar.getPreferExactIntrinsicSize());
        }
        return null;
    }

    public final void n(float f10) {
        this.alpha.setValue(Float.valueOf(f10));
    }

    public final void o(ColorFilter colorFilter) {
        this.colorFilter.setValue(colorFilter);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        g();
        Object obj = this._painter;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        this.drawSize.setValue(Size.m1440boximpl(drawScope.mo2113getSizeNHjbRc()));
        Painter painterK = k();
        if (painterK != null) {
            painterK.m2188drawx_KDEd0(drawScope, drawScope.mo2113getSizeNHjbRc(), h(), i());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        g();
        Object obj = this._painter;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        if (this.rememberScope != null) {
            return;
        }
        l0 l0VarA = kotlinx.coroutines.d.a(j2.b(null, 1, null).plus(w0.c().M()));
        this.rememberScope = l0VarA;
        Object obj = this._painter;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onRemembered();
        }
        if (!this.isPreview) {
            p000do.i.d(l0VarA, null, null, new AnonymousClass1(null), 3, null);
        } else {
            Drawable drawableE = f.Q(l(), null, 1, null).c(j().getDefaults()).a().E();
            D(new b.Loading(drawableE != null ? A(drawableE) : null));
        }
    }

    public final void p(@NotNull ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void q(int i10) {
        this.filterQuality = i10;
    }

    public final void r(@NotNull ImageLoader imageLoader) {
        this.imageLoader.setValue(imageLoader);
    }

    public final void s(@Nullable l<? super b, r> lVar) {
        this.onState = lVar;
    }

    public final void t(Painter painter) {
        this.painter.setValue(painter);
    }

    public final void u(boolean z10) {
        this.isPreview = z10;
    }

    public final void v(@NotNull f fVar) {
        this.request.setValue(fVar);
    }

    public final void w(b bVar) {
        this.state.setValue(bVar);
    }

    public final void x(@NotNull l<? super b, ? extends b> lVar) {
        this.transform = lVar;
    }

    public final void y(Painter painter) {
        this._painter = painter;
        t(painter);
    }

    public final void z(b bVar) {
        this._state = bVar;
        w(bVar);
    }
}
