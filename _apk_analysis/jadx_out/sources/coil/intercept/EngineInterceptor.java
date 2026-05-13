package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import cn.r;
import coil.ImageLoader;
import coil.decode.DataSource;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.ui.AdActivity;
import e0.a;
import h0.c;
import j0.f;
import j0.j;
import j0.l;
import java.util.List;
import kotlin.Metadata;
import o0.i;
import o0.k;
import o0.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.g;

/* JADX INFO: compiled from: EngineInterceptor.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 72\u00020\u0001:\u0002\u0005*B!\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010,\u001a\u00020)\u0012\b\u00100\u001a\u0004\u0018\u00010-¢\u0006\u0004\b5\u00106J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJC\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u0004\u0018\u00010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcoil/intercept/EngineInterceptor;", "Le0/a;", "Le0/a$a;", "chain", "Lj0/g;", "a", "(Le0/a$a;Lhn/c;)Ljava/lang/Object;", "Lcoil/intercept/EngineInterceptor$b;", "result", "Lj0/f;", AdActivity.REQUEST_KEY_EXTRA, "Lj0/j;", "options", "Ly/c;", "eventListener", CampaignEx.JSON_KEY_AD_K, "(Lcoil/intercept/EngineInterceptor$b;Lj0/f;Lj0/j;Ly/c;Lhn/c;)Ljava/lang/Object;", "", "mappedData", "_options", "i", "(Lj0/f;Ljava/lang/Object;Lj0/j;Ly/c;Lhn/c;)Ljava/lang/Object;", "Ly/b;", "components", "Ld0/h;", "j", "(Ly/b;Lj0/f;Ljava/lang/Object;Lj0/j;Ly/c;Lhn/c;)Ljava/lang/Object;", "Ld0/l;", "fetchResult", "h", "(Ld0/l;Ly/b;Lj0/f;Ljava/lang/Object;Lj0/j;Ly/c;Lhn/c;)Ljava/lang/Object;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "Lm0/a;", "transformations", "Landroid/graphics/Bitmap;", "g", "Lcoil/ImageLoader;", "Lcoil/ImageLoader;", "imageLoader", "Lj0/l;", "b", "Lj0/l;", "requestService", "Lo0/q;", "c", "Lo0/q;", "logger", "Lh0/c;", "d", "Lh0/c;", "memoryCacheService", "<init>", "(Lcoil/ImageLoader;Lj0/l;Lo0/q;)V", "e", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class EngineInterceptor implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageLoader imageLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l requestService;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final q logger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c memoryCacheService;

    /* JADX INFO: compiled from: EngineInterceptor.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcoil/intercept/EngineInterceptor$b;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isSampled", "Lcoil/decode/DataSource;", "dataSource", "", "diskCacheKey", "a", "Landroid/graphics/drawable/Drawable;", "e", "()Landroid/graphics/drawable/Drawable;", "b", "Z", InneractiveMediationDefs.GENDER_FEMALE, "()Z", "c", "Lcoil/decode/DataSource;", "()Lcoil/decode/DataSource;", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;Ljava/lang/String;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Drawable drawable;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final boolean isSampled;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final DataSource dataSource;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String diskCacheKey;

        public b(@NotNull Drawable drawable, boolean z10, @NotNull DataSource dataSource, @Nullable String str) {
            this.drawable = drawable;
            this.isSampled = z10;
            this.dataSource = dataSource;
            this.diskCacheKey = str;
        }

        public static /* synthetic */ b b(b bVar, Drawable drawable, boolean z10, DataSource dataSource, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                drawable = bVar.drawable;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.isSampled;
            }
            if ((i10 & 4) != 0) {
                dataSource = bVar.dataSource;
            }
            if ((i10 & 8) != 0) {
                str = bVar.diskCacheKey;
            }
            return bVar.a(drawable, z10, dataSource, str);
        }

        @NotNull
        public final b a(@NotNull Drawable drawable, boolean isSampled, @NotNull DataSource dataSource, @Nullable String diskCacheKey) {
            return new b(drawable, isSampled, dataSource, diskCacheKey);
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final DataSource getDataSource() {
            return this.dataSource;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Drawable getDrawable() {
            return this.drawable;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsSampled() {
            return this.isSampled;
        }
    }

    public EngineInterceptor(@NotNull ImageLoader imageLoader, @NotNull l lVar, @Nullable q qVar) {
        this.imageLoader = imageLoader;
        this.requestService = lVar;
        this.logger = qVar;
        this.memoryCacheService = new c(imageLoader, lVar, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // e0.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull e0.a.InterfaceC0737a r14, @org.jetbrains.annotations.NotNull hn.c<? super j0.g> r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof coil.intercept.EngineInterceptor$intercept$1
            if (r0 == 0) goto L13
            r0 = r15
            coil.intercept.EngineInterceptor$intercept$1 r0 = (coil.intercept.EngineInterceptor$intercept$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil.intercept.EngineInterceptor$intercept$1 r0 = new coil.intercept.EngineInterceptor$intercept$1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r14 = r0.L$1
            e0.a$a r14 = (e0.a.InterfaceC0737a) r14
            java.lang.Object r0 = r0.L$0
            coil.intercept.EngineInterceptor r0 = (coil.intercept.EngineInterceptor) r0
            kotlin.c.b(r15)     // Catch: java.lang.Throwable -> L31
            goto L9b
        L31:
            r15 = move-exception
            goto L9e
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            kotlin.c.b(r15)
            j0.f r6 = r14.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r15 = r6.getData()     // Catch: java.lang.Throwable -> L9c
            k0.g r2 = r14.getSize()     // Catch: java.lang.Throwable -> L9c
            y.c r9 = o0.i.h(r14)     // Catch: java.lang.Throwable -> L9c
            j0.l r4 = r13.requestService     // Catch: java.lang.Throwable -> L9c
            j0.j r8 = r4.f(r6, r2)     // Catch: java.lang.Throwable -> L9c
            coil.size.Scale r4 = r8.getScale()     // Catch: java.lang.Throwable -> L9c
            r9.r(r6, r15)     // Catch: java.lang.Throwable -> L9c
            coil.ImageLoader r5 = r13.imageLoader     // Catch: java.lang.Throwable -> L9c
            y.b r5 = r5.getComponents()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r7 = r5.g(r15, r8)     // Catch: java.lang.Throwable -> L9c
            r9.k(r6, r7)     // Catch: java.lang.Throwable -> L9c
            h0.c r15 = r13.memoryCacheService     // Catch: java.lang.Throwable -> L9c
            coil.memory.MemoryCache$Key r10 = r15.f(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L9c
            if (r10 == 0) goto L77
            h0.c r15 = r13.memoryCacheService     // Catch: java.lang.Throwable -> L9c
            coil.memory.MemoryCache$b r15 = r15.a(r6, r10, r2, r4)     // Catch: java.lang.Throwable -> L9c
            goto L78
        L77:
            r15 = 0
        L78:
            if (r15 == 0) goto L81
            h0.c r0 = r13.memoryCacheService     // Catch: java.lang.Throwable -> L9c
            j0.m r14 = r0.g(r14, r6, r10, r15)     // Catch: java.lang.Throwable -> L9c
            return r14
        L81:
            do.h0 r15 = r6.getFetcherDispatcher()     // Catch: java.lang.Throwable -> L9c
            coil.intercept.EngineInterceptor$intercept$2 r2 = new coil.intercept.EngineInterceptor$intercept$2     // Catch: java.lang.Throwable -> L9c
            r12 = 0
            r4 = r2
            r5 = r13
            r11 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9c
            r0.L$0 = r13     // Catch: java.lang.Throwable -> L9c
            r0.L$1 = r14     // Catch: java.lang.Throwable -> L9c
            r0.label = r3     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r15 = p000do.g.g(r15, r2, r0)     // Catch: java.lang.Throwable -> L9c
            if (r15 != r1) goto L9b
            return r1
        L9b:
            return r15
        L9c:
            r15 = move-exception
            r0 = r13
        L9e:
            boolean r1 = r15 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto Lad
            j0.l r0 = r0.requestService
            j0.f r14 = r14.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String()
            j0.d r14 = r0.b(r14, r15)
            return r14
        Lad:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.a(e0.a$a, hn.c):java.lang.Object");
    }

    public final Bitmap g(Drawable drawable, j options, List<? extends m0.a> transformations) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config configC = o0.a.c(bitmap);
            if (r.P(i.p(), configC)) {
                return bitmap;
            }
            q qVar = this.logger;
            if (qVar != null && qVar.getLevel() <= 4) {
                qVar.a("EngineInterceptor", 4, "Converting bitmap with config " + configC + " to apply transformations: " + transformations + '.', null);
            }
        } else {
            q qVar2 = this.logger;
            if (qVar2 != null && qVar2.getLevel() <= 4) {
                qVar2.a("EngineInterceptor", 4, "Converting drawable of type " + drawable.getClass().getCanonicalName() + " to apply transformations: " + transformations + '.', null);
            }
        }
        return k.f75977a.a(drawable, options.getConfig(), options.getSize(), options.getScale(), options.getAllowInexactSize());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ab -> B:21:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(d0.l r17, y.b r18, j0.f r19, java.lang.Object r20, j0.j r21, y.c r22, hn.c<? super coil.intercept.EngineInterceptor.b> r23) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.h(d0.l, y.b, j0.f, java.lang.Object, j0.j, y.c, hn.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c A[Catch: all -> 0x0212, TRY_LEAVE, TryCatch #0 {all -> 0x0212, blocks: (B:45:0x0151, B:47:0x015c, B:53:0x019c, B:55:0x01a0, B:76:0x020c, B:77:0x0211, B:27:0x00a5, B:29:0x00b1, B:30:0x00df, B:32:0x00e5, B:41:0x0114, B:34:0x00eb, B:36:0x00fa, B:37:0x0101, B:39:0x0107, B:40:0x010e), top: B:88:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019c A[Catch: all -> 0x0212, TRY_ENTER, TryCatch #0 {all -> 0x0212, blocks: (B:45:0x0151, B:47:0x015c, B:53:0x019c, B:55:0x01a0, B:76:0x020c, B:77:0x0211, B:27:0x00a5, B:29:0x00b1, B:30:0x00df, B:32:0x00e5, B:41:0x0114, B:34:0x00eb, B:36:0x00fa, B:37:0x0101, B:39:0x0107, B:40:0x010e), top: B:88:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021f  */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, y.b] */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, j0.j] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, y.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(j0.f r36, java.lang.Object r37, j0.j r38, y.c r39, hn.c<? super coil.intercept.EngineInterceptor.b> r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.i(j0.f, java.lang.Object, j0.j, y.c, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:21:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(y.b r10, j0.f r11, java.lang.Object r12, j0.j r13, y.c r14, hn.c<? super d0.h> r15) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor.j(y.b, j0.f, java.lang.Object, j0.j, y.c, hn.c):java.lang.Object");
    }

    @VisibleForTesting
    @Nullable
    public final Object k(@NotNull b bVar, @NotNull f fVar, @NotNull j jVar, @NotNull y.c cVar, @NotNull hn.c<? super b> cVar2) {
        List<m0.a> listN = fVar.N();
        if (listN.isEmpty()) {
            return bVar;
        }
        if ((bVar.getDrawable() instanceof BitmapDrawable) || fVar.getAllowConversionToBitmap()) {
            return g.g(fVar.getTransformationDispatcher(), new EngineInterceptor$transform$3(this, bVar, jVar, listN, cVar, fVar, null), cVar2);
        }
        q qVar = this.logger;
        if (qVar != null && qVar.getLevel() <= 4) {
            qVar.a("EngineInterceptor", 4, "allowConversionToBitmap=false, skipping transformations for type " + bVar.getDrawable().getClass().getCanonicalName() + '.', null);
        }
        return bVar;
    }
}
