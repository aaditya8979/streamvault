package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes9.dex */
@LazyScopeMarker
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J@\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ4\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0017¢\u0006\u0004\b\t\u0010\u000bJf\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011JN\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0002\b\u0007H\u0017¢\u0006\u0004\b\u0010\u0010\u0012J@\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H'¢\u0006\u0004\b\u0013\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", "key", "contentType", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Lbn/r;", "Landroidx/compose/runtime/Composable;", "content", "item", "(Ljava/lang/Object;Ljava/lang/Object;Lsn/q;)V", "(Ljava/lang/Object;Lsn/q;)V", "", "count", "Lkotlin/Function2;", "itemContent", "items", "(ILsn/l;Lsn/l;Lsn/r;)V", "(ILsn/l;Lsn/r;)V", "stickyHeader", "foundation_release"}, k = 1, mv = {1, 6, 0})
public interface LazyListScope {

    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void item(@NotNull LazyListScope lazyListScope, @Nullable Object obj, @Nullable Object obj2, @NotNull q<? super LazyItemScope, ? super Composer, ? super Integer, r> qVar) {
            p.k(qVar, "content");
            LazyListScope.super.item(obj, obj2, qVar);
        }

        @Deprecated
        public static /* synthetic */ void item(LazyListScope lazyListScope, Object obj, q qVar) {
            p.k(qVar, "content");
            LazyListScope.super.item(obj, qVar);
        }

        @Deprecated
        public static void items(@NotNull LazyListScope lazyListScope, int i10, @Nullable l<? super Integer, ? extends Object> lVar, @NotNull l<? super Integer, ? extends Object> lVar2, @NotNull sn.r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, r> rVar) {
            p.k(lVar2, "contentType");
            p.k(rVar, "itemContent");
            LazyListScope.super.items(i10, lVar, lVar2, rVar);
        }

        @Deprecated
        public static /* synthetic */ void items(LazyListScope lazyListScope, int i10, l lVar, sn.r rVar) {
            p.k(rVar, "itemContent");
            LazyListScope.super.items(i10, lVar, rVar);
        }
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Object obj2, q qVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.item(obj, obj2, qVar);
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, q qVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        lazyListScope.item(obj, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i10, l lVar, l lVar2, sn.r rVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        if ((i11 & 4) != 0) {
            lVar2 = new l() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.1
                @Override // sn.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }

                @Nullable
                public final Void invoke(int i12) {
                    return null;
                }
            };
        }
        lazyListScope.items(i10, lVar, lVar2, rVar);
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i10, l lVar, sn.r rVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        lazyListScope.items(i10, lVar, rVar);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, q qVar, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.stickyHeader(obj, obj2, qVar);
    }

    default void item(@Nullable Object key, @Nullable Object contentType, @NotNull q<? super LazyItemScope, ? super Composer, ? super Integer, r> content) {
        p.k(content, "content");
        throw new IllegalStateException("The method is not implemented".toString());
    }

    /* synthetic */ default void item(Object key, q content) {
        p.k(content, "content");
        item(key, null, content);
    }

    default void items(int count, @Nullable l<? super Integer, ? extends Object> key, @NotNull l<? super Integer, ? extends Object> contentType, @NotNull sn.r<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, r> itemContent) {
        p.k(contentType, "contentType");
        p.k(itemContent, "itemContent");
        throw new IllegalStateException("The method is not implemented".toString());
    }

    /* synthetic */ default void items(int count, l key, sn.r itemContent) {
        p.k(itemContent, "itemContent");
        items(count, key, new l<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.2
            @Nullable
            public final Object invoke(int i10) {
                return null;
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, itemContent);
    }

    @ExperimentalFoundationApi
    void stickyHeader(@Nullable Object key, @Nullable Object contentType, @NotNull q<? super LazyItemScope, ? super Composer, ? super Integer, r> content);
}
