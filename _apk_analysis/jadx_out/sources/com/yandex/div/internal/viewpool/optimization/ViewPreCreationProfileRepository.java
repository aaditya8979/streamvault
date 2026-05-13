package com.yandex.div.internal.viewpool.optimization;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Serializer;
import bn.r;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.logging.Severity;
import go.f;
import hn.c;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.g;
import p000do.l0;
import p000do.w0;
import sn.a;
import sn.l;
import so.t;
import tn.i;
import tn.p;
import xo.d;
import xo.g0;
import xo.u;

/* JADX INFO: compiled from: ViewPreCreationProfileRepository.kt */
/* JADX INFO: loaded from: classes11.dex */
public class ViewPreCreationProfileRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final WeakHashMap<String, DataStore<ViewPreCreationProfile>> stores = new WeakHashMap<>();

    @NotNull
    private final Context context;

    @NotNull
    private final ViewPreCreationProfile defaultProfile;

    /* JADX INFO: compiled from: ViewPreCreationProfileRepository.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final DataStore<ViewPreCreationProfile> getStoreForId(@NotNull final Context context, @NotNull final String str) {
            WeakHashMap<String, DataStore<ViewPreCreationProfile>> stores = getStores();
            DataStore<ViewPreCreationProfile> dataStoreCreate$default = stores.get(str);
            if (dataStoreCreate$default == null) {
                dataStoreCreate$default = DataStoreFactory.create$default(DataStoreFactory.INSTANCE, ViewPreCreationProfileSerializer.INSTANCE, null, null, null, new a<File>() { // from class: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$Companion$getStoreForId$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final File invoke() {
                        File filesDir = context.getFilesDir();
                        String str2 = String.format("divkit_optimized_viewpool_profile_%s.json", Arrays.copyOf(new Object[]{str}, 1));
                        p.j(str2, "format(...)");
                        return new File(filesDir, str2);
                    }
                }, 14, null);
                stores.put(str, dataStoreCreate$default);
            }
            return dataStoreCreate$default;
        }

        @NotNull
        public final WeakHashMap<String, DataStore<ViewPreCreationProfile>> getStores() {
            return ViewPreCreationProfileRepository.stores;
        }
    }

    /* JADX INFO: compiled from: ViewPreCreationProfileRepository.kt */
    public static final class ViewPreCreationProfileSerializer implements Serializer<ViewPreCreationProfile> {

        @Nullable
        private static final ViewPreCreationProfile defaultValue = null;

        @NotNull
        public static final ViewPreCreationProfileSerializer INSTANCE = new ViewPreCreationProfileSerializer();

        @NotNull
        private static final xo.a json = u.b(null, new l<d, r>() { // from class: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$ViewPreCreationProfileSerializer$json$1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(d dVar) {
                invoke2(dVar);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull d dVar) {
                dVar.d(false);
            }
        }, 1, null);

        private ViewPreCreationProfileSerializer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.datastore.core.Serializer
        @Nullable
        public ViewPreCreationProfile getDefaultValue() {
            return defaultValue;
        }

        @Override // androidx.datastore.core.Serializer
        @Nullable
        public Object readFrom(@NotNull InputStream inputStream, @NotNull c<? super ViewPreCreationProfile> cVar) {
            Object objM7534constructorimpl;
            try {
                Result.a aVar = Result.Companion;
                xo.a aVar2 = json;
                objM7534constructorimpl = Result.m7534constructorimpl((ViewPreCreationProfile) g0.a(aVar2, t.b(aVar2.a(), tn.t.g(ViewPreCreationProfile.class)), inputStream));
            } catch (Throwable th2) {
                Result.a aVar3 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
            if (thM7537exceptionOrNullimpl != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                Log.e("OptimizedViewPreCreationProfileRepository", "", thM7537exceptionOrNullimpl);
            }
            if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
                return null;
            }
            return objM7534constructorimpl;
        }

        @Nullable
        /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
        public Object writeTo2(@Nullable ViewPreCreationProfile viewPreCreationProfile, @NotNull OutputStream outputStream, @NotNull c<? super r> cVar) {
            Object objM7534constructorimpl;
            try {
                Result.a aVar = Result.Companion;
                xo.a aVar2 = json;
                g0.b(aVar2, t.b(aVar2.a(), tn.t.g(ViewPreCreationProfile.class)), viewPreCreationProfile, outputStream);
                objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
            } catch (Throwable th2) {
                Result.a aVar3 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
            if (thM7537exceptionOrNullimpl != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                Log.e("OptimizedViewPreCreationProfileRepository", "", thM7537exceptionOrNullimpl);
            }
            return r.f5635a;
        }

        @Override // androidx.datastore.core.Serializer
        public /* bridge */ /* synthetic */ Object writeTo(ViewPreCreationProfile viewPreCreationProfile, OutputStream outputStream, c cVar) {
            return writeTo2(viewPreCreationProfile, outputStream, (c<? super r>) cVar);
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$get$2, reason: invalid class name */
    /* JADX INFO: compiled from: ViewPreCreationProfileRepository.kt */
    @jn.d(c = "com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$get$2", f = "ViewPreCreationProfileRepository.kt", l = {33}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements sn.p<l0, c<? super ViewPreCreationProfile>, Object> {
        public final /* synthetic */ String $id;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = ViewPreCreationProfileRepository.this.new AnonymousClass2(this.$id, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super ViewPreCreationProfile> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM7534constructorimpl;
            Object objV;
            Object objG = in.a.g();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    ViewPreCreationProfileRepository viewPreCreationProfileRepository = ViewPreCreationProfileRepository.this;
                    String str = this.$id;
                    Result.a aVar = Result.Companion;
                    go.d<ViewPreCreationProfile> data = ViewPreCreationProfileRepository.Companion.getStoreForId(viewPreCreationProfileRepository.context, str).getData();
                    this.label = 1;
                    objV = f.v(data, this);
                    if (objV == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    objV = obj;
                }
                objM7534constructorimpl = Result.m7534constructorimpl((ViewPreCreationProfile) objV);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
            if (thM7537exceptionOrNullimpl != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                Log.e("OptimizedViewPreCreationProfileRepository", "", thM7537exceptionOrNullimpl);
            }
            if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
                objM7534constructorimpl = null;
            }
            ViewPreCreationProfile viewPreCreationProfile = (ViewPreCreationProfile) objM7534constructorimpl;
            if (viewPreCreationProfile != null) {
                return viewPreCreationProfile;
            }
            ViewPreCreationProfile viewPreCreationProfile2 = ViewPreCreationProfileRepository.this.defaultProfile;
            return viewPreCreationProfile2.copy((524286 & 1) != 0 ? viewPreCreationProfile2.f53988id : this.$id, (524286 & 2) != 0 ? viewPreCreationProfile2.text : null, (524286 & 4) != 0 ? viewPreCreationProfile2.image : null, (524286 & 8) != 0 ? viewPreCreationProfile2.gifImage : null, (524286 & 16) != 0 ? viewPreCreationProfile2.overlapContainer : null, (524286 & 32) != 0 ? viewPreCreationProfile2.linearContainer : null, (524286 & 64) != 0 ? viewPreCreationProfile2.wrapContainer : null, (524286 & 128) != 0 ? viewPreCreationProfile2.grid : null, (524286 & 256) != 0 ? viewPreCreationProfile2.gallery : null, (524286 & 512) != 0 ? viewPreCreationProfile2.pager : null, (524286 & 1024) != 0 ? viewPreCreationProfile2.tab : null, (524286 & 2048) != 0 ? viewPreCreationProfile2.state : null, (524286 & 4096) != 0 ? viewPreCreationProfile2.custom : null, (524286 & 8192) != 0 ? viewPreCreationProfile2.indicator : null, (524286 & 16384) != 0 ? viewPreCreationProfile2.slider : null, (524286 & 32768) != 0 ? viewPreCreationProfile2.input : null, (524286 & 65536) != 0 ? viewPreCreationProfile2.select : null, (524286 & 131072) != 0 ? viewPreCreationProfile2.video : null, (524286 & 262144) != 0 ? viewPreCreationProfile2.f3285switch : null);
        }
    }

    public ViewPreCreationProfileRepository(@NotNull Context context, @NotNull ViewPreCreationProfile viewPreCreationProfile) {
        this.context = context;
        this.defaultProfile = viewPreCreationProfile;
    }

    public static /* synthetic */ Object get$suspendImpl(ViewPreCreationProfileRepository viewPreCreationProfileRepository, String str, c<? super ViewPreCreationProfile> cVar) {
        return g.g(w0.b(), viewPreCreationProfileRepository.new AnonymousClass2(str, null), cVar);
    }

    @Nullable
    public Object get(@NotNull String str, @NotNull c<? super ViewPreCreationProfile> cVar) {
        return get$suspendImpl(this, str, cVar);
    }
}
