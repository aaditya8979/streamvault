package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import bn.r;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import go.e;
import go.f;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: WebviewConfigurationDataSource.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WebviewConfigurationDataSource {

    @NotNull
    private final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> webviewConfigurationStore;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2, reason: invalid class name */
    /* JADX INFO: compiled from: WebviewConfigurationDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2", f = "WebviewConfigurationDataSource.kt", l = {15}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements q<e<? super WebviewConfigurationStore.WebViewConfigurationStore>, Throwable, c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        @Override // sn.q
        @Nullable
        public final Object invoke(@NotNull e<? super WebviewConfigurationStore.WebViewConfigurationStore> eVar, @NotNull Throwable th2, @Nullable c<? super r> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.L$0 = eVar;
            anonymousClass2.L$1 = th2;
            return anonymousClass2.invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objG = in.a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                e eVar = (e) this.L$0;
                Throwable th2 = (Throwable) this.L$1;
                if (!(th2 instanceof CorruptionException)) {
                    throw th2;
                }
                WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
                p.j(defaultInstance, "getDefaultInstance()");
                this.L$0 = null;
                this.label = 1;
                if (eVar.emit(defaultInstance, this) == objG) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: WebviewConfigurationDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C44512 extends SuspendLambda implements sn.p<WebviewConfigurationStore.WebViewConfigurationStore, c<? super WebviewConfigurationStore.WebViewConfigurationStore>, Object> {
        public final /* synthetic */ WebviewConfigurationStore.WebViewConfigurationStore $data;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44512(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, c<? super C44512> cVar) {
            super(2, cVar);
            this.$data = webViewConfigurationStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new C44512(this.$data, cVar);
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, @Nullable c<? super WebviewConfigurationStore.WebViewConfigurationStore> cVar) {
            return ((C44512) create(webViewConfigurationStore, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return this.$data;
        }
    }

    public WebviewConfigurationDataSource(@NotNull DataStore<WebviewConfigurationStore.WebViewConfigurationStore> dataStore) {
        p.k(dataStore, "webviewConfigurationStore");
        this.webviewConfigurationStore = dataStore;
    }

    @Nullable
    public final Object get(@NotNull c<? super WebviewConfigurationStore.WebViewConfigurationStore> cVar) {
        return f.v(f.h(this.webviewConfigurationStore.getData(), new AnonymousClass2(null)), cVar);
    }

    @Nullable
    public final Object set(@NotNull WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, @NotNull c<? super r> cVar) {
        Object objUpdateData = this.webviewConfigurationStore.updateData(new C44512(webViewConfigurationStore, null), cVar);
        return objUpdateData == in.a.g() ? objUpdateData : r.f5635a;
    }
}
