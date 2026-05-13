package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import cn.r;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.x;
import tn.p;
import tn.w;
import zn.n;

/* JADX INFO: compiled from: ComposableLambdaN.jvm.kt */
/* JADX INFO: loaded from: classes7.dex */
@Stable
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ*\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\r\"\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "Lbn/r;", "trackWrite", "Landroidx/compose/runtime/Composer;", "composer", "trackRead", "", "params", "realParamCount", "", "block", "update", "", "args", "invoke", "([Ljava/lang/Object;)Ljava/lang/Object;", "key", "I", "getKey", "()I", "", "tracked", "Z", "arity", "getArity", "_block", "Ljava/lang/Object;", "Landroidx/compose/runtime/RecomposeScope;", "scope", "Landroidx/compose/runtime/RecomposeScope;", "", "scopes", "Ljava/util/List;", "<init>", "(IZI)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
public final class ComposableLambdaNImpl implements ComposableLambdaN {

    @Nullable
    private Object _block;
    private final int arity;
    private final int key;

    @Nullable
    private RecomposeScope scope;

    @Nullable
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaNImpl(int i10, boolean z10, int i11) {
        this.key = i10;
        this.tracked = z10;
        this.arity = i11;
    }

    private final int realParamCount(int params) {
        int i10 = (params - 1) - 1;
        for (int i11 = 1; i11 * 10 < i10; i11++) {
            i10--;
        }
        return i10;
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (!this.tracked || (recomposeScope = composer.getRecomposeScope()) == null) {
            return;
        }
        composer.recordUsed(recomposeScope);
        if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
            this.scope = recomposeScope;
            return;
        }
        List<RecomposeScope> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(recomposeScope);
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (ComposableLambdaKt.replacableWith(list.get(i10), recomposeScope)) {
                list.set(i10, recomposeScope);
                return;
            }
        }
        list.add(recomposeScope);
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // androidx.compose.runtime.internal.ComposableLambdaN, tn.m
    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambdaN, sn.x
    @Nullable
    public Object invoke(@NotNull final Object... args) {
        p.k(args, "args");
        final int iRealParamCount = realParamCount(args.length);
        Object obj = args[iRealParamCount];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.Composer");
        }
        Composer composer = (Composer) obj;
        Object[] array = r.y0(args, n.v(0, args.length - 1)).toArray(new Object[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Object obj2 = args[args.length - 1];
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        int iIntValue = ((Integer) obj2).intValue();
        Composer composerStartRestartGroup = composer.startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = iIntValue | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(iRealParamCount) : ComposableLambdaKt.sameBits(iRealParamCount));
        Object obj3 = this._block;
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        }
        w wVar = new w(2);
        wVar.b(array);
        wVar.a(Integer.valueOf(iDifferentBits));
        Object objInvoke = ((x) obj3).invoke(wVar.d(new Object[wVar.c()]));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sn.p<Composer, Integer, bn.r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaNImpl.invoke.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ bn.r mo2invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return bn.r.f5635a;
                }

                public final void invoke(@NotNull Composer composer2, int i10) {
                    p.k(composer2, ResourceManager.KEY_MD5CHECK);
                    Object[] array2 = r.y0(args, n.v(0, iRealParamCount)).toArray(new Object[0]);
                    if (array2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    Object obj4 = args[iRealParamCount + 1];
                    if (obj4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                    int iIntValue2 = ((Integer) obj4).intValue();
                    Object[] objArr = args;
                    Object[] array3 = r.y0(objArr, n.v(iRealParamCount + 2, objArr.length)).toArray(new Object[0]);
                    if (array3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    ComposableLambdaNImpl composableLambdaNImpl = this;
                    w wVar2 = new w(4);
                    wVar2.b(array2);
                    wVar2.a(composer2);
                    wVar2.a(Integer.valueOf(iIntValue2 | 1));
                    wVar2.b(array3);
                    composableLambdaNImpl.invoke(wVar2.d(new Object[wVar2.c()]));
                }
            });
        }
        return objInvoke;
    }

    public final void update(@NotNull Object obj) {
        p.k(obj, "block");
        if (p.f(obj, this._block)) {
            return;
        }
        boolean z10 = this._block == null;
        this._block = (x) obj;
        if (z10) {
            return;
        }
        trackWrite();
    }
}
