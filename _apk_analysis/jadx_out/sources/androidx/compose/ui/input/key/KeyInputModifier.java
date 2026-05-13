package androidx.compose.ui.input.key;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import com.ironsource.C3996e4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: KeyInputModifier.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003B6\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u001b\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001b\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\bJ\u001b\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R(\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00158\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00158\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR(\u0010 \u001a\u0004\u0018\u00010\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u001f\u001a\u0004\u0018\u00010$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010#\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "", "processKeyInput-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "processKeyInput", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "Lbn/r;", "onModifierLocalsUpdated", "propagatePreviewKeyEvent-ZmokQxo", "propagatePreviewKeyEvent", "propagateKeyEvent-ZmokQxo", "propagateKeyEvent", "Landroidx/compose/ui/layout/LayoutCoordinates;", C3996e4.f31528f, "onPlaced", "Lkotlin/Function1;", "onKeyEvent", "Lsn/l;", "getOnKeyEvent", "()Lsn/l;", "onPreviewKeyEvent", "getOnPreviewKeyEvent", "Landroidx/compose/ui/focus/FocusModifier;", "focusModifier", "Landroidx/compose/ui/focus/FocusModifier;", "<set-?>", "parent", "Landroidx/compose/ui/input/key/KeyInputModifier;", "getParent", "()Landroidx/compose/ui/input/key/KeyInputModifier;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "value", "<init>", "(Lsn/l;Lsn/l;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class KeyInputModifier implements ModifierLocalConsumer, ModifierLocalProvider<KeyInputModifier>, OnPlacedModifier {

    @Nullable
    private FocusModifier focusModifier;

    @Nullable
    private LayoutNode layoutNode;

    @Nullable
    private final l<KeyEvent, Boolean> onKeyEvent;

    @Nullable
    private final l<KeyEvent, Boolean> onPreviewKeyEvent;

    @Nullable
    private KeyInputModifier parent;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputModifier(@Nullable l<? super KeyEvent, Boolean> lVar, @Nullable l<? super KeyEvent, Boolean> lVar2) {
        this.onKeyEvent = lVar;
        this.onPreviewKeyEvent = lVar2;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<KeyInputModifier> getKey() {
        return KeyInputModifierKt.getModifierLocalKeyInput();
    }

    @Nullable
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Nullable
    public final l<KeyEvent, Boolean> getOnKeyEvent() {
        return this.onKeyEvent;
    }

    @Nullable
    public final l<KeyEvent, Boolean> getOnPreviewKeyEvent() {
        return this.onPreviewKeyEvent;
    }

    @Nullable
    public final KeyInputModifier getParent() {
        return this.parent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public KeyInputModifier getValue() {
        return this;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope modifierLocalReadScope) {
        MutableVector<KeyInputModifier> keyInputChildren;
        MutableVector<KeyInputModifier> keyInputChildren2;
        p.k(modifierLocalReadScope, "scope");
        FocusModifier focusModifier = this.focusModifier;
        if (focusModifier != null && (keyInputChildren2 = focusModifier.getKeyInputChildren()) != null) {
            keyInputChildren2.remove(this);
        }
        FocusModifier focusModifier2 = (FocusModifier) modifierLocalReadScope.getCurrent(FocusModifierKt.getModifierLocalParentFocusModifier());
        this.focusModifier = focusModifier2;
        if (focusModifier2 != null && (keyInputChildren = focusModifier2.getKeyInputChildren()) != null) {
            keyInputChildren.add(this);
        }
        this.parent = (KeyInputModifier) modifierLocalReadScope.getCurrent(KeyInputModifierKt.getModifierLocalKeyInput());
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public void onPlaced(@NotNull LayoutCoordinates layoutCoordinates) {
        p.k(layoutCoordinates, C3996e4.f31528f);
        this.layoutNode = ((LayoutNodeWrapper) layoutCoordinates).getLayoutNode();
    }

    /* JADX INFO: renamed from: processKeyInput-ZmokQxo, reason: not valid java name */
    public final boolean m2860processKeyInputZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
        FocusModifier focusModifierFindActiveFocusNode;
        KeyInputModifier keyInputModifierFindLastKeyInputModifier;
        p.k(keyEvent, "keyEvent");
        FocusModifier focusModifier = this.focusModifier;
        if (focusModifier == null || (focusModifierFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusModifier)) == null || (keyInputModifierFindLastKeyInputModifier = FocusTraversalKt.findLastKeyInputModifier(focusModifierFindActiveFocusNode)) == null) {
            throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
        }
        if (keyInputModifierFindLastKeyInputModifier.m2862propagatePreviewKeyEventZmokQxo(keyEvent)) {
            return true;
        }
        return keyInputModifierFindLastKeyInputModifier.m2861propagateKeyEventZmokQxo(keyEvent);
    }

    /* JADX INFO: renamed from: propagateKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean m2861propagateKeyEventZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
        p.k(keyEvent, "keyEvent");
        l<KeyEvent, Boolean> lVar = this.onKeyEvent;
        Boolean boolInvoke = lVar != null ? lVar.invoke(KeyEvent.m2836boximpl(keyEvent)) : null;
        if (p.f(boolInvoke, Boolean.TRUE)) {
            return boolInvoke.booleanValue();
        }
        KeyInputModifier keyInputModifier = this.parent;
        if (keyInputModifier != null) {
            return keyInputModifier.m2861propagateKeyEventZmokQxo(keyEvent);
        }
        return false;
    }

    /* JADX INFO: renamed from: propagatePreviewKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean m2862propagatePreviewKeyEventZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
        p.k(keyEvent, "keyEvent");
        KeyInputModifier keyInputModifier = this.parent;
        Boolean boolValueOf = keyInputModifier != null ? Boolean.valueOf(keyInputModifier.m2862propagatePreviewKeyEventZmokQxo(keyEvent)) : null;
        if (p.f(boolValueOf, Boolean.TRUE)) {
            return boolValueOf.booleanValue();
        }
        l<KeyEvent, Boolean> lVar = this.onPreviewKeyEvent;
        if (lVar != null) {
            return lVar.invoke(KeyEvent.m2836boximpl(keyEvent)).booleanValue();
        }
        return false;
    }
}
