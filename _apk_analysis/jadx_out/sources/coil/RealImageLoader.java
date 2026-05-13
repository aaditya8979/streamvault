package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.g;
import cn.f0;
import coil.decode.BitmapFactoryDecoder;
import coil.fetch.HttpUriFetcher;
import coil.intercept.EngineInterceptor;
import coil.memory.MemoryCache;
import com.applovin.sdk.AppLovinEventTypes;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.ui.AdActivity;
import d0.a;
import d0.b;
import d0.c;
import d0.e;
import d0.f;
import d0.j;
import d0.k;
import g0.e;
import g0.f;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import j0.a;
import j0.f;
import j0.l;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlinx.coroutines.d;
import o0.n;
import o0.q;
import o0.s;
import okhttp3.Call;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.i0;
import p000do.j2;
import p000do.l0;
import p000do.p0;
import p000do.w0;
import y.c;

/* JADX INFO: compiled from: RealImageLoader.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 f2\u00020\u0001:\u0001\u001dBg\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\u0006\u0010&\u001a\u00020\"\u0012\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'\u0012\u000e\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0'\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u0002000'\u0012\u0006\u00109\u001a\u000204\u0012\u0006\u0010?\u001a\u00020:\u0012\u0006\u0010D\u001a\u00020@\u0012\b\u0010I\u001a\u0004\u0018\u00010E¢\u0006\u0004\bd\u0010eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0083@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\"\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002R\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0'8\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010+R\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002000'8\u0006¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010+R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010D\u001a\u00020@8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010I\u001a\u0004\u0018\u00010E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010HR\u0014\u0010L\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010KR\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010NR\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010QR\u001d\u0010T\u001a\u0004\u0018\u00010(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b1\u0010SR\u001d\u0010X\u001a\u0004\u0018\u00010-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bU\u0010)\u001a\u0004\bV\u0010WR\u001a\u0010Z\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010<\u001a\u0004\b\u001d\u0010>R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006g"}, d2 = {"Lcoil/RealImageLoader;", "Lcoil/ImageLoader;", "Lj0/f;", AdActivity.REQUEST_KEY_EXTRA, "Lj0/c;", "b", "Lj0/g;", "d", "(Lj0/f;Lhn/c;)Ljava/lang/Object;", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "Lbn/r;", InneractiveMediationDefs.GENDER_MALE, "(I)V", "initialRequest", "type", "h", "(Lj0/f;ILhn/c;)Ljava/lang/Object;", "Lj0/m;", "result", "Ll0/a;", TypedValues.AttributesType.S_TARGET, "Ly/c;", "eventListener", "l", "Lj0/d;", CampaignEx.JSON_KEY_AD_K, "j", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lj0/a;", "Lj0/a;", "c", "()Lj0/a;", "defaults", "Lbn/g;", "Lcoil/memory/MemoryCache;", "Lbn/g;", "getMemoryCacheLazy", "()Lbn/g;", "memoryCacheLazy", "Lb0/a;", "getDiskCacheLazy", "diskCacheLazy", "Lokhttp3/Call$Factory;", "e", "getCallFactoryLazy", "callFactoryLazy", "Ly/c$d;", InneractiveMediationDefs.GENDER_FEMALE, "Ly/c$d;", "getEventListenerFactory", "()Ly/c$d;", "eventListenerFactory", "Ly/b;", "g", "Ly/b;", "getComponentRegistry", "()Ly/b;", "componentRegistry", "Lo0/n;", "Lo0/n;", "getOptions", "()Lo0/n;", "options", "Lo0/q;", "i", "Lo0/q;", "()Lo0/q;", "logger", "Ldo/l0;", "Ldo/l0;", "scope", "Lo0/s;", "Lo0/s;", "systemCallbacks", "Lj0/l;", "Lj0/l;", "requestService", "()Lcoil/memory/MemoryCache;", "memoryCache", "n", "getDiskCache", "()Lb0/a;", "diskCache", "o", "components", "", "Le0/a;", "p", "Ljava/util/List;", "interceptors", "Ljava/util/concurrent/atomic/AtomicBoolean;", "q", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isShutdown", "<init>", "(Landroid/content/Context;Lj0/a;Lbn/g;Lbn/g;Lbn/g;Ly/c$d;Ly/b;Lo0/n;Lo0/q;)V", "r", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class RealImageLoader implements ImageLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a defaults;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g<MemoryCache> memoryCacheLazy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g<b0.a> diskCacheLazy;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g<Call.Factory> callFactoryLazy;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.d eventListenerFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y.b componentRegistry;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n options;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final q logger;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 scope = d.a(j2.b(null, 1, null).plus(w0.c().M()).plus(new b(i0.D8, this)));

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s systemCallbacks;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l requestService;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g memoryCache;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g diskCache;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y.b components;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<e0.a> interceptors;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean isShutdown;

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"coil/RealImageLoader$b", "Lkotlin/coroutines/a;", "Ldo/i0;", "Lkotlin/coroutines/d;", GAMConfig.KEY_CONTEXT, "", "exception", "Lbn/r;", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1})
    public static final class b extends kotlin.coroutines.a implements i0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RealImageLoader f6813b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i0.b bVar, RealImageLoader realImageLoader) {
            super(bVar);
            this.f6813b = realImageLoader;
        }

        @Override // p000do.i0
        public void handleException(@NotNull kotlin.coroutines.d dVar, @NotNull Throwable th2) {
            q logger = this.f6813b.getLogger();
            if (logger != null) {
                o0.g.a(logger, "RealImageLoader", th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealImageLoader(@NotNull Context context, @NotNull a aVar, @NotNull g<? extends MemoryCache> gVar, @NotNull g<? extends b0.a> gVar2, @NotNull g<? extends Call.Factory> gVar3, @NotNull c.d dVar, @NotNull y.b bVar, @NotNull n nVar, @Nullable q qVar) {
        this.context = context;
        this.defaults = aVar;
        this.memoryCacheLazy = gVar;
        this.diskCacheLazy = gVar2;
        this.callFactoryLazy = gVar3;
        this.eventListenerFactory = dVar;
        this.componentRegistry = bVar;
        this.options = nVar;
        this.logger = qVar;
        s sVar = new s(this, context, nVar.getNetworkObserverEnabled());
        this.systemCallbacks = sVar;
        l lVar = new l(this, sVar, qVar);
        this.requestService = lVar;
        this.memoryCache = gVar;
        this.diskCache = gVar2;
        this.components = bVar.h().d(new g0.c(), HttpUrl.class).d(new g0.g(), String.class).d(new g0.b(), Uri.class).d(new f(), Uri.class).d(new e(), Integer.class).d(new g0.a(), byte[].class).c(new f0.c(), Uri.class).c(new f0.a(nVar.getAddLastModifiedToFileCacheKey()), File.class).b(new HttpUriFetcher.b(gVar3, gVar2, nVar.getRespectCacheHeaders()), Uri.class).b(new j.a(), File.class).b(new a.C0726a(), Uri.class).b(new e.a(), Uri.class).b(new k.b(), Uri.class).b(new f.a(), Drawable.class).b(new b.a(), Bitmap.class).b(new c.a(), ByteBuffer.class).a(new BitmapFactoryDecoder.c(nVar.getBitmapFactoryMaxParallelism(), nVar.getBitmapFactoryExifOrientationPolicy())).e();
        this.interceptors = f0.P0(getComponents().c(), new EngineInterceptor(this, lVar, qVar));
        this.isShutdown = new AtomicBoolean(false);
        sVar.c();
    }

    @Override // coil.ImageLoader
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public y.b getComponents() {
        return this.components;
    }

    @Override // coil.ImageLoader
    @NotNull
    public j0.c b(@NotNull j0.f request) {
        p0<? extends j0.g> p0VarB = i.b(this.scope, null, null, new RealImageLoader$enqueue$job$1(this, request, null), 3, null);
        return request.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET java.lang.String() instanceof l0.b ? o0.i.m(((l0.b) request.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET java.lang.String()).getView()).b(p0VarB) : new j0.i(p0VarB);
    }

    @Override // coil.ImageLoader
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public j0.a getDefaults() {
        return this.defaults;
    }

    @Override // coil.ImageLoader
    @Nullable
    public Object d(@NotNull j0.f fVar, @NotNull hn.c<? super j0.g> cVar) {
        return d.f(new RealImageLoader$execute$2(fVar, this, null), cVar);
    }

    @Override // coil.ImageLoader
    @Nullable
    public MemoryCache e() {
        return (MemoryCache) this.memoryCache.getValue();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c A[Catch: all -> 0x01a6, TryCatch #3 {all -> 0x01a6, blocks: (B:42:0x00f0, B:44:0x00f6, B:46:0x00fc, B:49:0x0104, B:52:0x010c, B:54:0x011e, B:56:0x0124, B:57:0x0127, B:59:0x0130, B:60:0x0133, B:53:0x011a), top: B:97:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a A[Catch: all -> 0x01a6, TryCatch #3 {all -> 0x01a6, blocks: (B:42:0x00f0, B:44:0x00f6, B:46:0x00fc, B:49:0x0104, B:52:0x010c, B:54:0x011e, B:56:0x0124, B:57:0x0127, B:59:0x0130, B:60:0x0133, B:53:0x011a), top: B:97:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0124 A[Catch: all -> 0x01a6, TryCatch #3 {all -> 0x01a6, blocks: (B:42:0x00f0, B:44:0x00f6, B:46:0x00fc, B:49:0x0104, B:52:0x010c, B:54:0x011e, B:56:0x0124, B:57:0x0127, B:59:0x0130, B:60:0x0133, B:53:0x011a), top: B:97:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130 A[Catch: all -> 0x01a6, TryCatch #3 {all -> 0x01a6, blocks: (B:42:0x00f0, B:44:0x00f6, B:46:0x00fc, B:49:0x0104, B:52:0x010c, B:54:0x011e, B:56:0x0124, B:57:0x0127, B:59:0x0130, B:60:0x0133, B:53:0x011a), top: B:97:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189 A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x0046, B:68:0x0183, B:70:0x0189, B:71:0x0194, B:73:0x0198), top: B:99:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0194 A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x0046, B:68:0x0183, B:70:0x0189, B:71:0x0194, B:73:0x0198), top: B:99:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ba A[Catch: all -> 0x01cf, TRY_LEAVE, TryCatch #5 {all -> 0x01cf, blocks: (B:82:0x01b6, B:84:0x01ba, B:87:0x01cb, B:88:0x01ce), top: B:100:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb A[Catch: all -> 0x01cf, TRY_ENTER, TryCatch #5 {all -> 0x01cf, blocks: (B:82:0x01b6, B:84:0x01ba, B:87:0x01cb, B:88:0x01ce), top: B:100:0x01b6 }] */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(j0.f r21, int r22, hn.c<? super j0.g> r23) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.h(j0.f, int, hn.c):java.lang.Object");
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final q getLogger() {
        return this.logger;
    }

    public final void j(j0.f fVar, y.c cVar) {
        q qVar = this.logger;
        if (qVar != null && qVar.getLevel() <= 4) {
            qVar.a("RealImageLoader", 4, "🏗  Cancelled - " + fVar.getData(), null);
        }
        cVar.d(fVar);
        f.b listener = fVar.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (listener != null) {
            listener.d(fVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(j0.d r7, l0.a r8, y.c r9) {
        /*
            r6 = this;
            j0.f r0 = r7.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String()
            o0.q r1 = r6.logger
            if (r1 == 0) goto L37
            r2 = 4
            int r3 = r1.getLevel()
            if (r3 > r2) goto L37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "🚨 Failed - "
            r3.append(r4)
            java.lang.Object r4 = r0.getData()
            r3.append(r4)
            java.lang.String r4 = " - "
            r3.append(r4)
            java.lang.Throwable r4 = r7.getThrowable()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r1.a(r5, r2, r3, r4)
        L37:
            boolean r1 = r8 instanceof n0.d
            if (r1 != 0) goto L3e
            if (r8 == 0) goto L6a
            goto L51
        L3e:
            j0.f r1 = r7.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String()
            n0.c$a r1 = r1.getTransitionFactory()
            r2 = r8
            n0.d r2 = (n0.d) r2
            n0.c r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof n0.b
            if (r2 == 0) goto L59
        L51:
            android.graphics.drawable.Drawable r1 = r7.getDrawable()
            r8.b(r1)
            goto L6a
        L59:
            j0.f r8 = r7.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String()
            r9.f(r8, r1)
            r1.a()
            j0.f r8 = r7.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String()
            r9.i(r8, r1)
        L6a:
            r9.c(r0, r7)
            j0.f$b r8 = r0.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()
            if (r8 == 0) goto L76
            r8.c(r0, r7)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.k(j0.d, l0.a, y.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(j0.m r7, l0.a r8, y.c r9) {
        /*
            r6 = this;
            j0.f r0 = r7.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String()
            coil.decode.DataSource r1 = r7.getDataSource()
            o0.q r2 = r6.logger
            if (r2 == 0) goto L41
            r3 = 4
            int r4 = r2.getLevel()
            if (r4 > r3) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = o0.i.g(r1)
            r4.append(r5)
            java.lang.String r5 = " Successful ("
            r4.append(r5)
            java.lang.String r1 = r1.name()
            r4.append(r1)
            java.lang.String r1 = ") - "
            r4.append(r1)
            java.lang.Object r1 = r0.getData()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r2.a(r5, r3, r1, r4)
        L41:
            boolean r1 = r8 instanceof n0.d
            if (r1 != 0) goto L48
            if (r8 == 0) goto L74
            goto L5b
        L48:
            j0.f r1 = r7.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String()
            n0.c$a r1 = r1.getTransitionFactory()
            r2 = r8
            n0.d r2 = (n0.d) r2
            n0.c r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof n0.b
            if (r2 == 0) goto L63
        L5b:
            android.graphics.drawable.Drawable r1 = r7.getDrawable()
            r8.onSuccess(r1)
            goto L74
        L63:
            j0.f r8 = r7.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String()
            r9.f(r8, r1)
            r1.a()
            j0.f r8 = r7.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String()
            r9.i(r8, r1)
        L74:
            r9.a(r0, r7)
            j0.f$b r8 = r0.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()
            if (r8 == 0) goto L80
            r8.a(r0, r7)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.RealImageLoader.l(j0.m, l0.a, y.c):void");
    }

    public final void m(int level) {
        MemoryCache value;
        g<MemoryCache> gVar = this.memoryCacheLazy;
        if (gVar == null || (value = gVar.getValue()) == null) {
            return;
        }
        value.trimMemory(level);
    }
}
