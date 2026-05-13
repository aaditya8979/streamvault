package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import bn.r;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import go.e;
import go.f;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: AndroidByteStringDataSource.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidByteStringDataSource implements ByteStringDataSource {

    @NotNull
    private final DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidByteStringDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2", f = "AndroidByteStringDataSource.kt", l = {18}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements q<e<? super ByteStringStoreOuterClass.ByteStringStore>, Throwable, c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        @Override // sn.q
        @Nullable
        public final Object invoke(@NotNull e<? super ByteStringStoreOuterClass.ByteStringStore> eVar, @NotNull Throwable th2, @Nullable c<? super r> cVar) {
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
                ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
                ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
                p.j(builderNewBuilder, "newBuilder()");
                ByteStringStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
                ByteString byteString = ByteString.EMPTY;
                p.j(byteString, "EMPTY");
                dsl_create.setData(byteString);
                ByteStringStoreOuterClass.ByteStringStore byteStringStore_build = dsl_create._build();
                this.L$0 = null;
                this.label = 1;
                if (eVar.emit(byteStringStore_build, this) == objG) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidByteStringDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2", f = "AndroidByteStringDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C44472 extends SuspendLambda implements sn.p<ByteStringStoreOuterClass.ByteStringStore, c<? super ByteStringStoreOuterClass.ByteStringStore>, Object> {
        public final /* synthetic */ ByteString $data;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44472(ByteString byteString, c<? super C44472> cVar) {
            super(2, cVar);
            this.$data = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C44472 c44472 = new C44472(this.$data, cVar);
            c44472.L$0 = obj;
            return c44472;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull ByteStringStoreOuterClass.ByteStringStore byteStringStore, @Nullable c<? super ByteStringStoreOuterClass.ByteStringStore> cVar) {
            return ((C44472) create(byteStringStore, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            in.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ((ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder().setData(this.$data).build();
            p.j(byteStringStoreBuild, "currentData.toBuilder()\n…\n                .build()");
            return byteStringStoreBuild;
        }
    }

    public AndroidByteStringDataSource(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.k(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    @Nullable
    public Object get(@NotNull c<? super ByteStringStoreOuterClass.ByteStringStore> cVar) {
        return f.v(f.h(this.dataStore.getData(), new AnonymousClass2(null)), cVar);
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    @Nullable
    public Object set(@NotNull ByteString byteString, @NotNull c<? super r> cVar) {
        Object objUpdateData = this.dataStore.updateData(new C44472(byteString, null), cVar);
        return objUpdateData == in.a.g() ? objUpdateData : r.f5635a;
    }
}
