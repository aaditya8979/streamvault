package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: FocusRequesterModifier.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "Lbn/r;", "onModifierLocalsUpdated", "Landroidx/compose/ui/focus/FocusModifier;", "focusModifier", "addFocusModifier", "Landroidx/compose/runtime/collection/MutableVector;", "newModifiers", "addFocusModifiers", "removeFocusModifier", "removedModifiers", "removeFocusModifiers", "findFocusNode", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "parent", "Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "focusModifiers", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "()Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "value", "<init>", "(Landroidx/compose/ui/focus/FocusRequester;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class FocusRequesterModifierLocal implements ModifierLocalConsumer, ModifierLocalProvider<FocusRequesterModifierLocal> {

    @NotNull
    private final MutableVector<FocusModifier> focusModifiers;

    @NotNull
    private final FocusRequester focusRequester;

    @Nullable
    private FocusRequesterModifierLocal parent;

    public FocusRequesterModifierLocal(@NotNull FocusRequester focusRequester) {
        p.k(focusRequester, "focusRequester");
        this.focusRequester = focusRequester;
        this.focusModifiers = new MutableVector<>(new FocusModifier[16], 0);
        focusRequester.getFocusRequesterModifierLocals$ui_release().add(this);
    }

    public final void addFocusModifier(@NotNull FocusModifier focusModifier) {
        p.k(focusModifier, "focusModifier");
        this.focusModifiers.add(focusModifier);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.addFocusModifier(focusModifier);
        }
    }

    public final void addFocusModifiers(@NotNull MutableVector<FocusModifier> mutableVector) {
        p.k(mutableVector, "newModifiers");
        MutableVector<FocusModifier> mutableVector2 = this.focusModifiers;
        mutableVector2.addAll(mutableVector2.getSize(), mutableVector);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.addFocusModifiers(mutableVector);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.focus.FocusModifier findFocusNode() {
        /*
            r9 = this;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusModifier> r0 = r9.focusModifiers
            int r1 = r0.getSize()
            r2 = 0
            if (r1 <= 0) goto L8a
            r3 = 0
            java.lang.Object[] r0 = r0.getContent()
        Le:
            r4 = r0[r3]
            androidx.compose.ui.focus.FocusModifier r4 = (androidx.compose.ui.focus.FocusModifier) r4
            if (r2 == 0) goto L85
            androidx.compose.ui.node.LayoutNodeWrapper r5 = r2.getLayoutNodeWrapper()
            if (r5 == 0) goto L85
            androidx.compose.ui.node.LayoutNode r5 = r5.getLayoutNode()
            if (r5 != 0) goto L21
            goto L85
        L21:
            androidx.compose.ui.node.LayoutNodeWrapper r6 = r4.getLayoutNodeWrapper()
            if (r6 == 0) goto L86
            androidx.compose.ui.node.LayoutNode r6 = r6.getLayoutNode()
            if (r6 != 0) goto L2e
            goto L86
        L2e:
            int r7 = r5.getDepth()
            int r8 = r6.getDepth()
            if (r7 <= r8) goto L40
            androidx.compose.ui.node.LayoutNode r5 = r5.getParent$ui_release()
            tn.p.h(r5)
            goto L2e
        L40:
            int r7 = r6.getDepth()
            int r8 = r5.getDepth()
            if (r7 <= r8) goto L52
            androidx.compose.ui.node.LayoutNode r6 = r6.getParent$ui_release()
            tn.p.h(r6)
            goto L40
        L52:
            androidx.compose.ui.node.LayoutNode r7 = r5.getParent$ui_release()
            androidx.compose.ui.node.LayoutNode r8 = r6.getParent$ui_release()
            boolean r7 = tn.p.f(r7, r8)
            if (r7 != 0) goto L6f
            androidx.compose.ui.node.LayoutNode r5 = r5.getParent$ui_release()
            tn.p.h(r5)
            androidx.compose.ui.node.LayoutNode r6 = r6.getParent$ui_release()
            tn.p.h(r6)
            goto L52
        L6f:
            androidx.compose.ui.node.LayoutNode r7 = r5.getParent$ui_release()
            tn.p.h(r7)
            androidx.compose.runtime.collection.MutableVector r7 = r7.get_children$ui_release()
            int r5 = r7.indexOf(r5)
            int r6 = r7.indexOf(r6)
            if (r5 >= r6) goto L85
            goto L86
        L85:
            r2 = r4
        L86:
            int r3 = r3 + 1
            if (r3 < r1) goto Le
        L8a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRequesterModifierLocal.findFocusNode():androidx.compose.ui.focus.FocusModifier");
    }

    @NotNull
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<FocusRequesterModifierLocal> getKey() {
        return FocusRequesterModifierKt.getModifierLocalFocusRequester();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public FocusRequesterModifierLocal getValue() {
        return this;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope modifierLocalReadScope) {
        p.k(modifierLocalReadScope, "scope");
        FocusRequesterModifierLocal focusRequesterModifierLocal = (FocusRequesterModifierLocal) modifierLocalReadScope.getCurrent(FocusRequesterModifierKt.getModifierLocalFocusRequester());
        if (p.f(focusRequesterModifierLocal, this.parent)) {
            return;
        }
        FocusRequesterModifierLocal focusRequesterModifierLocal2 = this.parent;
        if (focusRequesterModifierLocal2 != null) {
            focusRequesterModifierLocal2.removeFocusModifiers(this.focusModifiers);
        }
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.addFocusModifiers(this.focusModifiers);
        }
        this.parent = focusRequesterModifierLocal;
    }

    public final void removeFocusModifier(@NotNull FocusModifier focusModifier) {
        p.k(focusModifier, "focusModifier");
        this.focusModifiers.remove(focusModifier);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.removeFocusModifier(focusModifier);
        }
    }

    public final void removeFocusModifiers(@NotNull MutableVector<FocusModifier> mutableVector) {
        p.k(mutableVector, "removedModifiers");
        this.focusModifiers.removeAll(mutableVector);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.removeFocusModifiers(mutableVector);
        }
    }
}
