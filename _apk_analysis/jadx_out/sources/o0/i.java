package o0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import b0.a;
import bo.d0;
import bo.z;
import cn.f0;
import coil.base.R$id;
import coil.decode.DataSource;
import coil.intercept.RealInterceptorChain;
import coil.request.ViewTargetRequestManager;
import coil.view.Scale;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.squareup.picasso.AssetRequestHandler;
import e0.a;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import j0.Parameters;
import j0.Tags;
import java.io.Closeable;
import java.io.File;
import k0.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u000e\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0007H\u0000\u001a\u000e\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\tH\u0000\u001a\u000e\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\u000bH\u0000\u001a\b\u0010\u000e\u001a\u00020\rH\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0000\u001a\f\u0010\u0013\u001a\u00020\u0001*\u00020\u0012H\u0000\u001a\f\u0010\u0014\u001a\u00020\r*\u00020\u000fH\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u000f*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0000\u001a\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000\u001a\u0014\u0010\u001e\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0000\u001a\u0018\u0010$\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020!H\u0000\" \u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)\"\u001a\u0010.\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010+\u001a\u0004\b,\u0010-\"\u001a\u00102\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010/\u001a\u0004\b0\u00101\"\u0018\u00107\u001a\u000204*\u0002038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\"\u0018\u0010;\u001a\u00020\u0004*\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:\"\u0018\u0010?\u001a\u00020\u000f*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>\"\u0018\u0010A\u001a\u00020\u000f*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010>\"\u0018\u0010D\u001a\u00020\r*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C\"\u0018\u0010\u0017\u001a\u00020\u0016*\u00020E8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G\"\u001a\u0010J\u001a\u0004\u0018\u00010\u0004*\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I\"\u0018\u0010N\u001a\u00020\u000f*\u00020K8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M\"\u0018\u0010R\u001a\u00020O*\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q\"\u0018\u0010V\u001a\u00020\r*\u00020S8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U\"\u0018\u0010Z\u001a\u00020W*\u00020S8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006["}, d2 = {"Ljava/io/Closeable;", "Lbn/r;", "d", "Landroid/webkit/MimeTypeMap;", "", "url", CampaignEx.JSON_KEY_AD_K, "Lokhttp3/Headers;", VastAttributes.VERTICAL_POSITION, "Lj0/n;", VastAttributes.HORIZONTAL_POSITION, "Lj0/k;", "w", "", "s", "", "defaultValue", "z", "Lb0/a$b;", "a", "t", "Lk0/c;", "Lcoil/size/Scale;", "scale", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/net/Uri;", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "r", "Lokhttp3/Headers$Builder;", "line", "b", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "e", "percent", "c", "", "Landroid/graphics/Bitmap$Config;", "[Landroid/graphics/Bitmap$Config;", "p", "()[Landroid/graphics/Bitmap$Config;", "VALID_TRANSFORMATION_CONFIGS", "Landroid/graphics/Bitmap$Config;", InneractiveMediationDefs.GENDER_FEMALE, "()Landroid/graphics/Bitmap$Config;", "DEFAULT_BITMAP_CONFIG", "Lokhttp3/Headers;", "getEMPTY_HEADERS", "()Lokhttp3/Headers;", "EMPTY_HEADERS", "Landroid/view/View;", "Lcoil/request/ViewTargetRequestManager;", InneractiveMediationDefs.GENDER_MALE, "(Landroid/view/View;)Lcoil/request/ViewTargetRequestManager;", "requestManager", "Lcoil/decode/DataSource;", "g", "(Lcoil/decode/DataSource;)Ljava/lang/String;", "emoji", "Landroid/graphics/drawable/Drawable;", "q", "(Landroid/graphics/drawable/Drawable;)I", "width", "j", "height", "v", "(Landroid/graphics/drawable/Drawable;)Z", "isVector", "Landroid/widget/ImageView;", "o", "(Landroid/widget/ImageView;)Lcoil/size/Scale;", "i", "(Landroid/net/Uri;)Ljava/lang/String;", "firstPathSegment", "Landroid/content/res/Configuration;", "l", "(Landroid/content/res/Configuration;)I", "nightMode", "Ljava/io/File;", "n", "(Landroid/content/Context;)Ljava/io/File;", "safeCacheDir", "Le0/a$a;", "u", "(Le0/a$a;)Z", "isPlaceholderCached", "Ly/c;", "h", "(Le0/a$a;)Ly/c;", "eventListener", "coil-base_release"}, k = 2, mv = {1, 7, 1})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Bitmap.Config[] f75972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Bitmap.Config f75973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Headers f75974c;

    /* JADX INFO: compiled from: Utils.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DataSource.values().length];
            iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
            iArr[DataSource.MEMORY.ordinal()] = 2;
            iArr[DataSource.DISK.ordinal()] = 3;
            iArr[DataSource.NETWORK.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Scale.values().length];
            iArr3[Scale.FILL.ordinal()] = 1;
            iArr3[Scale.FIT.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f75972a = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f75973b = i10 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f75974c = new Headers.Builder().build();
    }

    public static final int A(@NotNull k0.c cVar, @NotNull Scale scale) {
        if (cVar instanceof c.a) {
            return ((c.a) cVar).px;
        }
        int i10 = a.$EnumSwitchMapping$2[scale.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void a(@NotNull a.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final Headers.Builder b(@NotNull Headers.Builder builder, @NotNull String str) {
        int iQ0 = d0.q0(str, ':', 0, false, 6, null);
        if (!(iQ0 != -1)) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iQ0);
        tn.p.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String string = d0.s1(strSubstring).toString();
        String strSubstring2 = str.substring(iQ0 + 1);
        tn.p.j(strSubstring2, "this as java.lang.String).substring(startIndex)");
        builder.addUnsafeNonAscii(string, strSubstring2);
        return builder;
    }

    public static final int c(@NotNull Context context, double d10) {
        int largeMemoryClass;
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            tn.p.h(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        double d11 = 1024;
        return (int) (d10 * ((double) largeMemoryClass) * d11 * d11);
    }

    public static final void d(@NotNull Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final double e(@NotNull Context context) {
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            tn.p.h(systemService);
            return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    @NotNull
    public static final Bitmap.Config f() {
        return f75973b;
    }

    @NotNull
    public static final String g(@NotNull DataSource dataSource) {
        int i10 = a.$EnumSwitchMapping$0[dataSource.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return "🧠";
        }
        if (i10 == 3) {
            return "💾";
        }
        if (i10 == 4) {
            return "☁️ ";
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final y.c h(@NotNull a.InterfaceC0737a interfaceC0737a) {
        return interfaceC0737a instanceof RealInterceptorChain ? ((RealInterceptorChain) interfaceC0737a).getEventListener() : y.c.f87206b;
    }

    @Nullable
    public static final String i(@NotNull Uri uri) {
        return (String) f0.v0(uri.getPathSegments());
    }

    public static final int j(@NotNull Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    @Nullable
    public static final String k(@NotNull MimeTypeMap mimeTypeMap, @Nullable String str) {
        if (str == null || d0.u0(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(d0.f1(d0.h1(d0.p1(d0.p1(str, '#', null, 2, null), '?', null, 2, null), '/', null, 2, null), '.', ""));
    }

    public static final int l(@NotNull Configuration configuration) {
        return configuration.uiMode & 48;
    }

    @NotNull
    public static final ViewTargetRequestManager m(@NotNull View view) {
        int i10 = R$id.coil_request_manager;
        Object tag = view.getTag(i10);
        ViewTargetRequestManager viewTargetRequestManager = tag instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager == null) {
            synchronized (view) {
                Object tag2 = view.getTag(i10);
                ViewTargetRequestManager viewTargetRequestManager2 = tag2 instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag2 : null;
                if (viewTargetRequestManager2 != null) {
                    viewTargetRequestManager = viewTargetRequestManager2;
                } else {
                    viewTargetRequestManager = new ViewTargetRequestManager(view);
                    view.addOnAttachStateChangeListener(viewTargetRequestManager);
                    view.setTag(i10, viewTargetRequestManager);
                }
            }
        }
        return viewTargetRequestManager;
    }

    @NotNull
    public static final File n(@NotNull Context context) {
        File cacheDir = context.getCacheDir();
        cacheDir.mkdirs();
        return cacheDir;
    }

    @NotNull
    public static final Scale o(@NotNull ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i10 = scaleType == null ? -1 : a.$EnumSwitchMapping$1[scaleType.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? Scale.FIT : Scale.FILL;
    }

    @NotNull
    public static final Bitmap.Config[] p() {
        return f75972a;
    }

    public static final int q(@NotNull Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean r(@NotNull Uri uri) {
        return tn.p.f(uri.getScheme(), C3978d4.i.f31327b) && tn.p.f(i(uri), AssetRequestHandler.ANDROID_ASSET);
    }

    public static final boolean s() {
        return tn.p.f(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean t(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE;
    }

    public static final boolean u(@NotNull a.InterfaceC0737a interfaceC0737a) {
        return (interfaceC0737a instanceof RealInterceptorChain) && ((RealInterceptorChain) interfaceC0737a).getIsPlaceholderCached();
    }

    public static final boolean v(@NotNull Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
    }

    @NotNull
    public static final Parameters w(@Nullable Parameters parameters) {
        return parameters == null ? Parameters.f72154d : parameters;
    }

    @NotNull
    public static final Tags x(@Nullable Tags tags) {
        return tags == null ? Tags.f72170c : tags;
    }

    @NotNull
    public static final Headers y(@Nullable Headers headers) {
        return headers == null ? f75974c : headers;
    }

    public static final int z(@NotNull String str, int i10) {
        Long lT = z.t(str);
        if (lT == null) {
            return i10;
        }
        long jLongValue = lT.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }
}
