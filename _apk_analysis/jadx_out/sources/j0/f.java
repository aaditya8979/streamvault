package j0;

import a0.e;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import cn.w;
import coil.memory.MemoryCache;
import coil.request.CachePolicy;
import coil.request.GlobalLifecycle;
import coil.view.Precision;
import coil.view.Scale;
import coil.view.ViewSizeResolver;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.ui.AdActivity;
import d0.i;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import j0.Parameters;
import java.util.List;
import java.util.Map;
import k0.Size;
import kotlin.Metadata;
import kotlin.Pair;
import n0.c;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import tn.p;

/* JADX INFO: compiled from: ImageRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u000b\u000fB\u008e\u0003\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010%\u001a\u0004\u0018\u00010 \u0012\b\u0010+\u001a\u0004\u0018\u00010&\u0012\u0006\u00101\u001a\u00020,\u0012\b\u00107\u001a\u0004\u0018\u000102\u0012\u0006\u0010=\u001a\u000208\u0012\u001c\u0010D\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030?\u0012\b\u0012\u0006\u0012\u0002\b\u00030@\u0018\u00010>\u0012\b\u0010I\u001a\u0004\u0018\u00010E\u0012\f\u0010O\u001a\b\u0012\u0004\u0012\u00020K0J\u0012\u0006\u0010U\u001a\u00020P\u0012\u0006\u0010Z\u001a\u00020V\u0012\u0006\u0010`\u001a\u00020[\u0012\u0006\u0010d\u001a\u00020\u0007\u0012\u0006\u0010e\u001a\u00020\u0007\u0012\u0006\u0010g\u001a\u00020\u0007\u0012\u0006\u0010j\u001a\u00020\u0007\u0012\u0006\u0010p\u001a\u00020k\u0012\u0006\u0010r\u001a\u00020k\u0012\u0006\u0010t\u001a\u00020k\u0012\u0006\u0010y\u001a\u00020u\u0012\u0006\u0010z\u001a\u00020u\u0012\u0006\u0010|\u001a\u00020u\u0012\u0006\u0010~\u001a\u00020u\u0012\u0007\u0010\u0082\u0001\u001a\u00020\u007f\u0012\b\u0010\u0087\u0001\u001a\u00030\u0083\u0001\u0012\b\u0010\u008c\u0001\u001a\u00030\u0088\u0001\u0012\b\u0010\u0091\u0001\u001a\u00030\u008d\u0001\u0012\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010 \u0012\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\t\u0012\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0097\u0001\u0012\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\t\u0012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0097\u0001\u0012\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\t\u0012\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u0097\u0001\u0012\b\u0010¡\u0001\u001a\u00030\u009e\u0001\u0012\b\u0010¥\u0001\u001a\u00030¢\u0001¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010%\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010+\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u00107\u001a\u0004\u0018\u0001028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010=\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R-\u0010D\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030?\u0012\b\u0012\u0006\u0012\u0002\b\u00030@\u0018\u00010>8\u0006¢\u0006\f\n\u0004\b/\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010I\u001a\u0004\u0018\u00010E8\u0006¢\u0006\f\n\u0004\b5\u0010F\u001a\u0004\bG\u0010HR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020K0J8\u0006¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010U\u001a\u00020P8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010Z\u001a\u00020V8\u0006¢\u0006\f\n\u0004\bG\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010`\u001a\u00020[8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010d\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\b-\u0010cR\u0017\u0010e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010b\u001a\u0004\b3\u0010cR\u0017\u0010g\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bf\u0010b\u001a\u0004\b9\u0010cR\u0017\u0010j\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bh\u0010b\u001a\u0004\bi\u0010cR\u0017\u0010p\u001a\u00020k8\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0017\u0010r\u001a\u00020k8\u0006¢\u0006\f\n\u0004\bq\u0010m\u001a\u0004\bf\u0010oR\u0017\u0010t\u001a\u00020k8\u0006¢\u0006\f\n\u0004\bB\u0010m\u001a\u0004\bs\u0010oR\u0017\u0010y\u001a\u00020u8\u0006¢\u0006\f\n\u0004\bX\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010z\u001a\u00020u8\u0006¢\u0006\f\n\u0004\bw\u0010v\u001a\u0004\bq\u0010xR\u0017\u0010|\u001a\u00020u8\u0006¢\u0006\f\n\u0004\b{\u0010v\u001a\u0004\bQ\u0010xR\u0017\u0010~\u001a\u00020u8\u0006¢\u0006\f\n\u0004\b\u001d\u0010v\u001a\u0004\b}\u0010xR\u001a\u0010\u0082\u0001\u001a\u00020\u007f8\u0006¢\u0006\u000e\n\u0005\b#\u0010\u0080\u0001\u001a\u0005\b{\u0010\u0081\u0001R\u001c\u0010\u0087\u0001\u001a\u00030\u0083\u00018\u0006¢\u0006\u000f\n\u0005\bn\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u008c\u0001\u001a\u00030\u0088\u00018\u0006¢\u0006\u000f\n\u0005\bs\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001d\u0010\u0091\u0001\u001a\u00030\u008d\u00018\u0006¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u008e\u0001\u0010\u0090\u0001R\u001c\u0010\u0094\u0001\u001a\u0004\u0018\u00010 8\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\"\u001a\u0005\b\u0093\u0001\u0010$R\u0019\u0010\u0096\u0001\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0095\u0001R\u0019\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010\u0098\u0001R\u0018\u0010\u009a\u0001\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bi\u0010\u0095\u0001R\u001a\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0098\u0001R\u0019\u0010\u009c\u0001\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0095\u0001R\u0019\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b^\u0010\u0098\u0001R\u001b\u0010¡\u0001\u001a\u00030\u009e\u00018\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010\u009f\u0001\u001a\u0005\ba\u0010 \u0001R\u001b\u0010¥\u0001\u001a\u00030¢\u00018\u0006¢\u0006\u000e\n\u0005\b}\u0010£\u0001\u001a\u0005\b\\\u0010¤\u0001R\u0017\u0010§\u0001\u001a\u0005\u0018\u00010\u0097\u00018F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010¦\u0001R\u0016\u0010¨\u0001\u001a\u0005\u0018\u00010\u0097\u00018F¢\u0006\u0007\u001a\u0005\bh\u0010¦\u0001R\u0016\u0010©\u0001\u001a\u0005\u0018\u00010\u0097\u00018F¢\u0006\u0007\u001a\u0005\bl\u0010¦\u0001¨\u0006¬\u0001"}, d2 = {"Lj0/f;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lj0/f$a;", "P", "other", "", "equals", "", "hashCode", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/Object;", "l", "()Ljava/lang/Object;", "data", "Ll0/a;", "c", "Ll0/a;", "L", "()Ll0/a;", TypedValues.AttributesType.S_TARGET, "Lj0/f$b;", "d", "Lj0/f$b;", "z", "()Lj0/f$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/memory/MemoryCache$Key;", "e", "Lcoil/memory/MemoryCache$Key;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lcoil/memory/MemoryCache$Key;", "memoryCacheKey", "", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/String;", "q", "()Ljava/lang/String;", "diskCacheKey", "Landroid/graphics/Bitmap$Config;", "g", "Landroid/graphics/Bitmap$Config;", "j", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/ColorSpace;", "h", "Landroid/graphics/ColorSpace;", CampaignEx.JSON_KEY_AD_K, "()Landroid/graphics/ColorSpace;", "colorSpace", "Lcoil/size/Precision;", "i", "Lcoil/size/Precision;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "()Lcoil/size/Precision;", "precision", "Lkotlin/Pair;", "Ld0/i$a;", "Ljava/lang/Class;", "Lkotlin/Pair;", "v", "()Lkotlin/Pair;", "fetcherFactory", "La0/e$a;", "La0/e$a;", "n", "()La0/e$a;", "decoderFactory", "", "Lm0/a;", "Ljava/util/List;", "N", "()Ljava/util/List;", "transformations", "Ln0/c$a;", InneractiveMediationDefs.GENDER_MALE, "Ln0/c$a;", "O", "()Ln0/c$a;", "transitionFactory", "Lokhttp3/Headers;", "Lokhttp3/Headers;", "w", "()Lokhttp3/Headers;", "headers", "Lj0/n;", "o", "Lj0/n;", "K", "()Lj0/n;", "tags", "p", "Z", "()Z", "allowConversionToBitmap", "allowHardware", "r", "allowRgb565", "s", "H", "premultipliedAlpha", "Lcoil/request/CachePolicy;", "t", "Lcoil/request/CachePolicy;", "B", "()Lcoil/request/CachePolicy;", "memoryCachePolicy", "u", "diskCachePolicy", "C", "networkCachePolicy", "Ldo/h0;", "Ldo/h0;", VastAttributes.HORIZONTAL_POSITION, "()Ldo/h0;", "interceptorDispatcher", "fetcherDispatcher", VastAttributes.VERTICAL_POSITION, "decoderDispatcher", "M", "transformationDispatcher", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle;", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lk0/h;", "Lk0/h;", "J", "()Lk0/h;", "sizeResolver", "Lcoil/size/Scale;", "Lcoil/size/Scale;", "I", "()Lcoil/size/Scale;", "scale", "Lj0/k;", "D", "Lj0/k;", "()Lj0/k;", "parameters", ExifInterface.LONGITUDE_EAST, "F", "placeholderMemoryCacheKey", "Ljava/lang/Integer;", "placeholderResId", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "errorResId", "errorDrawable", "fallbackResId", "fallbackDrawable", "Lj0/b;", "Lj0/b;", "()Lj0/b;", "defined", "Lj0/a;", "Lj0/a;", "()Lj0/a;", "defaults", "()Landroid/graphics/drawable/Drawable;", "placeholder", "error", "fallback", "<init>", "(Landroid/content/Context;Ljava/lang/Object;Ll0/a;Lj0/f$b;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lcoil/size/Precision;Lkotlin/Pair;La0/e$a;Ljava/util/List;Ln0/c$a;Lokhttp3/Headers;Lj0/n;ZZZZLcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Ldo/h0;Ldo/h0;Ldo/h0;Ldo/h0;Landroidx/lifecycle/Lifecycle;Lk0/h;Lcoil/size/Scale;Lj0/k;Lcoil/memory/MemoryCache$Key;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Lj0/b;Lj0/a;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class f {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Lifecycle lifecycle;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final k0.h sizeResolver;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final Scale scale;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Parameters parameters;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public final MemoryCache.Key placeholderMemoryCacheKey;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public final Integer placeholderResId;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public final Drawable placeholderDrawable;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public final Integer errorResId;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public final Drawable errorDrawable;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public final Integer fallbackResId;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    public final Drawable fallbackDrawable;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public final j0.b defined;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public final j0.a defaults;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final l0.a target;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final b listener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final MemoryCache.Key memoryCacheKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String diskCacheKey;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ColorSpace colorSpace;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Precision precision;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Pair<i.a<?>, Class<?>> fetcherFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final e.a decoderFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<m0.a> transformations;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.a transitionFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Headers headers;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Tags tags;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final boolean allowConversionToBitmap;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final boolean allowHardware;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final boolean allowRgb565;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final boolean premultipliedAlpha;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CachePolicy memoryCachePolicy;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CachePolicy diskCachePolicy;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CachePolicy networkCachePolicy;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 interceptorDispatcher;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 fetcherDispatcher;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 decoderDispatcher;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 transformationDispatcher;

    /* JADX INFO: compiled from: ImageRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001B\u001e\b\u0017\u0012\u0007\u0010\u008e\u0001\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001c¢\u0006\u0006\b\u008c\u0001\u0010\u008f\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001b\u001a\u00020\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010/R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00101R,\u00106\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u000303\u0012\b\u0012\u0006\u0012\u0002\b\u000304\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00108R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER(\u0010J\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u000304\u0012\u0004\u0012\u00020\u0001\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\u0016\u0010U\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010MR\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010[\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010XR\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010c\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010`R\u0018\u0010g\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010`R\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010m\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010&R\u0018\u0010q\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010u\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010w\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bv\u0010pR\u0018\u0010y\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010tR\u0018\u0010{\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bz\u0010pR\u0018\u0010}\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010tR\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u007fR\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0082\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0085\u0001¨\u0006\u0090\u0001"}, d2 = {"Lj0/f$a;", "", "Lbn/r;", InneractiveMediationDefs.GENDER_FEMALE, "e", "Landroidx/lifecycle/Lifecycle;", "g", "Lk0/h;", "i", "Lcoil/size/Scale;", "h", "data", "b", "resolver", CampaignEx.JSON_KEY_AD_K, "scale", "j", "Lcoil/size/Precision;", "precision", "d", "Ll0/a;", TypedValues.AttributesType.S_TARGET, "l", "Lj0/a;", "defaults", "c", "Lj0/f;", "a", "Landroid/content/Context;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lj0/a;", "Ljava/lang/Object;", "Ll0/a;", "Lj0/f$b;", "Lj0/f$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/memory/MemoryCache$Key;", "Lcoil/memory/MemoryCache$Key;", "memoryCacheKey", "", "Ljava/lang/String;", "diskCacheKey", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/ColorSpace;", "Landroid/graphics/ColorSpace;", "colorSpace", "Lcoil/size/Precision;", "Lkotlin/Pair;", "Ld0/i$a;", "Ljava/lang/Class;", "Lkotlin/Pair;", "fetcherFactory", "La0/e$a;", "La0/e$a;", "decoderFactory", "", "Lm0/a;", InneractiveMediationDefs.GENDER_MALE, "Ljava/util/List;", "transformations", "Ln0/c$a;", "n", "Ln0/c$a;", "transitionFactory", "Lokhttp3/Headers$Builder;", "o", "Lokhttp3/Headers$Builder;", "headers", "", "p", "Ljava/util/Map;", "tags", "", "q", "Z", "allowConversionToBitmap", "r", "Ljava/lang/Boolean;", "allowHardware", "s", "allowRgb565", "t", "premultipliedAlpha", "Lcoil/request/CachePolicy;", "u", "Lcoil/request/CachePolicy;", "memoryCachePolicy", "v", "diskCachePolicy", "w", "networkCachePolicy", "Ldo/h0;", VastAttributes.HORIZONTAL_POSITION, "Ldo/h0;", "interceptorDispatcher", VastAttributes.VERTICAL_POSITION, "fetcherDispatcher", "z", "decoderDispatcher", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "transformationDispatcher", "Lj0/k$a;", "B", "Lj0/k$a;", "parameters", "C", "placeholderMemoryCacheKey", "", "D", "Ljava/lang/Integer;", "placeholderResId", "Landroid/graphics/drawable/Drawable;", ExifInterface.LONGITUDE_EAST, "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "F", "errorResId", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "errorDrawable", "H", "fallbackResId", "I", "fallbackDrawable", "J", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "K", "Lk0/h;", "sizeResolver", "L", "Lcoil/size/Scale;", "M", "resolvedLifecycle", "N", "resolvedSizeResolver", "O", "resolvedScale", "<init>", "(Landroid/content/Context;)V", AdActivity.REQUEST_KEY_EXTRA, "(Lj0/f;Landroid/content/Context;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        @Nullable
        public h0 transformationDispatcher;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        @Nullable
        public Parameters.a parameters;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        @Nullable
        public MemoryCache.Key placeholderMemoryCacheKey;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        @DrawableRes
        @Nullable
        public Integer placeholderResId;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        @Nullable
        public Drawable placeholderDrawable;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        @DrawableRes
        @Nullable
        public Integer errorResId;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        @Nullable
        public Drawable errorDrawable;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        @DrawableRes
        @Nullable
        public Integer fallbackResId;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        @Nullable
        public Drawable fallbackDrawable;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        @Nullable
        public Lifecycle lifecycle;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        @Nullable
        public k0.h sizeResolver;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata */
        @Nullable
        public Scale scale;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata */
        @Nullable
        public Lifecycle resolvedLifecycle;

        /* JADX INFO: renamed from: N, reason: from kotlin metadata */
        @Nullable
        public k0.h resolvedSizeResolver;

        /* JADX INFO: renamed from: O, reason: from kotlin metadata */
        @Nullable
        public Scale resolvedScale;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public j0.a defaults;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Object data;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public l0.a target;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public b listener;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public MemoryCache.Key memoryCacheKey;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String diskCacheKey;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Bitmap.Config bitmapConfig;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public ColorSpace colorSpace;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Precision precision;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Pair<? extends i.a<?>, ? extends Class<?>> fetcherFactory;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public e.a decoderFactory;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public List<? extends m0.a> transformations;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public c.a transitionFactory;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Headers.Builder headers;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Map<Class<?>, Object> tags;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        public boolean allowConversionToBitmap;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Boolean allowHardware;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Boolean allowRgb565;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        public boolean premultipliedAlpha;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public CachePolicy memoryCachePolicy;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public CachePolicy diskCachePolicy;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public CachePolicy networkCachePolicy;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public h0 interceptorDispatcher;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public h0 fetcherDispatcher;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public h0 decoderDispatcher;

        public a(@NotNull Context context) {
            this.context = context;
            this.defaults = o0.h.b();
            this.data = null;
            this.target = null;
            this.listener = null;
            this.memoryCacheKey = null;
            this.diskCacheKey = null;
            this.bitmapConfig = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.colorSpace = null;
            }
            this.precision = null;
            this.fetcherFactory = null;
            this.decoderFactory = null;
            this.transformations = w.m();
            this.transitionFactory = null;
            this.headers = null;
            this.tags = null;
            this.allowConversionToBitmap = true;
            this.allowHardware = null;
            this.allowRgb565 = null;
            this.premultipliedAlpha = true;
            this.memoryCachePolicy = null;
            this.diskCachePolicy = null;
            this.networkCachePolicy = null;
            this.interceptorDispatcher = null;
            this.fetcherDispatcher = null;
            this.decoderDispatcher = null;
            this.transformationDispatcher = null;
            this.parameters = null;
            this.placeholderMemoryCacheKey = null;
            this.placeholderResId = null;
            this.placeholderDrawable = null;
            this.errorResId = null;
            this.errorDrawable = null;
            this.fallbackResId = null;
            this.fallbackDrawable = null;
            this.lifecycle = null;
            this.sizeResolver = null;
            this.scale = null;
            this.resolvedLifecycle = null;
            this.resolvedSizeResolver = null;
            this.resolvedScale = null;
        }

        public a(@NotNull f fVar, @NotNull Context context) {
            this.context = context;
            this.defaults = fVar.getDefaults();
            this.data = fVar.getData();
            this.target = fVar.getTarget();
            this.listener = fVar.getListener();
            this.memoryCacheKey = fVar.getMemoryCacheKey();
            this.diskCacheKey = fVar.getDiskCacheKey();
            this.bitmapConfig = fVar.getDefined().getBitmapConfig();
            if (Build.VERSION.SDK_INT >= 26) {
                this.colorSpace = fVar.getColorSpace();
            }
            this.precision = fVar.getDefined().getPrecision();
            this.fetcherFactory = fVar.v();
            this.decoderFactory = fVar.getDecoderFactory();
            this.transformations = fVar.N();
            this.transitionFactory = fVar.getDefined().getTransitionFactory();
            this.headers = fVar.getHeaders().newBuilder();
            this.tags = kotlin.collections.a.C(fVar.getTags().a());
            this.allowConversionToBitmap = fVar.getAllowConversionToBitmap();
            this.allowHardware = fVar.getDefined().getAllowHardware();
            this.allowRgb565 = fVar.getDefined().getAllowRgb565();
            this.premultipliedAlpha = fVar.getPremultipliedAlpha();
            this.memoryCachePolicy = fVar.getDefined().getMemoryCachePolicy();
            this.diskCachePolicy = fVar.getDefined().getDiskCachePolicy();
            this.networkCachePolicy = fVar.getDefined().getNetworkCachePolicy();
            this.interceptorDispatcher = fVar.getDefined().getInterceptorDispatcher();
            this.fetcherDispatcher = fVar.getDefined().getFetcherDispatcher();
            this.decoderDispatcher = fVar.getDefined().getDecoderDispatcher();
            this.transformationDispatcher = fVar.getDefined().getTransformationDispatcher();
            this.parameters = fVar.getParameters().g();
            this.placeholderMemoryCacheKey = fVar.getPlaceholderMemoryCacheKey();
            this.placeholderResId = fVar.placeholderResId;
            this.placeholderDrawable = fVar.placeholderDrawable;
            this.errorResId = fVar.errorResId;
            this.errorDrawable = fVar.errorDrawable;
            this.fallbackResId = fVar.fallbackResId;
            this.fallbackDrawable = fVar.fallbackDrawable;
            this.lifecycle = fVar.getDefined().getLifecycle();
            this.sizeResolver = fVar.getDefined().getSizeResolver();
            this.scale = fVar.getDefined().getScale();
            if (fVar.getContext() == context) {
                this.resolvedLifecycle = fVar.getLifecycle();
                this.resolvedSizeResolver = fVar.getSizeResolver();
                this.resolvedScale = fVar.getScale();
            } else {
                this.resolvedLifecycle = null;
                this.resolvedSizeResolver = null;
                this.resolvedScale = null;
            }
        }

        @NotNull
        public final f a() {
            Context context = this.context;
            Object obj = this.data;
            if (obj == null) {
                obj = h.f72136a;
            }
            Object obj2 = obj;
            l0.a aVar = this.target;
            b bVar = this.listener;
            MemoryCache.Key key = this.memoryCacheKey;
            String str = this.diskCacheKey;
            Bitmap.Config configC = this.bitmapConfig;
            if (configC == null) {
                configC = this.defaults.getBitmapConfig();
            }
            Bitmap.Config config = configC;
            ColorSpace colorSpace = this.colorSpace;
            Precision precisionM = this.precision;
            if (precisionM == null) {
                precisionM = this.defaults.getPrecision();
            }
            Precision precision = precisionM;
            Pair<? extends i.a<?>, ? extends Class<?>> pair = this.fetcherFactory;
            e.a aVar2 = this.decoderFactory;
            List<? extends m0.a> list = this.transformations;
            c.a aVarO = this.transitionFactory;
            if (aVarO == null) {
                aVarO = this.defaults.getTransitionFactory();
            }
            c.a aVar3 = aVarO;
            Headers.Builder builder = this.headers;
            Headers headersY = o0.i.y(builder != null ? builder.build() : null);
            Map<Class<?>, ? extends Object> map = this.tags;
            Tags tagsX = o0.i.x(map != null ? Tags.INSTANCE.a(map) : null);
            boolean z10 = this.allowConversionToBitmap;
            Boolean bool = this.allowHardware;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : this.defaults.getAllowHardware();
            Boolean bool2 = this.allowRgb565;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : this.defaults.getAllowRgb565();
            boolean z11 = this.premultipliedAlpha;
            CachePolicy cachePolicyJ = this.memoryCachePolicy;
            if (cachePolicyJ == null) {
                cachePolicyJ = this.defaults.getMemoryCachePolicy();
            }
            CachePolicy cachePolicy = cachePolicyJ;
            CachePolicy cachePolicyE = this.diskCachePolicy;
            if (cachePolicyE == null) {
                cachePolicyE = this.defaults.getDiskCachePolicy();
            }
            CachePolicy cachePolicy2 = cachePolicyE;
            CachePolicy cachePolicyK = this.networkCachePolicy;
            if (cachePolicyK == null) {
                cachePolicyK = this.defaults.getNetworkCachePolicy();
            }
            CachePolicy cachePolicy3 = cachePolicyK;
            h0 h0VarI = this.interceptorDispatcher;
            if (h0VarI == null) {
                h0VarI = this.defaults.getInterceptorDispatcher();
            }
            h0 h0Var = h0VarI;
            h0 h0VarH = this.fetcherDispatcher;
            if (h0VarH == null) {
                h0VarH = this.defaults.getFetcherDispatcher();
            }
            h0 h0Var2 = h0VarH;
            h0 h0VarD = this.decoderDispatcher;
            if (h0VarD == null) {
                h0VarD = this.defaults.getDecoderDispatcher();
            }
            h0 h0Var3 = h0VarD;
            h0 h0VarN = this.transformationDispatcher;
            if (h0VarN == null) {
                h0VarN = this.defaults.getTransformationDispatcher();
            }
            h0 h0Var4 = h0VarN;
            Lifecycle lifecycleG = this.lifecycle;
            if (lifecycleG == null && (lifecycleG = this.resolvedLifecycle) == null) {
                lifecycleG = g();
            }
            Lifecycle lifecycle = lifecycleG;
            k0.h hVarI = this.sizeResolver;
            if (hVarI == null && (hVarI = this.resolvedSizeResolver) == null) {
                hVarI = i();
            }
            k0.h hVar = hVarI;
            Scale scaleH = this.scale;
            if (scaleH == null && (scaleH = this.resolvedScale) == null) {
                scaleH = h();
            }
            Scale scale = scaleH;
            Parameters.a aVar4 = this.parameters;
            return new f(context, obj2, aVar, bVar, key, str, config, colorSpace, precision, pair, aVar2, list, aVar3, headersY, tagsX, z10, zBooleanValue, zBooleanValue2, z11, cachePolicy, cachePolicy2, cachePolicy3, h0Var, h0Var2, h0Var3, h0Var4, lifecycle, hVar, scale, o0.i.w(aVar4 != null ? aVar4.a() : null), this.placeholderMemoryCacheKey, this.placeholderResId, this.placeholderDrawable, this.errorResId, this.errorDrawable, this.fallbackResId, this.fallbackDrawable, new j0.b(this.lifecycle, this.sizeResolver, this.scale, this.interceptorDispatcher, this.fetcherDispatcher, this.decoderDispatcher, this.transformationDispatcher, this.transitionFactory, this.precision, this.bitmapConfig, this.allowHardware, this.allowRgb565, this.memoryCachePolicy, this.diskCachePolicy, this.networkCachePolicy), this.defaults, null);
        }

        @NotNull
        public final a b(@Nullable Object data) {
            this.data = data;
            return this;
        }

        @NotNull
        public final a c(@NotNull j0.a defaults) {
            this.defaults = defaults;
            e();
            return this;
        }

        @NotNull
        public final a d(@NotNull Precision precision) {
            this.precision = precision;
            return this;
        }

        public final void e() {
            this.resolvedScale = null;
        }

        public final void f() {
            this.resolvedLifecycle = null;
            this.resolvedSizeResolver = null;
            this.resolvedScale = null;
        }

        public final Lifecycle g() {
            l0.a aVar = this.target;
            Lifecycle lifecycleC = o0.d.c(aVar instanceof l0.b ? ((l0.b) aVar).getView().getContext() : this.context);
            return lifecycleC == null ? GlobalLifecycle.f6975b : lifecycleC;
        }

        public final Scale h() {
            View view;
            k0.h hVar = this.sizeResolver;
            View view2 = null;
            ViewSizeResolver viewSizeResolver = hVar instanceof ViewSizeResolver ? (ViewSizeResolver) hVar : null;
            if (viewSizeResolver == null || (view = viewSizeResolver.getView()) == null) {
                l0.a aVar = this.target;
                l0.b bVar = aVar instanceof l0.b ? (l0.b) aVar : null;
                if (bVar != null) {
                    view2 = bVar.getView();
                }
            } else {
                view2 = view;
            }
            return view2 instanceof ImageView ? o0.i.o((ImageView) view2) : Scale.FIT;
        }

        public final k0.h i() {
            l0.a aVar = this.target;
            if (!(aVar instanceof l0.b)) {
                return new k0.d(this.context);
            }
            View view = ((l0.b) aVar).getView();
            if (view instanceof ImageView) {
                ImageView.ScaleType scaleType = ((ImageView) view).getScaleType();
                if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                    return k0.i.a(Size.f72688d);
                }
            }
            return k0.j.b(view, false, 2, null);
        }

        @NotNull
        public final a j(@NotNull Scale scale) {
            this.scale = scale;
            return this;
        }

        @NotNull
        public final a k(@NotNull k0.h resolver) {
            this.sizeResolver = resolver;
            f();
            return this;
        }

        @NotNull
        public final a l(@Nullable l0.a target) {
            this.target = target;
            f();
            return this;
        }
    }

    /* JADX INFO: compiled from: ImageRequest.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\nH\u0017¨\u0006\f"}, d2 = {"Lj0/f$b;", "", "Lj0/f;", AdActivity.REQUEST_KEY_EXTRA, "Lbn/r;", "b", "d", "Lj0/d;", "result", "c", "Lj0/m;", "a", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public interface b {
        @MainThread
        void a(@NotNull f fVar, @NotNull m mVar);

        @MainThread
        void b(@NotNull f fVar);

        @MainThread
        void c(@NotNull f fVar, @NotNull d dVar);

        @MainThread
        void d(@NotNull f fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(Context context, Object obj, l0.a aVar, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair<? extends i.a<?>, ? extends Class<?>> pair, e.a aVar2, List<? extends m0.a> list, c.a aVar3, Headers headers, Tags tags, boolean z10, boolean z11, boolean z12, boolean z13, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, Lifecycle lifecycle, k0.h hVar, Scale scale, Parameters parameters, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, j0.b bVar2, j0.a aVar4) {
        this.context = context;
        this.data = obj;
        this.target = aVar;
        this.listener = bVar;
        this.memoryCacheKey = key;
        this.diskCacheKey = str;
        this.bitmapConfig = config;
        this.colorSpace = colorSpace;
        this.precision = precision;
        this.fetcherFactory = pair;
        this.decoderFactory = aVar2;
        this.transformations = list;
        this.transitionFactory = aVar3;
        this.headers = headers;
        this.tags = tags;
        this.allowConversionToBitmap = z10;
        this.allowHardware = z11;
        this.allowRgb565 = z12;
        this.premultipliedAlpha = z13;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
        this.interceptorDispatcher = h0Var;
        this.fetcherDispatcher = h0Var2;
        this.decoderDispatcher = h0Var3;
        this.transformationDispatcher = h0Var4;
        this.lifecycle = lifecycle;
        this.sizeResolver = hVar;
        this.scale = scale;
        this.parameters = parameters;
        this.placeholderMemoryCacheKey = key2;
        this.placeholderResId = num;
        this.placeholderDrawable = drawable;
        this.errorResId = num2;
        this.errorDrawable = drawable2;
        this.fallbackResId = num3;
        this.fallbackDrawable = drawable3;
        this.defined = bVar2;
        this.defaults = aVar4;
    }

    public /* synthetic */ f(Context context, Object obj, l0.a aVar, b bVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, e.a aVar2, List list, c.a aVar3, Headers headers, Tags tags, boolean z10, boolean z11, boolean z12, boolean z13, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, Lifecycle lifecycle, k0.h hVar, Scale scale, Parameters parameters, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, j0.b bVar2, j0.a aVar4, tn.i iVar) {
        this(context, obj, aVar, bVar, key, str, config, colorSpace, precision, pair, aVar2, list, aVar3, headers, tags, z10, z11, z12, z13, cachePolicy, cachePolicy2, cachePolicy3, h0Var, h0Var2, h0Var3, h0Var4, lifecycle, hVar, scale, parameters, key2, num, drawable, num2, drawable2, num3, drawable3, bVar2, aVar4);
    }

    public static /* synthetic */ a Q(f fVar, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = fVar.context;
        }
        return fVar.P(context);
    }

    @Nullable
    /* JADX INFO: renamed from: A, reason: from getter */
    public final MemoryCache.Key getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    @NotNull
    /* JADX INFO: renamed from: B, reason: from getter */
    public final CachePolicy getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: C, reason: from getter */
    public final CachePolicy getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: D, reason: from getter */
    public final Parameters getParameters() {
        return this.parameters;
    }

    @Nullable
    public final Drawable E() {
        return o0.h.c(this, this.placeholderDrawable, this.placeholderResId, this.defaults.getPlaceholder());
    }

    @Nullable
    /* JADX INFO: renamed from: F, reason: from getter */
    public final MemoryCache.Key getPlaceholderMemoryCacheKey() {
        return this.placeholderMemoryCacheKey;
    }

    @NotNull
    /* JADX INFO: renamed from: G, reason: from getter */
    public final Precision getPrecision() {
        return this.precision;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final boolean getPremultipliedAlpha() {
        return this.premultipliedAlpha;
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final Scale getScale() {
        return this.scale;
    }

    @NotNull
    /* JADX INFO: renamed from: J, reason: from getter */
    public final k0.h getSizeResolver() {
        return this.sizeResolver;
    }

    @NotNull
    /* JADX INFO: renamed from: K, reason: from getter */
    public final Tags getTags() {
        return this.tags;
    }

    @Nullable
    /* JADX INFO: renamed from: L, reason: from getter */
    public final l0.a getTarget() {
        return this.target;
    }

    @NotNull
    /* JADX INFO: renamed from: M, reason: from getter */
    public final h0 getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    @NotNull
    public final List<m0.a> N() {
        return this.transformations;
    }

    @NotNull
    /* JADX INFO: renamed from: O, reason: from getter */
    public final c.a getTransitionFactory() {
        return this.transitionFactory;
    }

    @NotNull
    public final a P(@NotNull Context context) {
        return new a(this, context);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof f) {
            f fVar = (f) other;
            if (p.f(this.context, fVar.context) && p.f(this.data, fVar.data) && p.f(this.target, fVar.target) && p.f(this.listener, fVar.listener) && p.f(this.memoryCacheKey, fVar.memoryCacheKey) && p.f(this.diskCacheKey, fVar.diskCacheKey) && this.bitmapConfig == fVar.bitmapConfig && ((Build.VERSION.SDK_INT < 26 || p.f(this.colorSpace, fVar.colorSpace)) && this.precision == fVar.precision && p.f(this.fetcherFactory, fVar.fetcherFactory) && p.f(this.decoderFactory, fVar.decoderFactory) && p.f(this.transformations, fVar.transformations) && p.f(this.transitionFactory, fVar.transitionFactory) && p.f(this.headers, fVar.headers) && p.f(this.tags, fVar.tags) && this.allowConversionToBitmap == fVar.allowConversionToBitmap && this.allowHardware == fVar.allowHardware && this.allowRgb565 == fVar.allowRgb565 && this.premultipliedAlpha == fVar.premultipliedAlpha && this.memoryCachePolicy == fVar.memoryCachePolicy && this.diskCachePolicy == fVar.diskCachePolicy && this.networkCachePolicy == fVar.networkCachePolicy && p.f(this.interceptorDispatcher, fVar.interceptorDispatcher) && p.f(this.fetcherDispatcher, fVar.fetcherDispatcher) && p.f(this.decoderDispatcher, fVar.decoderDispatcher) && p.f(this.transformationDispatcher, fVar.transformationDispatcher) && p.f(this.placeholderMemoryCacheKey, fVar.placeholderMemoryCacheKey) && p.f(this.placeholderResId, fVar.placeholderResId) && p.f(this.placeholderDrawable, fVar.placeholderDrawable) && p.f(this.errorResId, fVar.errorResId) && p.f(this.errorDrawable, fVar.errorDrawable) && p.f(this.fallbackResId, fVar.fallbackResId) && p.f(this.fallbackDrawable, fVar.fallbackDrawable) && p.f(this.lifecycle, fVar.lifecycle) && p.f(this.sizeResolver, fVar.sizeResolver) && this.scale == fVar.scale && p.f(this.parameters, fVar.parameters) && p.f(this.defined, fVar.defined) && p.f(this.defaults, fVar.defaults))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getAllowConversionToBitmap() {
        return this.allowConversionToBitmap;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getAllowHardware() {
        return this.allowHardware;
    }

    public int hashCode() {
        int iHashCode = ((this.context.hashCode() * 31) + this.data.hashCode()) * 31;
        l0.a aVar = this.target;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        b bVar = this.listener;
        int iHashCode3 = (iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.memoryCacheKey;
        int iHashCode4 = (iHashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.diskCacheKey;
        int iHashCode5 = (((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.bitmapConfig.hashCode()) * 31;
        ColorSpace colorSpace = this.colorSpace;
        int iHashCode6 = (((iHashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.precision.hashCode()) * 31;
        Pair<i.a<?>, Class<?>> pair = this.fetcherFactory;
        int iHashCode7 = (iHashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        e.a aVar2 = this.decoderFactory;
        int iHashCode8 = (((((((((((((((((((((((((((((((((((((((iHashCode7 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + this.transformations.hashCode()) * 31) + this.transitionFactory.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.tags.hashCode()) * 31) + Boolean.hashCode(this.allowConversionToBitmap)) * 31) + Boolean.hashCode(this.allowHardware)) * 31) + Boolean.hashCode(this.allowRgb565)) * 31) + Boolean.hashCode(this.premultipliedAlpha)) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31) + this.interceptorDispatcher.hashCode()) * 31) + this.fetcherDispatcher.hashCode()) * 31) + this.decoderDispatcher.hashCode()) * 31) + this.transformationDispatcher.hashCode()) * 31) + this.lifecycle.hashCode()) * 31) + this.sizeResolver.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.parameters.hashCode()) * 31;
        MemoryCache.Key key2 = this.placeholderMemoryCacheKey;
        int iHashCode9 = (iHashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.placeholderResId;
        int iHashCode10 = (iHashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.placeholderDrawable;
        int iHashCode11 = (iHashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.errorResId;
        int iHashCode12 = (iHashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.errorDrawable;
        int iHashCode13 = (iHashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.fallbackResId;
        int iHashCode14 = (iHashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.fallbackDrawable;
        return ((((iHashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.defined.hashCode()) * 31) + this.defaults.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final h0 getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final e.a getDecoderFactory() {
        return this.decoderFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final j0.a getDefaults() {
        return this.defaults;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final j0.b getDefined() {
        return this.defined;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public final CachePolicy getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    @Nullable
    public final Drawable s() {
        return o0.h.c(this, this.errorDrawable, this.errorResId, this.defaults.getError());
    }

    @Nullable
    public final Drawable t() {
        return o0.h.c(this, this.fallbackDrawable, this.fallbackResId, this.defaults.getFallback());
    }

    @NotNull
    /* JADX INFO: renamed from: u, reason: from getter */
    public final h0 getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    @Nullable
    public final Pair<i.a<?>, Class<?>> v() {
        return this.fetcherFactory;
    }

    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: x, reason: from getter */
    public final h0 getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    @NotNull
    /* JADX INFO: renamed from: y, reason: from getter */
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @Nullable
    /* JADX INFO: renamed from: z, reason: from getter */
    public final b getListener() {
        return this.listener;
    }
}
