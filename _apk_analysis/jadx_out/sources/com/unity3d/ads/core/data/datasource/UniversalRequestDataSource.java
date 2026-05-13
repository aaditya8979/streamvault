package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import bn.r;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import go.e;
import go.f;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: UniversalRequestDataSource.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class UniversalRequestDataSource {

    @NotNull
    private final UniversalRequestDataStoreProvider universalRequestStoreProvider;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2, reason: invalid class name */
    /* JADX INFO: compiled from: UniversalRequestDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2", f = "UniversalRequestDataSource.kt", l = {15}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements q<e<? super UniversalRequestStoreOuterClass.UniversalRequestStore>, Throwable, c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        @Override // sn.q
        @Nullable
        public final Object invoke(@NotNull e<? super UniversalRequestStoreOuterClass.UniversalRequestStore> eVar, @NotNull Throwable th2, @Nullable c<? super r> cVar) {
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
                UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
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

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UniversalRequestDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2", f = "UniversalRequestDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C44492 extends SuspendLambda implements sn.p<UniversalRequestStoreOuterClass.UniversalRequestStore, c<? super UniversalRequestStoreOuterClass.UniversalRequestStore>, Object> {
        public final /* synthetic */ String $key;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44492(String str, c<? super C44492> cVar) {
            super(2, cVar);
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C44492 c44492 = new C44492(this.$key, cVar);
            c44492.L$0 = obj;
            return c44492;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, @Nullable c<? super UniversalRequestStoreOuterClass.UniversalRequestStore> cVar) {
            return ((C44492) create(universalRequestStore, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.removeUniversalRequestMap(this.$key);
            UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
            p.j(universalRequestStoreBuild, "dataBuilder.build()");
            return universalRequestStoreBuild;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UniversalRequestDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2", f = "UniversalRequestDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C44502 extends SuspendLambda implements sn.p<UniversalRequestStoreOuterClass.UniversalRequestStore, c<? super UniversalRequestStoreOuterClass.UniversalRequestStore>, Object> {
        public final /* synthetic */ ByteString $data;
        public final /* synthetic */ String $key;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44502(String str, ByteString byteString, c<? super C44502> cVar) {
            super(2, cVar);
            this.$key = str;
            this.$data = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C44502 c44502 = new C44502(this.$key, this.$data, cVar);
            c44502.L$0 = obj;
            return c44502;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, @Nullable c<? super UniversalRequestStoreOuterClass.UniversalRequestStore> cVar) {
            return ((C44502) create(universalRequestStore, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.putUniversalRequestMap(this.$key, this.$data);
            UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
            p.j(universalRequestStoreBuild, "dataBuilder.build()");
            return universalRequestStoreBuild;
        }
    }

    public UniversalRequestDataSource(@NotNull UniversalRequestDataStoreProvider universalRequestDataStoreProvider) {
        p.k(universalRequestDataStoreProvider, "universalRequestStoreProvider");
        this.universalRequestStoreProvider = universalRequestDataStoreProvider;
    }

    @Nullable
    public final Object get(@NotNull c<? super UniversalRequestStoreOuterClass.UniversalRequestStore> cVar) {
        return f.v(f.h(this.universalRequestStoreProvider.invoke().getData(), new AnonymousClass2(null)), cVar);
    }

    @Nullable
    public final Object remove(@NotNull String str, @NotNull c<? super r> cVar) {
        Object objUpdateData = this.universalRequestStoreProvider.invoke().updateData(new C44492(str, null), cVar);
        return objUpdateData == in.a.g() ? objUpdateData : r.f5635a;
    }

    @Nullable
    public final Object set(@NotNull String str, @NotNull ByteString byteString, @NotNull c<? super r> cVar) {
        Object objUpdateData = this.universalRequestStoreProvider.invoke().updateData(new C44502(str, byteString, null), cVar);
        return objUpdateData == in.a.g() ? objUpdateData : r.f5635a;
    }
}
