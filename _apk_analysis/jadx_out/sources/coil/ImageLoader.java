package coil;

import android.content.Context;
import bn.g;
import coil.memory.MemoryCache;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import j0.a;
import j0.f;
import kotlin.Metadata;
import o0.h;
import o0.n;
import o0.q;
import o0.r;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y.b;
import y.c;

/* JADX INFO: compiled from: ImageLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcoil/ImageLoader;", "", "Lj0/f;", AdActivity.REQUEST_KEY_EXTRA, "Lj0/c;", "b", "Lj0/g;", "d", "(Lj0/f;Lhn/c;)Ljava/lang/Object;", "Lj0/a;", "c", "()Lj0/a;", "defaults", "Ly/b;", "a", "()Ly/b;", "components", "Lcoil/memory/MemoryCache;", "e", "()Lcoil/memory/MemoryCache;", "memoryCache", "Builder", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public interface ImageLoader {

    /* JADX INFO: compiled from: ImageLoader.kt */
    @Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\tR \u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcoil/ImageLoader$Builder;", "", "Lcoil/ImageLoader;", "b", "Landroid/content/Context;", "a", "Landroid/content/Context;", "applicationContext", "Lj0/a;", "Lj0/a;", "defaults", "Lbn/g;", "Lcoil/memory/MemoryCache;", "c", "Lbn/g;", "memoryCache", "Lb0/a;", "d", "diskCache", "Lokhttp3/Call$Factory;", "e", "callFactory", "Ly/c$d;", InneractiveMediationDefs.GENDER_FEMALE, "Ly/c$d;", "eventListenerFactory", "Ly/b;", "g", "Ly/b;", "componentRegistry", "Lo0/n;", "h", "Lo0/n;", "options", "Lo0/q;", "i", "Lo0/q;", "logger", GAMConfig.KEY_CONTEXT, "<init>", "(Landroid/content/Context;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Context applicationContext;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public a defaults = h.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public g<? extends MemoryCache> memoryCache = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public g<? extends b0.a> diskCache = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public g<? extends Call.Factory> callFactory = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public c.d eventListenerFactory = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public b componentRegistry = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public n options = new n(false, false, false, 0, null, 31, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public q logger = null;

        public Builder(@NotNull Context context) {
            this.applicationContext = context.getApplicationContext();
        }

        @NotNull
        public final ImageLoader b() {
            Context context = this.applicationContext;
            a aVar = this.defaults;
            g<? extends MemoryCache> gVarB = this.memoryCache;
            if (gVarB == null) {
                gVarB = kotlin.b.b(new sn.a<MemoryCache>() { // from class: coil.ImageLoader$Builder$build$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final MemoryCache invoke() {
                        return new MemoryCache.a(this.this$0.applicationContext).a();
                    }
                });
            }
            g<? extends MemoryCache> gVar = gVarB;
            g<? extends b0.a> gVarB2 = this.diskCache;
            if (gVarB2 == null) {
                gVarB2 = kotlin.b.b(new sn.a<b0.a>() { // from class: coil.ImageLoader$Builder$build$2
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final b0.a invoke() {
                        return r.f75991a.a(this.this$0.applicationContext);
                    }
                });
            }
            g<? extends b0.a> gVar2 = gVarB2;
            g<? extends Call.Factory> gVarB3 = this.callFactory;
            if (gVarB3 == null) {
                gVarB3 = kotlin.b.b(new sn.a<OkHttpClient>() { // from class: coil.ImageLoader$Builder$build$3
                    @Override // sn.a
                    @NotNull
                    public final OkHttpClient invoke() {
                        return new OkHttpClient();
                    }
                });
            }
            g<? extends Call.Factory> gVar3 = gVarB3;
            c.d dVar = this.eventListenerFactory;
            if (dVar == null) {
                dVar = c.d.f87209b;
            }
            c.d dVar2 = dVar;
            b bVar = this.componentRegistry;
            if (bVar == null) {
                bVar = new b();
            }
            return new RealImageLoader(context, aVar, gVar, gVar2, gVar3, dVar2, bVar, this.options, this.logger);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    b getComponents();

    @NotNull
    j0.c b(@NotNull f request);

    @NotNull
    /* JADX INFO: renamed from: c */
    a getDefaults();

    @Nullable
    Object d(@NotNull f fVar, @NotNull hn.c<? super j0.g> cVar);

    @Nullable
    MemoryCache e();
}
