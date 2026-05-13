package androidx.compose.runtime;

import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.p;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes10.dex */
@ComposeCompilerApi
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/ScopeUpdateScope;", "", "Lkotlin/Function2;", "Landroidx/compose/runtime/Composer;", "", "Lbn/r;", "block", "updateScope", "runtime_release"}, k = 1, mv = {1, 6, 0})
public interface ScopeUpdateScope {
    void updateScope(@NotNull p<? super Composer, ? super Integer, r> pVar);
}
